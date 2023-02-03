package Backup;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Base {

	static AppiumDriverLocalService service;
	
	
	public static void StartAppiumServer(String poString) throws Exception, IOException
	{
		System.out.println("*************************I am in before class Starting server on Port Numebr ="+ poString+"**********************************8");
		//method of auto start driver
		
		AppiumServiceBuilder builder=new AppiumServiceBuilder();
		builder.usingPort(Integer.parseInt(poString));
		builder.withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/");
		builder.withArgument(GeneralServerFlag.RELAXED_SECURITY);
		builder.withArgument(GeneralServerFlag.ALLOW_INSECURE,"adb_shell");

		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		
		
		
	}
	
	public static AppiumDriver InitDriver(String PortNo, String Udid) throws Exception
	{
	//	StartAppiumServer(PortNo);
		String IP= Resources.fetchResource("IP");
					
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("android");       
		options.setUdid(Udid);
		
		AppiumDriver driver=new AndroidDriver(new URL("http://"+IP+":"+PortNo+"/wd/hub"), options);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return driver;
	}
	
	
	public static void StopAppiumServer()
	{
		System.out.println("*************************I am in after class stopping server**********************************");

		service.stop();
	}
	
}
