package com.qa.demoblaze.tests;
import com.qa.demoblaze.base.BaseTest;
import com.qa.demoblaze.constants.AppConstants;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void  homePageTitleTest() {
        String actualTitle = homePage.getHomePageTitle();
        Assert.assertEquals(actualTitle, AppConstants.LOGIN_PAGE_TITLE);
    }
    @Test
    public void  homePageURLTest() {
        String actualUrl = homePage.getHomePageURL();
        Assert.assertEquals(actualUrl, prop.getProperty("url"));
    }

    @Test
    public void clickOnProductTest() throws InterruptedException {
        String actualSearchHeader =  homePage.clickOnProduct();
        Assert.assertEquals(actualSearchHeader,  "Samsung galaxy s6");
    }

    //Multiple search data
//    @DataProvider
//    public Object[][] getProductData() {
//        return new Object[][] {
//
//                {"Samsung galaxy s6"},
//                {"Nokia lumia 1520"},
//                {"Nexus 6"}
//        };
//    }

}
