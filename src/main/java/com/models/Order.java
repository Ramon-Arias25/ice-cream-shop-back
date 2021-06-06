package com.models;

import java.util.List;

public class Order {
	private int id;
	private int terminaBoxId;
	private List<IceCream> listIceCream;
	private boolean dispatched;
	
	public Order() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTerminaBoxId() {
		return terminaBoxId;
	}
	public void setTerminaBoxId(int terminaBoxId) {
		this.terminaBoxId = terminaBoxId;
	}
	public List<IceCream> getIceCream() {
		return listIceCream;
	}
	public void setIceCream(List<IceCream> iceCream) {
		this.listIceCream = iceCream;
	}
	public boolean isDispatched() {
		return dispatched;
	}
	public void setDispatched(boolean dispatched) {
		this.dispatched = dispatched;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", terminaBoxId=" + terminaBoxId + ", iceCream=" + listIceCream + ", dispatched="
				+ dispatched + "]";
	}
}
