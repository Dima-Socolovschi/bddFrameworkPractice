package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class IndexPage {

    //Locators
    private final SelenideElement phoneCategoryLocator = $(By.xpath("//a[@class='list-group-item' and text()='Phones']"));
    private final ElementsCollection phoneNameLocators = $$(By.xpath("//a[@class='hrefch']"));

    public void clickOnPhoneCategory(){
        phoneCategoryLocator.should(Condition.clickable);
        phoneCategoryLocator.should(Condition.visible);
        phoneCategoryLocator.click();
    }

    public void choosePhone(String phoneName){
        for(SelenideElement element : phoneNameLocators){
            if(element.getText().equals(phoneName)){
                element.should(Condition.visible);
                element.should(Condition.clickable);
                element.click();
                break;
            }
        }
    }

}
