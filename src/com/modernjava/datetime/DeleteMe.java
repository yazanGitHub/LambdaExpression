package com.modernjava.datetime;

import java.util.Comparator;

abstract class Main {
	
	static {
		System.out.println("this is inside the static block");
	}
	
	public void print() {
		System.out.println("asdasdf");
	}
	Main(){
		System.out.println("the construct father is called");
	}
	public abstract void print2();
}



class Test extends Main implements inter{

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		
	}
	
	Test(){
		System.out.println("the construct son is called ");
		

	}
	protected void finalize(){
		System.out.println(" the Delete me object is deleted  ");
	}
	Comparator<Test> t = new Comparator<Test>() {
	
	};

}


public class DeleteMe{
	public static void main(String [] args)
	{
		Test t = new Test();
		Test t2 = new Test();
		t2 = new Test();
		t2 = new Test();
		t2 = new Test();
		t2 = new Test();
		int a = inter.i;
//		try {
//			int i = 10/0;
//
//		}catch(NullPointerException ex ) {
//			System.out.println(" the catch block ");
//		}
//		
//		
		t.print();
	}
	

}


interface inter {
	public final int i = 5;
}
