package Jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulation {
	

	public static void main(String[] args) {
		Account padma=new Account(500);
		int p=padma.getAmount();
		System.out.println(p);
		
		Account rashmi=new Account(1000);
		int r=rashmi.getAmount();
		System.out.println(r);
		
	//Check Account.java	
	}

}
