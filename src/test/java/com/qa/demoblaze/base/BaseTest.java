package com.qa.demoblaze.base;

import com.microsoft.playwright.Page;
import com.qa.demoblaze.factory.PlaywrightFactory;
import com.qa.demoblaze.pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;
   protected Properties prop;
   protected HomePage homePage;


    @BeforeTest
    public void setup(){
        pf = new PlaywrightFactory();
        prop =  pf.init_prop();
        page = pf.initBrowser(prop);
        homePage = new HomePage(page);
    }

    @AfterTest
    public void tearDown() {
        page.context().browser().close();
    }
}
