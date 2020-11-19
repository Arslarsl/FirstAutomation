package com.emerald.project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EmeraldRecordingTest2 extends Browser_Lunch {

	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
//testEquifaxVerification
	@Test(priority = 17)
	public void testEquifaxVerification() throws Exception {
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//img[@alt='Equifax checklist']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='isNew']")).click();
		WebElement arrow1 = driver
				.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/div[5]/div/h4/i"));
		actions.moveToElement(arrow1).click().perform();
		WebElement arrow2 = driver
				.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/div[6]/div/h4/i"));
		actions.moveToElement(arrow2).click().perform();
		WebElement arrow3 = driver
				.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/div[7]/div/h4/i"));
		actions.moveToElement(arrow3).click().perform();
		WebElement arrow4 = driver
				.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/div[8]/div/h4/i"));
		actions.moveToElement(arrow4).click().perform();
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("isNew")).click();
		driver.findElement(By.id("modalDefaultSubmitBTN")).click();
		Thread.sleep(40000);
		WebElement arrow5 = driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/h4/i"));
		actions.moveToElement(arrow5).click().perform();
		WebElement arrow6 = driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/h4/i"));
		actions.moveToElement(arrow6).click().perform();
		WebElement arrow7 = driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div/div[3]/h4/i"));
		actions.moveToElement(arrow7).click().perform();
		WebElement arrow8 = driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div/div[4]/h4/i"));
		actions.moveToElement(arrow8).click().perform();
		WebElement arrow9 = driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/h4/i"));
		actions.moveToElement(arrow9).click().perform();
		WebElement arrow10 = driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/h4/i"));
		actions.moveToElement(arrow10).click().perform();
		WebElement arrow11 = driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[3]/h4/i"));
		actions.moveToElement(arrow11).click().perform();
		WebElement arrow12 = driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[4]/h4/i"));
		actions.moveToElement(arrow12).click().perform();
		WebElement arrow13 = driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[3]/div/h4/i"));
		actions.moveToElement(arrow13).click().perform();
		WebElement arrow14 = driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[4]/div/h4/i"));
		actions.moveToElement(arrow14).click().perform();
		driver.findElement(By.id("isReport")).click();
		Thread.sleep(2000);
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens new window
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		// Continue with original browser (first window)
		driver.findElement(By.xpath("//button[@id='isReporttab']/i")).click();
		// Perform the click operation that opens new window
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		WebElement arrow15 = driver
				.findElement(By.xpath("//*[@id='contentWrapper']/div[1]/div[2]/div/div/div/div[1]/div[1]/h4/i"));
		actions.moveToElement(arrow15).click().perform();
		WebElement arrow16 = driver
				.findElement(By.xpath("//*[@id='contentWrapper']/div[1]/div[2]/div/div/div/div[1]/div[2]/h4/i"));
		actions.moveToElement(arrow16).click().perform();
		WebElement arrow17 = driver
				.findElement(By.xpath("//*[@id='contentWrapper']/div[1]/div[2]/div/div/div/div[1]/div[3]/h4/i"));
		actions.moveToElement(arrow17).click().perform();
		WebElement arrow18 = driver
				.findElement(By.xpath("//*[@id='contentWrapper']/div[1]/div[2]/div/div/div/div[1]/div[4]/h4/i"));
		actions.moveToElement(arrow18).click().perform();
		WebElement arrow19 = driver
				.findElement(By.xpath("//section[@id='contentWrapper']/div/div[2]/div/div/div/div[2]/div[1]/h4/i"));
		actions.moveToElement(arrow19).click().perform();
		WebElement arrow20 = driver
				.findElement(By.xpath("//section[@id='contentWrapper']/div/div[2]/div/div/div/div[2]/div[2]/h4/i"));
		actions.moveToElement(arrow20).click().perform();
		WebElement arrow21 = driver
				.findElement(By.xpath("//section[@id='contentWrapper']/div/div[2]/div/div/div/div[2]/div[3]/h4/i"));
		actions.moveToElement(arrow21).click().perform();
		WebElement arrow22 = driver
				.findElement(By.xpath("//section[@id='contentWrapper']/div/div[2]/div/div/div/div[2]/div[4]/h4/i"));
		actions.moveToElement(arrow22).click().perform();
		WebElement arrow23 = driver
				.findElement(By.xpath("//section[@id='contentWrapper']/div/div[2]/div/div/div/div[3]/div/h4/i"));
		actions.moveToElement(arrow23).click().perform();
		WebElement arrow24 = driver
				.findElement(By.xpath("//section[@id='contentWrapper']/div/div[2]/div/div/div/div[4]/div/h4/i"));
		actions.moveToElement(arrow24).click().perform();
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow |
		// win_ser_local | ]]
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}
//testBankAndFinanceReports
	@Test(priority = 18)
	public void testBankAndFinanceReports() throws Exception {
		Actions actions = new Actions(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='bank and finance']")).click();
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[1]/td[4]/input")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[1]/td[5]/input"))
				.sendKeys("Bal Sheet Major Debtors Note added in Asset");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[2]/td[4]/input")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[2]/td[5]/input"))
				.sendKeys("Company Mortgages Note Added in Asset");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[3]/td[4]/input")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[3]/td[5]/input"))
				.sendKeys("Company Mortgages Note Added 2nd time.");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[4]/td[4]/input")).sendKeys("4");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[4]/td[5]/input"))
				.sendKeys("Company Vehicle Loans added in Notes");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[5]/td[4]/input")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[5]/td[5]/input"))
				.sendKeys("Company Loans added in Asset");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[6]/td[4]/input")).sendKeys("6");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[6]/td[5]/input"))
				.sendKeys("Factors Debt added in Asset");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[7]/td[4]/input")).sendKeys("7");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[7]/td[5]/input"))
				.sendKeys("Good Title Assets Added.");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[8]/td[4]/input")).sendKeys("8");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[8]/td[5]/input"))
				.sendKeys("Stock Added in Asset");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[9]/td[4]/input")).sendKeys("9");
		driver.findElement(By.xpath("//*[@id='table_Asset_Liability_List']/tbody/tr[9]/td[5]/input"))
				.sendKeys("HPI Free Vehciles Asset note added.");
		driver.findElement(By.xpath("//div[@id='Asset_Liability_List']/ul/li/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();

		driver.findElement(By.id("Period")).click();
		new Select(driver.findElement(By.id("Period"))).selectByVisibleText("Sep 2020");
		driver.findElement(By.id("Period")).click();
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[1]/td[2]/div/input")).sendKeys("4000");
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[1]/td[3]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[1]/td[4]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[1]/td[6]/div/input")).sendKeys("4000");
		driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/button/i"))
				.click();
		// driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/thead/tr/th[7]/button")).click();
		driver.findElement(By.xpath("(//select[@id='Period'])[2]")).click();
		new Select(driver.findElement(By.xpath("(//select[@id='Period'])[2]"))).selectByVisibleText("Aug 2020");
		driver.findElement(By.xpath("(//select[@id='Period'])[2]")).click();
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[2]/td[2]/div/input")).sendKeys("4000");
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[2]/td[3]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[2]/td[4]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='table_Trading_Summary']/tbody/tr[2]/td[6]/div/input")).sendKeys("3000");
		driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/button/i"))
				.click();
		// driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id='table_Trading_Summary']/tbody/tr[2]/td[7]/button/i")).click();
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		driver.findElement(By.xpath("//table[@id='table_Trading_Summary']/tbody/tr[2]/td[7]/button/i")).click();
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//table[@id='table_Trading_Summary']/tbody/tr[2]/td[7]/button/i")).click();
		driver.findElement(By.xpath("//*[@id='modalDefaultSubmitBTN']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/thead/tr/th[7]/button")).click();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[1]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[1]/div/input")).sendKeys("Test User");
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[2]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[2]/div/input")).sendKeys("6000");
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[3]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[3]/div/input")).sendKeys("4000");
		driver.findElement(By.id("Start_Date0")).clear();
		driver.findElement(By.id("Start_Date0")).sendKeys("22-Dec-2020");
		driver.findElement(By.id("End_Date0")).clear();
		driver.findElement(By.id("End_Date0")).sendKeys("22-Dec-2021");
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[6]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[1]/td[6]/div/input")).sendKeys("London");
		driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[3]/div/button/i"))
				.click();
		// driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);

		// Adding Next Loan Summary.
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/thead/tr/th[7]/button")).click();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[1]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[1]/div/input"))
				.sendKeys("Test User1");
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[2]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[2]/div/input")).sendKeys("7000");
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[3]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[3]/div/input")).sendKeys("2000");
		driver.findElement(By.id("Start_Date1")).clear();
		driver.findElement(By.id("Start_Date1")).sendKeys("22-Dec-2020");
		driver.findElement(By.id("End_Date1")).clear();
		driver.findElement(By.id("End_Date1")).sendKeys("22-Dec-2021");
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[6]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='table_Loan_Summary']/tbody/tr[2]/td[6]/div/input")).sendKeys("London");
		driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[3]/div/button/i"))
				.click();
		// driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id='table_Loan_Summary']/tbody/tr[2]/td[7]/button/i")).click();

		WebElement arrow1 = driver.findElement(
				By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/h4/i"));
		actions.moveToElement(arrow1).click().perform();
		actions.moveToElement(arrow1).click().perform();
		WebElement arrow2 = driver.findElement(
				By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/h4/i"));
		actions.moveToElement(arrow2).click().perform();
		actions.moveToElement(arrow2).click().perform();
		WebElement arrow3 = driver.findElement(
				By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div[3]/div/h4/i"));
		actions.moveToElement(arrow3).click().perform();
		actions.moveToElement(arrow3).click().perform();

		// Fetch Bank and Finance Data.
		driver.findElement(By.id("isNew")).click();
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[3]/button[1]")).click();
		driver.findElement(By.id("isNew")).click();
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		driver.findElement(By.id("isNew")).click();
		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		driver.findElement(By.id("modalDefaultSubmitBTN")).click();
		Thread.sleep(12000);
		driver.findElement(By.id("isReport")).click();
		Thread.sleep(3000);

		// Fetch to New Bank and Finance Report
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens new window
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(By.id("2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("4")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='table_allTransactionList_0']/thead/tr/th[8]/span/div/select"))
				.click();
		new Select(driver
				.findElement(By.xpath("//table[@id='table_allTransactionList_0']/thead/tr/th[8]/span/div/select")))
						.selectByVisibleText("Gambling");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='table_allTransactionList_0']/thead/tr/th[8]/span/div/select"))
				.click();
		new Select(driver
				.findElement(By.xpath("//table[@id='table_allTransactionList_0']/thead/tr/th[8]/span/div/select")))
						.selectByVisibleText("Category");
		driver.findElement(By.xpath("//*[@id='table_allTransactionList_0']/tbody/tr[1]/td[8]/div/select")).click();
		new Select(driver.findElement(By.xpath("//*[@id='table_allTransactionList_0']/tbody/tr[1]/td[8]/div/select")))
				.selectByVisibleText("Gambling");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='table_allTransactionList_0']/tbody/tr[1]/td[9]/div/select")).click();
		new Select(driver.findElement(By.xpath("//*[@id='table_allTransactionList_0']/tbody/tr[1]/td[9]/div/select")))
				.selectByVisibleText("william hill");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='table_allTransactionList_0']/tbody/tr[1]/td[10]/div/select")).click();
		new Select(driver.findElement(By.xpath("//*[@id='table_allTransactionList_0']/tbody/tr[1]/td[10]/div/select")))
				.selectByVisibleText("Business Outgoings");
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		// Continue with original browser (first window)
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
		Thread.sleep(8000);

	}

	/*
	 * @Test(priority = 19) public void testAddingCardDetails() throws Exception {
	 * driver.findElement(By.xpath(
	 * "//*[@id='header']/div/div/div[2]/ul/li[1]/ul[2]/li[1]/div")).click();
	 * Thread.sleep(2000); driver.findElement(By.id("fetch")).click();
	 * Thread.sleep(4000); driver.findElement(By.xpath(
	 * "//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	 * driver.findElement(By.xpath(
	 * "//*[@id='header']/div/div/div[2]/ul/li[1]/ul[2]/li[1]/div")).click();
	 * Thread.sleep(2000); driver.findElement(By.id("addNewCard")).click();
	 * Thread.sleep(15000); Set<String> handler = driver.getWindowHandles();
	 * Iterator<String> it = handler.iterator();
	 * 
	 * String parentwindowID = it.next(); System.out.println("parent window id:" +
	 * parentwindowID);
	 * 
	 * String childwindowID = it.next(); System.out.println("child window id:" +
	 * childwindowID);
	 * 
	 * driver.switchTo().window(childwindowID);
	 * 
	 * System.out.println("Child window pop up title" + driver.getTitle());
	 * 
	 * // Perform the actions on new window Thread.sleep(2000);
	 * driver.findElement(By.id("CardName")).click(); new
	 * Select(driver.findElement(By.id("CardName"))).
	 * selectByVisibleText("NEW ACRES DEVELOPMENTS LTD");
	 * driver.findElement(By.id("CardName")).click();
	 * driver.findElement(By.id("Email")).click(); new
	 * Select(driver.findElement(By.id("Email"))).selectByVisibleText(
	 * "susan@nabi.com"); driver.findElement(By.id("Email")).click();
	 * driver.findElement(By.id("Phone")).click(); new
	 * Select(driver.findElement(By.id("Phone"))).selectByVisibleText(
	 * "5434543432432"); driver.findElement(By.id("Phone")).click();
	 * driver.findElement(By.id("Address")).click(); new
	 * Select(driver.findElement(By.id("Address"))).
	 * selectByVisibleText("West Farm Lodge Gonalston ...");
	 * driver.findElement(By.id("Address")).click();
	 * driver.findElement(By.id("continue")).click(); Thread.sleep(5000); // Switch
	 * to new window opened
	 * 
	 * driver.findElement(By.id("customerName")).click();
	 * driver.findElement(By.id("customerName")).clear();
	 * driver.findElement(By.id("customerName")).sendKeys("Test User");
	 * driver.findElement(By.id("cardNumber")).clear();
	 * driver.findElement(By.id("cardNumber")).sendKeys("4929421234600821"); new
	 * Select(driver.findElement(By.id("cardExpiryMonth"))).
	 * selectByVisibleText("12 - Dec"); new
	 * Select(driver.findElement(By.id("cardExpiryYear"))).selectByVisibleText(
	 * "2020"); driver.findElement(By.id("cardCVV")).click();
	 * driver.findElement(By.id("cardCVV")).clear();
	 * driver.findElement(By.id("cardCVV")).sendKeys("445");
	 * driver.findElement(By.id("cardExpiryMonth")).click();
	 * driver.findElement(By.id("cardExpiryMonth")).click();
	 * driver.findElement(By.id("cardExpiryYear")).click(); new
	 * Select(driver.findElement(By.id("cardExpiryYear"))).selectByVisibleText(
	 * "2021"); driver.findElement(By.id("cardExpiryYear")).click();
	 * driver.findElement(By.id("paybttn")).click(); Thread.sleep(6000); // Closing
	 * the Child Window. driver.close(); // Switch back to original browser (first
	 * window) driver.switchTo().window(parentwindowID); // continue with original
	 * browser (first window)
	 * 
	 * Thread.sleep(2000); driver.findElement(By.xpath(
	 * "//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click(); }
	 */
//testAddGoCardlessDetails
	@Test(priority = 20)
	public void testAddGoCardlessDetails() throws Exception {
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//section[@id='header']/div/div/div[2]/ul/li/ul[2]/li[2]/div")).click();
		    driver.findElement(By.id("cancelActiveMandate")).click();
		    driver.findElement(By.id("addNewMandate")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		    driver.findElement(By.id("customer_bank_accounts_branch_code")).click();
		    driver.findElement(By.id("customer_bank_accounts_branch_code")).clear();
		    driver.findElement(By.id("customer_bank_accounts_branch_code")).sendKeys("200000");
		    driver.findElement(By.id("customer_bank_accounts_account_number")).click();
		    driver.findElement(By.id("customer_bank_accounts_account_number")).clear();
		    driver.findElement(By.id("customer_bank_accounts_account_number")).sendKeys("55779911");
		    driver.findElement(By.id("customer_email")).click();
		    driver.findElement(By.id("customer_email")).clear();
		    driver.findElement(By.id("customer_email")).sendKeys("local@gmail.com");
		    driver.findElement(By.id("submit-button-text")).click();
		    driver.findElement(By.id("submit-button")).click();
		    driver.findElement(By.id("save")).click();
		    driver.close();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		    driver.findElement(By.id("fetch")).click();
		    driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}

	@Test(priority = 21)
	public void testVisitCheckList() throws Exception {
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[1]/ul[1]/li[2]/div")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/div/div/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tab2012']/div/div/div/div[1]/div/div/div[1]/div/div/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tab2012']/div/div/div/div[1]/div/div/div[1]/div/div/div[1]")).click();
		Thread.sleep(1000);

		Actions actions = new Actions(driver);
		WebElement Visit1 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[2]/td[3]/div"));
		actions.moveToElement(Visit1).click().perform();

		WebElement Visit2 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[3]/td[4]/div"));
		actions.moveToElement(Visit2).click().perform();

		WebElement Visit3 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[4]/td[5]/div"));
		actions.moveToElement(Visit3).click().perform();

		WebElement Visit4 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[5]/td[3]/div"));
		actions.moveToElement(Visit4).click().perform();

		WebElement Visit5 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[6]/td[4]/div"));
		actions.moveToElement(Visit5).click().perform();

		WebElement Visit6 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[7]/td[5]/div"));
		actions.moveToElement(Visit6).click().perform();

		WebElement Visit7 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[8]/td[3]/div"));
		actions.moveToElement(Visit7).click().perform();

		WebElement Visit8 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[9]/td[4]/div"));
		actions.moveToElement(Visit8).click().perform();

		WebElement Visit9 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[10]/td[5]/div"));
		actions.moveToElement(Visit9).click().perform();

		WebElement Visit10 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[11]/td[3]/div"));
		actions.moveToElement(Visit10).click().perform();

		WebElement Visit11 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[12]/td[4]/div"));
		actions.moveToElement(Visit11).click().perform();

		WebElement Visit12 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[13]/td[5]/div"));
		actions.moveToElement(Visit12).click().perform();

		WebElement Visit13 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[14]/td[3]/div"));
		actions.moveToElement(Visit13).click().perform();

		WebElement Visit14 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[15]/td[4]/div"));
		actions.moveToElement(Visit14).click().perform();

		WebElement Visit15 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[16]/td[5]/div"));
		actions.moveToElement(Visit15).click().perform();

		WebElement Visit16 = driver.findElement(By.xpath("//*[@id='checklist2017']/table/tbody/tr[17]/td[3]/div"));
		actions.moveToElement(Visit16).click().perform();

		driver.findElement(By.xpath("//*[@id='tab2012']/div/div/div/div[2]/div/div/div[1]/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tab2012']/div/div/div/div[2]/div/div/div[1]/div/div/div[1]")).click();
		Thread.sleep(2000);

		WebElement Visit17 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[2]/td[3]/div"));
		actions.moveToElement(Visit17).click().perform();

		WebElement Visit18 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[3]/td[4]/div"));
		actions.moveToElement(Visit18).click().perform();

		WebElement Visit19 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[4]/td[5]/div"));
		actions.moveToElement(Visit19).click().perform();

		WebElement Visit20 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[5]/td[3]/div"));
		actions.moveToElement(Visit20).click().perform();

		WebElement Visit21 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[6]/td[4]/div"));
		actions.moveToElement(Visit21).click().perform();

		WebElement Visit22 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[7]/td[5]/div"));
		actions.moveToElement(Visit22).click().perform();

		WebElement Visit23 = driver.findElement(By.xpath("//*[@id='checklist2018']/table/tbody/tr[8]/td[3]/div"));
		actions.moveToElement(Visit23).click().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/div/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/label")).click();
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/div/span[4]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}

	@Test(priority = 22)
	public void testDuplicatesApplication() throws Exception {

		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[1]/div/i[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[1]/div/i[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='dashboardChase']/thead/tr/th[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='dashboardChase']/thead/tr/th[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='dashboardChase']/thead/tr/th[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='dashboardChase']/tbody/tr[1]/td[8]/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("modalDefaultSubmitBTN")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[1]/div/i[2]")).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath("//table[@id='dashboardChase']/tbody/tr[2]/td[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 23)
	public void Moving_From_Duplicate_to_Orignal() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/label")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/div/span[4]/i")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[1]/div/div/div/div")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 24)
	public void Test_aduitLogs() throws Exception {
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='defaultModalheader']/button/i")).click();
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("auditLogs")).click();
		new Select(driver.findElement(By.id("auditLogs"))).selectByVisibleText("Application");
		driver.findElement(By.id("auditLogs")).click();
		driver.findElement(By.xpath("//*[@id='dashboardChase']/tbody/tr[1]/td[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}

	@Test(priority = 25)
	public void Test_ApplicationJourney() throws Exception {
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[3]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/button")).click();
	}

	@Test(priority = 26)
	public void testReminders() throws Exception {

		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[4]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("reminderDateTime")).sendKeys("20-Dec-2020 12:23");

		driver.findElement(By.id("sectionID")).click();
		new Select(driver.findElement(By.id("sectionID"))).selectByVisibleText("Collections");
		driver.findElement(By.id("sectionID")).click();
		driver.findElement(By.id("reminderMessage")).sendKeys("Tested Using  Recording Tool.");
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("Zulfiqar Ali");

		driver.findElement(By.xpath(
				"//div[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/ul/li/div/span"))
				.click();
		driver.findElement(By.xpath("//span[@id='1']/i")).click();
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("Zulfiqar Ali");
		driver.findElement(By.xpath(
				"//div[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/ul/li/div/span"))
				.click();

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("reminderDateTime")).sendKeys("20-Dec-2020 12:23");

		driver.findElement(By.id("sectionID")).click();
		new Select(driver.findElement(By.id("sectionID"))).selectByVisibleText("Collections");
		driver.findElement(By.id("sectionID")).click();
		driver.findElement(By.id("reminderMessage")).sendKeys("Tested Using  Recording Tool.");
		driver.findElement(By.id("clear")).click();
		driver.findElement(By.id("goBack")).click();

		driver.findElement(By.xpath("//*[@id='dashboardChase']/tbody/tr[1]/td[7]/img[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
	}

	@Test(priority = 27)
	public void testCreateSubApplication() throws Exception {
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[5]/div/i[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//select[@id='loanTerm'])[2]")).click();
		new Select(driver.findElement(By.xpath("(//select[@id='loanTerm'])[2]"))).selectByVisibleText("9 months");
		driver.findElement(By.xpath("(//select[@id='loanTerm'])[2]")).click();
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("6000");
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='dashboardChase']/tbody/tr[1]/td[1]/button")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1
		// | ]]
		Thread.sleep(3000);

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentwindowID = it.next();
		System.out.println("parent window id:" + parentwindowID);

		String childwindowID = it.next();
		System.out.println("parent window id:" + childwindowID);

		driver.switchTo().window(childwindowID);
		System.out.println("Child window pop up title" + driver.getTitle());
		driver.close();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow |
		// win_ser_local | ]]
		// Switch back to original browser (first window)
		driver.switchTo().window(parentwindowID);
		// continue with original browser (first window)
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
	}

	@Test(priority = 28)
	public void testCall_Logs() throws Exception {
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[6]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='defaultModalheader']/button/i")).click();
	}

	@Test(priority = 29)
	public void MoveApplication_to_Test() throws Exception {
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[3]/div[2]/ul/li[7]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='modalDefaultSubmitBTN']")).click();
		Thread.sleep(4000);
	}

	@Test(priority = 30)
	public void Moving_From_Test_to_Orignal() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/label")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/div/span[4]/i")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[1]/div/div/div/div")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 31)
	public void Send_Email() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='messageIcon']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='2nd Reminder']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='attachm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='2nd Reminder']")).click();
		driver.findElement(By.xpath("//*[@id='7 Day pre-legal to PG']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='tagg']")).click();
		driver.findElement(By.xpath("//*[@id='<<ApplicationID>>']")).click();
		driver.findElement(By.xpath("//*[@id='<<CompanyName>>']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]/ul/div/button"))
				.click();
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 32)
	public void Send_SMS() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='messageIcon']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("templates")).click();
		new Select(driver.findElement(By.id("templates"))).selectByVisibleText("SMS");
		driver.findElement(By.id("templates")).click();
		driver.findElement(By.xpath("//li[@id='Acknowledge Communication']/div")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='tagg']")).click();
		// driver.findElement(By.id("smsTextArea")).click();
		driver.findElement(By.xpath("//i[@id='<<ApplicationID>>']")).click();
		driver.findElement(By.xpath("//*[@id='<<CompanyName>>']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]/ul/div/button"))
				.click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 33)
	public void Generate_Loan_agreementDocument() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='messageIcon']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("templates")).click();
		new Select(driver.findElement(By.id("templates"))).selectByVisibleText("Loan Agreement");
		driver.findElement(By.id("templates")).click();
		driver.findElement(By.xpath("//*[@id='Loan Agreement']")).click();
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/ul/div/button"))
				.click();
		Thread.sleep(3000);

	}

	@Test(priority = 34)
	public void Generate_Document() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='messageIcon']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("templates")).click();
		new Select(driver.findElement(By.id("templates"))).selectByVisibleText("Documents");
		driver.findElement(By.id("templates")).click();
		driver.findElement(By.xpath("//*[@id='AN1 Form']")).click();
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/ul/div/button"))
				.click();
		Thread.sleep(3000);
	}

	@Test(priority = 35)
	public void Generate_Letters_Document() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='messageIcon']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("templates")).click();
		new Select(driver.findElement(By.id("templates"))).selectByVisibleText("Letters");
		driver.findElement(By.id("templates")).click();
		driver.findElement(By.xpath("//*[@id='7 Day pre-legal to PG']")).click();

		driver.findElement(By.xpath("//*[@id='tagg']")).click();
		driver.findElement(By.xpath("//*[@id='<<ApplicationID>>']")).click();
		driver.findElement(By.xpath("//*[@id='<<CompanyName>>']")).click();
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//*[@id='defaultModal']/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]/ul/div/button"))
				.click();
		Thread.sleep(3000);
	}

	@Test(priority = 36)
	public void SendLoan_Agreement() throws Exception {
		// For Loan Agreement DR
		driver.findElement(By.xpath("//img[@alt='Dcs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[@id='header']/div/div/div[2]/ul/li/ul/li[6]/div[2]/ul/li[2]/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("modalDefaultSubmitBTN")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div/div/div/div/h5")).click();

		// For Loan Agreement WR
		driver.findElement(By.xpath("//img[@alt='Dcs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[@id='header']/div/div/div[2]/ul/li/ul/li[6]/div[2]/ul/li[3]/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='modalDefaultSubmitBTN']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/button")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 37)
	public void testSendReceiveDocuments() throws Exception {
		driver.findElement(By.xpath("//img[@alt='Dcs']")).click();
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[1]/ul[1]/li[6]/div[2]/ul/li[1]/div"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='table_sent_Doc']/tbody/tr[1]/td[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='defaultModalheader']/button")).click();

		Thread.sleep(4000);

		// Fetch all Documents
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/div[2]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		driver.findElement(By.id("modalDefaultSubmitBTN")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div[2]/div/ul/li[2]/a/span"))
				.click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@id='DocumentViewDetail']/div/p")).click();
		// driver.findElement(By.xpath("//input[@type='file']")).clear();
		WebElement chooseFile = driver.findElement(By.xpath("//*[@id='DocumentViewDetail']/div/input"));
		chooseFile.sendKeys(System.getProperty("user.dir") + "\\Documents\\Tested.png");
		Thread.sleep(8000);
		driver.findElement(By.id("documentUploadName")).click();
		driver.findElement(By.id("documentUploadName")).clear();
		driver.findElement(By.id("documentUploadName")).sendKeys("Tested");
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div[3]/div/div[2]/ul/li/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/div[2]/button"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		driver.findElement(By.xpath("//*[@id='modalDefaultSubmitBTN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='table_recieved_Doc']/tbody/tr/td[8]/span/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='del']")).click();
		driver.findElement(By.xpath("//div[@id='myId']/div/label")).click();
		driver.findElement(By.id("modalDefaultSubmitBTN")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}

	@Test(priority = 38)
	public void Move_applicationto_Chaps() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/div/span[4]")).click();

	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

}
