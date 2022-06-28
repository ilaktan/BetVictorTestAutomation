package BetVictor.pages;

import BetVictor.utilities.GenericFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class CommonMethods extends GenericFunctions {

    public void assertGetLinkTextWith(String linkText) {
        try {
            System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"")).getText());

            Assert.assertEquals("expectedMaxLifeSpan different",linkText.substring(0,8),driver.findElement(By.xpath("(//*[text()='"+linkText+"'])")).getText());



        } catch (NoSuchElementException e) {
            Assert.fail("Link text can not found on the page");
            e.printStackTrace();
        }

    }
    public void getLinkTextWith(String linkText) {
        try {

            driver.findElement(By.xpath("(//*[text()='"+linkText+"'])")).getText();



        } catch (NoSuchElementException e) {
            Assert.fail("Link text can not found on the page");
            e.printStackTrace();
        }

    }
}
