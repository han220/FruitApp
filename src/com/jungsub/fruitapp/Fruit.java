package com.jungsub.fruitapp;

import java.util.Comparator;

public class Fruit {
	private static int totalFruit = 0;
	int no, price;
	String name;
	
	public Fruit(String name, int price) {
		no = ++totalFruit;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("Fruit [no=%d, name=%s, price=%d]", no, name, price);
	}
}

class FruitComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class FruitComparatorDesc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
	
}