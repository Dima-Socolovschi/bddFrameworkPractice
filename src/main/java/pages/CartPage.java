package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    private final ElementsCollection checkoutRows = $$(By.xpath("//tr[@class='success']"));
    private final SelenideElement placeOrderButton = $(By.xpath("//button[@class=('btn btn-success')]"));
    private final SelenideElement nameField = $(By.xpath("//input[@id=('name')]"));
    private final SelenideElement countryField = $(By.xpath("//input[@id=('country')]"));
    private final SelenideElement cityField = $(By.xpath("//input[@id=('city')]"));
    private final SelenideElement creditCardField = $(By.xpath("//input[@id=('card')]"));
    private final SelenideElement monthField = $(By.xpath("//input[@id=('month')]"));
    private final SelenideElement yearField = $(By.xpath("//input[@id=('year')]"));
    private final SelenideElement purchaseButton = $(By.xpath("//button[@class='btn btn-primary' and text()='Purchase']"));
    private final SelenideElement orderCredentials = $(By.xpath("//p[@class='lead text-muted ']"));

    public void checkIfTheProductIsInTheCart(String product){

        boolean isProductInTheCart = false;

        for(SelenideElement element : checkoutRows){
            if(element.getText().contains(product)){
                isProductInTheCart = true;
                break;
            }
        }

        Assert.isTrue(isProductInTheCart, "Product "+ product + " is not in the cart.");
    }

    public void clickOnPlaceOrderButton(){
        placeOrderButton.should(Condition.clickable);
        placeOrderButton.should(Condition.visible);
        placeOrderButton.click();

    }

    public void insertName(String name){
        nameField.should(Condition.visible);
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void insertCountry(String country){
        countryField.should(Condition.visible);
        countryField.clear();
        countryField.sendKeys(country);
    }

    public void insertCity(String city){
        cityField.should(Condition.visible);
        cityField.clear();
        cityField.sendKeys(city);
    }

    public void insertCreditCard(String creditCard){
        creditCardField.should(Condition.visible);
        creditCardField.clear();
        creditCardField.sendKeys(creditCard);
    }

    public void insertMonth(String month){
        monthField.should(Condition.visible);
        monthField.clear();
        monthField.sendKeys(month);
    }

    public void insertYear(String year){
        yearField.should(Condition.visible);
        yearField.clear();
        yearField.sendKeys(year);
    }

    public void clickOnPurchaseButton(){
        purchaseButton.should(Condition.visible);
        purchaseButton.should(Condition.clickable);
        purchaseButton.click();
    }

    public void checkIfOrderIsFinished(){
        Assert.isTrue(orderCredentials.getText().contains("Id"), "Order summary is not visible");
    }

}
