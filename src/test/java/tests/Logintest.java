package tests;

import org.testng.annotations.Test;

import base.Basetest;
import pages.Loginpage;

public class Logintest extends Basetest {

	@Test
	public void testsvalid() {

	    System.out.println("========== TEST STARTED ==========");

	    Loginpage login = new Loginpage(driver);

	    login.username("admin@yourstore.com");
	    login.password("admin");
	    login.login();

	    System.out.println("Title: " + driver.getTitle());
	}
	
}