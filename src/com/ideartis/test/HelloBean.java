package com.ideartis.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
	
	private List<Bean1> bean1List;
	
	public HelloBean() {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " constructor");
		Bean1 b1 = new Bean1();
		b1.setName("bean1");
		Bean1 b2 = new Bean1();
		b2.setName("bean2");
		List<Bean1> a = new ArrayList<Bean1>();
		a.add(b1);
		a.add(b2);
		setBean1List(a);
	}
 
	public String getName() {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " getter");
		return name;
	}
	public void setName(String name) {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " setter");
		this.name = name;
	}
	public List<Bean1> getBean1List() {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " bean list getter");
		return bean1List;
	}
	public void setBean1List(List<Bean1> bean1List) {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " bean list setter");
		this.bean1List = bean1List;
	}
}