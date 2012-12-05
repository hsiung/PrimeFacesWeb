package com.ideartis.test;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Bean1 {
	
	private String name;

	public String getName() {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " Bean1 getter");
		return name;
	}

	public void setName(String name) {
		String jsfCallId = FacesContext.getCurrentInstance().getExternalContext().getRequest().toString();
		System.out.println(jsfCallId + " " + System.currentTimeMillis() + " Bean1 setter");
		this.name = name;
	}

}
