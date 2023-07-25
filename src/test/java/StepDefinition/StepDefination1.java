package StepDefinition;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;

import BasePackage.BaseClass;
import Screen.Screen1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class StepDefination1 extends BaseClass {
	
	public Screen1 sr;
	Logger log = Logger.getLogger(StepDefination1.class);
	
	public void verticleswipebypercentage (double startpercentage, double endpercentage, double anchorpercentage) {
	Dimension size = driver.manage().window().getSize();

	int anchor= (int) (size.width * anchorpercentage);
	int startpoint = (int) (size.height * startpercentage);
	int endpoint = (int) (size.height * endpercentage);

	new TouchAction(driver).press(PointOption.point(anchor,startpoint))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
	.moveTo(PointOption.point(anchor,endpoint)).release().perform();
}
	
	@Given("^workindia app is launched$")
	public void workindia_app_is_launched() throws Throwable {
	    sr=new Screen1(driver);
	    log.info("app launch sucessfully");
	}
	@When("^User click on continue$")
	public void user_click_on_continue() throws Throwable {
	    sr.continue_();
	    log.info("continue button is clicked");
	}
	@Then("^User click on ok$")
	public void user_click_on_ok() throws Throwable {
	    sr.ok_();
	    log.info("ok button is click");
	}

	@When("^user enters name \"([^\"]*)\"$")
	public void user_enters_name(String arg1) throws Throwable {
	   sr.getname(arg1);
	   log.info("name is entered");
	}

	@When("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
	    sr.getno(arg1);
	    log.info("number is entered");
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
	    sr.clickButton();
	    log.info("submit button is click");
	}

	@Then("^user choose the city$")
	public void user_choose_the_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.select();
	}

	@Then("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.nearestCity(arg1);
	}

	@Then("^user click on the submit button$")
	public void user_click_on_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sr.submit();
		log.info("Registration is done");
	   	}
	


	@Given("^user have to select his Gender$")
	public void user_have_to_select_his_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Gender();
	}

	@Then("^user have to select his Qualification$")
	public void user_have_to_select_his_Qualification() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Qualification();
	}

	@Then("^user have to select his School Medium Was$")
	public void user_have_to_select_his_School_Medium_Was() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Medium();
	}

	@Then("^user have to select how fluent his English is$")
	public void user_have_to_select_how_fluent_his_English_is() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sr.speakEnglish();
		verticleswipebypercentage(0.70, 0.10,0.50);
	}

	@Then("^user have to select his Fresher/Experience$")
	public void user_have_to_select_his_Fresher_Experience() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Fresher();
	    verticleswipebypercentage(0.70, 0.5,0.25);
	}

	@Then("^user have to select his age$")
	public void user_have_to_select_his_age() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Age();
	    sr.SelectAge();
	    verticleswipebypercentage(0.70, 0.5,0.25);
	}

	@Then("^user have to select his profession intrest$")
	public void user_have_to_select_his_profession_intrest() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.ProfessionIntreset();
	}

	@Then("^user click on the intrest submit button$")
	public void user_click_on_the_intrest_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Submit();
	}

	@Then("^user select his Technical skill$")
	public void user_select_his_Technical_skill() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.technicalSkill();
	}

	@Then("^user choose his option$")
	public void user_choose_his_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.ElectricalOption();
	}

	@Then("^user click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.submitOpttion();
	}

	@Then("^user choose his Degree$")
	public void user_choose_his_Degree() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.yourDegree();
	}

	@Then("^user click on Desired degree$")
	public void user_click_on_Desired_degree() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   sr.DegreeSelect();
	}

	@Then("^user yes/no$")
	public void user_yes_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.No();
	}

	@Then("^user click on submits button$")
	public void user_click_on_submits_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.Submit();
	}

	@Then("^user choose his language$")
	public void user_choose_his_language() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sr.selectLanguage();
	    log.info("skill created");
	}
	
	

	
	@When("^User have to click on filter$")
	public void user_have_to_click_on_filter() throws Throwable {
		Thread.sleep(20000);
	  sr.filter_();
	}

	@When("^User have to choose Interesed aria for job$")
	public void user_have_to_choose_Interesed_aria_for_job() throws Throwable {
	  sr.interesed_area1();
	}

	@Then("^click on apply$")
	public void click_on_apply() throws Throwable {
	  sr.Apply_filter();
	  Thread.sleep(5000);
	  verticleswipebypercentage(0.70, 0.10,0.50);
	  
	}



	//--Scenario 3---

	@Then("^User have to sreach near location for job \"([^\"]*)\"$")
	public void user_have_to_sreach_near_location_for_job(String location) throws Throwable {
	   sr.Search(location);
	   Thread.sleep(3000);
	   log.info("search for jobs");
	}

	@When("^Use have to Selcet Jobs$")
	public void use_have_to_Selcet_Jobs() throws Throwable {
	   sr.job_favorite1();
	}

	  @Then("^User Have to click on favorite button to save job for later$")
	public void user_Have_to_click_on_favorite_button_to_save_job_for_later() throws Throwable {
	    sr.Add_to_favortite();
	    Thread.sleep(3000);
	}
	  @Then("^User have to go back to select another job$")
	  public void user_have_to_go_back_to_select_another_job() throws Throwable {
	    sr.back();
	  }

	  @Then("^User have to select another job$")
	  public void user_have_to_select_another_job() throws Throwable {
	    sr.job_favorite2();
	  }

	  @Then("^User have to click on favorite button$")
	  public void user_have_to_click_on_favorite_button() throws Throwable {
	    sr.Add_to_favortite();
	  }

	  @When("^User have go back for cheking Favorite Job List$")
	  public void user_have_go_back_for_cheking_Favorite_Job_List() throws Throwable {
	    sr.back();
	  }

	  @Then("^Click on prifle$")
	  public void click_on_prifle() throws Throwable {
	      sr.my_profile();
	      log.info("clicked on profile");
	  }

	  @Then("^Click on my favorite job$")
	  public void click_on_my_favorite_job() throws Throwable {
	    sr.my_favorite_job();
	   // Thread.sleep(3000);
	    sr.back();
	  }


}