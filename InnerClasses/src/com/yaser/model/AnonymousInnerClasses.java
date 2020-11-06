package com.yaser.model;

public class AnonymousInnerClasses {
	
	
	public Ability getAbility() {
		
	return new Ability() {
		
		{
			System.out.println("Ability olusturuldu.");
			
			// BU Sekilde constructor ekleriz.
			//Anonymous classlar�n ismi olmad�g� icin constracter ekleme bos scopelar ile gercekle�ir.
		}
		@Override
		public void method() {

			
		}
		
		public void f() {
			// Bu sekilde icine methodlarda ekleyebiliriz.
		}
	};	
	}

}
