package net.agency.view;

import java.util.List;

import net.agency.controller.DriverManager;
import net.agency.model.Driver;

import com.opensymphony.xwork2.ActionSupport;

public class DriverAction extends ActionSupport {

	private static final long serialVersionUID = 7705909531166010708L;
	private Driver aDriver;
	private List<Driver> driverList;
	private int id;

	private DriverManager linkController;
	
	public DriverAction(){
		linkController = new DriverManager();		
	}
	
	public String execute() {
		this.driverList = linkController.list();
		return SUCCESS;
	}

	public String add() {
		System.out.println(getDriver());
		try {
			linkController.add(getDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driverList = linkController.list();
		return SUCCESS;
	}

	public String delete() {
		linkController.delete(getId());
		return SUCCESS;
	}

	public Driver getDriver() {
		return aDriver;
	}

	public List<Driver> getContactList() {
		return driverList;
	}

	public void setDriver(Driver aDriver) {
		this.aDriver = aDriver;
	}

	public void setContactList(List<Driver> driversList) {
		this.driverList = driversList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
