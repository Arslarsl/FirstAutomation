package com.emerald.project;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmeraldRecordingTest1 extends Browser_Lunch {

	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Test(priority = 1)
	@Parameters("URL")
	public void Emerald_Lunched(String URL) {
		driver.get(URL);
		System.out.println("Login page Successfully Dispalyed with :" + URL);
		System.out.println("Test Case-1 executed");
	}

	@Test(priority = 2)
	public void Login() throws Exception {
		// driver.get("https://emeralddev.cubefunder.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("zulfiqar");
		driver.findElement(By.id("password")).sendKeys("Us@12e34");
		driver.findElement(By.xpath("//section[@id='login']/div/div/div[2]/div/div/form/div[3]/div")).click();
		Thread.sleep(10000);

	}

	/*@Test(priority = 3)
	public void DashbaordNewApplications() throws Exception {
		driver.findElement(By.xpath("//table[@id='dashboardChase']/tbody/tr/td/div")).click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		driver.findElement(By.xpath("//table[@id='dashboardChase']/tbody/tr/td[2]/div")).click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		driver.findElement(By.xpath("//table[@id='dashboardChase']/tbody/tr/td[3]/div")).click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		driver.findElement(By.xpath("//table[@id='dashboardChase']/tbody/tr/td[4]/div")).click();
		driver.findElement(By.xpath("//section[@id='privaryNav']/div/ul/li/a")).click();
		driver.findElement(By.xpath("//table[@id='dashboardChase']/tbody/tr/td[5]/div")).click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div/div/div[1]/div/div/nav/a/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
	}

	@Test(priority = 4)
	public void testDashbaordChases() throws Exception {
		driver.get("https://emeralddev.cubefunder.com/dashboard");
		// For Clear the input text
		driver.findElement(By.xpath(
				"//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr/td"))
				.click();
		driver.findElement(By.id("CallBackDate")).sendKeys("31-Dec-2020 23:35");
		driver.findElement(
				By.xpath("//*[@id='chaseNote']/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[3]/div[2]/label"))
				.click();
		driver.findElement(By.id("Note")).sendKeys("Tested by QA");
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[2]/div/div[2]/button[1]")).click();
		// For Submit button

		driver.findElement(By.id("CallBackDate")).sendKeys("31-Dec-2020 23:35");
		driver.findElement(
				By.xpath("//*[@id='chaseNote']/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[3]/div[2]/label"))
				.click();
		driver.findElement(By.id("Note")).sendKeys("Tested by QA");
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[2]/div/div[2]/button[2]")).click();

		// For Deleting the Chases
		driver.findElement(By.xpath(
				"//*[@id='contentWrapper']/div/div/div[1]/div/div/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[2]/div"))
				.click();
		driver.findElement(By.xpath("//*[@id='defaultModal']/div/div[2]/div/div[2]/button[2]")).click();

		driver.findElement(By.xpath(
				"//*[@id='contentWrapper']/div/div/div[1]/div/div/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div"))
				.click();
		driver.findElement(By.xpath("//div[@id='chaseNote']/div/div[2]/div/div/div/table/thead/tr[4]/td/i")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='chaseNote']/div/div[2]/div/div/div/table/thead/tr[5]/td/i")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		driver.findElement(By.xpath(
				"//*[@id='contentWrapper']/div/div/div[1]/div/div/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		driver.findElement(By.xpath(
				"//*[@id='contentWrapper']/div/div/div[1]/div/div/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[2]/div/div/nav/a/button/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='privaryNav']/div/ul/li[1]/a/span")).click();
	}

	@Test(priority = 5)
	public void Dashbaord_recentPayment() throws Exception {
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[3]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[3]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[3]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[3]/div/div/div/canvas"))
				.click();
	}

	@Test(priority = 6)
	public void testDashbaordApplicationSources() throws Exception {
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(By.xpath("//img[@alt='dashobard']")).click();
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// //section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas
		// | ]]
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// //section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas
		// | ]]
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// //section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas
		// | ]]
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// //section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas
		// | ]]
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// //section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas
		// | ]]
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// //section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas
		// | ]]
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div/div[5]/div/div/div/canvas"))
				.click();
	}*/
//testCreateNewApplications
	@Test(priority = 7)
	public void testCreateNewApplications() throws Exception {
		driver.get("https://emeralddev.cubefunder.com/applications");
		driver.findElement(By.id("companyName")).sendKeys("New Acres Development ltd");
		driver.findElement(By.xpath("//div[@id='company']/div/div/div/i")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/table/tbody/tr/td")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/table/tbody/tr[1]/td[2]/span[2]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/table/tbody/tr[2]/td[2]/span[2]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/table/tbody/tr[3]/td[2]/span[2]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/table/tbody/tr[4]/td[2]/span[2]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/table/tbody/tr[5]/td[2]/span[2]"))
				.click();
		driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div[2]/div/div[3]/ul/li/span")).click();
		driver.findElement(By.id("mainGuarantordob")).click();
		driver.findElement(By.xpath("//td[2]")).click();
		driver.findElement(By.id("mainGuarantormaritalStatus")).click();
		new Select(driver.findElement(By.id("mainGuarantormaritalStatus"))).selectByVisibleText("Civil");
		driver.findElement(By.id("mainGuarantormaritalStatus")).click();
		driver.findElement(By.id("mainGuarantormobile")).click();
		driver.findElement(By.id("mainGuarantormobile")).clear();
		driver.findElement(By.id("mainGuarantormobile")).sendKeys("5434543432432");
		driver.findElement(By.id("mainGuarantorlandline")).click();
		driver.findElement(By.id("mainGuarantorlandline")).clear();
		driver.findElement(By.id("mainGuarantorlandline")).sendKeys("4324543454324");
		driver.findElement(By.id("mainGuarantoremail")).click();
		driver.findElement(By.id("mainGuarantoremail")).clear();
		driver.findElement(By.id("mainGuarantoremail")).sendKeys("susan@nabi.com");
		driver.findElement(By.xpath("//div[@id='mainGuarantor']/div/div[10]/div/div/div/label")).click();
		driver.findElement(By.id("mainGuarantorRole")).click();
		driver.findElement(By.id("mainGuarantorRole")).click();
		driver.findElement(By.xpath("//div[@id='mainGuarantor']/div/div[12]/div/div/div/label")).click();
		driver.findElement(By.id("mainGuarantorPresentAddressoccupancyType")).click();
		new Select(driver.findElement(By.id("mainGuarantorPresentAddressoccupancyType")))
				.selectByVisibleText("Council Tenant");
		driver.findElement(By.id("mainGuarantorPresentAddressoccupancyType")).click();
		driver.findElement(By.id("mainGuarantorPresentAddressyearsAtAddress")).click();
		driver.findElement(By.id("mainGuarantorPresentAddressyearsAtAddress")).clear();
		driver.findElement(By.id("mainGuarantorPresentAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("mainGuarantorPresentAddressmonthAtAddress")).click();
		driver.findElement(By.id("mainGuarantorPresentAddressmonthAtAddress")).clear();
		driver.findElement(By.id("mainGuarantorPresentAddressmonthAtAddress")).sendKeys("3");
		driver.findElement(By.id("mainGuarantorPreviousAddresspostCode")).click();
		driver.findElement(By.id("mainGuarantorPreviousAddresspostCode")).clear();
		driver.findElement(By.id("mainGuarantorPreviousAddresspostCode")).sendKeys("W1J 6EQ");
		driver.findElement(By.xpath("//div[@id='mainGuarantorPreviousAddress']/div/div/div/button/i")).click();
		driver.findElement(By.xpath("//div[@id='addresslookup']/div/div/div/h1")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.id("mainGuarantorPreviousAddressyearsAtAddress")).click();
		driver.findElement(By.id("mainGuarantorPreviousAddressyearsAtAddress")).clear();
		driver.findElement(By.id("mainGuarantorPreviousAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("mainGuarantorPreviousAddressmonthAtAddress")).click();
		driver.findElement(By.id("mainGuarantorPreviousAddressmonthAtAddress")).clear();
		driver.findElement(By.id("mainGuarantorPreviousAddressmonthAtAddress")).sendKeys("3");
		driver.findElement(By.id("guarantor2dob")).sendKeys("12-Jan-1998");
		driver.findElement(By.id("guarantor2maritalStatus")).click();
		new Select(driver.findElement(By.id("guarantor2maritalStatus"))).selectByVisibleText("Co Hab");
		driver.findElement(By.id("guarantor2maritalStatus")).click();
		driver.findElement(By.id("guarantor2mobile")).click();
		driver.findElement(By.id("guarantor2mobile")).clear();
		driver.findElement(By.id("guarantor2mobile")).sendKeys("6543445643453");
		driver.findElement(By.id("guarantor2landline")).click();
		driver.findElement(By.id("guarantor2landline")).clear();
		driver.findElement(By.id("guarantor2landline")).sendKeys("2321342134213");
		driver.findElement(By.id("guarantor2email")).click();
		driver.findElement(By.id("guarantor2email")).clear();
		driver.findElement(By.id("guarantor2email")).sendKeys("james@nabi.com");
		driver.findElement(By.xpath("//div[@id='guarantor2']/div/div[10]/div/div/div/label")).click();
		driver.findElement(By.id("guarantor2Role")).click();
		new Select(driver.findElement(By.id("guarantor2Role"))).selectByVisibleText("FD");
		driver.findElement(By.id("guarantor2Role")).click();
		driver.findElement(By.xpath("//div[@id='guarantor2']/div/div[12]/div/div/div/label")).click();
		driver.findElement(By.id("guarantor2PresentAddressoccupancyType")).click();
		new Select(driver.findElement(By.id("guarantor2PresentAddressoccupancyType")))
				.selectByVisibleText("Employment Accomodation");
		driver.findElement(By.id("guarantor2PresentAddressoccupancyType")).click();
		driver.findElement(By.id("guarantor2PresentAddressyearsAtAddress")).click();
		driver.findElement(By.id("guarantor2PresentAddressyearsAtAddress")).clear();
		driver.findElement(By.id("guarantor2PresentAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor2PresentAddressmonthAtAddress")).click();
		driver.findElement(By.id("guarantor2PresentAddressmonthAtAddress")).clear();
		driver.findElement(By.id("guarantor2PresentAddressmonthAtAddress")).sendKeys("3");
		driver.findElement(By.id("guarantor2PreviousAddresspostCode")).click();
		driver.findElement(By.id("guarantor2PreviousAddresspostCode")).clear();
		driver.findElement(By.id("guarantor2PreviousAddresspostCode")).sendKeys("CW8 1AU");
		driver.findElement(By.xpath("//div[@id='guarantor2PreviousAddress']/div/div/div/button")).click();
		driver.findElement(By.xpath("//div[@id='addresslookup']/div/div/div/h1")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.id("guarantor2PreviousAddressyearsAtAddress")).click();
		driver.findElement(By.id("guarantor2PreviousAddressyearsAtAddress")).clear();
		driver.findElement(By.id("guarantor2PreviousAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor2PreviousAddressmonthAtAddress")).click();
		driver.findElement(By.id("guarantor2PreviousAddressmonthAtAddress")).clear();
		driver.findElement(By.id("guarantor2PreviousAddressmonthAtAddress")).sendKeys("5");
		driver.findElement(By.id("guarantor3middleName")).click();
		driver.findElement(By.id("guarantor3middleName")).clear();
		driver.findElement(By.id("guarantor3middleName")).sendKeys("Tested");
		driver.findElement(By.id("guarantor3dob")).sendKeys("12-Jan-1998");
		;
		driver.findElement(By.id("guarantor3maritalStatus")).click();
		new Select(driver.findElement(By.id("guarantor3maritalStatus"))).selectByVisibleText("Married");
		driver.findElement(By.id("guarantor3maritalStatus")).click();
		driver.findElement(By.id("guarantor3mobile")).click();
		driver.findElement(By.id("guarantor3mobile")).clear();
		driver.findElement(By.id("guarantor3mobile")).sendKeys("6543564356435");
		driver.findElement(By.id("guarantor3landline")).click();
		driver.findElement(By.id("guarantor3landline")).clear();
		driver.findElement(By.id("guarantor3landline")).sendKeys("3454324543245");
		driver.findElement(By.id("guarantor3email")).click();
		driver.findElement(By.id("guarantor3email")).click();
		driver.findElement(By.id("guarantor3email")).clear();
		driver.findElement(By.id("guarantor3email")).sendKeys("tested@kerrie.com");
		driver.findElement(By.xpath("//div[@id='guarantor3']/div/div[10]/div/div/div/label")).click();
		driver.findElement(By.id("guarantor3Role")).click();
		new Select(driver.findElement(By.id("guarantor3Role"))).selectByVisibleText("Nominee");
		driver.findElement(By.id("guarantor3Role")).click();
		driver.findElement(By.xpath("//div[@id='guarantor3']/div/div[12]/div/div/div/label")).click();
		driver.findElement(By.id("guarantor3PresentAddressoccupancyType")).click();
		new Select(driver.findElement(By.id("guarantor3PresentAddressoccupancyType")))
				.selectByVisibleText("Home Owner");
		driver.findElement(By.id("guarantor3PresentAddressoccupancyType")).click();
		driver.findElement(By.id("guarantor3PresentAddressyearsAtAddress")).click();
		driver.findElement(By.id("guarantor3PresentAddressyearsAtAddress")).clear();
		driver.findElement(By.id("guarantor3PresentAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor3PresentAddressmonthAtAddress")).click();
		driver.findElement(By.id("guarantor3PresentAddressmonthAtAddress")).clear();
		driver.findElement(By.id("guarantor3PresentAddressmonthAtAddress")).sendKeys("4");
		driver.findElement(By.id("guarantor3PreviousAddresspostCode")).click();
		driver.findElement(By.id("guarantor3PreviousAddresspostCode")).clear();
		driver.findElement(By.id("guarantor3PreviousAddresspostCode")).sendKeys("CT6 5HA");
		driver.findElement(By.xpath("//div[@id='guarantor3PreviousAddress']/div/div/div/button/i")).click();
		driver.findElement(By.xpath("//div[@id='addresslookup']/div/div/div[6]/h1")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.id("guarantor3PreviousAddressyearsAtAddress")).click();
		driver.findElement(By.id("guarantor3PreviousAddressyearsAtAddress")).clear();
		driver.findElement(By.id("guarantor3PreviousAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor3PreviousAddressmonthAtAddress")).click();
		driver.findElement(By.id("guarantor3PreviousAddressmonthAtAddress")).clear();
		driver.findElement(By.id("guarantor3PreviousAddressmonthAtAddress")).sendKeys("3");
		driver.findElement(By.id("guarantor3Title")).click();
		new Select(driver.findElement(By.id("guarantor3Title"))).selectByVisibleText("Miss");
		driver.findElement(By.id("guarantor3Title")).click();
		driver.findElement(By.id("guarantor4middleName")).click();
		driver.findElement(By.id("guarantor4middleName")).clear();
		driver.findElement(By.id("guarantor4middleName")).sendKeys("Tested");
		driver.findElement(By.id("guarantor4dob")).sendKeys("12-Jan-1998");
		driver.findElement(By.id("guarantor4maritalStatus")).click();
		new Select(driver.findElement(By.id("guarantor4maritalStatus"))).selectByVisibleText("Other");
		driver.findElement(By.id("guarantor4maritalStatus")).click();
		driver.findElement(By.id("guarantor4mobile")).click();
		driver.findElement(By.id("guarantor4mobile")).clear();
		driver.findElement(By.id("guarantor4mobile")).sendKeys("6543564354324");
		driver.findElement(By.id("guarantor4landline")).click();
		driver.findElement(By.id("guarantor4landline")).clear();
		driver.findElement(By.id("guarantor4landline")).sendKeys("2343243245324");
		driver.findElement(By.id("guarantor4email")).click();
		driver.findElement(By.id("guarantor4email")).clear();
		driver.findElement(By.id("guarantor4email")).sendKeys("tested@andrew.com");
		driver.findElement(By.xpath("//div[@id='guarantor4']/div/div[10]/div/div/div/label")).click();
		driver.findElement(By.id("guarantor4Role")).click();
		new Select(driver.findElement(By.id("guarantor4Role"))).selectByVisibleText("Director");
		driver.findElement(By.id("guarantor4Role")).click();
		driver.findElement(By.xpath("//div[@id='guarantor4']/div/div[12]/div/div/div/label")).click();
		driver.findElement(By.id("guarantor4PresentAddressoccupancyType")).click();
		new Select(driver.findElement(By.id("guarantor4PresentAddressoccupancyType")))
				.selectByVisibleText("Employment Accomodation");
		driver.findElement(By.id("guarantor4PresentAddressoccupancyType")).click();
		driver.findElement(By.id("guarantor4PresentAddressyearsAtAddress")).click();
		driver.findElement(By.id("guarantor4PresentAddressyearsAtAddress")).clear();
		driver.findElement(By.id("guarantor4PresentAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor4PresentAddressmonthAtAddress")).click();
		driver.findElement(By.id("guarantor4PresentAddressmonthAtAddress")).clear();
		driver.findElement(By.id("guarantor4PresentAddressmonthAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor4PreviousAddresspostCode")).click();
		driver.findElement(By.id("guarantor4PreviousAddresspostCode")).clear();
		driver.findElement(By.id("guarantor4PreviousAddresspostCode")).sendKeys("TN13 2EH");
		driver.findElement(By.xpath("//div[@id='guarantor4PreviousAddress']/div/div/div/button/i")).click();
		driver.findElement(By.xpath("//div[@id='addresslookup']/div/div/div[4]/h1")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.id("guarantor4PreviousAddressyearsAtAddress")).click();
		driver.findElement(By.id("guarantor4PreviousAddressyearsAtAddress")).clear();
		driver.findElement(By.id("guarantor4PreviousAddressyearsAtAddress")).sendKeys("2");
		driver.findElement(By.id("guarantor4PreviousAddressmonthAtAddress")).click();
		driver.findElement(By.id("guarantor4PreviousAddressmonthAtAddress")).clear();
		driver.findElement(By.id("guarantor4PreviousAddressmonthAtAddress")).sendKeys("4");
		driver.findElement(By.id("Trading As")).click();
		driver.findElement(By.id("Trading As")).clear();
		driver.findElement(By.id("Trading As")).sendKeys("IT and Telecom");
		driver.findElement(By.id("noofEmployees")).click();
		new Select(driver.findElement(By.id("noofEmployees"))).selectByVisibleText("2-5");
		driver.findElement(By.id("noofEmployees")).click();
		driver.findElement(By.id("noOf25PercentageShareHolders")).click();
		driver.findElement(By.id("noOf25PercentageShareHolders")).clear();
		driver.findElement(By.id("noOf25PercentageShareHolders")).sendKeys("4");
		driver.findElement(By.id("yearRunningBusiness")).click();
		new Select(driver.findElement(By.id("yearRunningBusiness"))).selectByVisibleText("< 1 Year");
		driver.findElement(By.id("yearRunningBusiness")).click();
		driver.findElement(By.id("companyTradingAddresspostCode")).click();
		driver.findElement(By.id("companyTradingAddresspostCode")).clear();
		driver.findElement(By.id("companyTradingAddresspostCode")).sendKeys("SG13 7NN");
		driver.findElement(By.xpath("//div[@id='companyTradingAddress']/div/div/div/button")).click();
		driver.findElement(By.xpath("//div[@id='addresslookup']/div/div/div[5]/h1")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.id("leaseOnTrading")).click();
		new Select(driver.findElement(By.id("leaseOnTrading"))).selectByVisibleText("< 1 Year");
		driver.findElement(By.id("leaseOnTrading")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div[5]/div/div/div/label")).click();
		driver.findElement(By.id("businessCategoryID")).click();
		new Select(driver.findElement(By.id("businessCategoryID"))).selectByVisibleText("Leisure");
		driver.findElement(By.id("businessCategoryID")).click();
		driver.findElement(By.id("website")).click();
		driver.findElement(By.id("website")).clear();
		driver.findElement(By.id("website")).sendKeys("www.cubefunder.com");
		driver.findElement(By.id("vatno")).click();
		driver.findElement(By.id("vatno")).clear();
		driver.findElement(By.id("vatno")).sendKeys("12345678ABCD");
		driver.findElement(By.xpath("//div[@id='socialmedia']/div/div/div/input")).sendKeys("www.facebook.com");
		driver.findElement(By.xpath("//div[@id='socialmedia']/div/div[2]/div/input")).sendKeys("www.twitter.com");
		driver.findElement(By.xpath("//div[@id='socialmedia']/div/div[3]/div/input")).sendKeys("www.linkdin.com");
		driver.findElement(By.xpath("//div[@id='socialmedia']/div/div[4]/div/input")).sendKeys("www.instagram.com");

		driver.findElement(By.id("mainBankbankName")).click();
		driver.findElement(By.id("mainBankbankName")).clear();
		driver.findElement(By.id("mainBankbankName")).sendKeys("HBL");

		driver.findElement(By.xpath("//*[@id='mainBank']/div/div[2]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='mainBank']/div/div[2]/div/input")).sendKeys("12345678");
		driver.findElement(By.xpath("//div[@id='mainBank']/div/div[3]")).click();
		driver.findElement(By.id("mainBanksortCode")).sendKeys("222222");
		driver.findElement(By.xpath("//div[@id='1']/div/div/div[2]/div/div/div/div/div/label")).click();
		driver.findElement(By.id("paymentBankbankName")).click();
		driver.findElement(By.id("paymentBankbankName")).clear();
		driver.findElement(By.id("paymentBankbankName")).sendKeys("MCB");

		driver.findElement(By.xpath("//*[@id='paymentBank']/div/div[2]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='paymentBank']/div/div[2]/div/input")).sendKeys("64345634");
		driver.findElement(By.id("paymentBanksortCode")).sendKeys("333333");
		driver.findElement(By.id("monthlyDeclaredRevenue")).click();
		driver.findElement(By.id("monthlyDeclaredRevenue")).clear();
		driver.findElement(By.id("monthlyDeclaredRevenue")).sendKeys("10000");

		driver.findElement(By.xpath("//*[@id='saleData']/div/div[2]/div/input")).sendKeys("3000");
		driver.findElement(By.xpath("//*[@id='saleData']/div/div[3]/div/input")).sendKeys("4000");
		driver.findElement(By.xpath("//*[@id='saleData']/div/div[4]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='saleData']/div/div[5]/div/input")).sendKeys("4000");

		driver.findElement(By.xpath("//div[@id='saleData']/div/div[6]/div/div/div/label")).click();
		driver.findElement(By.xpath("//div[@id='saleData']/div/div[7]/div/div/div/label")).click();
		driver.findElement(By.xpath("//div[@id='saleData']/div/div[8]/div/div/div/label")).click();
		driver.findElement(By.id("loanGradeNameID")).click();
		new Select(driver.findElement(By.id("loanGradeNameID"))).selectByVisibleText("Bronze");
		driver.findElement(By.id("loanGradeNameID")).click();
		driver.findElement(By.id("teamNameID")).click();
		new Select(driver.findElement(By.id("teamNameID"))).selectByVisibleText("Orange");
		driver.findElement(By.id("teamNameID")).click();
		driver.findElement(By.id("loanPurposeID")).click();
		new Select(driver.findElement(By.id("loanPurposeID"))).selectByVisibleText("Equipment");
		driver.findElement(By.id("loanPurposeID")).click();
		driver.findElement(By.id("parentSourceID")).click();
		new Select(driver.findElement(By.id("parentSourceID"))).selectByVisibleText("Cube Web");
		driver.findElement(By.id("parentSourceID")).click();
		driver.findElement(By.id("sourceID")).click();
		new Select(driver.findElement(By.id("sourceID"))).selectByVisibleText("Web");
		driver.findElement(By.id("sourceID")).click();
		driver.findElement(By.id("whenYouNeedLoan")).click();
		new Select(driver.findElement(By.id("whenYouNeedLoan"))).selectByVisibleText("ASAP");
		driver.findElement(By.id("whenYouNeedLoan")).click();
		driver.findElement(By.id("loanApplied")).click();
		driver.findElement(By.id("loanApplied")).clear();
		driver.findElement(By.id("loanApplied")).sendKeys("6000");
		driver.findElement(By.id("loanOffered")).click();
		driver.findElement(By.id("loanOffered")).clear();
		driver.findElement(By.id("loanOffered")).sendKeys("7000");
		driver.findElement(By.id("loanProductID")).click();
		new Select(driver.findElement(By.id("loanProductID"))).selectByVisibleText("Alpha 6 18.00%");
		driver.findElement(By.id("loanProductID")).click();
		driver.findElement(By.xpath("//*[@id='undefinedexposure']/div/div[1]/div/input")).sendKeys("123456ABCD");
		driver.findElement(By.xpath("//*[@id='undefinedexposure']/div/div[2]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='undefinedexposure']/div/div[3]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='undefinedexposure']/div/div[4]/div/input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id='undefinedexposure']/div/div[5]/div/input")).sendKeys("1000");
		driver.findElement(By.xpath("//div[@id='undefinedexposure']/div/div[7]/div/div/div/label")).click();
		driver.findElement(By.xpath("//div[@id='undefinedexposure']/div/div[8]/div/div/div/label")).click();
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/div/span/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@id='mainGuarantor']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='mainGuarantor']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='mainGuarantor']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='mainGuarantor']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor2']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor2']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor2']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor2']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor3']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor3']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor3']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor3']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor4']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor4']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor4']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='guarantor4']/div[2]/div[2]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div[3]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div[3]/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div[9]/h4")).click();
		driver.findElement(By.xpath("//div[@id='company']/div[2]/div[9]/h4")).click();
		driver.findElement(By.xpath("//div[@id='1']/div/div/div[4]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='1']/div/div/div[4]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='1']/div/div/div[5]/div/div/h4")).click();
		driver.findElement(By.xpath("//div[@id='1']/div/div/div[5]/div/div/h4")).click();
		driver.findElement(By.xpath(
				"//section[@id='contentWrapper']/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[9]/h4"))
				.click();
		driver.findElement(By.xpath(
				"//section[@id='contentWrapper']/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[9]/h4"))
				.click();
	}
//testQuestionnaire
	@Test(priority = 8)
	public void testQuestionnaire() throws Exception {
		driver.findElement(By.xpath("//img[@alt='Questionnaire']")).click();
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/div/div/h1/div/div/div")).click();
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/div/div/h1/div/div/div")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/div/div/h1/div/div/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='Questionnaire']")).click();
		driver.findElement(By.id("DD-0")).click();
		new Select(driver.findElement(By.id("DD-0"))).selectByVisibleText("< 1 Yr");
		driver.findElement(By.id("DD-0")).click();
		driver.findElement(By.id("N-1")).click();
		driver.findElement(By.id("N-1")).clear();
		driver.findElement(By.id("N-1")).sendKeys("5");
		driver.findElement(By.id("T-2")).click();
		driver.findElement(By.id("T-2")).click();
		driver.findElement(By.id("T-2")).clear();
		driver.findElement(By.id("T-2")).sendKeys("8 a.m in Morning");
		driver.findElement(By.id("T-3")).click();
		driver.findElement(By.id("T-3")).clear();
		driver.findElement(By.id("T-3")).sendKeys("About 90 Thosands dollars");
		driver.findElement(By.xpath(
				"//*[@id='contentWrapper']/div/div/div[2]/div/div/div[2]/div/div/div/div/div[5]/div[2]/div/div/div/div[1]/label"))
				.click();
		driver.findElement(By.id("MT-5-0")).click();
		driver.findElement(By.id("MT-5-0")).click();
		driver.findElement(By.id("MT-5-0")).clear();
		driver.findElement(By.id("MT-5-0")).sendKeys("www.tested1.com");
		driver.findElement(By.id("MT-5-1")).click();
		driver.findElement(By.id("MT-5-1")).clear();
		driver.findElement(By.id("MT-5-1")).sendKeys("www.tested1.com");
		driver.findElement(By.id("MT-5-2")).click();
		driver.findElement(By.id("MT-5-2")).clear();
		driver.findElement(By.id("MT-5-2")).sendKeys("www.tested1.com");
		driver.findElement(By.id("MT-5-4")).click();
		driver.findElement(By.id("MT-5-3")).click();
		driver.findElement(By.id("MT-5-3")).clear();
		driver.findElement(By.id("MT-5-3")).sendKeys("www.tested1.com");
		driver.findElement(By.id("MT-5-4")).click();
		driver.findElement(By.id("MT-5-4")).clear();
		driver.findElement(By.id("MT-5-4")).sendKeys("www.tested1.com");
		driver.findElement(By.id("MT-5-5")).click();
		driver.findElement(By.id("MT-5-5")).clear();
		driver.findElement(By.id("MT-5-5")).sendKeys("www.tested1.com");
		driver.findElement(By.id("RD-6-0")).sendKeys("01-Oct-2020");
		driver.findElement(By.id("RD-6-1")).sendKeys("15-Oct-2020");
		driver.findElement(By.id("RN-7-0")).click();
		driver.findElement(By.id("RN-7-0")).clear();
		driver.findElement(By.id("RN-7-0")).sendKeys("1");
		driver.findElement(By.id("RN-7-1")).click();
		driver.findElement(By.id("RN-7-1")).clear();
		driver.findElement(By.id("RN-7-1")).sendKeys("10");
		driver.findElement(By.id("D-8")).sendKeys("10-Oct-2020");
		driver.findElement(By.id("MN-9-0")).click();
		driver.findElement(By.id("MN-9-0")).clear();
		driver.findElement(By.id("MN-9-0")).sendKeys("1");
		driver.findElement(By.id("MN-9-1")).click();
		driver.findElement(By.id("MN-9-1")).clear();
		driver.findElement(By.id("MN-9-1")).sendKeys("10");
		driver.findElement(By.id("save")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();

	}
//testCustomerChecklist
	@Test(priority = 9)
	public void testCustomerChecklist() throws Exception {
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//img[@alt='customers Checklist']")).click();
		driver.findElement(By.xpath("//*[@id='tab4']/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tab4']/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='tab4']/div/div/div/div/div/div/div/div[2]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='tab4']/div/div/div/div/div/div/div/div[2]/div/div")).click();
		Thread.sleep(2000);

		WebElement c1 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[2]/td[3]/div"));
		actions.moveToElement(c1).click().perform();

		WebElement c2 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[3]/td[4]/div"));
		actions.moveToElement(c2).click().perform();

		WebElement c3 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[4]/td[5]/div"));
		actions.moveToElement(c3).click().perform();

		WebElement c4 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[6]/td[3]/div"));
		actions.moveToElement(c4).click().perform();

		WebElement c5 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[7]/td[4]/div"));
		actions.moveToElement(c5).click().perform();

		WebElement c6 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[8]/td[5]/div"));
		actions.moveToElement(c6).click().perform();

		WebElement c7 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[9]/td[3]/div"));
		actions.moveToElement(c7).click().perform();

		WebElement c8 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[10]/td[4]/div"));
		actions.moveToElement(c8).click().perform();

		WebElement c9 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[11]/td[5]/div"));
		actions.moveToElement(c9).click().perform();

		WebElement c10 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[12]/td[3]/div"));
		actions.moveToElement(c10).click().perform();

		WebElement c11 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[14]/td[3]/div"));
		actions.moveToElement(c11).click().perform();

		WebElement c12 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[16]/td[3]/div"));
		actions.moveToElement(c12).click().perform();

		WebElement c13 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[17]/td[3]/div"));
		actions.moveToElement(c13).click().perform();

		WebElement c14 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[19]/td[3]/div"));
		actions.moveToElement(c14).click().perform();
		WebElement c15 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[20]/td[3]/div"));
		actions.moveToElement(c15).click().perform();
		WebElement c16 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[21]/td[3]/div"));
		actions.moveToElement(c16).click().perform();

		WebElement c17 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[22]/td[3]/div"));
		actions.moveToElement(c17).click().perform();
		WebElement c18 = driver.findElement(By.xpath("//*[@id='checklist6']/table/tbody/tr[23]/td[3]/div"));
		actions.moveToElement(c18).click().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[1]/div/div/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/div/span[4]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}
//testUnderWriterChecklist
	@Test(priority = 10)
	public void testUnderWriterChecklist() throws Exception {
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//img[@alt='customers Checklist']")).click();
		driver.findElement(By.xpath("//div[@id='tab4']/div/div/div/div[2]/div/div/div/div/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='tab4']/div/div/div/div[2]/div/div/div/div/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[2]/td[3]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[4]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[5]/td[5]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[6]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[7]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[8]/td[3]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[10]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[11]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[12]/td[5]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[13]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[14]/td[3]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[15]/td[4]/div")).click();
		driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[16]/td[5]/div")).click();

		WebElement e17 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[17]/td[5]"));
		actions.moveToElement(e17).click().perform();

		Thread.sleep(5000);
		WebElement e18 = driver.findElement(By.xpath("//div[@id='checklist7']/table/tbody/tr[18]/td[3]/div"));
		actions.moveToElement(e18).click().perform();

		WebElement e181 = driver.findElement(By.xpath("//div[@id='checklist7']/table/tbody/tr[18]/td[4]/div"));
		actions.moveToElement(e181).click().perform();
		WebElement e182 = driver.findElement(By.xpath("//div[@id='checklist7']/table/tbody/tr[18]/td[5]/div"));
		actions.moveToElement(e182).click().perform();

		WebElement e20 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[20]/td[3]/div"));
		actions.moveToElement(e20).click().perform();

		WebElement e21 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[21]/td[5]"));
		actions.moveToElement(e21).click().perform();

		WebElement e22 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[22]/td[5]"));
		actions.moveToElement(e22).click().perform();

		WebElement e23 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[23]/td[5]"));
		actions.moveToElement(e23).click().perform();

		WebElement e24 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[24]/td[5]"));
		actions.moveToElement(e24).click().perform();

		WebElement e26 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[26]/td[5]"));
		actions.moveToElement(e26).click().perform();

		WebElement e27 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[27]/td[5]"));
		actions.moveToElement(e27).click().perform();

		WebElement e28 = driver.findElement(By.xpath("//*[@id='checklist7']/table/tbody/tr[28]/td[5]"));
		actions.moveToElement(e28).click().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/div/span[4]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
	}
//testRisk_checklist
	@Test(priority = 11)
	public void testRisk_checklist() throws Exception {
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/ul/li[1]/ul[1]/li[2]/div")).click();
		Thread.sleep(3000);
		WebElement Risktab = driver
				.findElement(By.xpath("//div[@id='tab4']/div/div/div/div[3]/div/div/div/div/div/div"));
		actions.moveToElement(Risktab).click().perform();
		Thread.sleep(1000);
		actions.moveToElement(Risktab).click().perform();
		Thread.sleep(1000);

		WebElement Risk1 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[2]/td[3]/div"));
		actions.moveToElement(Risk1).click().perform();

		WebElement Risk2 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[3]/td[4]/div"));
		actions.moveToElement(Risk2).click().perform();

		WebElement Risk3 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[4]/td[5]/div"));
		actions.moveToElement(Risk3).click().perform();

		WebElement Risk4 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[5]/td[3]/div"));
		actions.moveToElement(Risk4).click().perform();

		WebElement Risk5 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[6]/td[4]/div"));
		actions.moveToElement(Risk5).click().perform();

		WebElement Risk6 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[7]/td[4]/div"));
		actions.moveToElement(Risk6).click().perform();

		WebElement Risk7 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[8]/td[4]/div"));
		actions.moveToElement(Risk7).click().perform();

		WebElement Risk8 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[9]/td[5]/div"));
		actions.moveToElement(Risk8).click().perform();

		WebElement Risk9 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[11]/td[3]/div"));
		actions.moveToElement(Risk9).click().perform();

		WebElement Risk10 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[12]/td[4]/div"));
		actions.moveToElement(Risk10).click().perform();
		WebElement Risk11 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[13]/td[5]/div"));
		actions.moveToElement(Risk11).click().perform();

		WebElement Risk12 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[15]/td[3]/div"));
		actions.moveToElement(Risk12).click().perform();
		WebElement Risk13 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[16]/td[4]/div"));
		actions.moveToElement(Risk13).click().perform();
		WebElement Risk14 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[17]/td[5]/div"));
		actions.moveToElement(Risk14).click().perform();

		WebElement Risk15 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[18]/td[3]"));
		actions.moveToElement(Risk15).click().perform();
		Thread.sleep(3000);
		WebElement Risk151 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[18]/td[5]"));
		actions.moveToElement(Risk151).click().perform();

		WebElement Risk16 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[20]/td[4]/div"));
		actions.moveToElement(Risk16).click().perform();

		WebElement Risk17 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[21]/td[5]/div"));
		actions.moveToElement(Risk17).click().perform();

		WebElement Risk18 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[22]/td[3]/div"));
		actions.moveToElement(Risk18).click().perform();

		WebElement Risk19 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[23]/td[4]/div"));
		actions.moveToElement(Risk19).click().perform();
		WebElement Risk20 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[24]/td[5]/div"));
		actions.moveToElement(Risk20).click().perform();
		WebElement Risk21 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[25]/td[3]/div"));
		actions.moveToElement(Risk21).click().perform();
		WebElement Risk22 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[26]/td[4]/div"));
		actions.moveToElement(Risk22).click().perform();
		WebElement Risk23 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[27]/td[5]/div"));
		actions.moveToElement(Risk23).click().perform();
		WebElement Risk24 = driver.findElement(By.xpath("//*[@id='checklist5']/table/tbody/tr[28]/td[4]/div"));
		actions.moveToElement(Risk24).click().perform();

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/label")).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div[2]/div/span[4]/i"))
				.click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();

	}
//DailyPaymentSchedule
	@Test(priority = 12)
	public void DailyPaymentSchedule() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//section[@id='contentWrapper']/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[8]/div/button/i"))
				.click();
		driver.findElement(By.id("scheduleType")).click();
		new Select(driver.findElement(By.id("scheduleType"))).selectByVisibleText("Daily");
		driver.findElement(By.id("scheduleType")).click();
		 Thread.sleep(2000);
		    WebElement selectDate = driver.findElement(By.id("startdate"));
		    selectDate.sendKeys("11-Nov-2020");
		    Thread.sleep(2000);
		    WebElement selecttime = driver.findElement(By.id("time"));
		    selecttime.sendKeys("15:30");
		//driver.findElement(By.xpath("//div[12]/div[2]/table/tbody/tr/td/fieldset[2]/span[12]")).click();
		//driver.findElement(By.xpath("//div[12]/div/table/tbody/tr/td/fieldset/span[3]")).click();
		driver.findElement(By.id("paymentMethod")).click();
		new Select(driver.findElement(By.id("paymentMethod"))).selectByVisibleText("Axcess");
		driver.findElement(By.id("paymentMethod")).click();
		driver.findElement(By.xpath("//div[@class='row']/div[10]/button")).click();
		Thread.sleep(11000);
		driver.findElement(By.xpath("//div[@class='row']/div[11]/button")).click();
		driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		Thread.sleep(2000);
		
		
	}
//testWeeklyPaymentSch
	@Test(priority = 13)
	public void testWeeklyPaymentSch() throws Exception {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[8]/div/button/i")).click();
	    driver.findElement(By.id("scheduleType")).click();
	    new Select(driver.findElement(By.id("scheduleType"))).selectByVisibleText("Weekly");
	    driver.findElement(By.id("scheduleType")).click();
	    driver.findElement(By.id("DayNo")).click();
	    new Select(driver.findElement(By.id("DayNo"))).selectByVisibleText("Mon");
	    driver.findElement(By.id("DayNo")).click();
	    Thread.sleep(2000);
	    WebElement selectDate = driver.findElement(By.id("startdate"));
	    selectDate.sendKeys("11-Nov-2020");
	    Thread.sleep(2000);
	    WebElement selecttime = driver.findElement(By.id("time"));
	    selecttime.sendKeys("15:30");
	    //driver.findElement(By.xpath("//div[8]/div[2]/table/tbody/tr/td/fieldset[2]/span")).click();
	    //driver.findElement(By.xpath("//div[8]/div/table/tbody/tr/td/fieldset/span[3]")).click();
	    driver.findElement(By.id("paymentMethod")).click();
	    new Select(driver.findElement(By.id("paymentMethod"))).selectByVisibleText("Debit Card");
	    driver.findElement(By.id("paymentMethod")).click();
	    driver.findElement(By.id("paymentSchGenerateBTN")).click();
	    driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
	}
//testBioMonthlyPaymentSch
	@Test(priority = 14)
	public void testBioMonthlyPaymentSch() throws Exception {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[8]/div/button/i")).click();
	    driver.findElement(By.id("scheduleType")).click();
	    new Select(driver.findElement(By.id("scheduleType"))).selectByVisibleText("Bimonthly");
	    driver.findElement(By.id("scheduleType")).click();
	    driver.findElement(By.id("DayNo")).click();
	    new Select(driver.findElement(By.id("DayNo"))).selectByVisibleText("Mon");
	    driver.findElement(By.id("DayNo")).click();
	    Thread.sleep(2000);
	    WebElement selectDate = driver.findElement(By.id("startdate"));
	    selectDate.sendKeys("19-Nov-2020");
	    Thread.sleep(2000);
	    WebElement selecttime = driver.findElement(By.id("time"));
	    selecttime.sendKeys("15:30");
	    driver.findElement(By.id("paymentMethod")).click();
	    new Select(driver.findElement(By.id("paymentMethod"))).selectByVisibleText("Direct Debit");
	    driver.findElement(By.id("paymentMethod")).click();
	    driver.findElement(By.id("paymentSchGenerateBTN")).click();
	    driver.findElement(By.id("paymentSchClearBTN")).click();
	    driver.findElement(By.xpath("//div[@id='defaultModalheader']/button/i")).click();
		
	}
//testMonthlyPaymentSch
	@Test(priority = 15)
	public void testMonthlyPaymentSch() throws Exception {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[8]/div/button/i")).click();
	    driver.findElement(By.id("scheduleType")).click();
	    new Select(driver.findElement(By.id("scheduleType"))).selectByVisibleText("Monthly");
	    driver.findElement(By.id("scheduleType")).click();
	    driver.findElement(By.xpath("(//select[@id='scheduleType'])[2]")).click();
	    new Select(driver.findElement(By.xpath("(//select[@id='scheduleType'])[2]"))).selectByVisibleText("Last working day of Month");
	    driver.findElement(By.xpath("(//select[@id='scheduleType'])[2]")).click();
	    Thread.sleep(2000);
	    WebElement selectDate = driver.findElement(By.id("startdate"));
	    selectDate.sendKeys("11-Nov-2020");
	    Thread.sleep(2000);
	    WebElement selecttime = driver.findElement(By.id("time"));
	    selecttime.sendKeys("15:30");
	    driver.findElement(By.id("paymentMethod")).click();
	    new Select(driver.findElement(By.id("paymentMethod"))).selectByVisibleText("GoCardLess");
	    driver.findElement(By.id("paymentMethod")).click();
	    driver.findElement(By.id("paymentSchGenerateBTN")).click();
	    driver.findElement(By.xpath("//div[@id='defaultModal']/div/div[2]/div/div/div/div/div[3]/div/div[4]/ul/li/li/span")).click();

	}
//testApplicationNotes
	@Test(priority = 16)
	public void testApplicationNotes() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='Notes']")).click();
		driver.findElement(By.id("noteInputnote1")).click();
		driver.findElement(By.id("noteInputnote1")).clear();
		driver.findElement(By.id("noteInputnote1")).sendKeys("Customer Call / Contact Notes are verifyed");
		driver.findElement(By.xpath("//div[@id='note1mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote4")).click();
		driver.findElement(By.id("noteInputnote4"))
				.sendKeys("Companies House Report are verifyed and data are properly coming.");
		driver.findElement(By.xpath("//div[@id='note4mainDiv']/div/div[3]/div[2]/h1/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote31")).click();
		driver.findElement(By.id("noteInputnote31")).click();
		driver.findElement(By.id("noteInputnote31")).clear();
		driver.findElement(By.id("noteInputnote31")).sendKeys("Application Red Flags Notes are verified");
		driver.findElement(By.xpath("//div[@id='note31mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote1090")).click();
		driver.findElement(By.id("noteInputnote1090")).clear();
		driver.findElement(By.id("noteInputnote1090"))
				.sendKeys("Risk Assess & Security Application Notes are verified.");
		driver.findElement(By.xpath("//div[@id='note1090mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote1087")).click();
		driver.findElement(By.id("noteInputnote1087")).clear();
		driver.findElement(By.id("noteInputnote1087")).sendKeys("Biz Revenue & Factoring Note are verified.");
		driver.findElement(By.xpath("//div[@id='note1087mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote1088")).click();
		driver.findElement(By.id("noteInputnote1088")).clear();
		driver.findElement(By.id("noteInputnote1088")).sendKeys("Equifax Observations Application Notes are verified.");
		driver.findElement(By.xpath("//div[@id='note1088mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote1089")).click();
		driver.findElement(By.id("noteInputnote1089")).clear();
		driver.findElement(By.id("noteInputnote1089")).sendKeys("Land Registry Application Notes are verified.");
		driver.findElement(By.xpath("//div[@id='note1089mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/ul/li[2]/a/span"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.id("noteInputnote24")).click();
		driver.findElement(By.id("noteInputnote24")).clear();
		driver.findElement(By.id("noteInputnote24")).sendKeys("Chase Notes are verified.");
		driver.findElement(By.xpath("//div[@id='note24mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/div/div/ul/li[3]/a/span"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.id("noteInputnote1107")).click();
		driver.findElement(By.id("noteInputnote1107")).clear();
		driver.findElement(By.id("noteInputnote1107")).sendKeys("Broker Notes are verified");
		driver.findElement(By.xpath("//div[@id='note1107mainDiv']/div/div[3]/div[2]/h1/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.id("noteInputnote26")).click();
		driver.findElement(By.id("noteInputnote26")).clear();
		driver.findElement(By.id("noteInputnote26")).sendKeys("Buyback Notes are verified.");
		driver.findElement(By.xpath("//div[@id='note26mainDiv']/div/div[3]/div[2]/h1/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//section[@id='contentWrapper']/div/div/div[2]/div/button/i")).click();
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
