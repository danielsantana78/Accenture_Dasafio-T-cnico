package steps;

import cucumber.api.java.en.When;
import paginas.Paginas_AbaSelectPriceOption;

public class Steps_AbaSelectPriceOption {

	private Paginas_AbaSelectPriceOption form = new Paginas_AbaSelectPriceOption();
	
	@When("^Preencho o formulário, aba “Select Price Option” e pressione next$")
	public void preenchoOFormulárioAbaSelectPriceOptionEPressioneNext() throws Throwable {
		form.preenchoOFormularioAbaSelectPriceOptionEPressioneNext();
	}
}
