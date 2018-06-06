package com.sap.dbpool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBPool {

	private static BasicDataSource dataSource;
	
	private static BasicDataSource getSource(){
		if(dataSource == null){
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ds.setUrl("jdbc:sqlserver://veWIN10TLS2.dhcp.wdf.sap.corp:1433;databaseName=DragonBlood_Incident");
			ds.setUsername("dbadmin");
			ds.setPassword("potpot@2");
			
			
			ds.setMinIdle(5);
			ds.setMaxIdle(10);
			ds.setMaxOpenPreparedStatements(2);
			
			dataSource = ds;
			System.out.println("MAX Total Connection: "+dataSource.getMaxTotal());
			System.out.println("MAx Idle Connection: "+dataSource.getMaxIdle());
		}
		return dataSource;
	}
	
	
	public static void main(String[] args){
		try(BasicDataSource datasource = DBPool.getSource();
			Connection con = datasource.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from [dbo].[testDCtoM]");
			ResultSet rs = pstmt.executeQuery();){
			System.out.println("MAX Total Connection: "+datasource.getMaxTotal());
			System.out.println("MAX Idle Connection: "+datasource.getMaxIdle());
	
			while(rs.next()){
				System.out.print(rs.getInt(1));
				System.out.print(" ");
				System.out.print(rs.getInt(2));
				System.out.println();
			}
			
			System.out.println(datasource.getInitialSize());
			System.out.println(datasource.getMaxIdle());
			System.out.println(datasource.getMinIdle());
			System.out.println("MAX Total Connection: "+datasource.getMaxTotal());
			System.out.println("MAX Idle Connection: "+datasource.getMaxIdle());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
