package com.bit.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;

public class loopPractice {
	
	WebDriver driver;
	@Test
	public void nestedLop() {
		for(int i=1;i<=3;i++) {
			//click on element
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div["+i+"]/div/div/div/a")).click();
			for(int j=1;j<3;j++) {
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div["+j+"]/div[1]/a/img")).click();
				driver.navigate().back();
			}
			driver.navigate().back();
			
			//test3(driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li/a")),"NEW");
		}
	
//	public void test1() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("");
//		int mSize=driver.findElements(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li")).size();
//		for(int i=1;i<mSize;i++) {
//			driver.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li["+i+"]")).click();
//			driver.navigate().back();
//		}
//	}
//	
//	public void test2(List<WebElement> elements) {
//		 
//		driver.get("");
//		int mSize=elements.size();
//		for(int i=1;i<mSize;i++) {
//			elements.get(i).click();
//			driver.navigate().back();
//		}
//		
//	}
//	
//	public void test3(List<WebElement> elements,String text) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("");
//		int mSize=elements.size();
//		for(int i=1;i<mSize;i++) {
//			if(elements.get(i).getText().equalsIgnoreCase(text))
//			{
//				elements.get(i).click();
//				break;
//			}
//		}
//	}
//	
//	WebDriver driver=new ChromeDriver();
//		public void test4() {
//			
//			driver.get("");
//			List<WebElement>  elements=driver.findElements(By.tagName("a"));
//			for(WebElement element:elements) {
//				System.out.println(element.getText());
//			}
//			}
//		
//		public void MouseRelatedWork(WebElement ele) {
//			//Actions ac=new Actions(driver);
//			//ac.moveToElement(ele).build().perform();
//			int msize=driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a")).size();
//			for(int i=1;i<msize;i++) {
//				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div["+i+"]/div/div/div/a")).click();
//				int sSize=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/a/img")).size();
//			    for(int j=1;j<sSize;j++) {
//			    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div["+j+"]/a/img")).click();
//			    	driver.navigate().back();
//			    }
//			    driver.navigate().back();
//			
//			}
//		}
//			public void test5(WebElement ele) {
//				while(driver.findElement(By.xpath("xpath of next button")).isEnabled()) {
//					driver.findElement(By.xpath("xpath of next button")).click();
////					JavascriptExecutor js=(JavascriptExecutor)driver;
////					js.executeScript("window.scrollBy(0,4000)");
////					Coordinates co=((Locatable)ele).getCoordinates();
////					co.inViewPort();
//				}
//			}
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//}
}
}