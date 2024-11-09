package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    private By errorMessage = By.cssSelector(".message-error");
    private By loggedInUser = By.cssSelector(".logged-in");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public boolean isLoginSuccessful() {
        try {
            return driver.findElement(loggedInUser).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}
