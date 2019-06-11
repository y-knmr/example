package com.example.scenario;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.example.view.HelloPage;
import com.example.view.IndexPage;

/**
 * ページオブジェクトをためすテストシナリオです。
 * 
 * @author y-knmr
 *
 */
public class ScenarioTest1 {

	IndexPage indexPage = new IndexPage();

	/**
	 * メニュー画面の「簡単な画面へのリンク」押下のシナリオ
	 */
	@Test
	public void testHello() {
		// 画面を開く
		open("http://localhost:8080/example");

		HelloPage helloPage = indexPage.簡単な画面へのリンク();
		System.out.println(helloPage.getTitleTagValue());
		
		// 遷移した先の画面にHelloが表示されていることを確認
		// assertThat(title()).isEqualTo("Hello");
	}

}
