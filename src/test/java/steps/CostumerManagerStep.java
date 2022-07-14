package steps;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.RegisterPage;

public class CostumerManagerStep {
	private RegisterPage registerPage;
	ChromeDriver driver = new ChromeDriver();

	public void AutomacaoWebStep() {
		this.registerPage = new RegisterPage(driver);
	}

	@Dado("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		new RegisterPage(driver).setQueAcessoSite(site);
	}

	@E("^clico User$")
	public void clico_User() throws Throwable {
		new RegisterPage(driver).clicarUser();
	}

	@E("^clico em Criar Nova Conta$")
	public void clico_em_Criar_Nova_Conta() throws Throwable {
		new RegisterPage(driver).createNewAccount();
	}
	
	@Dado("^digito o username \"([^\"]*)\"$")
	public void digito_o_username(String username) throws Throwable {
		new RegisterPage(driver).criarUsername(username);
	}
	
	@Dado("^digito o email \"([^\"]*)\"$")
	public void digito_o_email(String email) {
		new RegisterPage(driver).digitarEmail(email);
	}
	
	@Dado("^crio a senha \"([^\"]*)\"$")
	public void crio_a_senha(String password) throws Throwable {
		new RegisterPage(driver).criarSenha(password);
	}
	
	@Dado("^confirmo a senha \"([^\"]*)\"$")
	public void confirmo_a_senha(String password) throws Throwable {
		new RegisterPage(driver).confirmarSenha(password);
	}
	
	@Dado("^digito primeiro Nome \"([^\"]*)\"$")
	public void digito_primeiro_nome(String primeiroNome) throws Throwable {
		new RegisterPage(driver).digitarPrimeiroNome(primeiroNome);
	}

	@Dado("^digito ultimo Nome \"([^\"]*)\"$")
	public void digito_ultimo_nome(String ultimoNome) throws Throwable {
		new RegisterPage(driver).digitarUltimoNome(ultimoNome);
	}

	@Dado("^digito celular \"([^\"]*)\"$")
	public void digito_celular(String celular) throws Throwable {
		new RegisterPage(driver).digitarCelular(celular);
	}

	@Dado("^seleciono o pais \"([^\"]*)\"$")
	public void seleciono_o_pais(String pais) throws Throwable {
		new RegisterPage(driver).selecionarUmPais(pais);
	}

	@Dado("^digito cidade \"([^\"]*)\"$")
	public void digito_cidade(String cidade) throws Throwable {
		new RegisterPage(driver).digitarCidade(cidade);
	}

	@Dado("^digito endereco \"([^\"]*)\"$")
	public void digito_endereco(String endereco) throws Throwable {
		new RegisterPage(driver).digitarEndereco(endereco);
	}

	@Dado("^digito regiao \"([^\"]*)\"$")
	public void digito_regiao(String regiao) throws Throwable {
		new RegisterPage(driver).digitarRegiao(regiao);
	}

	@Dado("^digito cep \"([^\"]*)\"$")
	public void digito_cep(String cep) throws Throwable {
		new RegisterPage(driver).digitarCEP(cep);
	}

	@Dado("^clico no check box eu concordo$")
	public void clico_no_check_box_eu_concordo() throws Throwable {
		new RegisterPage(driver).clicarNoCheckBoxEuConcordo();
	}
	
	@Então("^clico no botao Register$")
	public void clico_no_botão_Register() {
		new RegisterPage(driver).clicarNoBotaoDeRegistrar();
	}

	@Dado("^clico em User para Login$")
	public void clico_em_User_para_Login() throws Throwable {
		new RegisterPage(driver).clicoUserParaLogin();
	}

	@Dado("^digito o login \"([^\"]*)\"$")
	public void digito_o_login(String username) throws Throwable {
		new RegisterPage(driver).digitologin(username);
	}

	@Dado("^digito a senha \"([^\"]*)\"$")
	public void digito_a_senha(String password) throws Throwable {
		new RegisterPage(driver).digitoaSenha(password);
	}

	@Dado("^clico sign in$")
	public void clico_sign_in() throws Throwable {
		new RegisterPage(driver).clicoSignIn();
	}

	@Dado("^clico em My account$")
	public void clico_em_My_account() throws Throwable {
		new RegisterPage(driver).clicoUserParaLogin();
		new RegisterPage(driver).clicoMyAccount();
	}

	@Dado("^clico em Delete Account$")
	public void clico_em_Delete_Account() throws Throwable {
		new RegisterPage(driver).clicoDeleteAccount();
	}
	
	@Então("^clico em YES$")
	public void clico_em_YES() throws Throwable {
		new RegisterPage(driver).clicoEmYES();
	}

	@After
	public void bfechaBrowser() throws InterruptedException {
		driver.quit();
	}
}