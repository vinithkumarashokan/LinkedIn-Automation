package org.test.LinkedInAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {
	static WebDriver driver;

@Test
public void LinkedIn() throws AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.linkedin.com/");
	
//Sign In
		WebElement signin = driver.findElement(By.xpath("//a[@class='nav__button-secondary btn-secondary-emphasis btn-md']"));
	signin.click();
	
//UserName	
	WebElement UserName = driver.findElement(By.id("username"));
	UserName.sendKeys("vinithkumarashokan@gmail.com");
	
//Password
	driver.findElement(By.id("password")).sendKeys("g7gf86gghhh");;
    driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
    
//profile click
    driver.findElement(By.id("ember18")).click();
    Robot r =new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_UP);
    r.keyRelease(KeyEvent.VK_UP);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
//Add Github project
    driver.findElement(By.xpath("(//span[@class='pvs-navigation__text'])[1]")).click();
	
	
	
	
	
	
}

}
