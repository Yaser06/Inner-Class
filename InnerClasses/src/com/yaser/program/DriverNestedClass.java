package com.yaser.program;

import com.yaser.model.NestedClass.InnerClass;

public class DriverNestedClass {
	public static void main(String[] args) {
		
		// Inner class static yaparak instance alma i�lemi ger�ekle�tirebiliriz.
		
		InnerClass inner = new InnerClass();
		inner.f();
		
		
		
		
		/*Burdaki en �nemli �zellik �udur. Bir s�n�f ba�ka s�n�flar� bir defa extends yapabilir.
		 * Ama inner s�n�flar sayesinde birden fazla s�n�f� extends i�lemi yapabilir hale getiriyoruz.
		 * Bu sayede MULT� �NHER�T�ANCE YAPMI� OLUYORUZ.
		 * 
		 * Ayn� zamanda da i� implementasyonu en kaps�le etmi� oluyoruz.
		 */
	}

}
