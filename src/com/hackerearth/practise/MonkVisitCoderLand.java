package com.hackerearth.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MonkVisitCoderLand {

	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = null;
	        // Reading input from STDIN
	      
	        int testCase = Integer.parseInt(br.readLine());
	        List<Integer> totalResult = new ArrayList<Integer>();
	        for(int j=0; j<testCase; j++){
	        	 int count = 0;
	            int checkPoints = Integer.parseInt(br.readLine());
	            String[] cpl = br.readLine().split(" ");
	             String[] rl = br.readLine().split(" ");
	             List<String> lst = new ArrayList<>(Arrays.asList(cpl));
	             
	            List<Integer> costPerLtr = lst.stream().map(x->Integer.parseInt(x)).collect(Collectors.toList());
	             List<Integer> reqLtr = new ArrayList<>(rl.length);
	             
	             for(int k=0; k<cpl.length; k++){
	            	 costPerLtr.add(Integer.parseInt(cpl[k]));
	            	 reqLtr.add(Integer.parseInt(rl[k]));
	             }
	             int initialCheckPoint = costPerLtr.get(0);
		           
	             for(int i=0; i<checkPoints; i++){
	                 if(i==0)
	                   count += initialCheckPoint*reqLtr.get(i);
	                 else if(costPerLtr.get(i) < initialCheckPoint){
	                     initialCheckPoint = costPerLtr.get(i);
	                     count += initialCheckPoint*reqLtr.get(i);
	                 }
	                 else
	                    count += initialCheckPoint*reqLtr.get(i);
	             }
	             totalResult.add(count);
	        }
	        br.close();
	       totalResult.forEach(x->System.out.println(x));
	}
}
