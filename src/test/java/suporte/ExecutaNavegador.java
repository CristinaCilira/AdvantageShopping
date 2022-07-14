package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExecutaNavegador {
    
//           Metodo que cria um navegador e faz navegar ate a pagina desejada
    
    public static WebDriver executaNavegador(){

        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        String url = "http://advantageonlineshopping.com/#/";
        driver.get(url);
        return driver;
    }
}
