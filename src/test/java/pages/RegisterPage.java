package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RegisterPage extends BasePage {
	private Wait<WebDriver> wait;
	JavascriptExecutor js = (JavascriptExecutor)driver;

	public RegisterPage(WebDriver driver) {
		

		super(driver);
		// TODO Auto-generated constructor stub
		this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
	}
	
	

	public void setQueAcessoSite(String site) {
		driver.get(site);
		driver.manage().window().maximize();
	}

	public void clicarUser() throws InterruptedException  {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menuUserLink']")));
		driver.findElement(By.xpath("//a[@id='menuUserLink']")).click();
	}

	public void createNewAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='create-new-account ng-scope']")));
		driver.findElement(By.xpath(".//*[@class='create-new-account ng-scope']")).click();
	}
	
	public void fecharModal() throws InterruptedException {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='closeBtn loginPopUpCloseBtn']")));
		driver.findElement(By.xpath("//div[@class='closeBtn loginPopUpCloseBtn']")).click();
	}

	public void criarUsername(String username) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='usernameRegisterPage']")));
		driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys(username);
    }

	public void digitarEmail(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(By.name("emailRegisterPage")));
		driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
	}

	public void criarSenha(String senha) {
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(senha);
	}

	public void confirmarSenha(String confirSenha) {
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(confirSenha);
	}

	public void digitarPrimeiroNome(String primeiroNome) {
		driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).sendKeys(primeiroNome);
	}

    public void digitarUltimoNome(String ultimoNome){
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys(ultimoNome);
    }
    
    public void digitarCelular(String celular){
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(celular);
    }
    
    public void selecionarUmPais(String pais){
    	Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.tagName("select"))).click();
    }
    
    public void digitarCidade(String cidade){
        driver.findElement(By.name("cityRegisterPage")).sendKeys(cidade);
    }
    
    public void digitarEndereco(String endereco){
        driver.findElement(By.name("addressRegisterPage")).sendKeys(endereco);
    }
    
    public void digitarRegiao(String regiao){
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(regiao);
    }

    public void digitarCEP(String cep){
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(cep);
    }
    
    public void clicarNoCheckBoxEuConcordo(){
        driver.findElement(By.name("i_agree")).click();
    }

    public void clicarNoBotaoDeRegistrar(){
        driver.findElement(By.id("register_btnundefined")).click();
    }
    
    public void clicoUserParaLogin() throws InterruptedException{
    	Thread.sleep(20000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menuUserLink']")));
		driver.findElement(By.xpath("//a[@id='menuUserLink']")).click();
    }
    
    public void digitologin(String username) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    }
   
    public void digitoaSenha(String password) {
    	
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
    
    public void clicoSignIn() {
    	driver.findElement(By.xpath("//*[@id='sign_in_btnundefined']")).click();
    }
    
    public void clicoMyAccount() {
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(@class,'option roboto-medium')])[2]")));
    	driver.findElement(By.xpath("(//label[contains(@class,'option roboto-medium')])[2]")).click();
    }
    
    public void clicoDeleteAccount() {
    	js.executeScript("window.scrollBy(0, 250)", "//button[@class='deleteMainBtnContainer a-button ng-scope']");
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='deleteMainBtnContainer a-button ng-scope']")));
    	driver.findElement(By.xpath("//button[@class='deleteMainBtnContainer a-button ng-scope']")).click();
    }
    
    public void clicoEmYES() {
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='deletePopupBtn deleteRed']")));
    	driver.findElement(By.xpath("//div[@class='deletePopupBtn deleteRed']")).click();
    }
 }
