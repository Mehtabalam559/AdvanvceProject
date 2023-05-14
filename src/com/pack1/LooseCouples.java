package com.pack1;

public class LooseCouples {
	
	private LooseandT a;
	void add() {
		LooseandT ls=new LooseandT(new LooseCouples());
		ls.display();//tight coupling
	}

}
