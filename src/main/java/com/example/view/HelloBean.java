package com.example.view;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * こんにちは画面のBackingBeanです。
 * 
 * @author y-knmr
 *
 */
@Named("hello")
@RequestScoped
public class HelloBean {

	/** 名前 */
	private String firstName;

	/** 苗字 */
	private String lastName;

	/**
	 * 初期化
	 */
	@PostConstruct
	public void init() {
		System.out.println("called HelloBean#init");
	}

	public String showGreeting() {
		System.out.println("called showGreeting");
		System.out.println("fn: " + firstName + ":  ln:  " + lastName);

		String msgs = "Hello " + firstName + " " + lastName + "!!!";
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msgs, null));

		return "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
