package com.solvd.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class WebTests extends AbstractPage {
    public WebTests(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class = 'auth-bar__item auth-bar__item--text']")
    private ExtendedWebElement btn;

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public String clickBtn() {
        assertElementPresent(btn);
        System.out.println(btn.getText());
        return btn.getText();

    }
}
