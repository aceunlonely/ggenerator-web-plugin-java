package com.ggweb.base;

import java.io.Serializable;

import com.ggweb.common.IFrontendSearch;

public class GGWebBaseSearch  implements Serializable,IFrontendSearch {

private String page;
	
	private String rows;
	
	private String sort;
	
	private String order;
	
	private String callback;

	public String getPage() {
		if(page==null || page.equals(""))
			return "1";
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

}
