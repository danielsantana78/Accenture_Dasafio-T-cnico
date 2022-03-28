package elementos;

import org.openqa.selenium.By;

public class Elementos_AbaEnterVehicleData {

	/// elementos aba Enter Vehicle Data

	private By cmpCylindercapacity = By
			.xpath("//form//section[@class='idealsteps-step']//input[@name='Cylinder Capacity']");
	private By cmpengineperformance = By.xpath("//section[@class='idealsteps-step']//input[@id='engineperformance']");
	private By cmpDateOfManufacture = By.xpath("//input[@id='dateofmanufacture']");
	private By cmpdiaNoCalendario = By.xpath("//tr//td[@class='  ui-datepicker-today']//a");
	private By cmpnumberofseats = By.xpath("//section[@class='idealsteps-step']//select[@id='numberofseats']");
	private By slcNumberofseats = By.xpath("//section[@class='idealsteps-step']//select[@id='numberofseats']");
	private By rdoYes = By.xpath("//input[@id='righthanddriveyes']");
	private By slcNumberOfSeats = By
			.xpath("//section[@class='idealsteps-step']//select[@id='numberofseatsmotorcycle']");
	private By slcFuelType = By.xpath("//section[@class='idealsteps-step']//select[@id='fuel']");
	private By cmpPayloadkg = By.xpath("//section[@class='idealsteps-step']//input[@name='Payload']");
	private By cmpTotalWeightkg = By.id("totalweight");
	private By cmpListPrice = By.id("listprice");
	private By cmpLicensePlatenumber = By.xpath("//section[@class='idealsteps-step']//input[@id='licenseplatenumber']");
	private By cmpAnnualMileage = By.id("annualmileage");
	private By btnNextButton = By.xpath("//div//button[@class='next button']");
	private By cmpMake = By.xpath("//section[@class='idealsteps-step']//select[@id='make']");

	private By cmpModel = By.xpath("//section[@class='idealsteps-step']//select[@id='model']");

	public By getCmpModel() {
		return cmpModel;
	}

	public By getCmpCylindercapacity() {
		return cmpCylindercapacity;
	}

	public By getCmpengineperformance() {
		return cmpengineperformance;
	}

	public By getCmpDateOfManufacture() {
		return cmpDateOfManufacture;
	}

	public By getCmpdiaNoCalendario() {
		return cmpdiaNoCalendario;
	}

	public By getCmpnumberofseats() {
		return cmpnumberofseats;
	}

	public By getSlcNumberofseats() {
		return slcNumberofseats;
	}

	public By getRdoYes() {
		return rdoYes;
	}

	public By getSlcNumberOfSeats() {
		return slcNumberOfSeats;
	}

	public By getSlcFuelType() {
		return slcFuelType;
	}

	public By getCmpPayloadkg() {
		return cmpPayloadkg;
	}

	public By getCmpTotalWeightkg() {
		return cmpTotalWeightkg;
	}

	public By getCmpListPrice() {
		return cmpListPrice;
	}

	public By getCmpLicensePlatenumber() {
		return cmpLicensePlatenumber;
	}

	public By getCmpAnnualMileage() {
		return cmpAnnualMileage;
	}

	public By getBtnNextButton() {
		return btnNextButton;
	}

	public By getCmpMake() {
		return cmpMake;
	}

}
