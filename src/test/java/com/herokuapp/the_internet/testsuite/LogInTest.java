package com.herokuapp.the_internet.testsuite;

import com.herokuapp.the_internet.pages.LogIn;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    LogIn login = new LogIn();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        // Enter username
        login.enterValidUserName("tomsmith");
        // Enter password
        login.enterValidPassword("SuperSecretPassword!");
        // click on login button
        login.clickOnLogin();
        // verify text "Secure Area"
        String actualSecureText = login.VerifySecureArea();
        String expectedSecureText = "Secure Area";
        Assert.assertEquals(actualSecureText,expectedSecureText);
    }
    @Test
    public void verifyTheUsernameErrorMessage() {
        // Enter username
        login.enterInvalidUserName("tomsmith1");
        // Enter password
        login.enterInValidPassword("SuperSecretPassword!");
        // click on login button
        login.clickOnLogin();
        // verify text "Secure Area"
        String actualErrorText = login.VerifyError();
        String expectedErrorText = "Your username is invalid!";
        Assert.assertEquals(actualErrorText,expectedErrorText);
    }
    @Test
    public void verifyThePasswordErrorMessage() {
        // Enter username
        login.enterInvalidUserName("tomsmith");
        // Enter password
        login.enterInValidPassword("SuperSecretPassword");
        // click on login button
        login.clickOnLogin();
        // verify text "Secure Area"
        String actualErrorText = login.VerifyError();
        String expectedErrorText = "Your password is invalid!";
        Assert.assertEquals(actualErrorText,expectedErrorText);
    }
}
