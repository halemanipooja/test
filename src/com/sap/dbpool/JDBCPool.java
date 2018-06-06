package com.sap.dbpool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;

public class JDBCPool {

	private GenericObjectPool gPool = null;

	public DataSource setUpPool() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			gPool = new GenericObjectPool();
			gPool.setMaxActive(5);

			ConnectionFactory cf = new DriverManagerConnectionFactory(
					"jdbc:sqlserver://veWIN10TLS2.dhcp.wdf.sap.corp:1433;databaseName=DragonBlood_Incident", "dbadmin",
					"potpot@2");

			// Creates a PoolableConnectionFactory That Will Wraps the
			// Connection Object Created by the ConnectionFactory to Add Object
			// Pooling Functionality!
			PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, gPool, null, null, false, true);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new PoolingDataSource(gPool);
	}

	public GenericObjectPool getConnectionPool() {
		return gPool;
	}
	// This Method Is Used To Print The Connection Pool Status

	private void printDbStatus() {

		System.out.println("Max.: " + getConnectionPool().getMaxActive() + "; Active: "
				+ getConnectionPool().getNumActive() + "; Idle: " + getConnectionPool().getNumIdle());
	}

	
	public static void main(String[] args){
		ResultSet obj = null;
		JDBCPool pool = new JDBCPool();
		DataSource dataSource = pool.setUpPool();
		PreparedStatement pstmtObj = null;
		Connection connObj = null;
		try{
			connObj = dataSource.getConnection();
			pool.printDbStatus();
			System.out.println("\n=====Making A New Connection Object For Db Transaction=====\n");
			
			pool.printDbStatus(); 
			
			pstmtObj = connObj.prepareStatement("select * from [dbo].[testDCtoM]");
			obj = pstmtObj.executeQuery();
			while(obj.next()){
				System.out.print(obj.getInt(1));
				System.out.print(" ");
				System.out.print(obj.getInt(2));
				System.out.println();
			}
			System.out.println("\n=====Releasing Connection Object To Pool=====\n");	
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		pool.printDbStatus(); 
		
		
		try(Connection connObj1 = dataSource.getConnection();){
			
			pool.printDbStatus();
			System.out.println("\n=====Making A New Connection Object For Db Transaction=====\n");
			
			pool.printDbStatus(); 
			
			pstmtObj = connObj1.prepareStatement("select * from [dbo].[testDCtoM]");
			obj = pstmtObj.executeQuery();
			while(obj.next()){
				System.out.print(obj.getInt(1));
				System.out.print(" ");
				System.out.print(obj.getInt(2));
				System.out.println();
			}
			System.out.println("\n=====Releasing Connection Object To Pool=====\n");	
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		pool.printDbStatus(); 
	}
}
