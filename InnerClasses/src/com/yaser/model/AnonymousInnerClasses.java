package com.yaser.model;

public class AnonymousInnerClasses {
	
	
	public Ability getAbility() {
		
	return new Ability() {
		
		{
			System.out.println("Ability olusturuldu.");
			
			// BU Sekilde constructor ekleriz.
			//Anonymous classlarýn ismi olmadýgý icin constracter ekleme bos scopelar ile gercekleþir.
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
