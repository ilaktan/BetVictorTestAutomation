package BetVictor.pages;

import BetVictor.utilities.ConfigurationReader;
import BetVictor.utilities.GenericFunctions;
import BetVictor.utilities.Pages;
import org.openqa.selenium.By;

public class Login extends GenericFunctions {
    CommonMethods commonMethods = new CommonMethods();
    public  void userClickTheAcceptButton(){
        waitFor(2);
        driver.findElement(By.xpath("//*[text()='I Agree.']")).click();




    }
}
