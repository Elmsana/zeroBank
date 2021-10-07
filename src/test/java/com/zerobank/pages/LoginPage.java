package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
    @FindBy(css = "[id='user_login']")
    public WebElement userIdInput;

    @FindBy(css = "[id='user_password']")
    public WebElement userPasswordInput;

    @FindBy(css = "input[value='Sign in']")
    public WebElement signInButton;

    @FindBy(css = "div[class='alert alert-error']")
    public WebElement errorMessage;


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static void main(String[] args) {
      //  WebDriverManager driver = new ChromeDriverManager();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);


        System.out.println("secondpage");
        //input[@id='user_login']
    }

}
