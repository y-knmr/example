package com.example.view;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * MenuのBackingBeanです。
 * 
 * @author y-knmr
 *
 */
@Named("index")
@RequestScoped
public class IndexBean {

	/**
	 * 初期化を行います。
	 */
	@PostConstruct
	public void init() {
		System.out.println("called IndexBean#init");
	}

	/**
	 * goto Say Helloのイベントです。
	 * 
	 * @return hello.xhtmへの遷移
	 */
	public String hello() {
		System.out.println("called IndexBean#hello");
		return "/app/hello.xhtml?faces-redirect=true";
	}

	/**
	 * goto Todosリンクのイベントです。
	 * 
	 * @return todos.xhtmlへの遷移
	 */
	public String todos() {
		System.out.println("called IndexBean#todos");
		return "/app/todos.xhtml?faces-redirect=true";
	}

	public String dataTable() {
		System.out.println("called dataTable");
		return "/app/datatable.xhtml?faces-redirect=true";
	}
}
