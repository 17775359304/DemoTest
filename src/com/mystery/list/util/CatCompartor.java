package com.mystery.list.util;

import java.util.Comparator;

public class CatCompartor implements Comparator<Cat>{

	@Override
	public int compare(Cat o1, Cat o2) {
		
		return o1.getAge()-o2.getAge();
		
	}

}
