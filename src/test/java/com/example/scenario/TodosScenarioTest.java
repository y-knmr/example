package com.example.scenario;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TodosScenarioTest {

	/**
	 * 全件検索のパターン
	 */
	@Test
	public void testSearchAll() {
		// 画面を開く（本来はURLをじかにたたくことはありませんが…)
		open("http://localhost:8080/example/app/todos.xhtml");
		
		// ボタン押下
		$(By.id("searchBtn")).click();
		
		// 全件でていることを確認
		int resultCount = $$($(By.id("result")).find("tbody"), "tr").size();
		assertThat(resultCount).isEqualTo(10);
		
		// 1件目の確認
		// value属性でなく、中身？を取るのでgetTextを使っています
		// xpathはChromeのdeveloper toolで要素を右クリック→検証で開いた箇所を右クリック→Copy→Copy XPathでコピーできます
		String firstNo = $(By.xpath("//*[@id=\"result-0-id\"]")).getText();
		assertThat(firstNo).isEqualTo("1");
		String firstContent = $(By.xpath("//*[@id=\"result-0-content\"]")).getText();
		assertThat(firstContent).isEqualTo("odd1");
		
		

	}

	/**
	 * 検索条件を指定して、件数を絞るパターン
	 */
	@Test
	public void testSeachCondition() {

	}


	/**
	 * 検索条件を指定して、対象がないパターン
	 */
	@Test
	public void testSearchNotFound() {

	}

}
