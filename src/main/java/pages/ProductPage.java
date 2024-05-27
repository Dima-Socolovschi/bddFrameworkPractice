package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    //Locator
    private final SelenideElement phoneNameLocator = $(By.xpath("//h2[@class='name']"));
    private final SelenideElement addToCartButtonLocator = $(By.xpath("//a[@class='btn btn-success btn-lg']"));

    public void isTheSelectedTelephoneSelected(String phoneName){
        phoneNameLocator.should(Condition.visible);
        phoneNameLocator.should(Condition.exactText(phoneName));
    }

    public void clickAddToCartButton(){
        addToCartButtonLocator.should(Condition.visible);
        addToCartButtonLocator.should(Condition.clickable);
        addToCartButtonLocator.click();
        Selenide.sleep(1000);
    }

    public void checkIfAlertMessageIsCorrect(String message){
        Alert alert = WebDriverRunner.getWebDriver().switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        Assert.isTrue(message.equals(alertMessage), "Alert message is not correct.");
    }

}
