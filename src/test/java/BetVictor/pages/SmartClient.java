package BetVictor.pages;

import BetVictor.utilities.GenericFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.text.DecimalFormat;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class SmartClient extends GenericFunctions {
    CommonMethods commonMethods = new CommonMethods();

    public void user_set_animal_letter(String letter){
        waitForElement("(//div//input)[2]");

        driver.findElement(By.xpath("(//div//input)[2]")).sendKeys(letter);
    }
    public void userOpenTheBrowserAmountSliderOnThe(String expectedMaxLifeSpan) {
        System.out.println(driver.findElement(By.xpath("(//*[text()='60'])[1]")).getText());

        Assert.assertEquals("expectedMaxLifeSpan different",expectedMaxLifeSpan,driver.findElement(By.xpath("(//*[text()='"+expectedMaxLifeSpan+"'])[1]")).getText());


    }
    public void userMoveMaxLifeSpanSliderFromBetweenToWithThisValueTo(String arg0, String arg1, String expectedMaxLifeSpan1, String expectedMaxLifeSpan2) {

        Actions moveSlider = new Actions(driver);
        Action action = moveSlider.dragAndDropBy(driver.findElement(By.xpath("//div[@id='isc_2D']")), -70, 0).build();

        action.perform();
       Assert.assertEquals("expectedMaxLifeSpan different",expectedMaxLifeSpan2,driver.findElement(By.xpath("(//*[text()='"+expectedMaxLifeSpan2+"'])[1]")).getText());



    }
    public void useClickTheAscendingBox (){
        click("//span[@class='checkboxFalse']");



    }
    public void userClickThe (String linkText){
        clickLinkWithText2(linkText);

    }
    public void userSortOrderBy (String linkText){
        clickLinkWithText2(linkText);

    }
    public void userClickTheSortBy (){
        click("(//div[@class='selectItemLiteText'])[4]");

    }
    public void calculateThe (String linkText){

        int lifespan=0;

        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"3'])")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 3",driver.findElement(By.xpath("(//*[text()='"+linkText+"3'])")).getText());
        //waitFor(1);
        isElementClickable("(//*[text()='"+linkText+"8'])");
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"8'])")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 8",driver.findElement(By.xpath("(//*[text()='"+linkText+"8'])")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"9'])")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 9",driver.findElement(By.xpath("(//*[text()='"+linkText+"9'])")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"10'])[2]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 10",driver.findElement(By.xpath("(//*[text()='"+linkText+"10'])[2]")).getText());
        //waitFor(1);
        isElementClickable("(//*[text()='"+linkText+"10'])[3]");
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"10'])[3]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 10",driver.findElement(By.xpath("(//*[text()='"+linkText+"10'])[3]")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"10'])[4]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 10",driver.findElement(By.xpath("(//*[text()='"+linkText+"10'])[4]")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"12'])")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 12",driver.findElement(By.xpath("(//*[text()='"+linkText+"12'])")).getText());
        lifespan=lifespan+1;
        //waitFor(1);
        isElementClickable("(//*[text()='"+linkText+"15'])[1]");
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"15'])[1]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 15",driver.findElement(By.xpath("(//*[text()='"+linkText+"15'])[1]")).getText());
        lifespan=lifespan+1;
        //waitFor(1);
        isElementClickable("(//*[text()='"+linkText+"15'])[3]");
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"15'])[3]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 15",driver.findElement(By.xpath("(//*[text()='"+linkText+"15'])[3]")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='" + linkText + "20'])[1]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 20",driver.findElement(By.xpath("(//*[text()='"+linkText+"20'])[1]")).getText());
        lifespan=lifespan+1;
        //waitFor(1);
        isElementClickable("(//*[text()='"+linkText+"20'])[3]");
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"20'])[3]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 20",driver.findElement(By.xpath("(//*[text()='"+linkText+"20'])[3]")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"20'])[5]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 20",driver.findElement(By.xpath("(//*[text()='"+linkText+"20'])[5]")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"25'])[1]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 25",driver.findElement(By.xpath("(//*[text()='"+linkText+"25'])[1]")).getText());
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"30'])[1]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 30",driver.findElement(By.xpath("(//*[text()='"+linkText+"30'])[1]")).getText());
        //waitFor(1);
        isElementClickable("(//*[text()='"+linkText+"30'])[2]");
        lifespan=lifespan+1;
        System.out.println(driver.findElement(By.xpath("(//*[text()='"+linkText+"30'])[2]")).getText());
        Assert.assertEquals("expectedMaxLifeSpan different","Lifespan: 30",driver.findElement(By.xpath("(//*[text()='"+linkText+"30'])[2]")).getText());
        lifespan=lifespan+1;


        System.out.println("Total lifespan = " + lifespan);

        if(lifespan<13){
            Assert.fail();
        }





    }
    public void userShouldSeeMoreThanItemsTotal(String arg0, String arg1, String arg2, String actualLocate){
        int lifespan=0;
        Assert.assertEquals("expectedMaxLifeSpan different",actualLocate,driver.findElement(By.xpath("Locate")).getText());
        lifespan=lifespan+1;
        System.out.println("lifespan = " + lifespan);


    }
    public void userClickTheItem (){
        //click("(//span[@class='comboBoxItemPicker'])[3]");
        click("(//div[@class='selectItemLiteText'])[3]");

    }
    public void userSelectItemContainsUnitsContainsUnitCostGreaterThen(String arg0, String arg1, String unitCost){


        Actions moveSlider = new Actions(driver);
        Action action = moveSlider.dragAndDropBy(driver.findElement(By.xpath("(//img[@class='vScrollThumbGrip'])[2]")), 0, 25).build();
        action.perform();

        System.out.println(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 240 Page']")).getText());
        org.testng.Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 240 Page']")).getText().startsWith(arg0));

        System.out.println(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 320 Page']/./../../../tr[5]/td[2]/div")).getText());
        org.testng.Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 320 Page']/./../../../tr[5]/td[2]/div")).getText().startsWith(arg1));

        System.out.println(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 240 Page']/./../../../tr[9]/td[3]/div")).getText());
        double actualUnitCost1 = Double.parseDouble(getTextFromElement("//*[text()='Exercise Book Sewn 240 Page']/./../../../tr[9]/td[3]/div"));
        actualUnitCost1=Double.parseDouble(new DecimalFormat("##.#####").format(actualUnitCost1));

        double expectedUnitCost=Double.parseDouble(unitCost);

        if(actualUnitCost1<=expectedUnitCost){
            fail();
        }


        System.out.println(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 320 Page']")).getText());
        org.testng.Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 320 Page']")).getText().startsWith(arg0));

        System.out.println(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 320 Page']/./../../../tr[4]/td[2]/div")).getText());
        org.testng.Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Exercise Book Sewn 320 Page']/./../../../tr[4]/td[2]/div")).getText().startsWith(arg1));


        System.out.println(driver.findElement(By.xpath("//*[text()='1.69']")).getText());
        double actualUnitCost2 = Double.parseDouble(getTextFromElement("//*[text()='1.69']"));
        actualUnitCost2=Double.parseDouble(new DecimalFormat("##.#####").format(actualUnitCost2));


        if(actualUnitCost2<=expectedUnitCost){
            fail();
        }



    }
}
