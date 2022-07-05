package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Каталог']")
    private ExtendedWebElement catalogLink;

    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Новости']")
    private ExtendedWebElement newsLink;

    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Автобарахолка']")
    private ExtendedWebElement autoSellLink;

    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Дома и квартиры']")
    private ExtendedWebElement housesLink;

    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Услуги']")
    private ExtendedWebElement servicesLink;

    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Барахолка']")
    private ExtendedWebElement baraholkaLink;

    @FindBy(xpath = "//span[@class=\"b-main-navigation__text\"][text()='Форум']")
    private ExtendedWebElement forumLink;

    @FindBy(xpath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]")
    private ExtendedWebElement loginBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public CatalogPage clickCatalogLink() {
        catalogLink.click();
        return new CatalogPage(getDriver());
    }

    public NewsPage clickNewsLink() {
        newsLink.click();
        return new NewsPage(getDriver());
    }

    public AutoSellPage clickAutoSellLink() {
        autoSellLink.click();
        return new AutoSellPage(getDriver());
    }

    public HousesPage clickHosesLink() {
        housesLink.click();
        return new HousesPage(getDriver());
    }

    public ServicesPage clickServicesLink() {
        servicesLink.click();
        return new ServicesPage(getDriver());
    }

    public BaraholkaPage clickBaraholkaLink() {
        baraholkaLink.click();
        return new BaraholkaPage(getDriver());
    }

    public ForumPage clickForumLink() {
        forumLink.click();
        return new ForumPage(getDriver());
    }

    public LoginPage clickLoginBtn() {
        loginBtn.click();
        return new LoginPage(getDriver());
    }
}
