/**
 * 
 */
package com.midea.demo.pojo;

/**
 * @author Administrator
 *
 */
public class Account {

	String name;
	float amount;

	public Account(String name, float amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public  void deposit(float amt) {
		float temp = amount;
		temp += amt;

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		amount = temp;
	}

	public  void withdraw(float amt) {
		float tmp = amount;
		tmp -= amt;

		try {
			Thread.sleep(100);// 模拟其它处理所需要的时间，比如刷新数据库等
		} catch (InterruptedException e) {
			// ignore
		}

		amount = tmp;
	}

	public float getBalance() {
		return amount;
	}
}
