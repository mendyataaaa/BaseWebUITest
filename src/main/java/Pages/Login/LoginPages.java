package Pages.Login;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends PageObject {

    @FindBy(css=".dropdown-login > #dropdownCurrency")
    WebElement dropDownLogin;

    public void clickDropDownLogin(){
        Assert.assertTrue(dropDownLogin.isDisplayed());
        dropDownLogin.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement buttonMenuLogin;

    public void clickLogin(){
        Assert.assertTrue(buttonMenuLogin.isDisplayed());
        buttonMenuLogin.click();
    }

    @FindBy(name = "username")
    WebElement textFieldUsername;

    public void setUsername(){
        textFieldUsername.isDisplayed();
        textFieldUsername.sendKeys("maulana123@gmail.com");
    }

    @FindBy(name = "password")
    WebElement textFieldUPassword;

    public void setPassword(){
        textFieldUPassword.isDisplayed();
        textFieldUPassword.sendKeys("12345");
    }

    @FindBy(css = ".btn-lg")
    WebElement buttonLogin;

    public void clickBtnLogin(){
        buttonLogin.isDisplayed();
        buttonLogin.click();
    }

    @FindBy(css = ".alert")
    WebElement allertDialog;

    public void validateAlert(){
        allertDialog.isDisplayed();
        String alert = allertDialog.getText();
        System.out.println("Debug : " + alert);
        Assert.assertTrue(alert.equals("Invalid Email or Password"));
    }

}
