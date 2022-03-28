package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Paginas_AbaEnterInsurantData;
import paginas.Paginas_AbaEnterProductData;

public class Steps_AbaEnterProductData {
	
	private Paginas_AbaEnterProductData form = new Paginas_AbaEnterProductData();
	
	@When("^Preencho o formulário, aba “Enter Product Data” e pressione next$")
	public void preenchoOFormulárioAbaEnterProductDataEPressioneNext() throws Throwable {
		form.preenchoOFormulárioAbaEnterProductDataEPressioneNext();
	}

}
