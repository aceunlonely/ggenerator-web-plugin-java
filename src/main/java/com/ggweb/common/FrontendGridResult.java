package com.ggweb.common;

import java.util.ArrayList;

public class FrontendGridResult<T> {
	private int total;
	
	private ArrayList<T> rows;
	
	public FrontendGridResult(int total,ArrayList<T> rows)
	{
		this.total=total;
		this.rows=rows;
	}
	
	public FrontendGridResult()
	{
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public ArrayList<T> getRows() {
		return rows;
	}

	public void setRows(ArrayList<T> rows) {
		this.rows = rows;
	}
	
	
}
