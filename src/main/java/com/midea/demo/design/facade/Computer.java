package com.midea.demo.design.facade;

public class Computer implements Hardware {
	
	private Cpu cpu;
	private Disk disk;
	
	public Computer(){
		super();
	}
	
	public Computer(Cpu cpu ,Disk disk){
		this.cpu = cpu;
		this.disk = disk;
	}

	public void start() {
		// TODO Auto-generated method stub
		cpu.start();
		disk.start();
	}

	public void stop() {
		// TODO Auto-generated method stub
		cpu.stop();
		disk.stop();
	}

}
