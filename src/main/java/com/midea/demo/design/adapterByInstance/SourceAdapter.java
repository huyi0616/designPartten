package com.midea.demo.design.adapterByInstance;

public class SourceAdapter implements Targetable {

	private Source source;
	
	public SourceAdapter(Source source) {
		super();
		this.source = source;
	}

	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}
	
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is SourceAdapter method!");
	}

}
