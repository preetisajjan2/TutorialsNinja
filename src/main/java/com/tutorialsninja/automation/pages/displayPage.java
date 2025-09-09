package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diatoz.automation.base.Base;

public class displayPage {
	public displayPage() {
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(xpath="//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=20']")
	public static WebElement dispalyarea;
}
