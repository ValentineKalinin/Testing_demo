package com.solvd.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.CompareModelsPage;
import com.solvd.carina.demo.gui.pages.HomePageSample;
import com.solvd.carina.demo.gui.pages.NewsPageSample;

public class FooterMenu extends AbstractUIObject {
    @FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//div[@class='footer-inner']//a[contains(text(),'Compare')]")
    private ExtendedWebElement compareLink;
    
    @FindBy(linkText = "News")
    private ExtendedWebElement newsLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePageSample openHomePage() {
        homeLink.click();
        return new HomePageSample(driver);
    }

    public CompareModelsPage openComparePage() {
        compareLink.click();
        return new CompareModelsPage(driver);
    }
    
    public NewsPageSample openNewsPage() {
        newsLink.click();
        return new NewsPageSample(driver);
    }
}
