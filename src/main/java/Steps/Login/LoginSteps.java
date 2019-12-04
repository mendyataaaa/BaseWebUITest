package Steps.Login;

import Pages.Login.LoginPages;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    LoginPages loginPages;

    public void openPHPTravelsPage(){
        loginPages.open();
    }

    public void openLoginPage(){
        loginPages.clickDropDownLogin();
        loginPages.clickLogin();
    }

    public void isiForm(){
        loginPages.setUsername();
        loginPages.setPassword();
        loginPages.clickBtnLogin();
    }

    public void validasi(){
        loginPages.validateAlert();
    }

}

