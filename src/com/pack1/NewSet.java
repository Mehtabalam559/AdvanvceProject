package com.pack1;

import java.util.HashSet;
import java.util.Set;

public class NewSet {
public static void main(String[] args) {
	String s="abc";
	String j=new String("abc");
	ClassA ca=new ClassA(1,"alam","lko");
	ClassA aa=new ClassA(1,"alam","lko");
	Set<String> a=new HashSet<String>();
	Set<ClassA> b=new HashSet<ClassA>();
	
	a.add(s);
	a.add(j);
	

	b.add(aa);
	b.add(ca);
System.out.println(a.size());
System.out.println(b.size());
}
}
