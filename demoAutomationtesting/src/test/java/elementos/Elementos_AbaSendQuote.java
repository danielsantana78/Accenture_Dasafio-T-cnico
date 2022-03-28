package elementos;

import org.openqa.selenium.By;

public class Elementos_AbaSendQuote {

	/// elementos aba Send Quote

	private By cmpPhone = By.xpath("//input[contains(@name,'Phone')]");
	private By cmpUsername = By.xpath("//input[contains(@name,'Username')]");
	private By cmpPassword = By.xpath("//input[@name='Password']");
	private By cmpConfirmPassword = By.xpath("//input[contains(@name,'Confirm Password')]");
	private By cmpComments = By.xpath("//textarea[contains(@name,'Comments')]");
	private By cmpEMail = By.xpath("//input[contains(@name,'E-Mail')]");
	private By btnsendemail = By.xpath("//button[@name='Send E-Mail'][contains(.,'« Send »')]");
	private By lblSuccess = By.xpath("//h2[contains(.,'Sending e-mail success!')]");
	private By btnOK = By.xpath("//button[@class='confirm'][contains(.,'OK')]");

	public By getCmpEMail() {
		return cmpEMail;
	}

	public By getCmpPhone() {
		return cmpPhone;
	}

	public By getCmpUsername() {
		return cmpUsername;
	}

	public By getCmpPassword() {
		return cmpPassword;
	}

	public By getCmpConfirmPassword() {
		return cmpConfirmPassword;
	}

	public By getCmpComments() {
		return cmpComments;
	}

	public By getBtnsendemail() {
		return btnsendemail;
	}

	public By getLblSuccess() {
		return lblSuccess;
	}

	public By getBtnOK() {
		return btnOK;
	}
}
