# language: pt
Funcionalidade: Login e Deletar Conta

  	Contexto: 
    Dado que eu acesse o site "https://www.advantageonlineshopping.com/#/"
    
@excluirConta
Esquema do Cenario: Deletando Conta
    E clico em User para Login
    E digito o login "<username>"
    E digito a senha "<password>"
    E clico sign in
    E clico em My account
    E clico em Delete Account
    Entao clico em YES
       
    Exemplos: 
      | username		   | password |
      | Cristina			 | Cris@123 |