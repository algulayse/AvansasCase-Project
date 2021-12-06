package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods{

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementVisible(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),20);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

}
