package com.midea.demo.design.decorator;

public class SubSoucre extends Source {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("-------before--------");
		super.method();
		System.out.println("-------after--------");
	}

	
}
