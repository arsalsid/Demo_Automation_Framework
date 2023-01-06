package com.qa.demoblaze.pages;

import Utils.CommonMethods;
import com.microsoft.playwright.Page;

import java.net.MalformedURLException;

public class HomePage {

    private Page page;
  //  CommonMethods commonMethods = new CommonMethods(null);


    //1. String Locators - Object Repository

    private String clickOnSearchProductLocator = "//a[text()= 'Samsung galaxy s6']";
    private String searchProductPageHeaderLocator = "//h2[text()= 'Samsung galaxy s6']";
    private String loginLinkLocator = "login2";


    //2. page Constructor:
    public HomePage(Page page){
        this.page = page;
    }

    //3. page actions/methods:
    public String getHomePageTitle() {
        String title = page.title();
        System.out.println("page title: " + title);
        return title;
    }

    public String getHomePageURL() {
        String url = page.url();
        System.out.println("page url : " + url);
        return url;
    }

    public String clickOnProduct() throws InterruptedException {
        CommonMethods.clickOnElement(clickOnSearchProductLocator);
        String header = page.textContent(searchProductPageHeaderLocator);
        System.out.println("search header: " + header);
        return header;
    }

    public LoginPage navigateToLoginPage() {
        CommonMethods.clickOnElement(loginLinkLocator);
        return new LoginPage(page);
    }
}
