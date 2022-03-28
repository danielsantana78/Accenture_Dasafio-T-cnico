package steps;

import cucumber.api.java.en.Then;
import paginas.Paginas_AbaSendQuote;

public class Steps_VerificacaoMensagemDeSucesso {

	private Paginas_AbaSendQuote form = new Paginas_AbaSendQuote();

	@Then("^Verifico a mensagem “Sending e-mail success!” na tela$")
	public void verificoAMensagemSendingEMailSuccessNaTela() throws Throwable {
		form.verificoAMensagemSendingEMailSuccessNaTela();
	}
}
