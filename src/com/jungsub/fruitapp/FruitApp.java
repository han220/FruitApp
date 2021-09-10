package com.jungsub.fruitapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitApp {

	public static void main(String[] args) {
		// 리스트 생성 및 데이터 추가
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("apple", 1000));
		list.add(new Fruit("banana", 1300));
		list.add(new Fruit("carrot", 1600));
		list.add(new Fruit("kiwi", 2000));
		list.add(new Fruit("orange", 3000));
		list.add(new Fruit("strawberry", 1300));
		list.add(new Fruit("watermelon", 7000));
		list.add(new Fruit("melon", 1400));
		list.add(new Fruit("mango", 5000));
		list.add(new Fruit("peach", 900));
		
		// 데이터 정렬 / 출력
		Collections.sort(list, new FruitComparator());
		System.out.println("Fruit List (ordered by name)");
		for (Fruit f : list) System.out.println(f.toString());
		
		// 데이터 반대로 정렬 / 출력
		Collections.sort(list, new FruitComparator());
		System.out.println("Fruit List (reverse ordered by name");
		for (Fruit f : list) System.out.println(f.toString());

	}

}
