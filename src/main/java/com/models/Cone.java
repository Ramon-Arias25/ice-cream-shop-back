package com.models;

import java.util.ArrayList;
import java.util.List;

public class Cone extends IceCream implements IProductConfiguration, IOrderIceCream{

	public Cone() {
		super();
		List<Taste> plusAcepted = new ArrayList<Taste>();
		plusAcepted.add(null);//no hay sabor de plus
		setPlusAcepted(plusAcepted);
	}

	@Override
	public List<String> getConfiguration(int maxCountTaste) {
		
		return null;
	}
}
