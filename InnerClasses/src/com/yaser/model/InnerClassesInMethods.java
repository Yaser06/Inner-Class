package com.yaser.model;

public class InnerClassesInMethods {
	
	public void f(boolean flag) {
		
		if(flag) {
			// Deger saglandýgý durumda ýnner class eriþim verebiliriz.
			class InnerClassInFMethod {
				
			}
		}
		
	}
	
	// Farklý acsess düzeylerinde sýnýf olusturabiliriz.
	
	protected class Inner {
		
	}
	private class  InnerPrivate {
		
	}
	
	class InnerPackage {
		
	}
}
