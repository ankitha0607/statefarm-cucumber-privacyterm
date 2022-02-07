package statefarmprivacyterm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class privacytermstepdefinitions{
	WebDriver driver;

	@Given("I am on statefarm website")
	public void i_am_on_statefarm_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.statefarm.com/");
	}
	@When("I click on dropdown")
	public void i_click_on_dropdown() {
		driver.findElement(By.id("popDropdown")).click();
	}
	@When("select an option in dropdown")
	public void select_an_option_in_dropdown() {
		driver.findElement(By.xpath("/html/body/div[8]/section[1]/div/div[1]/div/div/div/div/form/div/select/option[3]")).click();

	}
	@When("enter the zipcode in text box")
	public void enter_the_zipcode_in_text_box() {
		driver.findElement(By.id("quote-main-zip-code-input")).sendKeys("30024");
	}
	@When("click on get a quote button")
	public void click_on_get_a_quote_button() {
		driver.findElement(By.id("quote-main-zip-btn")).click();
	}
	@When("I verify the next page is displayed")
	public void i_verify_the_next_page_is_displayed() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean pageisup = driver.findElement(By.id("sfx_sfLogo")).isDisplayed();
		if(pageisup) {
			System.out.println("Page is up");
		}
		else {
			System.out.println("Page is up ");

		}
	}	

	@When("Click on the statefarm logo")
	public void click_on_the_statefarm_logo() {
		driver.findElement(By.id("sfx_sfLogo")).click();

	}


	@When("I verify I am on statefarm home page")
	public void i_verify_i_am_on_statefarm_home_page() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		if(URL.contains("/customer-care/privacy-security")) {
			System.out.println("URL not matching --> Part executed");
		}
		else {
			System.out.println("URL matching --> Part executed");

		} 

	}

	@When("I verify that the privacy term pop up is present")
	public void i_verify_that_the_privacy_term_pop_up_is_present() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean popupispresent =   driver.findElement(By.id("optpara")).isDisplayed();
		if(popupispresent) {
			System.out.println("pop up is present");

		}
		else {
			System.out.println("pop up is not present");
		}

	}
	@Then("I click on the read more option")
	public void i_click_on_the_read_more_option() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("optccpaReadmore")).click();
	}
	@Then("I close the browser")
	public void i_close_the_browser() {
		driver.close();
		System.out.println("Closed the browser");

	}









}