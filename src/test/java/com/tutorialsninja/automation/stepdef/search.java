package com.tutorialsninja.automation.stepdef;



import com.diatoz.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.searchPage;

import cucumber.api.java.en.*;


public class search {
	
	searchPage sp=new searchPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		Base.driver.get(Base.reader.getUrl());
	}
	
	@Then("^I search phone name \"([^\"]*)\"$")
	public void i_search_phone_name(String phonename) throws InterruptedException  {
	    Thread.sleep(3000);
		Elements.TypeText(searchPage.searchboxarea, phonename);
		Thread.sleep(3000);
	}

	@Then("^I click on search button$")
	public void i_click_on_search_button() throws InterruptedException  {
		Thread.sleep(3000);
		Elements.click(searchPage.searchlogo);
		Thread.sleep(3000);
	}

}
