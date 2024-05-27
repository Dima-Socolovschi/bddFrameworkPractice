package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartPageDef {

    CartPage cartPage = new CartPage();

    @And("user should see {string} in the cart")
    public void checkIfItemIsInTheCart(String item){
        cartPage.checkIfTheProductIsInTheCart(item);
    }

    @And("user click on Place Order button")
    public void clickOnPlaceOrderButton(){
        cartPage.clickOnPlaceOrderButton();
    }

    @And("user enters the name {string}")
    public void userEntersTheName(String name) {
        cartPage.insertName(name);
    }

    @And("user enters the country {string}")
    public void userEntersTheCountry(String country) {
        cartPage.insertCountry(country);
    }

    @And("user enters the city {string}")
    public void userEntersTheCity(String city) {
        cartPage.insertCity(city);
    }

    @And("user enters the credit card {string}")
    public void userEntersTheCreditCard(String creditCard) {
        cartPage.insertCreditCard(creditCard);
    }

    @And("user enters the month {string}")
    public void userEntersTheMonth(String month) {
        cartPage.insertMonth(month);
    }

    @And("user enters the year {string}")
    public void userEntersTheYear(String year) {
        cartPage.insertYear(year);
    }

    @And("user click on Purchase button")
    public void userClickOnPurchaseButton() {
        cartPage.clickOnPurchaseButton();
    }

    @Then("user should see order summary")
    public void userShouldSeeOrderSummary() {
        cartPage.checkIfOrderIsFinished();
    }
}
