package Runner;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

@CucumberOptions(features = "src/test/java/feature", glue = { "StepDefinition" }, // path of step definition
			plugin = { "pretty"}, monochrome = true, 
			tags = { "@Test11,@Test12" })


		
			public class TestRunner extends AbstractTestNGCucumberTests {
				public static AppiumDriverLocalService service;
              public BaseClass B;
			@BeforeSuite
			public void startAppium() {
			//start appium
				service = AppiumDriverLocalService.buildDefaultService();
				service.start();
				//@Before
			//	public void launchAndInstallApp(Scenario scenario)throws IOException{
					//capabilities.setCapability("appium-version","1.18.1");
				DesiredCapabilities capabilities=new DesiredCapabilities() ;
					capabilities.setCapability("platformName","Android");
					capabilities.setCapability("browser","");
					capabilities.setCapability("platfromVersion","10");
					capabilities.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
					capabilities.setCapability("appActivity", ".RegisterActivity");
					capabilities.setCapability("deviceName","Android");
					//capabilities.setCapability("app","Android");
					capabilities.setCapability("app","/Users/rishabhsharma06/Downloads/in.workindia.apk");
					try {
						URL url= new URL("http://127.0.0.1:4723/wd/hub");
				        B.driver = new AppiumDriver<MobileElement>(url, capabilities);
				        B.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					}catch(Exception e) {
						e.printStackTrace();
					}
				//	this.scenario = scenario;
					System.out.println("Executing The Scenario ");
					
				}
			



			@AfterSuite
			public void stopAppium() {
				//stop appium
					B.driver.removeApp("in.workindia");
					B.driver.quit();
					//service.stop();
				}
			}
