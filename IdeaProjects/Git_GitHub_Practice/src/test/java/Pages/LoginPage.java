package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);}

        @FindBy(id="prependedInput")
        public WebElement username;

        @FindBy(id="prependedInput2")
        public WebElement password;

        @FindBy(id="_submit")
        public WebElement loginButton;

        public void login(String usernameStr,String passwordStr ){
            username.sendKeys(usernameStr);
            password.sendKeys(passwordStr);
            loginButton.click();
        }



}
