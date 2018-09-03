package step_defs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Result;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homePage;
import pages.searchPage;
import utilities.Driver;
import utilities.configurationReader;

public class homePageStepDefs {
	private WebDriver driver = Driver.getDriver();
	homePage homepage = new homePage();
	searchPage searchpage = new searchPage();

	@Given("^I am on GitHub homepage$")
	public void i_am_on_GitHub_homepage() {
		driver.get(configurationReader.getProperty("url"));
		assertEquals(driver.getTitle(), "The world’s leading software development platform · GitHub");
	}

	@Then("^searchBox should be visible on GitHub homepage$")
	public void searchbox_should_be_visible_on_GitHub_homepage() {
		assertTrue(homepage.searchBox.isDisplayed());
	}

	@When("^I click on search textbox$")
	public void i_click_on_search_textbox() {
		homepage.searchBox.click();

	}

	// #2

	@Then("^place holder should be \"([^\"]*)\"$")
	public void place_holder_should_be(String arg1) {
		assertEquals(homepage.placeholder.getAttribute("placeholder"), arg1);

	}

	// #3
	@When("^I enter \"([^\"]*)\" and hit Enter key$")
	public void i_enter_and_hit_Enter_key(String arg1) {
		homepage.searchBox.sendKeys(arg1);
		homepage.searchBox.sendKeys(Keys.ENTER);

	}

	@Then("^I should see results page$")
	public void i_should_see_results_page() {
		assertEquals(driver.getTitle(), ("Search · repositories · GitHub"));
		assertTrue(searchpage.searchResultsCount.getText().contains("repository results"));
	}

	// #4

	@Then("^i should see results for \"([^\"]*)\"$")
	public void i_should_see_results_for(String arg1) {

		List<WebElement> allResults = driver.findElements(By.xpath("//*[contains(@class,'col-12 col-md-8 pr-md-3')]"));
		for (WebElement result : allResults) {
			if (result.getText().contains(arg1)) {
				assertTrue(result.getText().contains(arg1));
			}
		}
	}

	// #5

	@Then("^i should see (\\d+) results per page$")
	public void i_should_see_results_per_page(int arg1) {
		List<WebElement> allResults = driver.findElements(By.xpath("//*[contains(@class,'col-12 col-md-8 pr-md-3')]"));
		assertEquals(allResults.size(), arg1);
	}

	// #6

	@When("^i sort results by \"([^\"]*)\"$")
	public void i_sort_results_by(String arg1) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement dropdown = driver.findElement(By.xpath("//summary[@class='btn btn-sm select-menu-button']"));
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).click().build().perform();
		WebElement option2 = driver.findElement(By.xpath("//a[@class='select-menu-item'][2]"));
		action.click(option2).perform();
		;

	}

	@Then("^the resultspage should display \"([^\"]*)\" result$")
	public void the_resultspage_should_display_result(String arg1) {
		WebElement stars1 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][1]"));
		WebElement stars2 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][2]"));
		WebElement stars3 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][3]"));
		WebElement stars4 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][4]"));
		WebElement stars5 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][5]"));
		WebElement stars6 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][6]"));
		WebElement stars7 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][7]"));
		WebElement stars8 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][8]"));
		WebElement stars9 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][9]"));
		WebElement stars10 = driver.findElement(By.xpath(
				"//*[@class='repo-list-item d-flex flex-column flex-md-row flex-justify-start py-4 public source'][10]"));

		assertTrue(stars1.isDisplayed());
		assertTrue(stars2.isDisplayed());
		assertTrue(stars3.isDisplayed());
		assertTrue(stars4.isDisplayed());
		assertTrue(stars5.isDisplayed());
		assertTrue(stars6.isDisplayed());
		assertTrue(stars7.isDisplayed());
		assertTrue(stars8.isDisplayed());
		assertTrue(stars9.isDisplayed());
		assertTrue(stars10.isDisplayed());
	}
}
