$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cenário Preenchimento.feature");
formatter.feature({
  "line": 1,
  "name": "Preencher as abas Enter Vehicle Data, Enter Insurant Data, Enter Product Data, Select Price Option, Send Quote e Verificar a mensagem “Sending e-mail success!” na tela.",
  "description": "",
  "id": "preencher-as-abas-enter-vehicle-data,-enter-insurant-data,-enter-product-data,-select-price-option,-send-quote-e-verificar-a-mensagem-“sending-e-mail-success!”-na-tela.",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "que eu acesso O Site  \"http://sampleapp.tricentis.com/101/app.php\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sampleapp.tricentis.com/101/app.php",
      "offset": 23
    }
  ],
  "location": "Steps_AbaEnterVehicleData.queEuAcessoOSite(String)"
});
formatter.result({
  "duration": 3221392900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Preencher o formulario das abas Vehicle Data, Insurant Data, Product Data, Select Price Option e Send Quote",
  "description": "",
  "id": "preencher-as-abas-enter-vehicle-data,-enter-insurant-data,-enter-product-data,-select-price-option,-send-quote-e-verificar-a-mensagem-“sending-e-mail-success!”-na-tela.;preencher-o-formulario-das-abas-vehicle-data,-insurant-data,-product-data,-select-price-option-e-send-quote",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Preenchimento"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Preencho o formulário, aba “Enter Vehicle Data” e pressione next",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Preencho o formulário, aba “Enter Insurant Data” e pressione next",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Preencho o formulário, aba “Enter Product Data” e pressione next",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Preencho o formulário, aba “Select Price Option” e pressione next",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Preencho o formulário, aba “Send Quote” e pressione Send",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verifico a mensagem “Sending e-mail success!” na tela",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_AbaEnterVehicleData.preenchoOFormulárioAbaEnterVehicleDataEPressioneNext()"
});
formatter.result({
  "duration": 1262791800,
  "status": "passed"
});
formatter.match({
  "location": "Steps_AbaEnterInsurantData.preenchoOFormulárioAbaEnterInsurantDataEPressioneNext()"
});
formatter.result({
  "duration": 1447716400,
  "status": "passed"
});
formatter.match({
  "location": "Steps_AbaEnterProductData.preenchoOFormulárioAbaEnterProductDataEPressioneNext()"
});
formatter.result({
  "duration": 729986500,
  "status": "passed"
});
formatter.match({
  "location": "Steps_AbaSelectPriceOption.preenchoOFormulárioAbaSelectPriceOptionEPressioneNext()"
});
formatter.result({
  "duration": 803901800,
  "status": "passed"
});
formatter.match({
  "location": "Steps_AbaSendQuote.preenchoOFormulárioAbaSendQuoteEPressioneSend()"
});
formatter.result({
  "duration": 850957300,
  "status": "passed"
});
formatter.match({
  "location": "Steps_VerificacaoMensagemDeSucesso.verificoAMensagemSendingEMailSuccessNaTela()"
});
formatter.result({
  "duration": 14189772400,
  "status": "passed"
});
});