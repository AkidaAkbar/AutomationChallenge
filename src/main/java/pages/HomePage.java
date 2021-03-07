package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;


import static org.openqa.selenium.By.*;

public class HomePage {
    private static final By EMAIL_ADDRESS_INPUT = id("inputEmail");
    private static final By PASSWORD_INPUT = id("inputPassword");
    private static final By SIGN_IN_BUTTON = xpath("//button[@type='submit']");
    private static final By VALUE_ONE = xpath("//*[@id='test-2-div']/ul/li[1]");
    private static final By VALUE_TWO = xpath("//*[@id='test-2-div']/ul/li[2]");
    private static final By VALUE_THREE = xpath("//*[@id='test-2-div']/ul/li[3]");
    private static final By SECOND_BADGE_VALUE = xpath("//*[@id='test-2-div']/ul/li[2]/span");
    private static final By DROPDOWN_LIST = xpath("//*[@id='dropdownMenuButton']");
    private static final By OPTION_THREE = xpath("//*[@id='test-3-div']/div/div/a[3]");
    private static final By BUTTON_ENABLED= xpath("//button[@class='btn btn-lg btn-primary']");
    private static final By BUTTON_DISABLED = xpath("//button[@class='btn btn-lg btn-secondary']");
    private static final By BUTTON= xpath("//*[@id='test5-button']");
    private static final By SUCCESS_MESSAGE= xpath("//*[@id='test5-alert']");

    public void enterEmail(String email){
        Driver.getDriver().findElement(EMAIL_ADDRESS_INPUT).sendKeys(email);
    }

    public void enterPassword(String password){
        Driver.getDriver().findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickSignIn(){
        Driver.getDriver().findElement(SIGN_IN_BUTTON).click();
    }

    public WebElement getEmailAddressInput(){
        return Driver.getDriver().findElement(EMAIL_ADDRESS_INPUT);
    }

    public WebElement getPasswordInput(){
        return Driver.getDriver().findElement(PASSWORD_INPUT);
    }

    public WebElement getSignInButton(){
        return Driver.getDriver().findElement(SIGN_IN_BUTTON);
    }
    public WebElement getThreeValues(){
        return Driver.getDriver().findElement(VALUE_ONE).findElement(VALUE_TWO).findElement(VALUE_THREE);
    }

    public WebElement getSecondItem(){
        return Driver.getDriver().findElement(VALUE_TWO);
    }

    public WebElement getSecondBadgeValue(){
        return Driver.getDriver().findElement(SECOND_BADGE_VALUE);
    }

    public WebElement getDefaultValue(){
        return Driver.getDriver().findElement(DROPDOWN_LIST);
    }

    public void clickOptionThree(){
        Driver.getDriver().findElement(DROPDOWN_LIST).click();
        Driver.getDriver().findElement(OPTION_THREE).click();
    }
    public WebElement getFirstButton(){
        return Driver.getDriver().findElement(BUTTON_ENABLED);
    }

    public WebElement getSecondButton(){
        return Driver.getDriver().findElement(BUTTON_DISABLED);
    }
    public void clickButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BUTTON));
        element.click();
    }
    public WebElement getSuccessMessage() {
        return Driver.getDriver().findElement(SUCCESS_MESSAGE);
    }
    public WebElement verifyDisabledButton() {
        return Driver.getDriver().findElement(BUTTON);
    }
}
