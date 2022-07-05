package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ComparedItemPage extends AbstractPage {
    @FindBy(xpath = "//h1[@class = \"catalog-masthead__title js-nav-header\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//span[@class=\"catalog-masthead-controls__input i-checkbox i-checkbox_yellow\"]")
    private ExtendedWebElement toCompareCheckBox;

    public ComparedItemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public void addToCompare(){
        toCompareCheckBox.click();
    }
}
