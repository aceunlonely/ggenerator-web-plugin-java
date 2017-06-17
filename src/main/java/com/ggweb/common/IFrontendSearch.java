package com.ggweb.common;
/**
 * 前端框架查询接口
 * @author Administrator
 *
 */
public interface IFrontendSearch {

	public String getPage() ;

	public void setPage(String page);

	public String getRows() ;

	public void setRows(String rows) ;

	public String getSort() ;

	public void setSort(String sort) ;

	public String getOrder() ;

	public void setOrder(String order) ;

	public String getCallback() ;

	public void setCallback(String callback) ;
	
}