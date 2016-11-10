package com.midea.demo.design.decorator;

public class Decorator implements SourceAble {

	private Source source;
	
	public Decorator(Source source){
		this.source = source;
	}
	
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before soure");
		source.method();
		System.out.println("after source");
		
	}

}
