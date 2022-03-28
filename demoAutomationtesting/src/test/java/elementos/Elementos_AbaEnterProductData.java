package elementos;

import org.openqa.selenium.By;

public class Elementos_AbaEnterProductData {

	/// elementos aba Enter Product Data

	private By slcMeritRating = By.xpath("//section[@class='idealsteps-step']//select[@id='meritrating']");
	private By slcDamageInsurance = By.xpath("//section[@class='idealsteps-step']//select[@id='damageinsurance']");
	private By slcCourtesyCar = By.xpath("//section[@class='idealsteps-step']//select[@id='courtesycar']");
	private By btnNextSelectPriceOption = By.xpath("//div//button[@id='nextselectpriceoption']");
	private By cmpStartDate = By.xpath("//input[@id='startdate']");
	private By slcInsuranceSum = By.xpath("//section[@class='idealsteps-step']//select[@id='insurancesum']");
	private By rdoOptionalProducts = By
			.xpath("//label[@class='ideal-radiocheck-label'][contains(.,'Legal Defense Insurance')]");

	public By getSlcInsuranceSum() {
		return slcInsuranceSum;
	}

	public By getSlcMeritRating() {
		return slcMeritRating;
	}

	public By getSlcDamageInsurance() {
		return slcDamageInsurance;
	}

	public By getSlcCourtesyCar() {
		return slcCourtesyCar;
	}

	public By getBtnNextSelectPriceOption() {
		return btnNextSelectPriceOption;
	}

	public By getCmpStartDate() {
		return cmpStartDate;
	}

	public By getRdoOptionalProducts() {
		return rdoOptionalProducts;
	}
}
