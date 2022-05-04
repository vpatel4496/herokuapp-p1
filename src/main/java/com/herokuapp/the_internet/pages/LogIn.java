package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utilities.Utility;
import org.openqa.selenium.By;

public class LogIn extends Utility {

    //================== userSholdLoginSuccessfullyWithValidCredentials()=================
    // Enter username
    By UserName = By.xpath("//input[@type='text']");
    public void enterValidUserName(String Validusername){
        sendTextToElement(UserName,Validusername);
    }
    // Enter password
    By Password = By.id("password");
    public void enterValidPassword(String Validpassword){
        sendTextToElement(Password,Validpassword);
    }
    // click on login button
    By Login = By.xpath("//button[@type='submit']");
    public void clickOnLogin(){
        clickOnElement(Login);
    }
    // verify text "Secure Area"
    By SecureAreaText = By.xpath("//h2[contains(text(),' Secure Area')]");
    public String VerifySecureArea(){
        return getTextFromElement(SecureAreaText);
    }


    //=================== verifyTheUsernameErrorMessage() ===================================
    // Enter invalid username
    public void enterInvalidUserName(String Invalidusername){
        sendTextToElement(UserName,Invalidusername);
    }
    // Enter valid password
    public void enterInValidPassword(String InValidpassword){
        sendTextToElement(Password,InValidpassword);
    }
    // click on login button

    // verify text "Secure Area"
    By ErrorText = By.xpath("//div[@class='flash error'] ");
    public String VerifyError(){
        return getTextFromElement(ErrorText);
    }


//===============verifyThePasswordErrorMessage()===============================
    // Enter invalid username

    // Enter valid password

    // click on login button

    // verify text "Secure Area"
}
