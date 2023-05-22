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
    public void testCase08() throws InterruptedException, AWTException{
        
        System.out.println("Start Test case: testCase08");
        AlertPrompt Alert = new AlertPrompt();
        Alert.NameAlert();
        
//     public void testCase08() throws InterruptedException{
//         System.out.println("Start testCase: testCase08");

//         //navigate to the url https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt
//         driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//         // Go to the iframe where "try it" button is present Using Xpath //iframe[@name='iframeResult']
//         WebElement framess = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
//         driver.switchTo().frame(framess);
        
//         // click on the "try it" button
//         driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
//         //switch to the javascript alert
//         Alert alert =  driver.switchTo().alert();
        
//         //print the text on the alert
//         String text = alert.getText();
//         System.out.println("The text message written in the alert is : "+ text);
       
//         // send your name to alert text field and accept it
//         alert.sendKeys("Puja Layek");
//         Thread.sleep(2000);
//         alert.accept();
        
//         // check if your name is get printed or not
//         WebElement validation = driver.findElement(By.xpath("//p[@id='demo']"));
//         if(validation.getText().equals("Hello Puja Layek! How are you today?")){
//             System.out.println("Yes the name is getting printed");
//         }else{
//             System.out.println("Name is not getting printed");
//         }
    }

}
