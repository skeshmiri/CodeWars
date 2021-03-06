package com.sam.sixKyu;

import java.util.HashMap;
import java.util.Map;

public class Keypad {
	
	public static void main(String[] args) {
		System.out.println(presses("hello world 79"));
	}
	
	public static int presses(String phrase) {
		Map<String, Integer> map = loadMap();
		int count = 0;
		String[] arr = phrase.toUpperCase().split("");
		for (String s : arr) { 
			for (String x : map.keySet()) {
				if (x.contains(s)) {
					count += map.get(x);
				}
			}
		}
		return count;
	}

	public static Map<String, Integer> loadMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put(" ", 1);
		map.put("ADJGMPTW*#1", 1);
		map.put("BEHKNQUX0", 2);
		map.put("CFILORVY", 3);
		map.put("SZ234568", 4);
		map.put("79", 5);
		return map;
	}
}