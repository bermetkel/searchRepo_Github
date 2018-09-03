package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class searchPage {
	private WebDriver driver;

	public searchPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="//h3[contains(text(),'repository results')]")
	public WebElement searchResultsCount;
	
	

}
