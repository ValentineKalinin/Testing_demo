package com.solvd.carina.demo.gui.web.services;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.demo.gui.pages.*;
import com.solvd.carina.demo.gui.web.pages.CatalogPage;
import com.solvd.carina.demo.gui.web.pages.ComparedItemPage;
import com.solvd.carina.demo.gui.web.pages.HomePage;
import com.solvd.carina.demo.gui.web.pages.SearchPage;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class Search extends AbstractTest {
    public ComparedItemPage getSearchedItemPage(String string){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        CatalogPage catalogPage = homePage.clickCatalogLink();
        SearchPage searchPage = catalogPage.fillSearchField(string);
//        ComparedItemPage comparedItemPage = searchPage.clickSearchResult();
//        return comparedItemPage;
        return searchPage.clickSearchResult();
    }

}
