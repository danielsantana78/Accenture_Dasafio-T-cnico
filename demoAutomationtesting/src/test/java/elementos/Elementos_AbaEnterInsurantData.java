package elementos;

import org.openqa.selenium.By;

public class Elementos_AbaEnterInsurantData {

	/// elementos aba Enter Insurant Data

	private By cmpFirstname = By.xpath("//section[@class='idealsteps-step']//input[@name='First Name']");
	private By cmpLastname = By.xpath("//section[@class='idealsteps-step']//input[@name='Last Name']");
	private By cmpbirthdate = By.xpath("//input[@id='birthdate']");
	private By cmpStreetaddress = By.xpath("//section[@class='idealsteps-step']//input[@id='streetaddress']");
	private By slcCountry = By.xpath("//select[@id='country']");
	private By cmpZipcode = By.xpath("//section[@class='idealsteps-step']//input[@name='Zip Code']");
	private By cmpCity = By.xpath("//section[@class='idealsteps-step']//input[@name='City']");
	private By slcOccupation = By.xpath("//section[@class='idealsteps-step']//select[@id='occupation']");
	private By rdoHobbiesSpeeding = By
			.xpath("//div[@class='field idealforms-field idealforms-field-checkbox']//p//input[@id='other']");
	private By rdoOther = By
			.xpath("//p//label[@class='ideal-radiocheck-label'][contains(.,'Other')]");
	private By cmpWebSite = By.xpath("//section[@class='idealsteps-step']//input[@name='Website']");
	private By cmpUpLoadPicture = By.xpath("//input[@class='ideal-file-filename']");
	private By btnNextEnterInsurantData = By.xpath("//div//button[@id='nextenterproductdata']");

	

	public By getCmpFirstname() {
		return cmpFirstname;
	}

	public By getCmpLastname() {
		return cmpLastname;
	}

	public By getCmpbirthdate() {
		return cmpbirthdate;
	}

	public By getCmpStreetaddress() {
		return cmpStreetaddress;
	}

	public By getSlcCountry() {
		return slcCountry;
	}

	public By getCmpZipcode() {
		return cmpZipcode;
	}

	public By getCmpCity() {
		return cmpCity;
	}

	public By getSlcOccupation() {
		return slcOccupation;
	}

	public By getRdoHobbiesSpeeding() {
		return rdoHobbiesSpeeding;
	}

	public By getRdoOther() {
		return rdoOther;
	}

	public By getCmpWebSite() {
		return cmpWebSite;
	}

	public By getCmpUpLoadPicture() {
		return cmpUpLoadPicture;
	}

	public By getBtnNextEnterInsurantData() {
		return btnNextEnterInsurantData;
	}
}
