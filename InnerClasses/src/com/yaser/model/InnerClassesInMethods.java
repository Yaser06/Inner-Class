package com.yaser.model;

public class InnerClassesInMethods {
	
	public void f(boolean flag) {
		
		if(flag) {
			// Deger sagland�g� durumda �nner class eri�im verebiliriz.
			class InnerClassInFMethod {
				
			}
		}
		
	}
	
	// Farkl� acsess d�zeylerinde s�n�f olusturabiliriz.
	
	protected class Inner {
		
	}
	private class  InnerPrivate {
		
	}
	
	class InnerPackage {
		
	}
}
