package com.pageObjectModel;

import com.baseClass.BaseClass;
import com.interfaceElement.InterfaceElement;
import com.pageObjectManager.PageObjectManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass implements InterfaceElement{
	@FindBy(id=login_id)
	private WebElement login;
	@FindBy(id=userName_id)
	private WebElement username;
	@FindBy(id=password_id)
	private WebElement password;
	@FindBy(xpath=LoginBtn_xpath)
	private WebElement loginBtn;
public LoginPage()	{
	PageFactory.initElements(driver, this);
}
public void validLogin() throws Exception {
	implicityWait(20);
	passInput(username, PageObjectManager.getpageObjectManager().getfileReaderManager().getDataProperty("username"));
	passInput(password,PageObjectManager.getpageObjectManager().getfileReaderManager().getDataProperty("password"));
	Thread.sleep(3000);
	click(loginBtn);

}

}
