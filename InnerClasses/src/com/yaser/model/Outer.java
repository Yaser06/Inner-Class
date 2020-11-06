package com.yaser.model;

public class Outer {

	public class Inner {

		public Inner() {
			System.out.println("Inner Class Created");
		}
		
		public void f() {
			System.out.println("Inner f Fonksiyon ");
		}

	}
	
	
	public void createdInnerClass() {
		new Inner();
	}
	
	public Inner returnInner() {
		return new Inner();
	}

}
