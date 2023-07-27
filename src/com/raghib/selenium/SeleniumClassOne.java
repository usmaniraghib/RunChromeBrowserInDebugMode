package com.raghib.selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;*/

/*
 * driver.close();	-> It close the focused browser, which is open by Selenium Web Driver.
 * driver.quit();	-> It close all the open browser, which is open by Selenium Web Driver.
 */

public class SeleniumClassOne {

	public static void chromeBrowserMethod() throws InterruptedException {
		//Chrome Browser
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// So we can handle WebDriverWait in Selenium like below
		Duration duration = Duration.ofSeconds(30);
		driver.manage().timeouts().implicitlyWait(duration);
		driver.manage().timeouts().pageLoadTimeout(duration);
		
		driver.get("https://www.google.com/");
                
        driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
        driver.findElement(By.linkText("Sign in")).click();
        
        driver.quit();
        
	}
	
	public static void EdgeBrowserMethod() throws InterruptedException {
		//Edge Browser - This is not working
		/*System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();*/
				
		//Edge Browser
		//System.setProperty("webdriver.edge.driver","C:\\SELENIUM\\browser-driver\\edgedriver_win64\\msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"edgedriver_win64"+File.separator+"msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// So we can handle WebDriverWait in Selenium like below
		Duration duration = Duration.ofSeconds(30);
		driver.manage().timeouts().implicitlyWait(duration);
		driver.manage().timeouts().pageLoadTimeout(duration);
		
		driver.get("https://login.yahoo.com/");
        
		driver.findElement(By.name("username")).sendKeys("ru1251985@yahoo.co.in");
        driver.findElement(By.id("login-signin")).click();
        
        driver.close();
        
	}
	
	public static void IEBrowserMethod() {
		//IE Browser
		//System.setProperty("webdriver.ie.driver","C:\\SELENIUM\\browser-driver\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"IEDriverServer_x64_3.150.1"+File.separator+"IEDriverServer.exe");
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// So we can handle WebDriverWait in Selenium like below
		Duration duration = Duration.ofSeconds(30);
		driver.manage().timeouts().implicitlyWait(duration);
		driver.manage().timeouts().pageLoadTimeout(duration);
		
		driver.get("https://www.toolsqa.com/");
        
        //Below both are not working in IE
        //driver.close();
        //driver.quit();
	}
	
	public static void FirefoxBrowserMethod() throws InterruptedException {
		//Firefox Browser
		//System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\browser-driver\\firefox\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"firefox"+File.separator+"geckodriver-v0.29.0-win64"+File.separator+"geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
//		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// So we can handle WebDriverWait in Selenium like below
		Duration duration = Duration.ofSeconds(30);
		driver.manage().timeouts().implicitlyWait(duration);
		driver.manage().timeouts().pageLoadTimeout(duration);
		
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.google.com/");
        
		driver.close();
        //driver.quit();
        
	}	
	
	/*
	 * public static void OperaBrowserMethod() throws InterruptedException { //Opera
	 * Browser OperaOptions options = new OperaOptions(); options.setBinary(
	 * "C:\\Users\\raghi\\AppData\\Local\\Programs\\Opera\\60.0.3255.170\\opera.exe"
	 * ); options.setExperimentalOption("useAutomationExtension", false); //To
	 * remove notification for - Chrome Automation Extension.
	 * //System.setProperty("webdriver.opera.driver",
	 * "C:\\SELENIUM\\browser-driver\\operadriver_win32\\operadriver.exe");
	 * System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+
	 * File.separator+"browserdrivers"+File.separator+"operadriver_win32"+File.
	 * separator+"operadriver.exe"); WebDriver driver = new OperaDriver(options);
	 * 
	 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * 
	 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 * 
	 * driver.quit();
	 * 
	 * }
	 */
	
	// REFERENCE :- https://www.youtube.com/watch?v=4F-laDV9Pl8 [How to execute Selenium scripts on already opened browser]
	/*
	 * PRE-REQUIST
	 * 1) Chrome browser version above version 63.
	 * 
	 * 2) Add the below path to System Environment variable;
	 * C:\Program Files (x86)\Google\Chrome\Application
	 * 
	 * 3) Open the chrome browser in debugging mode
	 * Type the below command using command prompt
	 * chrome.exe -remote-debugging-port=9014 --user-data-dir="C:\SELENIUM\Chrome_Test_Profile"
	 * 
	 * 4)
	 * */
	public static void chromeBrowserInDebugMode() throws InterruptedException {
		/*
		Step-1 (Set the path in System variable)
		C:\Program Files (x86)\Google\Chrome\Application
		
		Step-2 (Open The Command Prompt and run the below command)
		chrome.exe -remote-debugging-port=9014 --user-data-dir=C:\SELENIUM\Chrome_Test_Profile
		 */
		
		/*
		Chrome Browser should be open thru command prompt and you should be available to that page where you want to continue your automation.
		Otherwise you will get exception
		*/
		
		//System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe");
		
		ChromeOptions chromeOptionsObj = new ChromeOptions();
		//chromeOptionsObj.addArguments("--remote-allow-origins=*");
		//chromeOptionsObj.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		chromeOptionsObj.setExperimentalOption("debuggerAddress", "localhost:9014");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptionsObj);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hi");
        
	}
	
	public static void main(String[] args) {
		try {
			SeleniumClassOne.chromeBrowserMethod();
			//SeleniumClassOne.EdgeBrowserMethod();
			//SeleniumClassOne.IEBrowserMethod();
			//SeleniumClassOne.FirefoxBrowserMethod();
			//SeleniumClassOne.OperaBrowserMethod();
			//SeleniumClassOne.chromeBrowserInDebugMode();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
