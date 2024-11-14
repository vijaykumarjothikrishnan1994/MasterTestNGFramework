package com.Main.programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class BasicRegister {

	
	public void Launch() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumTest\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805691%7Cb%7Cfb%20registration%7C&placement=&creative=550525805691&keyword=fb%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-322833375554%26loc_physical_ms%3D9153040%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw5pShBhB_EiwAvmnNV5gOAL-YxvGLxFpGt8EQZ8th7X1zgi3JgK3UzLbLrb7zQEp19vCZbhoCau4QAvD_BwE");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Surya");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Assertion sas =new Assertion();
		
	List<WebElement> list=	driver.findElements(By.xpath("//select//option"));
	
	
	for (WebElement webElement : list) {
		
		System.out.println(webElement.getText());
	//webElement.getText()
	
	if(webElement.getText().equals("207"))
	{
		System.out.println(webElement.getText());
		break;
	}
	else
	{
		System.out.println("There is data for 2022");
	}
		
	}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BasicRegister obj=new BasicRegister();
		
		obj.Launch();

	}

}
