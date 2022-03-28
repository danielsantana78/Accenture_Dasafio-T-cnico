package paginas;

import core.BaseSelenium;
import elementos.Elementos_AbaSelectPriceOption;

public class Paginas_AbaSelectPriceOption extends BaseSelenium {

	private Elementos_AbaSelectPriceOption eleDesafio = new Elementos_AbaSelectPriceOption();

	public void preenchoOFormularioAbaSelectPriceOptionEPressioneNext() {

		clicaNaOpcaoGolg();
		clicaNoBotaoNext();
		
	}

	// métodos dos preenchimentos

	private void clicaNaOpcaoGolg() {
		esperarElementoExistir(eleDesafio.getRdoOptionGold());
		System.out.println("verifica se o objeto Radio buton Option Gold existe na tela");
		moverParaElementoeClicar(eleDesafio.getRdoOptionGold());
		System.out.println("clica no radio button da opção Gold");
	}
	
	
	private void clicaNoBotaoNext() {
		esperarElementoExistir(eleDesafio.getBtnNextSendQuote());
		System.out.println("verifica se o objeto EnterInsurantData do botão Next existe na tela");
	  	clicar(eleDesafio.getBtnNextSendQuote());
		System.out.println("clicou no botão NEXT >>");
		System.out.println(" ");
		System.out.println("redireciona para o preenchimento da aba Send Quote");
	}
}
