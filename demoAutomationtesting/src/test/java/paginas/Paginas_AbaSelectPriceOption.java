package paginas;

import core.BaseSelenium;
import elementos.Elementos_AbaSelectPriceOption;

public class Paginas_AbaSelectPriceOption extends BaseSelenium{

	private Elementos_AbaSelectPriceOption eleDesafio = new Elementos_AbaSelectPriceOption();

	public void preenchoOFormularioAbaSelectPriceOptionEPressioneNext() {
		
	//	esperarElementoExistir(eleDesafio.getRdoOptionSilver());
		System.out.println("verifica se o objeto StartDate existe na tela");
	//	clicar(eleDesafio.getRdoOptionSilver());
		System.out.println("clica no radio button da opção Silver");
	}

}
