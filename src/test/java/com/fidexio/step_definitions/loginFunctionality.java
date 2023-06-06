package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginFunctionality {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the fidexio login page")
    public void userIsOnTheFidexioLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("user enters {string} in username field")
    public void userEntersInUsernameField(String user) {
        loginPage.username.sendKeys(user);
    }

    @And("user enters {string} in password field")
    public void userEntersInPasswordField(String pw) {
        loginPage.password.sendKeys(pw);

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginPage.loginButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        Assert.assertEquals("#Inbox - Odoo", Driver.getDriver().getTitle());

    }



}
