package com.models;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
	protected int maxCountTaste;
	protected List<Taste> plusAcepted;
	
	public IceCream() {
		this.maxCountTaste = 0;
		this.plusAcepted = new ArrayList<Taste>();
	}

	public int getMaxCountTaste() {
		return maxCountTaste;
	}

	public void setMaxCountTaste(int maxCountTaste) {
		this.maxCountTaste = maxCountTaste;
	}
	


	public List<Taste> getPlusAcepted() {
		
		return plusAcepted;
	}

	public void setPlusAcepted(List<Taste> plusAcepted) {
		this.plusAcepted = plusAcepted;
	}

	@Override
	public String toString() {
		return "IceCream [maxCountTaste=" + maxCountTaste + ", plusAcepted=" + plusAcepted + "]";
	}
}
