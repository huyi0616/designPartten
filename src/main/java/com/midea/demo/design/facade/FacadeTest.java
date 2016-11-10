package com.midea.demo.design.facade;

public class FacadeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Disk disk = new Disk();
		Cpu cpu = new Cpu();
		Hardware computer = new Computer(cpu,disk);
		computer.start();
		computer.stop();
	}

}
