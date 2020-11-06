package com.yaser.model;

public class OuterDotNew {
	
	public class Inner{
		
		public OuterDotNew getOuterReference() {
			return OuterDotNew.this;
		}
		
		public void test() {
			System.out.println("Hello From Inner");
		}
	}
	
	// No INNER CLASS INSTANCE METHOD

}
