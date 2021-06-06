package com.models;

import java.util.List;

public class RequestIceCream {
	private int id;
	private int terminaBoxId;
	private List<Integer> listTaste;
	private String description;
	private boolean dispatched;

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

	public List<Integer> getListTaste() {
		return listTaste;
	}

	public void setListTaste(List<Integer> listTaste) {
		this.listTaste = listTaste;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDispatched() {
		return dispatched;
	}

	public void setDispatched(boolean dispatched) {
		this.dispatched = dispatched;
	}

	@Override
	public String toString() {
		return "RequestIceCream [id=" + id + ", terminaBoxId=" + terminaBoxId + ", listTaste=" + listTaste
				+ ", description=" + description + ", dispatched=" + dispatched + "]";
	}
}
