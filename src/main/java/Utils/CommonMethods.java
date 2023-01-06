package Utils;

import com.microsoft.playwright.Page;
import com.qa.demoblaze.factory.PlaywrightFactory;

import java.io.IOException;
import java.util.NoSuchElementException;

public class CommonMethods extends PlaywrightFactory {

    public static void clickOnElement(String elementLocator) {
        try {
            page.click(elementLocator);
        }catch (NoSuchElementException e) {
            System.out.println("Unable to click element with the given element Locator");
        }
    }

    public static void enterText(String xpath, String value) {
        try {
            page.fill(xpath, value);
        }catch (NoSuchElementException e) {
            System.out.println("Unable to find element with the given element Locator");
        }
    }

}
