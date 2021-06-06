package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tastes")
public class Taste {
	@Id
	private int id;
	
	@Column(name = "taste")
	private String taste;
	
	@Column(name = "isPlus")
	private boolean isPlus;
	
	public Taste() {
		super();
	}
	
	public Taste(int id, String taste, boolean isPlus) {
		super();
		this.id = id;
		this.taste = taste;
		this.isPlus = isPlus;
	}
	public boolean isPlus() {
		return isPlus;
	}
	public void setPlus(boolean isPlus) {
		this.isPlus = isPlus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
}
