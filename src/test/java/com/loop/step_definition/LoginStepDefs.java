package com.loop.step_definition;
import com.loop.page.LoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("docuport"));
    }
    @When("user enter username for client")
    public void user_enter_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.login,DocuportConstants.LARGE);
        loginPage.username.sendKeys(DocuportConstants.USERNAME_CLIENT);

    }
    @When("user enter password for client")
    public void user_enter_password_for_client() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);
    }
    @When("user  click login button")
    public void user_click_login_button() {
        loginPage.login.click();
    }
    @When("user need to click continue button")
    public void user_need_to_click_continue_button() {
        BrowserUtils.justWait(2000);
        loginPage.continueBunnton.click();
    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");
    }
    @Then("user need to click Batch1 Group3")
    public void user_need_to_click_batch1_group3() {
        loginPage.Batch1Group3.click();
    }
    @Then("user need to click LogOut button")
    public void user_need_to_click_log_out_button() {
         loginPage.logOut.click();
    }


    @When("user enter username for employees")
    public void user_enter_username_for_employees() {
        BrowserUtils.waitForClickable(loginPage.login,DocuportConstants.LARGE);
       loginPage.username.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
    }

    @When("user enter password for employees")
    public void user_enter_password_for_employees() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);
    }

    @Then("user should see the home page for employees")
    public void user_should_see_the_home_page_for_employees() {
        BrowserUtils.waitForClickable(loginPage.login,DocuportConstants.LARGE);
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");
    }

    @When("user enter username for advisor")
    public void user_enter_username_for_advisor() {
       loginPage.username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
    }
    @When("user enter password for advisor")
    public void user_enter_password_for_advisor() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);
    }
    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");
    }

    @When("user enter username for supervisor")
    public void user_enter_username_for_supervisor() {
       loginPage.username.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
    }
    @When("user enter password for supervisor")
    public void user_enter_password_for_supervisor() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);
    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");

    }


}
