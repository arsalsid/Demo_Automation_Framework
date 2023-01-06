package com.qa.demoblaze.pages;

import Utils.CommonMethods;
import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    //1. String Locators - OR
    private String userNameLocator = "//input[@id= 'loginusername']";
    private String passwordLocator = "//input[@id= 'loginpassword']";
    private String loginLocator = "//button[text()= 'Log in']";



    //2. page Constructor:
    public LoginPage(Page page){
        this.page = page;
    }

    //3. page actions/methods:
    public String getLoginPageTitle() {
        String title = page.title();
        System.out.println("page title: " + title);
        return title;
    }

    public void enterText(String appUserName, String appPassword) throws Exception {
        System.out.println("App credentials: " + appUserName + ":" + appPassword);
        CommonMethods.enterText(userNameLocator,appUserName);
        CommonMethods.enterText(passwordLocator, appPassword);
        CommonMethods.clickOnElement(loginLocator);
    }
}
