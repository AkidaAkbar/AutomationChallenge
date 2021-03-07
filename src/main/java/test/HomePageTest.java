package test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import utils.Driver;


public class HomePageTest {
    HomePage homePage = new HomePage();
    @Before
    public void setUp() {
        Driver.getDriver().get("file:///Users/akidaakbar/Desktop/AutomationChallenge-2020/index.html#");
    }
    @Test
    public void Test1() {
        Assert.assertTrue("Validate that email address input is displayed.",homePage.getEmailAddressInput().isDisplayed());
        Assert.assertTrue("Validate that password input is displayed.",homePage.getPasswordInput().isDisplayed());
        Assert.assertTrue("Validate that sign in button is displayed.",homePage.getSignInButton().isDisplayed());

        homePage.enterEmail("aikede22@gmail.com");
        homePage.enterPassword("Hello1129!");
        homePage.clickSignIn();

    }
    @Test
    public void Test2(){
        Assert.assertTrue("Validate that there are three values in the list group.",homePage.getThreeValues().isDisplayed());
        Assert.assertTrue("Validate that the second list item's value is set to List Item 2.",homePage.getSecondItem().isDisplayed());
        Assert.assertTrue("Validate that the second list item's badge value is 6.",homePage.getSecondBadgeValue().isDisplayed());
    }
    @Test
    public void Test3(){
        Assert.assertTrue("Validate that Option 1 is the default selected value.",homePage.getDefaultValue().isDisplayed());
        homePage.clickOptionThree();
    }

    @Test
    public void Test4(){
        Assert.assertTrue("Validate that the first button is enabled.",homePage.getFirstButton().isDisplayed());
        Assert.assertTrue("Validate that the second button is disabled.",homePage.getSecondButton().isDisplayed());

    }
    @Test
    public void Test5(){
        homePage.clickButton();
        Assert.assertTrue("Validate that the success message has appeared.",homePage.getSuccessMessage().isDisplayed());
        Assert.assertTrue("Validate that the button is disabled.",homePage.verifyDisabledButton().isDisplayed());
    }

    @Test
    public void Test6(){

    }

    @After
    public void tearDown(){
        Driver.getDriver().close();
        Driver.getDriver().quit();
    }


}
