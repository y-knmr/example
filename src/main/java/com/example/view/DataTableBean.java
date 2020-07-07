package com.example.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.example.data.DataTableData;
import com.example.data.Product;
import com.example.data.SystemProducts;

@Named("dataTable")
@RequestScoped
public class DataTableBean {

	private DataTableData displayData;

	/**
	 * 初期化を行います。
	 */
	@PostConstruct
	public void init() {
		System.out.println("called DataTableBean#init");
		setDisplayData(createDummyData());
	}

	private DataTableData createDummyData() {
		DataTableData result = new DataTableData();
		List<SystemProducts> systems = new ArrayList<>();

		SystemProducts sp1 = new SystemProducts();
		sp1.setSystemId("cun0000");
		sp1.setSystemNo("1");
		sp1.setVersionNo("1");

		List<Product> sp1Products = new ArrayList<>();
		Product sp1_1 = new Product();
		sp1_1.setLine("1");
		sp1_1.setColumn1("cun0000-col1_1");
		sp1_1.setColumn2("cun0000-col2_1");
		sp1_1.setColumn3("cun0000-col3_1");
		sp1Products.add(sp1_1);
		Product sp1_2 = new Product();
		sp1_2.setLine("2");
		sp1_2.setColumn1("cun0000-col1_2");
		sp1_2.setColumn2("cun0000-col2_2");
		sp1_2.setColumn3("cun0000-col3_2");
		sp1Products.add(sp1_2);
		sp1.setProducts(sp1Products);
		systems.add(sp1);

		SystemProducts sp2 = new SystemProducts();
		sp2.setSystemId("cun0001");
		sp2.setSystemNo("1");
		sp2.setVersionNo("2");
		List<Product> sp2Products = new ArrayList<>();
		Product sp2_1 = new Product();
		sp2_1.setLine("3");
		sp2_1.setColumn1("cun0001-col1_1");
		sp2_1.setColumn2("cun0001-col2_1");
		sp2_1.setColumn3("cun0001-col3_1");
		sp2Products.add(sp2_1);
		Product sp2_2 = new Product();
		sp2_2.setLine("2");
		sp2_2.setColumn1("cun0000-col1_2");
		sp2_2.setColumn2("cun0000-col2_2");
		sp2_2.setColumn3("cun0000-col3_2");
		sp2Products.add(sp2_2);
		sp2.setProducts(sp2Products);
		systems.add(sp2);

		result.setSystems(systems);

		return result;
	}

	public DataTableData getDisplayData() {
		return displayData;
	}

	public void setDisplayData(DataTableData displayData) {
		this.displayData = displayData;
	}

}
