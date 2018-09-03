package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
public class searchResultPage {
		
		private WebDriver driver;

		public searchResultPage() {
			this.driver = Driver.getDriver();
			PageFactory.initElements(driver, this);
		}

}
