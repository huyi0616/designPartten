/**
 * 
 */
package com.midea.demo.test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;

import com.midea.demo.pojo.Account;

/**
 * @author Administrator
 *
 */
public class Demo {

	

	public static void main(String[] args) {
		final Account acc = new Account("John", 1000.0f);
		
		/*int NUM_OF_THREAD = 1000;
		Thread[] threads = new Thread[NUM_OF_THREAD];
		for (int i = 0; i < NUM_OF_THREAD; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
//					synchronized (Demo.class) {
						acc.deposit(100.0f);
						acc.withdraw(100.0f);
//					}
				}
			});
			threads[i].start();
		}

		for (int i = 0; i < NUM_OF_THREAD; i++) {
			try {
				threads[i].join(); // 等待所有线程运行结束
			} catch (InterruptedException e) {
				// ignore
			}
		}
		System.out.println("Finally, John's balance is:" + acc.getBalance());*/
		String path = Account.class.getName().replace(".", "/")+".class";
		try {
			Enumeration<URL> urls = Account.class.getClassLoader().getResources(path);
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();

				System.out.println(url);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Account.class.getClassLoader().getResource(path));
	}

}
