package com.edureka.stepDefinations;

import com.edureka.pages.LoginPage;
import com.edureka.utilities.BrowserUtils;
import com.edureka.utilities.ConfigurationReader;
import com.edureka.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginSteps {

    LoginPage login = new LoginPage();


    @Given("Student navigates to login page")
    public void student_navigates_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("Student clear the box and enter the mail adress to mail box")
    public void student_clear_the_box_and_enter_the_mail_adress_to_mail_box() {
        login.emailBox.clear();
        login.emailBox.sendKeys(ConfigurationReader.get("userName"));
    }
    @When("Student enter password to password box")
    public void student_enter_password_to_password_box() {
       login.passwordBox.clear();
       login.passwordBox.sendKeys(ConfigurationReader.get("password"));
    }
    @Then("Student click to login button")
    public void student_click_to_login_button() {
        login.loginButton.click();
        BrowserUtils.waitForClickablility(login.profilName,300);

        Assert.assertEquals(ConfigurationReader.get("name"),login.profilName.getText());
    }
}
