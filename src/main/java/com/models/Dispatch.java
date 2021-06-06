package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dispatch")
public class Dispatch {

	@Id
	private int id;

	@Column
	private int terminaBoxId;

	@Column
	private int dispatcherId;

	@Column
	private String description;

	@Column
	private boolean dispatched;

	public Dispatch() {
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

	public int getDispatcherId() {
		return dispatcherId;
	}

	public Integer getDispatcherIdInteger() {
		return dispatcherId;
	}

	
	public void setDispatcherId(int dispatcherId) {
		this.dispatcherId = dispatcherId;
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
		return "Dispatch [id=" + id + ", terminaBoxId=" + terminaBoxId + ", dispatcherId=" + dispatcherId
				+ ", description=" + description + ", dispatched=" + dispatched + "]";
	}
}