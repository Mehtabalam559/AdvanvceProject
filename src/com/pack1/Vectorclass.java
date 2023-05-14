package com.pack1;
import java.util.Vector;
import java.util.Enumeration;
public class Vectorclass {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(null);//hetrogeneous data are allowed
	v.add(20);//null values allowed
	v.add(30);//duplicates data are allowed
	v.add(40);//it is syncronized by default
	v.add(50);//it is legacy classes(1.0 version)
	v.add("Vector");//it default capacity is 10
	v.add('V');//it size increase by double
	v.add(20);//insertion order is maintained
	v.add(null);
	v.add(100);
	v.add("alam");
	//System.out.println(v.size());
	//System.out.println(v.capacity());
	v.remove(1);
	System.out.println(v);
	for(int i=0;i<=v.size()-1;i++) {
		System.out.print(v.get(i)+" ");
	}
	System.out.println();
	for(int i=v.size()-1;i>=0;i--) {
		System.out.print(v.get(i)+" ");
	}
	System.out.println();
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
		System.out.print(e.nextElement()+" ");
	}
}
}
