package com.midea.demo.design.proxy;

public class SourceProxy implements Sourceable{

	private Sourceable source;
	
	public SourceProxy(){
		this.source = new Source();
	}
	
	
	public void method1() {
		// TODO Auto-generated method stub
		before();
		source.method1();
		after();
	}

	public void method2() {
		// TODO Auto-generated method stub
		before();
		source.method2();
		after();
	}
	
	public void before(){
		System.out.println("This is before method");
	}

	public void after(){
		System.out.println("This is after method");
	}
	
}
