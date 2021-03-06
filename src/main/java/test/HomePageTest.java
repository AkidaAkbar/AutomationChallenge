package test;

import org.junit.jupiter.api.Test;
import utils.Driver;


public class HomePageTest {

    @Test
    public void Test1() {
        Driver.getDriver().get("file:///Users/akidaakbar/Desktop/AutomationChallenge-2020/index.html#");


    }
}
