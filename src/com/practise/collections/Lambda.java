package com.practise.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Lambda {

	public static void main(String[] args){
		List<String> lst = new ArrayList<>();
		
		lst.add("rachel");
		lst.add("ross");
		lst.add("chandler");
		lst.add("monica");
		lst.add("pheeebs");
		lst.add("joey");
		
		lst.forEach(x -> System.out.println(x));

		HashSet<Integer> set = new HashSet<>();
		set.add(6);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(1);
		
		set.forEach(x->System.out.println(x));
		
		set.remove(2);
		set.forEach(x->System.out.println(x));
		set.size();
		
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		
		hm.forEach((x,y)->System.out.println(x +" "+y));
		
		List<Integer> lst1 = new ArrayList<>();
		List<Integer> lst2 = new ArrayList<>();
		lst1.add(1);lst1.add(4);lst1.add(5);
		lst1.add(1);lst1.add(5);lst1.add(4);
		
		lst1.forEach(x->System.out.println(x));
		lst2.forEach(x->System.out.println(x));
		
		Collections.sort(lst1);
		
		lst1.forEach(x->System.out.println(x));
		
		Collections.sort(lst2);
		lst2.forEach(x->System.out.println(x));
		
		
	}

	
	
}
