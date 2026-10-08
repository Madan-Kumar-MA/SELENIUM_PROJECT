package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    private WebDriver driver;

    private By usernamebox = By.id("Email");
    private By passwordbox = By.id("Password");
    private By loginbox = By.xpath("//button[@type='submit']");

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void username(String username) {
        driver.findElement(usernamebox).clear();
        driver.findElement(usernamebox).sendKeys(username);
    }

    public void password(String password) {
        driver.findElement(passwordbox).clear();
        driver.findElement(passwordbox).sendKeys(password);
    }

    public void login() {
        driver.findElement(loginbox).click();
    }
}