package steps;

import cucumber.api.java.en.When;
import paginas.Paginas_AbaSendQuote;

public class Steps_AbaSendQuote {

	private Paginas_AbaSendQuote form = new Paginas_AbaSendQuote();

	@When("^Preencho o formulário, aba “Send Quote” e pressione Send$")
	public void preenchoOFormulárioAbaSendQuoteEPressioneSend() throws Throwable {
		form.preenchoOFormularioAbaSendQuoteEPressioneSend();
	}
	
}
