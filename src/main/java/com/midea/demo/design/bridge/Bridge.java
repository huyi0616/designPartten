package com.midea.demo.design.bridge;

public interface Bridge {

	public void setSource(Sourceable sourceable);
	
	public Sourceable getSource();
	
	public void getConnection();
	
}
