package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//this is just a comment

import utilities.Driver;

public class homePage {
	
	private WebDriver driver;

	public homePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='q']")
	public WebElement searchBox;

	@FindBy(xpath="//input[@placeholder='Search GitHub']")
	public WebElement placeholder;
	

}
