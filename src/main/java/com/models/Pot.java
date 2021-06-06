package com.models;

import java.util.ArrayList;
import java.util.List;

public class Pot extends IceCream implements IProductConfiguration, IOrderIceCream{

	public Pot() {
		super();
		List<Taste> plusAcepted = new ArrayList<Taste>();
		plusAcepted.add(null);//crema de vainilla
		plusAcepted.add(null);//chocolate fundido
		plusAcepted.add(null);//almendras
		setPlusAcepted(plusAcepted);
	}

	@Override
	public List<String> getConfiguration(int maxCountTaste) {
		// TODO Auto-generated method stub
		return null;
	}

}
