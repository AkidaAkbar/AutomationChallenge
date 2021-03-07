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
        String path = this.getClass().getResource("/index.html").getPath();
        Driver.getDriver().get("file://" + path);
    }

    @Test
    public void Test1() {
        Assert.assertTrue("Validate that email address input is displayed.", homePage.getEmailAddressInput().isDisplayed());
        Assert.assertTrue("Validate that password input is displayed.", homePage.getPasswordInput().isDisplayed());
        Assert.assertTrue("Validate that sign in button is displayed.", homePage.getSignInButton().isDisplayed());

        homePage.enterEmail("aikede22@gmail.com");
        homePage.enterPassword("Hello1129!");
        homePage.clickSignIn();

    }

    @Test
    public void Test2() {
        int expectedNumberOfValues = 3;
        String expectedSecondItemValue = "List Item 2";
        String expectedSecondItemBadgeValue = "6";

        Assert.assertEquals("Validate that there are three values in the list group", expectedNumberOfValues, homePage.getListGroupElements().size());
        Assert.assertTrue("Validate that the second list item's value is set to List Item 2.", homePage.getListItemValues(2).contains(expectedSecondItemValue));
        Assert.assertEquals("Validate that the second list item's badge value is 6.", homePage.getListItemBadgeValues(2), expectedSecondItemBadgeValue);
    }

    @Test
    public void Test3() {
        Driver.scrollIntoMiddleView(homePage.getDefaultValue());
        Assert.assertTrue("Validate that Option 1 is the default selected value.", homePage.getDefaultValue().isDisplayed());
        homePage.clickOptionThree();
    }

    @Test
    public void Test4() {
        Driver.scrollIntoMiddleView(homePage.getFirstButton());
        Assert.assertTrue("Validate that the first button is enabled.", homePage.getFirstButton().isDisplayed());
        Assert.assertTrue("Validate that the second button is disabled.", homePage.getSecondButton().isDisplayed());

    }

    @Test
    public void Test5() {

        homePage.clickButton();
        Driver.scrollIntoMiddleView(homePage.getTest5Button());
        Assert.assertTrue("Validate that the success message has appeared.", homePage.getSuccessMessage().isDisplayed());
        Assert.assertTrue("Validate that the button is disabled.", homePage.verifyDisabledButton().isDisplayed());
    }

    @Test
    public void Test6() {
        Driver.scrollIntoMiddleView(homePage.getTest06Table().getContainer());
        String value = homePage.getTest06Table().getCellText(2, 2);
        String expectedValue = "Ventosanzap";
        Assert.assertEquals(expectedValue, value);
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
