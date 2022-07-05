package com.solvd.carina.demo.gui.web.pages.footer;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RulesOfReturnPage extends AbstractPage {

    @FindBy(xpath = "//*[@class=\"news-header__title\"]")
    private ExtendedWebElement title;

    public RulesOfReturnPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

}

