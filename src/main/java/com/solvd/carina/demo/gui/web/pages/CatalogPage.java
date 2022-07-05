package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage {
    @FindBy(xpath = "//*[@class=\"catalog-navigation__title\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//*[@class=\"fast-search__input\"]")
    private ExtendedWebElement searchField;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getSearchField() {
        return searchField;
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public SearchPage fillSearchField(String string) {
        searchField.click();
        searchField.type(string);
        WebElement iframe = driver.findElement(By.cssSelector(".modal-iframe"));
        driver.switchTo().frame(iframe);
        return new SearchPage(getDriver());
    }
}
