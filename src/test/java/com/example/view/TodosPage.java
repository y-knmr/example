package com.example.view;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class TodosPage {

	private SelenideElement titleTag = $(By.tagName("title"));

	public String getTitleTag() {
		return titleTag.getValue();
	}
}
