package Orange.Definitions;

import Orange.Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);


    @Given("^open the browser$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }

    @When("^the user fill out user (.*) password (.*)$")
    public void fillOutLogin(String userName, String password) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);
    }

    @When("^press the Login button$")
    public void clickLoginButton() {
        this.loginPage.clickLoginButton();
    }

    /*@Then("^I should be logged in$")
    public void iShouldBeLoggedIn(){

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("The expected title is not displayed", expectedTitle, actualTitle);
    }*/
}