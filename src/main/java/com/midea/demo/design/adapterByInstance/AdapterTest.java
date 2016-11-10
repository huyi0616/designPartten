package com.midea.demo.design.adapterByInstance;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();  
		SourceAdapter adapter = new SourceAdapter(source);
		adapter.method1();
		adapter.method2();
	}

}
