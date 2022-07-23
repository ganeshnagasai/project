package com.entity;

public class Appointment {
	private String name;
	private int flatnumber;
	private String relation;
	private int number ;
	private String desc;
	public Appointment(String name, int flatnumber, String relation,int number, String desc
		) {
		super();
		this.name = name;
		this.flatnumber = flatnumber;
		this.relation = relation;
		this.number = number;
		this.desc = desc;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlatnumber() {
		return flatnumber;
	}
	public void setFlatnumber(int flatnumber2) {
		this.flatnumber = flatnumber2;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(String number2) {
		this.number = number2;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setFlatnumber(String flatnumber2) {
		// TODO Auto-generated method stub
		
	}
}