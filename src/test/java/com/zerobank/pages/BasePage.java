package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[class='nav nav-tabs']>li")
    public List<WebElement> navigationTabs;

    public static void main(String[] args) {
        //  WebDriverManager driver = new ChromeDriverManager();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



    }
}
