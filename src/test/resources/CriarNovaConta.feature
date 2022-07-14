# language: pt
Funcionalidade: Creat New Account

  	Contexto: 
    Dado que eu acesse o site "https://advantageonlineshopping.com/#/"
    
@criandoNovaConta 
Esquema do Cenario: Criando nova conta
		E clico User
    E clico em Criar Nova Conta
    E digito o username "<username>"
    E digito o email "<email>"
    E crio a senha "<password>"
    E confirmo a senha "<password>"
    E digito primeiro Nome "<firstname>"
    E digito ultimo Nome "<lastname>"
    E digito celular "<phone>"
   #E seleciono o pais"<country>"
    E digito cidade "<city>"
    E digito endereco "<address>"
    E digito regiao "<state>"
    E digito cep "<postalcode>"
    E clico no check box eu concordo
		Entao clico no botao Register
    
    Exemplos: 
 			| username		   | email          | password | firstname | lastname | phone 				| country | city      | address				| state | postalcode |
      | Cristina       | cris@gmail.com | Cris@123 | Cristina  |  Sales   |(11)99999-9999	| Brasil	| Sao Paulo | Av. Sao Joao  | SP		| 00000-000  |