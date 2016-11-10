package com.midea.demo.design.bridge;

public class MyBridge implements Bridge {
	
	private Sourceable sourceable;

	public void setSource(Sourceable sourceable) {
		// TODO Auto-generated method stub
		this.sourceable = sourceable;
	}

	public Sourceable getSource() {
		// TODO Auto-generated method stub
		return sourceable;
	}

	public void getConnection() {
		// TODO Auto-generated method stub
		sourceable.getConnection();
	}

}
