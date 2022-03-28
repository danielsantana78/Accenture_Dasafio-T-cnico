package steps;

import cucumber.api.java.en.When;
import paginas.Paginas_AbaEnterInsurantData;

public class Steps_AbaEnterInsurantData {

	private Paginas_AbaEnterInsurantData form = new Paginas_AbaEnterInsurantData();

	@When("^Preencho o formulário, aba “Enter Insurant Data” e pressione next$")
	public void preenchoOFormulárioAbaEnterInsurantDataEPressioneNext() throws Throwable {
		form.preenchoOFormulárioAbaEnterInsurantDataEPressioneNext();
	}

}
