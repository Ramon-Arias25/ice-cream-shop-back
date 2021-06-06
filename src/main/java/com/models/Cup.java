package com.models;

import java.util.ArrayList;
import java.util.List;

public class Cup extends IceCream implements IProductConfiguration, IOrderIceCream{
	
	public Cup() {
		super();
		List<Taste> plusAcepted = new ArrayList<Taste>();
		plusAcepted.add(null);//crema de vainilla
		plusAcepted.add(null);//chocolate fundido
		setPlusAcepted(plusAcepted);
	}

	@Override
	public List<String> getConfiguration(int maxCountTaste) {
		return null;
	}
}
