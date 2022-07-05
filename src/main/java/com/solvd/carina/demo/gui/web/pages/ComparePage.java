package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends AbstractPage {
    @FindBy(xpath = "(//span[@class=\"value__text\"])[3]")
    private ExtendedWebElement firstTypeOfDevice;
    @FindBy(xpath = "(//span[@class=\"value__text\"])[4]")
    private ExtendedWebElement secondTypeOfDevice;

    public ComparePage(WebDriver driver) {
        super(driver);
    }
    public boolean isSimilarType(){
        boolean result=false;
        if(firstTypeOfDevice.getText().equals(secondTypeOfDevice.getText()))
            result = true;
        return result;
    }
}
