
package com.educacionit.java.web;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;


@ManagedBean
@SessionScoped
public class UserBean implements Serializable {


	private String userName;


	public UserBean () {

	    super ();
    }

	public String getUserName () {

	    return this.userName;
	}

	public void setUserName (String userName) {

	    this.userName = userName;
	}

}