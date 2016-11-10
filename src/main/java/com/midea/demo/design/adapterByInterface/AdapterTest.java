package com.midea.demo.design.adapterByInterface;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable sourceable1 = new SubWrapper1();
		Sourceable sourceable2 = new SubWrapper2();
		sourceable1.method1();
		sourceable1.method2();
		sourceable2.method1();
		sourceable2.method2();
	}

}
