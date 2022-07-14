# language: pt
Funcionalidade: Login Conta

  	Contexto: 
    Dado que eu acesse o site "https://www.advantageonlineshopping.com/#/"
    
@loginConta
Esquema do Cenario: Realizando Login para o Carrinho
    E clico em User para Login
    E digito o login "<username>"
    E digito a senha "<password>"
    E clico sign in
    
       
    Exemplos: 
      | username		   | password |
      | Cristina			 | Cris@123 |
