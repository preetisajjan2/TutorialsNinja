package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diatoz.automation.base.Base;

public class searchPage {
	public searchPage() {
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(xpath="//input[@name='search']")
	public static WebElement searchboxarea;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	public static WebElement searchlogo;

}
