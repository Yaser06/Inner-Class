package com.yaser.program;

import com.yaser.model.OuterDotNew;

public class DriverOuterDotNew {
	public static void main(String[] args) {
		OuterDotNew outer = new OuterDotNew();
		OuterDotNew.Inner inner = outer.new Inner();
		inner.test();
		
		
		// Burada outer refarans�na erisim sa�lad�k .
	}

}
