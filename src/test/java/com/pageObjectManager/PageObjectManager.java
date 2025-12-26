package com.pageObjectManager;

import com.pageObjectModel.LoginPage;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private LoginPage loginpage;
	private FileReaderManager fileReaderManager;
	private static PageObjectManager pageObjectManager;
	public LoginPage getLoginPage() {
		if(loginpage==null) {
			loginpage=new LoginPage();
		}	return loginpage;
	}
	public FileReaderManager getfileReaderManager() {
	if(fileReaderManager==null) {
		fileReaderManager=new FileReaderManager() ;
		}
		return fileReaderManager;
	}
	public static PageObjectManager getpageObjectManager() {
		if(pageObjectManager==null) {
			pageObjectManager=new PageObjectManager();
		}
		
		
		return pageObjectManager;
	}
	
	
	

}
