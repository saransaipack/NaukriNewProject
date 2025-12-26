package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	private static FileInputStream fileInputstream;
	private static Properties property;
	private static void setupProperty() throws Exception {
		File file=new File("C:\\Users\\DELL\\eclipse-workspace\\NaukriNewMaven\\src\\main\\resources\\NaukriDataProperties");
		try {
			fileInputstream=new FileInputStream(file);
			property=new Properties();
			property.load(fileInputstream);
		} catch (FileNotFoundException e) {
			Assert.fail("error occur");
		} catch (IOException e) {
			Assert.fail("error occur");
		}}
		public static String getDataProperty(String datavalue) throws Exception {
			setupProperty();
			String data=property.getProperty(datavalue);
			
			return data;

		}
		
		public static void main(String[]args) {
		System.out.println("chrome");
		}
	
		
}
