package com.project.test_8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test8_3 {
public static void main(String[] args)throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.manage().window().maximize();
    WebElement value=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
    value.sendKeys("401");
    WebElement clickSubmit=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
    clickSubmit.click();
    Alert a=driver.switchTo().alert();
    a.dismiss();
    Thread.sleep(3000);
    value.clear();
    value.sendKeys("402");
    clickSubmit.click();
    a.accept();
    Thread.sleep(2000);
    Alert b=driver.switchTo().alert();
    String text=b.getText();
    b.accept();
    System.out.println(text);
    driver.quit();


}
}
