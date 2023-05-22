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
    public void testCase10() throws InterruptedException {
        
        System.out.println("Start Test case: testCase10");
        WindowHandle bookMyShow = new WindowHandle();
        bookMyShow.windowBook();
        

//     public void testCase10() throws InterruptedException{
//         System.out.println("Start testCase: testCase10");
//         //navigate to the url "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open"
//         driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        
//         // save the current window handle address
//         String currWindow = driver.getWindowHandle();
        
//         //Go to the frame where the "try it" button is present Using Locator "XPath" //iframe[@name='iframeResult']
//         WebElement iframe = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
//         driver.switchTo().frame(iframe);
        
//         // click on the "try it" button Using Locator "XPath //button[@onclick='myFunction()']
//         WebElement button = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        
//         // JavascriptExecutor js = (JavascriptExecutor) driver;
//         // js.executeScript("arguments[0].click();", button);
//         Actions act = new Actions(driver);
//         act.moveToElement(button).click().build().perform();
//         Thread.sleep(3000);
        
//         // save the address of newly open window and switch to it
//         Set<String> windows = driver.getWindowHandles();
//         for (String window: windows){
//             if(!window.equals(currWindow)){
//                 driver.switchTo().window(window);
//             }
//         }
//         // Get the url, title and take screenshot then close the window
//         String currUrl = driver.getCurrentUrl();
//         System.out.println("current url is : "+currUrl);
//         String title = driver.getTitle();
//         System.out.println("title of the page is : "+title);
//         try {
//             TakesScreenshot scrShot = ((TakesScreenshot) driver);
//             File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//             File DestFile = new File("C:\\Users\\sayan\\OneDrive\\Desktop\\picture\\W3SchoolImage.png");
//             Files.copy(SrcFile, DestFile);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         driver.close();
//         // switch back to the original window
//         driver.switchTo().window(currWindow);
//     }
 
    }

}
