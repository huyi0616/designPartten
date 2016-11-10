package com.midea.demo.design.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable sourceable1 = new SubSource1();
		Sourceable sourceable2 = new SubSource2();
		
		Bridge myBridge = new MyBridge();
		myBridge.setSource(sourceable1);
		myBridge.getConnection();
		
		myBridge.setSource(sourceable2);
		myBridge.getConnection();
	}

}
