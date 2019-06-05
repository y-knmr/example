package com.example.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.data.Todo;
import com.example.data.Todos;

@Named("todos")
@RequestScoped
public class TodosBean {

	@Inject
	Todos allDatas;

	private String searchCondition;

	private List<Todo> dispTodos = new ArrayList<>();

	@PostConstruct
	public void init() {
		System.out.println("called TodosBean#init");

	}

	public String search() {
		System.out.println("called TodosBean#search");

		List<Todo> searchResult = createResult(searchCondition);
		System.out.println("count=" + searchResult.size());
		setDispTodos(searchResult);

		return "/app/todos.xhtml";
		// return "/app/todos.xhtml?faces-redirect=true";
	}

	private List<Todo> createResult(String searchCondition) {
		Map<Integer, Todo> datas = allDatas.getTodos();

		if (searchCondition != null && !"".equals(searchCondition)) {
			Map<Integer, Todo> collect = datas.entrySet().stream()
					.filter(x -> x.getValue().getContent().contains(searchCondition))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			return new ArrayList<>(collect.values());
		} else {
			return new ArrayList<>(datas.values());
		}

	}

	public List<Todo> getDispTodos() {
		return dispTodos;
	}

	public void setDispTodos(List<Todo> dispTodos) {
		this.dispTodos = dispTodos;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

}
