package com.aBakun.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.aBakun.selenium.dataprovider.Values.*;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty(DRIVER_PROPERTY, PATH_TO_DRIVER);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_SECONDS, TimeUnit.SECONDS); 
        driver.get(START_URL);
        driver.findElement(By.xpath(XPATH_WORK_SECTION)).click();
        WebElement element = driver.findElement(By.xpath(XPATH_SEARCH_FORM));
        element.sendKeys(SEARCH_CRITERIA);
        element.submit();
		int totalPages = driver.findElements(By.xpath(XPATH_COUNT_OF_PAGES)).size();
		int nextPage = 1;
		int matches = 0;
		while(true){
			for (WebElement webElement : driver.findElements(By.xpath(XPATH_FIND_MATHED_ELEMENTS))){
				
				if(webElement.getText().toLowerCase().contains(SEARCH_CRITERIA.toLowerCase())){
					matches++;
				}
			}
			nextPage++;
			//go to next page with results if it exist
			if(nextPage > totalPages){
				break;
			}else{
				driver.findElement(By.xpath(String.format(XPATH_LINK_O_NEXT_PAGE, nextPage))).click();
			}
		};
		System.out.println(matches);
        driver.quit();
    }
}
