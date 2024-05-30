package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.Wait;

public class BaseTest {

    private final SelenideElement cartButton = $(By.xpath("//a[@class='nav-link' and text()='Cart']"));

    public void proceedToCart(){

        cartButton.should(Condition.visible, Duration.ofSeconds(5));

        cartButton.should(Condition.visible);
        cartButton.should(Condition.clickable);
        cartButton.click();
    }

}
