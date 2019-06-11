package com.example.view;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

/**
 * メニュー画面のページオブジェクトクラスです。
 * 
 * @author y-knmr
 *
 */
public class MenuPage {

	/** 簡単な画面へのリンク */
	SelenideElement helloLink = $(By.id("hello"));

	/** そこそこ難しい画面へのリンク */
	SelenideElement todosLink = $(By.id("todos"));

	/**
	 * 簡単な画面へのリンク押下時のイベントです。
	 * 
	 * @return 次画面ページオブジェクト
	 */
	public HelloPage 簡単な画面へのリンク() {
		helloLink.click();
		return new HelloPage();
	}

	/**
	 * そこそこ難しい画面へのリンク押下時のイベントです。
	 * 
	 * @deprecated ただ呼ぶだけなので呼ばないでください。
	 */
	public void そこそこ難しい画面へのリンク() {
		todosLink.click();
	}

}
