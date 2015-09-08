package net.agency.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Drivers")
public class Driver implements Serializable {
	
	
	private static final long serialVersionUID = 461774433635150767L;
	
	private int driverId;
	private int dni;
	private String firstName;
	private String lastName;
	private String address;
	private String cuil;
	private String phone;
	private String numberLicence;
	
	@Id
	@GeneratedValue
	@Column(name="driverId")
	public int getDriverId() {
		return driverId;
	}
	
	@Column(name="dni")
	public int getDni() {
		return dni;
	}
	
	@Column(name="firstName")
	public String getFirstName() {
		return firstName;
	}
	
	@Column(name="lastName")
	public String getLastName() {
		return lastName;
	}
	
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	
	@Column(name="cuil")
	public String getCuil() {
		return cuil;
	}
	
	@Column(name="phone")
	public String getPhone() {
		return phone;
	}
	
	@Column(name="numberLicence")
	public String getNumberLicence() {
		return numberLicence;
	}
	
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setNumberLicence(String numberLicence) {
		this.numberLicence = numberLicence;
	}
	
	
}
