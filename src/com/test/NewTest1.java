package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	private WebDriver driver;



    @BeforeTest
    public void beforeTest(){
  	  System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");/*(Ĭ�ϰ�װ�����������Ҫд��δ���)*/
  	  System.setProperty("webdriver.chrome.driver", "./res/chromedriver.exe");
  	  driver=new ChromeDriver();

    }

    @AfterTest
    public void afterTest(){
//        driver.quit();
    }
	 @Test
	    public void f1() throws Exception
	    {

//	       driver.findElement(By.id("su")).click();
//	       
//	       Thread.sleep(5000);
//	       driver.close();
	    	 driver.get("http://erptest.jsynjt.com/");
	    	 driver.findElement(By.id("at-field-username")).sendKeys("txd010");
	         driver.findElement(By.id("at-field-password")).sendKeys("010txd!");
	         driver.findElement(By.id("at-btn")).click();
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//a[text()='suoyoudingdan']")).click();

	    }
}
