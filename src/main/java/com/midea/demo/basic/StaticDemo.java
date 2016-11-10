package com.midea.demo.basic;

public class StaticDemo {

	static {  
        System.out.println("StaticDemo  静态语句块");  
    }  
    public StaticDemo() {  
        System.out.println("StaticDemo 默认无参构造器");  
    }
    
    {  
        System.out.println("StaticDemo 非静态");  
    } 
}
