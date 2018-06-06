package com.hackerearth.practise;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test {
	
	class innrer {
		void tes1t(){
			if(test.this.flag){
		}
	}
	}
		private boolean flag = true;
		public void sample(){
			System.out.println("dsam[ple");
		}
		
		public test(){
			(new innrer()).tes1t();
		}
	public static void main(String[] args) throws IOException{
		new test();
		System.out.println(Integer.MIN_VALUE);
		/*
	}
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        String[] first = br.readLine().split(" ");
	        String[] second = br.readLine().split(" ");
	        br.close();
	        String[] movies = new String[first.length];
	       movies = first;
	       Arrays.sort(movies);
	       //Collections.sort(movies);
	        int count =0;
	        for(int i=0; i<movies.length; i++){
	            Long index1 = new Long(Arrays.asList(first).indexOf(movies[i]));
	             int index2 = Arrays.asList(second).indexOf(movies[i]);
	             count = (int) (index2-index1);
	             if(count == 0)
	                continue;
	            else{
	              System.out.println(count);
	              break;
	            }
	        }
	*/
		
		/*String[] a = {"pooja", "sagar"};
		System.out.println(a.length +" "+a[0].length() );
	PriorityQueue db = new PriorityQueue();
	db.add("dishes");
	db.add("laundry");
	db.add("bills");
	db.add("bills");
	System.out.println(db.size() +" "+db.poll());
	System.out.println(db.peek() +" " +db.poll()+" " +db.poll()+" " +db.poll());
	
	
	List<String> x = new ArrayList<>();
	x.add("3");x.add("7");x.add("5");
	List<String> y = new test().dostuff(x);
	y.add("1");
	System.out.println(x);
	
	}

	
	public List<String> dostuff(List<String> x){
		x.add("9");
		return x;
		
	}*/
		
		
}
}
interface mypancake {
 List<String> dostuff(List<String> s);
}
