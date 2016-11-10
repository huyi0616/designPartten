package com.midea.demo.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("huyi", 'M', 20, 20.00,"123");
		
		File file = new File("D:\\student.txt");
		
		try {
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student ss = null;
		try {
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(in);
			ss = (Student)ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ss.getName());
		System.out.println(ss.getPasswd());
	}

}
