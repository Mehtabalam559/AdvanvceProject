package com.pack1;
import java.util.ArrayList;
public class ClassB {
void meth1() {
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(new ClassA(121,"aarif ansari","siwan"));
	System.out.print(al);
}
public static void main(String[] args) {
	new ClassB().meth1();
}
}
