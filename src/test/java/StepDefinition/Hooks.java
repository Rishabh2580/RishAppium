package StepDefinition;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BasePackage.BaseClass;
import BasePackage.ExtentManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hooks extends BaseClass{
	public Scenario scenerio;
public static  ExtentReports extent;
	public static ExtentTest test;
	 

	

	
	@Before
    public void setPrefbeforescenario(Scenario scenerio) {



       extent = ExtentManager.getInstance("reports/ExtentReport.html");
        System.out.println("BeforeSuite");



       String log4jPath = System.getProperty("user.dir") + "//log4j.properties";
      //  PropertyConfigurator.configure(log4jPath);
        System.out.println("BeforTest Log4j");



       this.scenerio = scenerio;
        System.out.println("This will run before " + scenerio.getName());



       test = extent.startTest(scenerio.getName());
        test.log(LogStatus.INFO, scenerio.getName() + " is Executing.");
    }



   @After
    public void setPrefAfterscenario() {



       System.out.println("This will run After TC");
        test.log(LogStatus.INFO, scenerio.getName() + " is Executed.");
        
        if (scenerio.getStatus().equalsIgnoreCase("failed"))
            test.log(LogStatus.FAIL, "Test Failed");
        else if (scenerio.getStatus().equalsIgnoreCase("skipped"))
            test.log(LogStatus.SKIP, "Test Skiped");
        else
            test.log(LogStatus.PASS, "Test Passed.");
        
        
        extent.flush();
    }
}