package Testcase;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng {
public static WebDriver Driver;
@BeforeSuite
public void beforesuite(){
	System.out.println("Test case exegution will start");
}
@BeforeClass
public void beforeclass(){
	System.out.println("Beforeclass");
}
@BeforeMethod
public void m1(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	Driver = new FirefoxDriver();
	System.out.println("before Method");
	}
@Test(priority =1)
public void m2(){
	Driver.get("http://gmail.com");
	Driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Reddyhemanth224@gmail.com");;
	Driver.findElement(By.xpath("(//*[@class='CwaK9'])[1]")).click();
}
@Test(priority =2)
public void m3() throws InterruptedException{
	Thread.sleep(5000);
	Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8147359220");
	Driver.findElement(By.xpath("(//*[@class='CwaK9'])[1]")).click();
}
@AfterTest
public void m4() throws InterruptedException{
	Thread.sleep(5000);
	Driver.findElement(By.xpath("//a[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']")).click();
	Driver.findElement(By.xpath("//*[text()='Sign out']")).click();
}
@AfterClass
public void m5(){
	System.out.println("After class");
}
@AfterSuite
public void m6(){
	System.out.println("Aftersuite");
}
}
