package com.yaser.program;

import com.yaser.model.NestedClass.InnerClass;

public class DriverNestedClass {
	public static void main(String[] args) {
		
		// Inner class static yaparak instance alma iþlemi gerçekleþtirebiliriz.
		
		InnerClass inner = new InnerClass();
		inner.f();
		
		
		
		
		/*Burdaki en önemli özellik þudur. Bir sýnýf baþka sýnýflarý bir defa extends yapabilir.
		 * Ama inner sýnýflar sayesinde birden fazla sýnýfý extends iþlemi yapabilir hale getiriyoruz.
		 * Bu sayede MULTÝ ÝNHERÝTÝANCE YAPMIÞ OLUYORUZ.
		 * 
		 * Ayný zamanda da iç implementasyonu en kapsüle etmiþ oluyoruz.
		 */
	}

}
