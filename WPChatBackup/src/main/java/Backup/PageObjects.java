package Backup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class PageObjects {
	
	public static WebElement threeDotsToOpenMenu(AppiumDriver driver)
	{
		//click on three dots to open setting menu
		return driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				
	}
	
	
	public static WebElement clickOnSetting(AppiumDriver driver)
	{
		//click on webelement settings
		return driver.findElement(By.xpath("//*[@text='Settings']"));
	}
	
	
	public static WebElement clickOnChat(AppiumDriver driver)
	{
		//click on webelement chat
		return driver.findElement(By.xpath("//*[@text='Chats']"));
	}
	
	
	public static WebElement clickOnChatBackup(AppiumDriver driver)
	{
		//click on webelement chatbackup
		return driver.findElement(By.xpath("//*[@text='Chat backup']"));
	}
	
	
	public static WebElement clickOnChatHistory(AppiumDriver driver)
	{
		//click on element chat history
		return driver.findElement(By.xpath("//*[@text='Chat history']"));
	}
	
	public static WebElement IfDirectlyNevigateToBackup(AppiumDriver driver)
	{
		//In some wp accounts chatbackup nevigates to another page so it handled using exception
		return driver.findElement(By.xpath("//*[@text='BACK UP']"));
	}
	
	public static WebElement CLickOnNevigateUp(AppiumDriver driver)
	{
		//After finished backup this button nevigates you back to previous page
		return driver.findElement(AppiumBy.accessibilityId("Navigate up"));
	}
	
	
	public static WebElement ClickOnDeleteAllChats(AppiumDriver driver)
	{
		//click on delete all chats button
		return driver.findElement(By.xpath("//*[@text='Delete all chats']"));
	}
	
	
	public static WebElement IsMediaChatCheckboxSelected(AppiumDriver driver)
	{
		//delete media chats checkbox selected or not checking
		return driver.findElement(By.id("com.whatsapp:id/delete_media_checkbox"));
	}
	
	
	public static WebElement clickOnDeleteChatFinally(AppiumDriver driver)
	{
		//click on delete chat button inside the frame, it deletes final all chats
		return driver.findElement(By.xpath("//*[@text='Delete chats']"));
	}
}
