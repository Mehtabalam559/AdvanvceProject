package com.pack1;
import java.util.LinkedList;
import java.util.ListIterator;
public class Linkedlist {
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("linked list");//it cames in jdk1.2 version
	ll.add(10);//hetrogeneous data are acccepted.
	ll.add('c');//insertion order is maintained
	ll.add(10);//it default capacity is 0
	ll.add("alam");//it size increase by double
	ll.add(null);//data is stored in nodes form
	ll.add(100);//it is not syncronized by default
	ll.add(200);//it accepts null elements.
	ll.add(300);//it accepts dublicates elements.
	ll.add("alam");
	//System.out.println(ll);
	//System.out.println(ll.size());
	//System.out.println;
	for(int i=0;i<=ll.size()-1;i++) {
		System.out.print(" "+ll.get(i));
	}
	System.out.println();
	for(int i=ll.size()-1;i>=0;i--) {
		System.out.print(ll.get(i)+" ");
	}
	System.out.println();
	ListIterator<Object> li=ll.listIterator();
	while(li.hasNext()) {
		System.out.print(li.next()+" ");
	}
	System.out.println( );
	while(li.hasPrevious()) {
		System.out.print(li.previous()+" ");
	}
	//System.out.println(ll.get(0));
	
	
}
}
