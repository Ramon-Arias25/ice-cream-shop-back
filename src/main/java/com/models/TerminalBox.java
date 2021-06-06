package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "terminalboxes")
public class TerminalBox{
	@Id
	private int id;

	@Column(name = "max_sales")
	private int maxSales;

	@Column(name="max_name")
	private String userName;
//	private List<Order> orders;

	
	
	public TerminalBox(int maxSales, String userName) {
		super();
		this.maxSales = maxSales;
		this.userName = userName;
//		orders = new ArrayList<Order>(maxSales);
	}

	public TerminalBox() {
	super();
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxSales() {
		return maxSales;
	}

	public void setMaxSales(int maxSales) {
		this.maxSales = maxSales;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
