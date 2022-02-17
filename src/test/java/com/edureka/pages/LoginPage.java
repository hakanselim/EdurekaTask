package com.edureka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(id = "si_popup_email")
    public WebElement emailBox;

    @FindBy(id = "si_popup_passwd")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='clik_btn_log btn-block']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='webinar-profile-name']")
    public WebElement profilName;


}
