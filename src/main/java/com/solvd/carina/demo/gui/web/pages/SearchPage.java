package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {
    @FindBy(xpath = "(//div[@class=\"result__item result__item_product\"])[1]/*[@class=\"product__preview\"]")
    private ExtendedWebElement searchResult;

    @FindBy(xpath = "//a[@class=\"compare-button__sub compare-button__sub_main\"]")
    private ExtendedWebElement compareBtn;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage getSearchPopup() {
        HomePage homePage = new HomePage(getDriver());
        CatalogPage catalogPage = homePage.clickCatalogLink();
        catalogPage.getSearchField().click();
        catalogPage.getSearchField().type("Iphone");
        WebElement iframe = driver.findElement(By.cssSelector(".modal-iframe"));
        driver.switchTo().frame(iframe);
        return new SearchPage(getDriver());
    }

    public ComparedItemPage clickSearchResult() {
        searchResult.click();
        return new ComparedItemPage(getDriver());
    }

    public ComparePage clickCompareBtn(){
        compareBtn.click();
        return new ComparePage(getDriver());
    }
}
