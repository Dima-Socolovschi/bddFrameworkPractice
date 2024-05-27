package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    private final SelenideElement cartButton = $(By.xpath("//a[@class='nav-link' and text()='Cart']"));

    public void proceedToCart(){
        cartButton.should(Condition.visible);
        cartButton.should(Condition.clickable);
        cartButton.click();
    }

}
