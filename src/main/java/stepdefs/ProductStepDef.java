package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductPage;

public class ProductStepDef {

    ProductPage productPage = new ProductPage();

    @Then("user should see {string} phone page")
    public void checkIfThePhoneIsCorrect(String phoneName){
        productPage.isTheSelectedTelephoneSelected(phoneName);
    }

    @And("user click on add to cart button")
    public void clickOnAddToCartButton(){
        productPage.clickAddToCartButton();
    }

    @Then("user should see an alert with {string} message")
    public void checkIfAlertTextIsCorrect(String message){
        productPage.checkIfAlertMessageIsCorrect(message);
    }

}
