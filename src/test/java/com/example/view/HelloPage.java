package com.example.view;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

/**
 * Hello画面のページオブジェクトです。
 * 
 * @author y-knmr
 *
 */
public class HelloPage {

	/** firstName */
	SelenideElement firstNameTxt = $(By.id("firstName"));

	/** lastName */
	SelenideElement lastNameTxt = $(By.id("lastName"));

	/** submit button */
	SelenideElement submitBtn = $(By.id("greetingBtn"));

	public HelloPage 緑色のボタン(String firstName, String lastName) {
		firstNameTxt.setValue(firstName);
		lastNameTxt.setValue(lastName);
		submitBtn.click();
		
		return this;
	}

	public String getTitleTagValue() {
		return title();
	}

}
