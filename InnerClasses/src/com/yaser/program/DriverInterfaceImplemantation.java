package com.yaser.program;

import com.yaser.model.InnerClassInterfaceImplemantation;

public class DriverInterfaceImplemantation {
	public static void main(String[] args) {
		InnerClassInterfaceImplemantation outer =new InnerClassInterfaceImplemantation();
		InnerClassInterfaceImplemantation.Inner inner = outer.new Inner();
		inner.method();
		
		
		// Bu �ekilde interfacede implementasyon yapabildi�imizi g�sterdik. 
		//Outerda implemantasyon yapmak istemedi�imizi bu �ekilde inner class �zelli� ile ger�ekle�tirdik.
	}
}
