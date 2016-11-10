package com.midea.demo.design.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		SourceAble decorator = new Decorator(source);
		decorator.method();
		
		SubSoucre subSoucre = new SubSoucre();
		subSoucre.method();
	}

}
