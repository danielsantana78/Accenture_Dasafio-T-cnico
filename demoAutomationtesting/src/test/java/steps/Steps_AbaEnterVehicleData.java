package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Paginas_AbaEnterVehicleData;

public class Steps_AbaEnterVehicleData {

	private Paginas_AbaEnterVehicleData form = new Paginas_AbaEnterVehicleData();

	@Given("^que eu acesso O Site  \"([^\"]*)\"$")
	public void queEuAcessoOSite(String site) throws Throwable {
		form.navegarParaUrl();
	}

	@When("^Preencho o formulário, aba “Enter Vehicle Data” e pressione next$")
	public void preenchoOFormulárioAbaEnterVehicleDataEPressioneNext() throws Throwable {
		form.preenchoOFormulárioAbaEnterVehicleDataEPressioneNext();
	}
}
