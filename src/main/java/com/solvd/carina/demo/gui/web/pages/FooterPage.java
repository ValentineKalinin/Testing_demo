package com.solvd.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.web.pages.footer.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends AbstractPage {
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][1]")
    private ExtendedWebElement aboutCompanyLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][3]")
    private ExtendedWebElement advertiseLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][9]")
    private ExtendedWebElement confidentialPolicyLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][6]")
    private ExtendedWebElement manifestLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][8]")
    private ExtendedWebElement publicContractLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][2]")
    private ExtendedWebElement redactionContactsLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][11]")
    private ExtendedWebElement rulesOfReturnLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][4]")
    private ExtendedWebElement tariffsLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][7]")
    private ExtendedWebElement userAgreementLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][10]")
    private ExtendedWebElement userSupportLink;
    @FindBy(xpath = "//*[@class=\"footer-style__item\"][5]")
    private ExtendedWebElement vacanciesLink;

    public FooterPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }
    public AboutCompanyPage clickAboutCompanyLink(){
        aboutCompanyLink.click();
        return new AboutCompanyPage(getDriver());
    }
    public AdvertisePage clickAdvertiseLink(){
        advertiseLink.click();
        return new AdvertisePage(getDriver());
    }
    public ConfidentialPolicyPage clickConfidentialPolicyLink(){
        confidentialPolicyLink.click();
        return new ConfidentialPolicyPage(getDriver());
    }
    public ManifestPage clickManifestLink(){
        manifestLink.click();
        return new ManifestPage(getDriver());
    }
    public PublicContractPage clickPublicContractLink(){
        publicContractLink.click();
        return new PublicContractPage(getDriver());
    }
    public RedactionContactsPage clickRedactionContactLink(){
        redactionContactsLink.click();
        return new RedactionContactsPage(getDriver());
    }
    public RulesOfReturnPage clickRulesOfReturnLink(){
        rulesOfReturnLink.click();
        return new RulesOfReturnPage(getDriver());
    }
    public TariffsPage clickTariffsLink(){
        tariffsLink.click();
        return new TariffsPage(getDriver());
    }
    public UserAgreementPage clickUserAgreementLink(){
        userAgreementLink.click();
        return new UserAgreementPage(getDriver());
    }
    public UserSupportPage clickUserSupportLink(){
        userSupportLink.click();
        return new UserSupportPage(getDriver());
    }
    public VacanciesPage clickVacanciesLink(){
        vacanciesLink.click();
        return new VacanciesPage(getDriver());
    }

}
