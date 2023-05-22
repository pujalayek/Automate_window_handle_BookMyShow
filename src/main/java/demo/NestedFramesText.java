package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesText {
    ChromeDriver driver;
    
        public void NestedFramesT() throws InterruptedException {
            this.driver = TestCases.TestCasesInitializer();
             
               System.out.println("Start testCase: testCase07");
             
               //Navigate to URL  https://the-internet.herokuapp.com/nested_frames
                 driver.get("https://the-internet.herokuapp.com/nested_frames");
                 driver.switchTo().frame("frame-top");
                 driver.switchTo().frame("frame-left");
                
                 //Search for the first BODY in html code Using Locator "XPath" //body[contains(text(),'LEFT')]
                 String leftText = driver.findElementByXPath("//body[contains(text(),'LEFT')]").getText();
                 System.out.println("First Text: "+ leftText);
        
                 driver.switchTo().parentFrame();
                 driver.switchTo().frame("frame-middle");
        
                 //Search for the middle BODY in html code Using Locator "XPath" //div[contains(text(),'MIDDLE')]
                 String middleText = driver.findElementByXPath("//div[contains(text(),'MIDDLE')]").getText();
                 System.out.println("Second Text: "+ middleText);
        
                 driver.switchTo().parentFrame();
                 driver.switchTo().frame("frame-right");
        
                 //Search for the RIGHT BODY in html code Using Locator "XPath" //body[contains(text(),'RIGHT')]
                 String rightText = driver.findElementByXPath("//body[contains(text(),'RIGHT')]").getText();
                 System.out.println("Third Text: "+ rightText);
        
                 driver.switchTo().defaultContent();
                 driver.switchTo().frame("frame-bottom");
        
                 //Search for the BOTTOM BODY in html code Using Locator "XPath" //body[contains(text(),'BOTTOM')]
                 String belowText = driver.findElementByXPath("//body[contains(text(),'BOTTOM')]").getText();
                 System.out.println("Fourth Text: "+ belowText);
             }
        
}
