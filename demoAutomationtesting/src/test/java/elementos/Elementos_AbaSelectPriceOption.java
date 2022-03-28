package elementos;

import org.openqa.selenium.By;

public class Elementos_AbaSelectPriceOption {

	private By rdoOptionGold = By.xpath("//input[contains(@value,'Gold')]");
	private By btnNextSendQuote = By.xpath("//button[@name='Next (Send Quote)'][contains(.,'Next »')]");
	

	public By getRdoOptionGold() {
		return rdoOptionGold;
	}

	public By getBtnNextSendQuote() {
		return btnNextSendQuote;
	}

}
