package com.solvd.carina.demo.gui.web.pages.auto;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutoPage extends AbstractPage implements IRating {

    @FindBy(xpath = "//*[@class=\"vehicle-form__title vehicle-form__title_big-alter\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//*[@class=\"vehicle-form__title vehicle-form__title_base\"]")
    private ExtendedWebElement rating;

    public AutoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public float getRating() {
        return Float.valueOf(rating.getText().replaceAll(",", "."));
    }
}


