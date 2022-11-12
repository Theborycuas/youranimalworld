package com.youranimalworld.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private Date birthday;
	private String city;
	private String address;
	private String phone;
	private String state;
	private String roll;
	private String urlphoto;	
	private Date fechacrear;
	private Date fechaactualizar;
	
	public User() {
	}

	public User(int id, String firstname, String lastname, String email, String password, Date birthday, String city,
			String address, String phone, String state, String roll, String urlphoto, Date fechacrear,
			Date fechaactualizar) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.state = state;
		this.roll = roll;
		this.urlphoto = urlphoto;
		this.fechacrear = fechacrear;
		this.fechaactualizar = fechaactualizar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String geturlphoto() {
		return urlphoto;
	}

	public void seturlphoto(String urlphoto) {
		this.urlphoto = urlphoto;
	}

	public Date getfechacrear() {
		return fechacrear;
	}

	public void setfechacrear(Date fechacrear) {
		this.fechacrear = fechacrear;
	}

	public Date getfechaactualizar() {
		return fechaactualizar;
	}

	public void setfechaactualizar(Date fechaactualizar) {
		this.fechaactualizar = fechaactualizar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", birthday=" + birthday + ", city=" + city + ", address=" + address
				+ ", phone=" + phone + ", state=" + state + ", roll=" + roll + ", urlphoto=" + urlphoto
				+ ", fechacrear=" + fechacrear + ", fechaactualizar=" + fechaactualizar + "]";
	}
	
	

}
