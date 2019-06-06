package com.example.scenario;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * Hello画面のシナリオです。
 * 
 * @author y-knmr
 *
 */
public class HelloScenarioTest {

	/**
	 * OKのパターン
	 */
	@Test
	public void testOk() {

		// 画面を開く（本来はURLをじかにたたくことはありませんが…)
		open("http://localhost:8080/example/app/hello.xhtml");

		// テキストに入力
		$(By.id("firstName")).setValue("木綿子");
		$(By.id("lastName")).setValue("金森");

		// ボタン押下
		$(By.id("greetingBtn")).click();

		// msgs確認
		String msgs = $(By.className("ui-messages-info-summary")).getText();
		assertThat(msgs).isEqualTo("Hello 木綿子 金森!!!");
	}

	/**
	 * NGのパターン hint:エラーメッセージの表示部分のclassはui-messages-error-summary. TODO 複数ある場合の挙動確認
	 */
	@Test
	public void testNg() {

	}
}
