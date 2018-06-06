package com.practise.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Animal{
	int i=12;
	public Animal(){
		i =13;
	}
	
	public String toString(){
		return "Animal" + i;
	}
}

public class Test {
public static void main(String args[]){

	HashSet<Animal> s = new HashSet<>();
	s.add(new Animal());
	s.add(new Animal());
	
	Iterator i = s.iterator();
	for(Animal a: s){
		System.out.println(a);
	}
	
	List<Integer> lst = new ArrayList<>();
	lst.add(1);
	lst.add(2);
	lst.add(3);
	lst.add(4);
	lst.add(5);
	lst.add(6);
	lst.forEach(x->System.out.println(x));
	/*for(int j=0 ;j<lst.size(); j++){
		System.out.println(lst.get(j));
		lst.add(j, 4);
	}*/
		
	Iterator<Integer> it = lst.iterator();
	int index = 0;
	try{
	while(it.hasNext()){
		it.next();
		index++;
		if(index == 2)
		 it.remove();
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	
	lst.forEach(x->System.out.println(x));
	
	ListIterator<Integer> lt = lst.listIterator();
	while(lt.hasNext()){
		lt.next();
		lt.remove();
	}
	//System.out.println(lst);
	lst.forEach(x->System.out.println(x));
	
	HashMap<Integer, Integer> map = new HashMap<>();
	map.put(1, 10);
	map.put(2, 20);
	map.put(3, 30);
	Iterator mit = map.keySet().iterator();
	while(mit.hasNext()){
		int k = (int) mit.next();
		if(k == 2) 
			map.put(3, 40);
	}
	map.keySet().forEach(x -> System.out.println(x +" "+map.get(x)));
}
	
	
}
