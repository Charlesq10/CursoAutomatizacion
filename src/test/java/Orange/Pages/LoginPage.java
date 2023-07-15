package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Encontrar elemento de la pagina, input UserName
    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement btnLogin;

    //Constructor
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Metodos
    public void fillOutLogin(String userName, String password) {
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
    }

    public void clickLoginButton(){
        this.btnLogin.click();
    }
}
