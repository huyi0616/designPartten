package com.midea.demo.design.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sourceable sourceable = new SourceProxy();
		sourceable.method1();
	}

}
