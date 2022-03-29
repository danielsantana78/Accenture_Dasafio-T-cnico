package paginas;

import core.BaseSelenium;
import elementos.Elementos_AbaEnterInsurantData;

public class Paginas_AbaEnterInsurantData extends BaseSelenium {

	private Elementos_AbaEnterInsurantData eleDesafio = new Elementos_AbaEnterInsurantData();

	public void preenchoOFormulárioAbaEnterInsurantDataEPressioneNext() {
		preencheCampoFirstName();
		preencheCampoLasttName();
		preencheCampoDateOfBirth();
		preencheCampoStreetAddress();
		selecionaCountry();
		preencheCampoZipCode();
		preencheCampoCity();
		selecionaOccupation();
		clicaEmOther();
		preencheCampoWebsite();
		upLoadPicture(); // Upload Picture não funcionou corretamente
		clicaNoBotaoNext();
		// implementar Gender
	}

	// métodos dos preenchimentos dos campos

	private void preencheCampoFirstName() {
		esperarElementoExistir(eleDesafio.getCmpFirstname());
		System.out.println("verifica se o objeto Firstname existe na tela");
		escreveNoCampo(eleDesafio.getCmpFirstname(), "Daniel");
		System.out.println("preenche o campo First Name com o nome Daniel");
	}

	private void preencheCampoLasttName() {
		esperarElementoExistir(eleDesafio.getCmpLastname());
		System.out.println("verifica se o objeto Lastname existe na tela");
		escreveNoCampo(eleDesafio.getCmpLastname(), "Santana");
		System.out.println("preenche o campo First Name com o sobrenome Santana");
	}

	private void preencheCampoDateOfBirth() {
		esperarElementoExistir(eleDesafio.getCmpbirthdate());
		System.out.println("verifica se o objeto birthdate existe na tela");
		limparCampo(eleDesafio.getCmpbirthdate());
		escreveNoCampo(eleDesafio.getCmpbirthdate(), "09/09/1978");
		System.out.println("preenche o campo Date of Birth com uma data");
	}

	private void preencheCampoStreetAddress() {
		esperarElementoExistir(eleDesafio.getCmpStreetaddress());
		System.out.println("verifica se o objeto Streetaddress existe na tela");
		escreveNoCampo(eleDesafio.getCmpStreetaddress(), "Rua Jarama");
		System.out.println("preenche o campo Street Address com a rua Jarama");
	}

	private void selecionaCountry() {
		esperarElementoExistir(eleDesafio.getSlcCountry());
		System.out.println("verifica se o objeto Country existe na tela");
		comboBoxPorTexto(eleDesafio.getSlcCountry(), "Brazil");
		System.out.println("seleciona o país Brazil no campo Country");
	}

	private void preencheCampoZipCode() {
		esperarElementoExistir(eleDesafio.getCmpZipcode());
		System.out.println("verifica se o objeto Zipcode existe na tela");
		escreveNoCampo(eleDesafio.getCmpZipcode(), "06634020");
		System.out.println("preenche o campo Zip Code com o CEP 06634020");
	}

	private void preencheCampoCity() {
		esperarElementoExistir(eleDesafio.getCmpCity());
		System.out.println("verifica se o objeto City existe na tela");
		escreveNoCampo(eleDesafio.getCmpCity(), "São Paulo");
		System.out.println("preenche o campo City com o nome da Cidade de São Paulo");
	}

	private void selecionaOccupation() {
		esperarElementoExistir(eleDesafio.getSlcOccupation());
		System.out.println("verifica se o objeto Occupation existe na tela");
		comboBoxPorValor(eleDesafio.getSlcOccupation(), "Selfemployed");
		System.out.println("seleciona a opção Autônomo do campo Occupation");
	}

	private void clicaEmOther() {
		esperarElementoExistir(eleDesafio.getRdoOther());
		System.out.println("verifica se o objeto id Other existe na tela");
		moverParaElementoeClicar(eleDesafio.getRdoOther());
		System.out.println("clica em Other do campo Hobbies");
	}

	private void preencheCampoWebsite() {
		esperarElementoExistir(eleDesafio.getCmpWebSite());
		System.out.println("verifica se o objeto WebSite existe na tela");
		escreveNoCampo(eleDesafio.getCmpWebSite(), "https://www.accenture.com/br-pt");
		System.out.println("preenche o campo Website com o endereço do site da Accenture Brasil");
	}

	public void upLoadPicture() {
		esperarElementoExistir(eleDesafio.getCmpUpLoadPicture());
		System.out.println("verifica se o objeto ideal-file-wrap existe na tela");
		anexarDocumentos();
	}

	private void clicaNoBotaoNext() {
		esperarElementoExistir(eleDesafio.getBtnNextEnterInsurantData());
		System.out.println("verifica se o objeto EnterInsurantData do botão Next existe na tela");
		clicar(eleDesafio.getBtnNextEnterInsurantData());
		System.out.println("clicou no botão NEXT >>");
		System.out.println(" ");
		System.out.println("redireciona para o preenchimento da aba Enter Product Data");
	}
}
