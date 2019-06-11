package com.example.view;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class IndexPage {

	SelenideElement helloLink = $(By.id("hello"));

	SelenideElement todosLink = $(By.id("todos"));

	public HelloPage 簡単な画面へのリンク() {
		helloLink.click();
		return new HelloPage();
	}

	public void そこそこ難しい画面へのリンク() {
		todosLink.click();
	}

}
