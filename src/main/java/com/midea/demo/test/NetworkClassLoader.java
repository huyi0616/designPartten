package com.midea.demo.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkClassLoader extends ClassLoader{

	private String rootUrl;
	
	public NetworkClassLoader(String url){
		//super(null);
		this.rootUrl = url;
	}
	
	@Override
	protected Class<?> findClass(String clzName) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		byte[] clzDate = null;
		clzDate = getClzData(clzName);
		return defineClass(clzName, clzDate, 0, clzDate.length);
	}

	private byte[] getClzData(String clzName){
		String path = getClzPath(clzName);
		ByteArrayOutputStream outputStream = null;
		try {
			URL url = new URL(path);
			InputStream inputStream = url.openStream();
			int len = -1;
			byte[] buff = new byte[1024*4];
			outputStream = new ByteArrayOutputStream();
			while((len = inputStream.read(buff))!= -1){
				outputStream.write(buff, 0, len);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outputStream.toByteArray();
	}
	
	private String getClzPath(String clzName){
		return rootUrl + clzName.replace(".", "/")+".class";
	}
}
