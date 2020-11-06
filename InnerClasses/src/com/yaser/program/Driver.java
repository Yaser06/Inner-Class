package com.yaser.program;

import com.yaser.model.Outer;
import com.yaser.model.Outer.Inner;

public class Driver {
	
	public static void main(String[] args) {
		
		// Inner innerInstance =new Inner(); // yapamıyoruz Nested class örneginde acıklama yapılmıstır.
		
		Outer outer =new Outer();
		outer.returnInner(); //Inner geri dönüs tipiyle olusturdum
		outer.createdInnerClass(); // yazdıgım metod ile olusturdum
		
		Outer.Inner inner =outer.returnInner();
		inner.f();
	}

}
