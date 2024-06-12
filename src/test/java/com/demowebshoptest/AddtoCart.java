package com.demowebshoptest;

import org.testng.annotations.Test;

public class AddtoCart extends BaseTest {

	
	@Test
	public void verifyUserIsAbleToAddProductToCart() {
	
		loginPage.Login();
		landingPage.searchProduct("Jeans");
			
	}
}