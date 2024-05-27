package stepdefs;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BaseTest;

public class BaseStepDef {

    BaseTest baseTest = new BaseTest();

    @When("open application")
    public void start (){
    }

    @And("user click on navigation cart button")
    public void proceedToCart(){
        baseTest.proceedToCart();
    }

    @And("user waits till the page is loaded")
    public void loadPage(){
        Selenide.sleep(1000);
    }

}
