package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    WebDriver driver;

    // Locators for the fields and buttons
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("password-confirm");
    private By createAccountButton = By.xpath("//button[@title='Create an Account']");
    private By errorMessage = By.cssSelector(".message-error");
    private By successMessage = By.cssSelector(".account-create-success");
    private By createAccountSuccessElement = By.cssSelector(".dashboard");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public boolean isAccountCreated() {
        try {
            return driver.findElement(createAccountSuccessElement).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void signUp(String firstName, String lastName, String email, String password, String confirmPassword) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        clickCreateAccountButton();
    }
}
