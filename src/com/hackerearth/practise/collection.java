package com.hackerearth.practise;
import java.util.Collection;
import java.util.Stack;

public class collection {

	public static void main(String[] args){
		Stack<Integer> stack = new Stack<>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		
		stack.forEach(System.out::println);
		
		stack.add(1, 6);
		stack.forEach(x -> System.out.println(x));
		
	}
}
