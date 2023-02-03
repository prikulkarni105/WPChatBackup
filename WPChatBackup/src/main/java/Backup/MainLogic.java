package Backup;

import io.appium.java_client.AppiumDriver;

public class MainLogic {

	 
	  public static void MainMethod(AppiumDriver driver) throws Exception
	
	  {
			try 
			{
				//home page wait until three dots are not available
				Actions.getExplicitWait(driver, PageObjects.threeDotsToOpenMenu(driver));
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				Actions.pressBackButton(driver);
			}
		  
			
				System.out.println("****log1*****home activity opened********");   //log1
		Actions.ClickOnWebelement(PageObjects.threeDotsToOpenMenu(driver)); 
		Thread.sleep(2000);
		
				System.out.println("*****log2*****Three dots clicked************");   //log2
		
		Actions.ClickOnWebelement(PageObjects.clickOnSetting(driver));
		Thread.sleep(1000);
			
				System.out.println("*****log3*******clicked on setting***********");   //log3
				
		Actions.ClickOnWebelement(PageObjects.clickOnChat(driver));
		Thread.sleep(2000);
				System.out.println("******log4*******clicked on chat*************");   //log4
		
	
		
		try
		{
			Actions.ClickOnWebelement(PageObjects.clickOnChatBackup(driver));
			
					System.out.println("******log5******clicked on chatbakup button*************");   //log5
					
			//wait until backup is not completed
			Actions.getExplicitWait(driver, PageObjects.clickOnChatHistory(driver));
			
			
					System.out.println("******log6******Done chat backup***************");   //log6
		} 
		catch (Exception e) 
		{
			//In some wp accounts chatbackup nevigates to another page so it handled using exception
			Actions.ClickOnWebelement(PageObjects.IfDirectlyNevigateToBackup(driver));     //changed webelement here later
			//wait until backup is not completed
			Actions.getExplicitWait(driver, PageObjects.CLickOnNevigateUp(driver));
		
			Actions.ClickOnWebelement(PageObjects.CLickOnNevigateUp(driver));
			Thread.sleep(2000);			
					System.out.println("******log7******Done alternate way chat backup***************");   //log7
		}
		
	/*	//explicitly wait until chat history not came   
		Actions.getExplicitWait(driver, PageObjects.clickOnChatHistory(driver));    //new added
	*/	
		//click on element chat history
		Actions.ClickOnWebelement(PageObjects.clickOnChatHistory(driver));
		Thread.sleep(2000);
				System.out.println("******log8******clicked on chat history button***************");   //log8
		
		//click on delete all chats button
		Actions.ClickOnWebelement(PageObjects.ClickOnDeleteAllChats(driver));
		Thread.sleep(1000);
				System.out.println("******log9******clicked on delete all chats button***************");   //log9
		
	/*	//delete media chats checkbox selected or not checking
		WebElement checkbox= PageObjects.IsMediaChatCheckboxSelected(driver);
				
		//validation
		if(checkbox.getAttribute("checked").equals("false"))
		{
			Actions.ClickOnWebelement(checkbox);
			Thread.sleep(2000);
		}
	*/	
		//click on delete chat button inside the frame
		
		Actions.ClickOnWebelement(PageObjects.clickOnDeleteChatFinally(driver));
		
	    Actions.getExplicitWait(driver, PageObjects.ClickOnDeleteAllChats(driver));	//changed later webelement				
		
				System.out.println("******log10******deleted all chats***************");   //log10
		Thread.sleep(2000);
		//press home button after finish
		Actions.pressOnHomeButton(driver);
		
		
		
	
	}

}
