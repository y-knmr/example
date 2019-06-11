package com.example.view;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class HelloPage {
	private SelenideElement titleTag = $(By.tagName("title"));

	public String getTitleTagValue() {
		System.out.println("titleTag=" + titleTag);
		System.out.println(titleTag.getTagName());
		return titleTag.getText();
	}
}
