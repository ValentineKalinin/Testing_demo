package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutoSellPage extends AbstractPage {
    public static final Logger LOGGER = LogManager.getLogger(AutoSellPage.class);
    @FindBy(css = "//*[@class=\"vehicle-form__title vehicle-form__title_big-alter\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "(//*[@class=\"input-style__real\"])[4]")
    private ExtendedWebElement modelField;
    @FindBy(xpath = "(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]")
    private ExtendedWebElement searchField;
    @FindBy(xpath = "(//*[@class=\"dropdown-style__checkbox-sign\"])[24]")
    private ExtendedWebElement searchResult;

    public AutoSellPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getModelField() {
        return modelField;
    }

    public ExtendedWebElement getSearchField() {
        return searchField;
    }

    public ExtendedWebElement getSearchResult() {
        return searchResult;
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }
}
