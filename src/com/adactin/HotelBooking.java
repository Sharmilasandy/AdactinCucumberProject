package com.adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BassClass.Bassclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking  {
	public static WebDriver driver;
	
	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		//driver = browserlaunch("chrome");
		
		WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
       
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Admin2022");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456789");
        
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        
        WebElement location = driver.findElement(By.id("location"));
        location.sendKeys("London");
        
        
        WebElement Hotels = driver.findElement(By.id("hotels"));
        Hotels.sendKeys("Hotel Sunshine");
        
        WebElement roomtype = driver.findElement(By.id("room_type"));
        roomtype.sendKeys("Double");
        
        WebElement roomNo = driver.findElement(By.id("room_nos"));
        roomNo.sendKeys("3 - three");
        
        WebElement CheckIn = driver.findElement(By.id("datepick_in"));
        CheckIn.sendKeys("30/11/2022");
        
        WebElement CheckOut = driver.findElement(By.id("datepick_out"));
        CheckOut.sendKeys("06/12/2022");
        
        WebElement Adultroom = driver.findElement(By.id("adult_room"));
        Adultroom.sendKeys("1 - One");
        
        WebElement Childrenroom = driver.findElement(By.id("child_room"));
        Childrenroom.sendKeys("0 - None");
        
        WebElement search = driver.findElement(By.id("Submit"));
        search.click();
        
        WebElement select = driver.findElement(By.id("radiobutton_0"));
        select.click();
        
        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
        
        WebElement name = driver.findElement(By.id("first_name"));
        name.sendKeys("Sharmila");
        
        WebElement Lastname = driver.findElement(By.id("last_name"));
        Lastname.sendKeys("B");
        
        WebElement add = driver.findElement(By.id("address"));
        add.sendKeys("XYZ ABC DEF MNO");
        
        WebElement Credit = driver.findElement(By.id("cc_num"));
        Credit.sendKeys("1234567891234567");
        
        WebElement CCNtype = driver.findElement(By.id("cc_type"));
        CCNtype.sendKeys("Master Card");
        
        WebElement Expmonth = driver.findElement(By.id("cc_exp_month"));
        Expmonth.sendKeys("April");
        
        WebElement Expyr = driver.findElement(By.id("cc_exp_year"));
        Expyr.sendKeys("2022");
        
        WebElement CVV = driver.findElement(By.id("cc_cvv"));
        CVV.sendKeys("414");
        
        driver.findElement(By.id("book_now")).click();
        
        TakesScreenshot source = (TakesScreenshot) driver;
        File source1=source.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\JavaPractice\\Selenium_Java_4-4-22-main\\ekart\\src\\screenshots");
        FileUtils.copyFile(source1, dest);
        Thread.sleep(2000);
        
        driver.findElement(By.id("logout")).click();

        driver.close();










        
	}
	

}
