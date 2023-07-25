package StepDefinition;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;

import BasePackage.BaseClass;
import Screen.Screen2;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class StepDefination2 extends BaseClass {
public Screen2 sc;
Logger log = Logger.getLogger(StepDefination2.class);

public void verticleswipebypercentage (double startpercentage, double endpercentage, double anchorpercentage) {

	Dimension size = driver.manage().window().getSize();

	int anchor= (int) (size.width * anchorpercentage);
	int startpoint = (int) (size.height * startpercentage);
	int endpoint = (int) (size.height * endpercentage);

	new TouchAction(driver).press(PointOption.point(anchor,startpoint))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
	.moveTo(PointOption.point(anchor,endpoint)).release().perform();
}

public void verticleswipebypercentags (double startpercentage, double endpercentage, double anchorpercentage) {

	Dimension size = driver.manage().window().getSize();

	int anchor= (int) (size.width * anchorpercentage);
	int startpoint = (int) (size.height * startpercentage);
	int endpoint = (int) (size.height * endpercentage);

	new TouchAction(driver).press(PointOption.point(anchor,endpoint))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
	.moveTo(PointOption.point(anchor,startpoint)).release().perform();
}

@Given("^Workindia app is launched$")
public void Workindia_app_is_launched() throws Throwable {
   
	sc = new Screen2(driver);
}

  @When("^User click on profile button$")
  public void user_click_on_profile_button() throws Throwable {
      sc.my_profile();
      log.info("profile button is clicked");
  }

  @When("^User select My profile option$")
  public void user_select_My_profile_option() throws Throwable {
	  sc.my_profile2();
	  log.info("my profile");
  }

  @Then("^User click on edit button$")
  public void user_click_on_edit_button() throws Throwable {
      sc.edit_profile();
      log.info("edit button is clicked");
  }

  @Then("^User enter email address \"([^\"]*)\"$")
  public void user_enter_email_address(String email) throws Throwable {
      sc.edit_email(email);
      log.info("email entered sucessfully");
  }

  @Then("^User click on done button$")
  public void user_click_on_done_button() throws Throwable {
	  sc.edit_done();
	  Thread.sleep(2000);
	  verticleswipebypercentage(0.70, 0.10,0.50);
	
  }
  
  @Then("^User click on update profile$")
  public void user_click_on_update_profile() throws Throwable {
	  Thread.sleep(2000);
	  verticleswipebypercentage(0.70, 0.10,0.50);
      sc.update_pofile();
      verticleswipebypercentags(0.70, 0.10,0.50);
      Thread.sleep(1000);
      verticleswipebypercentags(0.70, 0.10,0.50); 
      sc.back_to_home();
      log.info("profile is updated");
  }

  @When("^User click on profile$")
  public void user_click_on_profile() throws Throwable {
      sc.my_profile();    
      Thread.sleep(2000);
      verticleswipebypercentage(0.70, 0.10,0.50);
  }

  @When("^User select change language option$")
  public void user_select_change_language_option() throws Throwable {
      sc.Change_Language();
      sc.Setting_Lnaguage();
  }

 

  @Then("^User select language$")
  public void user_select_language() throws Throwable {
      sc.choose_lnaguage();
      Thread.sleep(3000);
      log.info("select for language");
  }
  
	@Then("^user click on tip button$")
	public void user_click_on_tip_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   sc.TipsButton();
	   verticleswipebypercentage(0.70, 0.10,0.50);
	   
	}

	@Then("^user click on like button$")
	public void user_click_on_like_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verticleswipebypercentage(0.70, 0.10,0.50);
	   sc.LikeButton();
	   log.info("like button click");
	}


	
}