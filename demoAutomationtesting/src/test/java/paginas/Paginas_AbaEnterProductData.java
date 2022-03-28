package paginas;

import core.BaseSelenium;
import elementos.Elementos_AbaEnterInsurantData;
import elementos.Elementos_AbaEnterProductData;

public class Paginas_AbaEnterProductData extends BaseSelenium {

	private Elementos_AbaEnterProductData eleDesafio = new Elementos_AbaEnterProductData();

	public void preenchoOFormulárioAbaEnterProductDataEPressioneNext() {

		preencheCampoStartDate();
		selecionaInsuranceSum();
		selecionaMeritRating();
		selecionaDamageInsurance();
		selecionaCourtesyCar();
		clicaNoBotaoNext();
	}

	// métodos dos preenchimentos

	private void preencheCampoStartDate() {
		esperarElementoExistir(eleDesafio.getCmpStartDate());
		System.out.println("verifica se o objeto StartDate existe na tela");
		escreveNoCampo(eleDesafio.getCmpStartDate(), "04/29/2022");
		System.out.println("preenche o campo Start Date com uma data");
	}

	private void selecionaInsuranceSum() {
		esperarElementoExistir(eleDesafio.getSlcInsuranceSum());
		System.out.println("verifica se o objeto InsuranceSum existe na tela");
		comboBoxPorTexto(eleDesafio.getSlcInsuranceSum(), "35.000.000,00");
		System.out.println("seleciona o valor 35.000.000,00 no campo Insurance Sum [$]");
	}

	private void selecionaMeritRating() {
		esperarElementoExistir(eleDesafio.getSlcMeritRating());
		System.out.println("verifica se o objeto MeritRating existe na tela");
		comboBoxPorValor(eleDesafio.getSlcMeritRating(), "Malus 17");
		System.out.println("seleciona a opção Malus 17 no campo Merit Rating");
	}

	private void selecionaDamageInsurance() {
		esperarElementoExistir(eleDesafio.getSlcDamageInsurance());
		System.out.println("verifica se o objeto DamageInsurance existe na tela");
		comboBoxPorValor(eleDesafio.getSlcDamageInsurance(), "Full Coverage");
		System.out.println("seleciona a opção Full Coverage no campo Damage Insurance");
	}

	private void selecionaCourtesyCar() {
		esperarElementoExistir(eleDesafio.getSlcCourtesyCar());
		System.out.println("verifica se o objeto CourtesyCar existe na tela");
		comboBoxPorValor(eleDesafio.getSlcCourtesyCar(), "Yes");
		System.out.println("seleciona a opção Yes no campo Courtesy Car");
	}

	private void clicaNoBotaoNext() {
		esperarElementoExistir(eleDesafio.getBtnNextSelectPriceOption());
		System.out.println("verifica se o objeto NextSelectPriceOption do botão Next existe na tela");
		clicar(eleDesafio.getBtnNextSelectPriceOption());
		System.out.println("clicou no botão NEXT >>");
		System.out.println(" ");
		System.out.println("redireciona para o preenchimento da aba Select Price Option");
	}
}
