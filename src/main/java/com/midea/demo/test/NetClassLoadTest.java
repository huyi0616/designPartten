/**
 * 
 */
package com.midea.demo.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Administrator
 *
 */
public class NetClassLoadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clzName = "com.midea.annto.web.ClassLoadInstance";
		String url = "http://localhost:8080/web/classes/";
		NetworkClassLoader loader1 = new NetworkClassLoader(url);
		NetworkClassLoader loader2 = new NetworkClassLoader(url);
		try {
			Class clz1 = loader1.loadClass(clzName);
			Class clz2 = loader2.loadClass(clzName);
			Object obj1 = clz1.newInstance();
			Object obj2 = clz2.newInstance();
			System.out.println(clz1.getClassLoader());
			System.out.println(clz1.getClassLoader().getParent());
			System.out.println(clz1.getClassLoader().getParent().getParent());
			try {
				clz1.getMethod("Transform", Object.class).invoke(obj1, obj2);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
