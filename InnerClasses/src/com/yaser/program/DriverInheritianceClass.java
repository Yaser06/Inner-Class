package com.yaser.program;

import com.yaser.model.InnerClassInheritiance;
import com.yaser.model.Outer;

public class DriverInheritianceClass {

	public static void main(String[] args) {
		InnerClassInheritiance outer =new InnerClassInheritiance();
		InnerClassInheritiance.InheritianceInner inner =outer.new InheritianceInner();
		inner.Method();
		
		
		// Burda refaransla .new kullanarak nesne olusturduk.
		//Bu sekilde ic class eri�im extends etti�imiz methoda ula�m�� olduk.
		
	}

}
