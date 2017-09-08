package com.VP.Framework.Adviser.Helper;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

	static Properties prop = new Properties();
	static File file = null;
	
	public static String readWebdriverConfig(String key){
		try {
			if(loadPropFiles().length!=0){
				for(File f: loadPropFiles()){
					if(f.getName().contains("webdriverConfig")){
						prop.load(new FileInputStream(f));
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public static String readMessageProperty(String key){
		try {
			if(loadPropFiles().length!=0){
				for(File f: loadPropFiles()){
					if(f.getName().contains("message")){
						prop.load(new FileInputStream(f));
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
// Loads all the files from Prop folder	
	
	
	public static File[] loadPropFiles(){
		File[] listOfFiles = null;
		try{
		file = new File(System.getProperty("user.dir")+ "/src/main/resources/Prop");
		listOfFiles = file.listFiles();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listOfFiles;
	}
}
