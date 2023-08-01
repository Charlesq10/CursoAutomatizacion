package Orange.Pages;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private ButtonPages buttonPages;
    private Questions questions;
    //Encontrar elemento de la pagina, input UserName
    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;

    //Constructor
    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    //Metodos
    public void fillOutLogin(String userName, String password) {
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
        this.buttonPages.btnLogin();
        this.questions.timeSecond(5);
        this.questions.screenShot();
    }

}
