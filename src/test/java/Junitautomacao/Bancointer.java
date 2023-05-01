package Junitautomacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {
	//Instrução do Selenium
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		// comando para apontar o driver do navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para indicar o meu driver instanciado
		driver = new ChromeDriver();
		// comando para maximixar a tela
		driver.manage().window().maximize();
		// comando para indicar o site a ser aberto
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		//driver.get("https://www.bancointer.com.br/");
		// comando para indicar o elemento a ter interação
		driver.findElement(By.id("bt_gerar_pessoa")).click();
		//Copy Selector para copiar elementos sem id na inspeção
		//driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	
		String nome;
		Thread.sleep(1000);
		nome = driver.findElement(By.id("nome")).getText();
		System.out.println(nome);
		
		String celular;
		Thread.sleep(1000);
		celular = driver.findElement(By.id("celular")).getText();
		System.out.println(celular);
		
		String email;
		Thread.sleep(1000);
		email = driver.findElement(By.id("email")).getText();
		System.out.println(email);
		
		String cpf;
		Thread.sleep(1000);
		cpf = driver.findElement(By.id("cpf")).getText();
		System.out.println(cpf);
		
		String data_nasc;
		Thread.sleep(1000);
		data_nasc = driver.findElement(By.id("data_nasc")).getText();
		System.out.println(data_nasc);
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bancointer.com.br/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("nome")).sendKeys(nome);
		Thread.sleep(1000);
		driver.findElement(By.id("celular")).sendKeys(celular);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("cpf")).sendKeys(cpf);
		Thread.sleep(1000);
		driver.findElement(By.id("dataNascimento")).sendKeys(data_nasc);
		
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void validacaodoTextoFormulario() throws InterruptedException {
		
		
		
	
	}

}
