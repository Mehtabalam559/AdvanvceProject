package com.pack1;

public class ClassA {
	int stdrollno;
	String stname;
	String address;
	ClassA(int stdrollno,String stname,String address){
		this.stdrollno=stdrollno;
		this.stname=stname;
		this.address=address;
	}
	@Override
	public String toString() {
		return "ClassA [stdrollno=" + stdrollno + ", stname=" + stname + ", address=" + address + "]";
	}
	
}
