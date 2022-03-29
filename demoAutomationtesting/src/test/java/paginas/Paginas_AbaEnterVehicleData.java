package paginas;

import core.BaseSelenium;
import elementos.Elementos_AbaEnterInsurantData;
import elementos.Elementos_AbaEnterVehicleData;

public class Paginas_AbaEnterVehicleData extends BaseSelenium {

	private Elementos_AbaEnterVehicleData eleDesafio = new Elementos_AbaEnterVehicleData();

	public void preenchoOFormulárioAbaEnterVehicleDataEPressioneNext() {
		selecionaMake();
		selecionaModel();
		preencheCampoCylinderCapacity();
		preencheCampoEnginePerformance();
		preencheCampoDateOfManufacture();
		selecioNumberOfSeats();
		selecionaOSegundoOfSeats();
		selecionaOFuelType();
		preencheCampoPayload();
		preencheCampoTotalWeight();
		preencheCampoListPrice();
		preencheCampoLicensePlateNumber();
		preencheCampoAnnualMileage();
		clicaNoBotaoNext();
	}

	// métodos dos preenchimentos dos campos

	private void selecionaMake() {
		esperarElementoExistir(eleDesafio.getCmpMake());
		System.out.println("verifica se o objeto make existe na tela");
		comboBoxPorValor(eleDesafio.getCmpMake(), "BMW");
		System.out.println("escolheu na lista Make o BMW");
	}

	private void selecionaModel() {
		esperarElementoExistir(eleDesafio.getCmpModel());
		System.out.println("verifica se o objeto model existe na tela");
		comboBoxPorValor(eleDesafio.getCmpModel(), "Motorcycle");
		System.out.println("escolheu na lista Model o Motorcycle");
	}

	private void preencheCampoCylinderCapacity() {
		esperarElementoExistir(eleDesafio.getCmpCylindercapacity());
		System.out.println("verifica se o objeto cylindercapacity existe na tela");
		escrever(eleDesafio.getCmpCylindercapacity(), "1200");
		System.out.println("preenche o campo Cylinder Capacity [ccm], com o valor 1200");
	}

	private void preencheCampoEnginePerformance() {
		esperarElementoExistir(eleDesafio.getCmpengineperformance());
		System.out.println("verifica se o objeto engineperformance existe na tela");
		escrever(eleDesafio.getCmpengineperformance(), "500");
		System.out.println("preenche o campo Engine Performance [kW], com o valor 500");
	}

	private void preencheCampoDateOfManufacture() {
		esperarElementoExistir(eleDesafio.getCmpDateOfManufacture());
		System.out.println("verifica se o objeto DateOfManufacture existe na tela");
		limparCampo(eleDesafio.getCmpDateOfManufacture());
		escreveNoCampo(eleDesafio.getCmpDateOfManufacture(), "03/25/2022");
		System.out.println("preenche o campo Date of Manufacture com uma data");
	}

	private void selecioNumberOfSeats() {
		esperarElementoExistir(eleDesafio.getSlcNumberofseats());
		System.out.println("verifica se o objeto Numberofseats existe na tela");
		comboBoxPorValor(eleDesafio.getSlcNumberofseats(), "9");
		System.out.println("seleciona o 9 no campo Number of Seats");
	}

	private void selecionaOSegundoOfSeats() {
		esperarElementoExistir(eleDesafio.getSlcNumberOfSeats());
		System.out.println("verifica se o objeto NumberOfSeats existe na tela");
		comboBoxPorValor(eleDesafio.getSlcNumberOfSeats(), "3");
		System.out.println("seleciona o 3 no campo Number of Seats");
	}

	private void selecionaOFuelType() {
		esperarElementoExistir(eleDesafio.getSlcFuelType());
		System.out.println("verifica se o objeto FuelType existe na tela");
		comboBoxPorValor(eleDesafio.getSlcFuelType(), "Petrol");
		System.out.println("seleciona a opçãp Petrol no campo Fuel Type");
	}

	private void preencheCampoPayload() {
		esperarElementoExistir(eleDesafio.getCmpPayloadkg());
		System.out.println("verifica se o objeto Payloadkg existe na tela");
		escrever(eleDesafio.getCmpPayloadkg(), "100");
		System.out.println("preenche o campo Payload [kg] com 100");
	}

	private void preencheCampoTotalWeight() {
		esperarElementoExistir(eleDesafio.getCmpTotalWeightkg());
		System.out.println("verifica se o objeto TotalWeightkg existe na tela");
		escrever(eleDesafio.getCmpTotalWeightkg(), "100");
		System.out.println("preenche o campo Total Weight [kg] com 100");
	}

	private void preencheCampoListPrice() {
		esperarElementoExistir(eleDesafio.getCmpListPrice());
		System.out.println("verifica se o objeto ListPrice existe na tela");
		escrever(eleDesafio.getCmpListPrice(), "500");
		System.out.println("preenche o campo List Price [$] com 500");
	}

	private void preencheCampoLicensePlateNumber() {
		esperarElementoExistir(eleDesafio.getCmpLicensePlatenumber());
		System.out.println("verifica se o objeto LicensePlatenumber existe na tela");
		escrever(eleDesafio.getCmpLicensePlatenumber(), "100");
		System.out.println("preenche o campo License Plate Number com 100");
	}

	private void preencheCampoAnnualMileage() {
		esperarElementoExistir(eleDesafio.getCmpAnnualMileage());
		System.out.println("verifica se o objeto AnnualMileage existe na tela");
		escrever(eleDesafio.getCmpAnnualMileage(), "100");
		System.out.println("preenche o campo Annual Mileage [mi] com 100");
	}

	private void clicaNoBotaoNext() {
		esperarElementoExistir(eleDesafio.getCmpAnnualMileage());
		System.out.println("verifica se o objeto AnnualMileage do botão Next existe na tela");
		clicar(eleDesafio.getBtnNextButton());
		System.out.println("clicou no botão NEXT >>");
		System.out.println(" ");
		System.out.println("redireciona para o preenchimento da aba Enter Insurant Data");
	}
}
