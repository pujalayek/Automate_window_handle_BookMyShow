package demo;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

import com.google.common.io.Files;

public class TestCases {
   static ChromeDriver driver;

    public static ChromeDriver TestCasesInitializer() {
        System.out.println("Driver initialization");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
//SESSION 4 ASSIGMENTS
    public void testCase07() throws InterruptedException, AWTException{
        
        System.out.println("Start Test case: testCase07");
        NestedFramesText NestedFrames = new NestedFramesText();
        NestedFrames.NestedFramesT();
        
//             public void testCase07() {
//         System.out.println("Start testCase: testCase07");
//         //Navigate to URL  https://the-internet.herokuapp.com/nested_frames
//         driver.get("https://the-internet.herokuapp.com/nested_frames");
//         driver.switchTo().frame("frame-top");
//         driver.switchTo().frame("frame-left");
        
//         //Search for the first BODY in html code Using Locator "XPath" //body[contains(text(),'LEFT')]
//         String leftText = driver.findElementByXPath("//body[contains(text(),'LEFT')]").getText();
//         System.out.println("First Text: "+ leftText);

//         driver.switchTo().parentFrame();
//         driver.switchTo().frame("frame-middle");

//         //Search for the middle BODY in html code Using Locator "XPath" //div[contains(text(),'MIDDLE')]
//         String middleText = driver.findElementByXPath("//div[contains(text(),'MIDDLE')]").getText();
//         System.out.println("Second Text: "+ middleText);

//         driver.switchTo().parentFrame();
//         driver.switchTo().frame("frame-right");

//         //Search for the RIGHT BODY in html code Using Locator "XPath" //body[contains(text(),'RIGHT')]
//         String rightText = driver.findElementByXPath("//body[contains(text(),'RIGHT')]").getText();
//         System.out.println("Third Text: "+ rightText);

//         driver.switchTo().defaultContent();
//         driver.switchTo().frame("frame-bottom");

//         //Search for the BOTTOM BODY in html code Using Locator "XPath" //body[contains(text(),'BOTTOM')]
//         String belowText = driver.findElementByXPath("//body[contains(text(),'BOTTOM')]").getText();
//         System.out.println("Fourth Text: "+ belowText);
    }

}
