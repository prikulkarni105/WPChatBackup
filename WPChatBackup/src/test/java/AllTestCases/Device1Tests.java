package AllTestCases;

import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Backup.Actions;
import Backup.Base;
import Backup.MainLogic;
import Backup.Resources;
import io.appium.java_client.AppiumDriver;

public class Device1Tests {

     public static AppiumDriver driver;
	
//method recreate to start appium server
	@BeforeClass
	public static void startAppiumServer() throws Exception, Exception
	{
		Base.StartAppiumServer(Resources.fetchResource("Device1PortNo"));
	    driver= Base.InitDriver(Resources.fetchResource("Device1PortNo"), Resources.fetchResource("Device1UdId"));
		
	}

//Original whatsapp starts from here
	/*
	@Test(priority = 1)
	public static void device1_FM_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("FMPackage"), Resources.fetchResource("FMActivity"), "Original");
		MainLogic.MainMethod(driver); 
	
	
	}
	
	@Test(priority = 2)
	public static void device1_GB_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("GBPackage"), Resources.fetchResource("GBActivity"), "Original");
		MainLogic.MainMethod(driver);
	}
	*/
	@Test(priority = 3)
	public static void device1_WB_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("WBPackage"), Resources.fetchResource("WBActivity"), "Original");
		 MainLogic.MainMethod(driver);
	}
	/*
	@Test(priority = 4)
	public static void device1_AERO_I_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("AEROIPackage"), Resources.fetchResource("AEROIActivity"), "Original");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 5)
	public static void device1_AERO_II_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("AEROIIPackage"), Resources.fetchResource("AEROIIActivity"), "Original");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 6)
	public static void device1_WA_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("WAPackage"), Resources.fetchResource("WAActivity"), "Original");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 7)
	public static void device1_YO_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("YOPackage"), Resources.fetchResource("YOActivity"), "Original");
		 MainLogic.MainMethod(driver);
	}
	
//Dual whatsapp starts from here
	
	@Test(priority = 8)
	public static void device1_Dual_FM_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("FMPackage"), Resources.fetchResource("FMActivity"), "Dual");
		MainLogic.MainMethod(driver); 
	
	
	}
	
	@Test(priority = 9)
	public static void device1_Dual_GB_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("GBPackage"), Resources.fetchResource("GBActivity"), "Dual");
		MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 10)
	public static void device1_Dual_WB_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("WBPackage"), Resources.fetchResource("WBActivity"), "Dual");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 11)
	public static void device1_Dual_AERO_I_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("AEROIPackage"), Resources.fetchResource("AEROIActivity"), "Dual");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 12)
	public static void device1_Dual_AERO_II_Test() throws Exception
	{
	//	 AppiumDriver driver= Base.InitDriver(Resources.fetchResource("Device1PortNo"), Resources.fetchResource("Device1UdId"));
		Actions.startHomeActivity(driver, Resources.fetchResource("AEROIIPackage"), Resources.fetchResource("AEROIIActivity"), "Dual");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 13)
	public static void device1_Dual_WA_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("WAPackage"), Resources.fetchResource("WAActivity"), "Dual");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 14)
	public static void device1_Dual_YO_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("YOPackage"), Resources.fetchResource("YOActivity"), "Dual");
		 MainLogic.MainMethod(driver);
	}
	
//Work whatsapp starts from here
	
	@Test(priority = 15)
	public static void device1_Work_FM_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("FMPackage"), Resources.fetchResource("FMActivity"), "Work");
		MainLogic.MainMethod(driver); 
	
	
	}
	
	@Test(priority = 16)
	public static void device1_Work_GB_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("GBPackage"), Resources.fetchResource("GBActivity"), "Work");
		MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 17)
	public static void device1_Work_WB_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("WBPackage"), Resources.fetchResource("WBActivity"), "Work");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 18)
	public static void device1_Work_AERO_I_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("AEROIPackage"), Resources.fetchResource("AEROIActivity"), "Work");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 19)
	public static void device1_Work_AERO_II_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("AEROIIPackage"), Resources.fetchResource("AEROIIActivity"), "Work");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 20)
	public static void device1_Work_WA_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("WAPackage"), Resources.fetchResource("WAActivity"), "Work");
		 MainLogic.MainMethod(driver);
	}
	
	@Test(priority = 21)
	public static void device1_Work_YO_Test() throws Exception
	{
		Actions.startHomeActivity(driver, Resources.fetchResource("YOPackage"), Resources.fetchResource("YOActivity"), "Work");
		 MainLogic.MainMethod(driver);
	}
	 */
//method recreate to stop appium server
	@AfterClass
	public static void stopAppiumServer() 
	{
		Base.StopAppiumServer();
	}
}
