package com.yaser.program;

import com.yaser.model.Outer;
import com.yaser.model.Outer.Inner;

public class Driver {
	
	public static void main(String[] args) {
		
		// Inner innerInstance =new Inner(); // yapam�yoruz Nested class �rneginde ac�klama yap�lm�st�r.
		
		Outer outer =new Outer();
		outer.returnInner(); //Inner geri d�n�s tipiyle olusturdum
		outer.createdInnerClass(); // yazd�g�m metod ile olusturdum
		
		Outer.Inner inner =outer.returnInner();
		inner.f();
	}

}
