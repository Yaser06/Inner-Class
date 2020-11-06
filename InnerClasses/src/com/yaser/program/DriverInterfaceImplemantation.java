package com.yaser.program;

import com.yaser.model.InnerClassInterfaceImplemantation;

public class DriverInterfaceImplemantation {
	public static void main(String[] args) {
		InnerClassInterfaceImplemantation outer =new InnerClassInterfaceImplemantation();
		InnerClassInterfaceImplemantation.Inner inner = outer.new Inner();
		inner.method();
		
		
		// Bu şekilde interfacede implementasyon yapabildiğimizi gösterdik. 
		//Outerda implemantasyon yapmak istemediğimizi bu şekilde inner class özelliğ ile gerçekleştirdik.
	}
}
