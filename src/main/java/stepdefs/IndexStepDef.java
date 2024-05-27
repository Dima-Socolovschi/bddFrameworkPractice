package stepdefs;

import io.cucumber.java.en.*;
import pages.IndexPage;

public class IndexStepDef {

    IndexPage indexPage = new IndexPage();

    @When("user click on phones category")
    public void choosePhoneCategory(){
        indexPage.clickOnPhoneCategory();
    }

    @And("user click on {string} phone")
    public void clickOnThePhone(String phoneName){
        indexPage.choosePhone(phoneName);
    }

}
