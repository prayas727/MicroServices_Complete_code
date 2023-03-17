package com.example.demo.beans;

public class Pojo {
	
	private Integer id;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Pojo(Integer id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	public Pojo() {
		super();
	}
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", address=" + address + "]";
	}
	

}
