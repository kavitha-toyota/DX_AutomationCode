import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class dx_step_definition {
	
	
	FirefoxDriver driver=new FirefoxDriver();
	
	@Given("^Firefox browser opened successfully with the website$")
	public void Firefox_browser_opened_successfully_with_the_website() throws Throwable {
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("^click on first link of the page$")
	public void click_on_first_link_of_the_page() throws Throwable {
		driver.findElementByXPath("//*[text()='JavaScript Alerts']").click();
	}

	@Then("^click on second link of the page$")
	public void click_on_second_link_of_the_page() throws Throwable {
		driver.findElementByXPath("//*[text()= 'Click for JS Confirm']").click();
	    
	}

	@Then("^select OK on the pop up window$")
	public void select_OK_on_the_pop_up_window() throws Throwable {
		driver.switchTo().alert().accept();
	    
	}

	@Then("^verify the text on the page using assert$")
	public void verify_the_text_on_the_page_using_assert() throws Throwable {
		String str = driver.findElement(By.id("result")).getText();
		Assert.assertEquals("You clicked: Ok", str);
		driver.quit();
	}
	    
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.quit();
	}
	
	}


	
	