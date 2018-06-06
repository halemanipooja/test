package com.practise.wrapper;

public class Wrapper {

	
	void add(int a, int b){
		System.out.println("int: "+a+" "+b);
	}
	
	/*void add(Integer a, Integer b){
		System.out.println("Integer: "+a+" "+b);
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;   //primitive
		Integer b = new Integer(a); //creating Integer object
		System.out.println(a +" "+b);
		
		
		Integer j = Integer.valueOf(a); //converts primitive to wrapper object
		Integer i = a;  //autoboxing
		
		System.out.println(j +" "+i);
		
		
		
		Integer c = new Integer(20);
		int k = c.intValue();  //returns Integer as int
		int l = c;     //unboxing
		
		System.out.println(c +" "+k+" "+l);
		
		new Wrapper().add(10, 20);
		new Wrapper().add(new Integer(10), new Integer(20));
	}

}
