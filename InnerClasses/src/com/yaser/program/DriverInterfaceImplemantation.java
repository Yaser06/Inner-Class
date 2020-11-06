package com.yaser.program;

import com.yaser.model.InnerClassInterfaceImplemantation;

public class DriverInterfaceImplemantation {
	public static void main(String[] args) {
		InnerClassInterfaceImplemantation outer =new InnerClassInterfaceImplemantation();
		InnerClassInterfaceImplemantation.Inner inner = outer.new Inner();
		inner.method();
		
		
		// Bu þekilde interfacede implementasyon yapabildiðimizi gösterdik. 
		//Outerda implemantasyon yapmak istemediðimizi bu þekilde inner class özellið ile gerçekleþtirdik.
	}
}
