package com.pack1;
import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);//hetrogenous are allowed
	al.add("ArrayList");//dublicates are allowed 
	al.add(10);//insertion order is maintained 
	al.add(100);//null are allowed
	al.add(200);//it is available from 1.2 version
	al.add(300);//its default capacity is 10.
	al.add('A');//it size increase by half.
	al.add(true);
	al.add(null);
	for(int i=0;i<=al.size()-1;i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	for(int i=al.size()-1;i>=0;i--) {
		System.out.print(al.get(i)+" " );
	}
	System.out.println();
	Iterator i=al.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	
	}
}
}
