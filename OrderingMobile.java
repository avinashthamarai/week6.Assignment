package week6.TestNg.Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class OrderingMobile extends CommonMethods {
	
	
	@Test
	public void orderMobiles()
	{
		Shadow dom=new Shadow(driver); 
		WebElement path = dom.findElementByXPath("//div[@class='sn-polaris-navigation polaris-header-menu']/following::div");
		path.click();
		driver.findElement(By.id("filter")).sendKeys("Service catalog", Keys.ENTER);
		
	}
	
	
	

}
