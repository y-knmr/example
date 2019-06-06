package com.example.scenario;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * メニューの画面のリンクをクリックして画面の遷移を確認するシナリオです。
 * 
 * @author y-knmr
 *
 */
public class ScenarioTest1 {

	@Test
	public void testHello() {
		open("http://localhost:8080/example");

		// リンクのクリック
		$(By.linkText("簡単な画面へのリンク")).click();

		// 遷移した先の画面にHelloが表示されていることを確認
		assertThat(title()).isEqualTo("Hello");

	}
	
	@Test
	public void testTodos() {
		
	}

}
