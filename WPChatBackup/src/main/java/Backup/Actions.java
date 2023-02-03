package Backup;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class Actions {

	//method is to click on webelement
	public static void ClickOnWebelement(WebElement anywebelement)
	{
		anywebelement.click();
	}
	
	//method is to press directly on home button
	public static void pressOnHomeButton(AppiumDriver driver)
	{
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.HOME));
	}
	
	//method is to press back button
	public static void pressBackButton(AppiumDriver driver)
	{
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public static void getExplicitWait(AppiumDriver driver, WebElement anywebelement)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.visibilityOf(anywebelement));
	}
	
	//method is to start home activity
	public static void startHomeActivity(AppiumDriver driver, String packagename, String activityname, String appType) throws Exception
	{
		
		if(appType.equalsIgnoreCase("Original")) {
			//Original
			
			//adb -s udid shell am start --user 0 packagename/activityname
			
			
			List<String> adbcommandArgs = Arrays.asList(
				    "start",
				    "--user",
				    "0",
				    packagename+"/"+activityname
				);

			Map<String, Object> removePicsCmd = ImmutableMap.of(
				    "command", "am",
				    "args", adbcommandArgs
				);
				driver.executeScript("mobile: shell", removePicsCmd);
				((StartsActivity) driver).startActivity(new Activity(packagename, "com.whatsapp.settings.Settings"));
			
		}
		else if(appType.equalsIgnoreCase("Dual")) {
			//Dual
			List<String> adbcommandArgs = Arrays.asList(
				    "start",
				    "--user",
				    "999",
				    activityname+"/"+packagename
				);

			Map<String, Object> removePicsCmd = ImmutableMap.of(
				    "command", "am",
				    "args", adbcommandArgs
				);
				driver.executeScript("mobile: shell", removePicsCmd);
					
		
		}
		else {
			//work
			List<String> adbcommandArgs = Arrays.asList(
				    "start",
				    "--user",
				    "10",
				    activityname+"/"+packagename
				);

			Map<String, Object> removePicsCmd = ImmutableMap.of(
				    "command", "am",
				    "args", adbcommandArgs
				);
				driver.executeScript("mobile: shell", removePicsCmd);
				
		}
		
		
		//to start main homepage activity
			//	((StartsActivity) driver).startActivity(new Activity(activityname, packagename));
				Thread.sleep(2000);
				
	}
		
}
