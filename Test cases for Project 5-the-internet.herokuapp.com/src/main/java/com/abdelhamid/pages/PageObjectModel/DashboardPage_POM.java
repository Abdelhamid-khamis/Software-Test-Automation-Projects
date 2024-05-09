package com.abdelhamid.pages.PageObjectModel;

import com.abdelhamid.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAllPage {

    DashboardPage_POM() {
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();

    }



}
