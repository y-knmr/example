package com.example.data;

import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Todos {
	private Map<Integer, Todo> todos;

	@PostConstruct
	public void init() {
		System.out.println("called Todos#init");

		todos = new TreeMap<>();

		for (int i = 1; i < 11; i++) {

			Todo todo = null;
			if (i % 2 == 0) {
				todo = new Todo(i, "even" + i);
			} else {
				todo = new Todo(i, "odd" + i);
			}

			todos.put(i, todo);

		}

	}

	public Map<Integer, Todo> getTodos() {
		return todos;
	}

	public void setTodos(Map<Integer, Todo> todos) {
		this.todos = todos;
	}

}
