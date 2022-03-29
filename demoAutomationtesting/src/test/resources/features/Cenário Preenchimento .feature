Feature: Preencher as abas Enter Vehicle Data, Enter Insurant Data, Enter Product Data, Select Price Option, Send Quote e Verificar a mensagem “Sending e-mail success!” na tela.

Background:
  Given que eu acesso O Site  "http://sampleapp.tricentis.com/101/app.php"

 @Preenchimento
 Scenario: Preencher o formulario das abas Vehicle Data, Insurant Data, Product Data, Select Price Option e Send Quote
	  When Preencho o formulário, aba “Enter Vehicle Data” e pressione next
		And Preencho o formulário, aba “Enter Insurant Data” e pressione next
		And Preencho o formulário, aba “Enter Product Data” e pressione next
		And Preencho o formulário, aba “Select Price Option” e pressione next
		And Preencho o formulário, aba “Send Quote” e pressione Send
		Then Verifico a mensagem “Sending e-mail success!” na tela

