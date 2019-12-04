package Login;

import Steps.Login.LoginSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Login extends SerenityStory {

    @Steps
    LoginSteps loginSteps;

    @Given("I open PhpTravels login page")
    public void givenIOpenPhpTravelsLoginPage() {
        // PENDING
        loginSteps.openPHPTravelsPage();
    }

    @When("I input invalid email email and password")
    public void whenIInputEmailEmailAndPassword() {
        // PENDING
        loginSteps.openLoginPage();
    }

    @When("I click button login")
    public void whenIClickButtonLogin() {
        // PENDING
        loginSteps.isiForm();
    }

    @Then("I can see my news feed")
    public void thenICanSeeMyNewsFeed() {
        // PENDING
        loginSteps.validasi();
    }

}