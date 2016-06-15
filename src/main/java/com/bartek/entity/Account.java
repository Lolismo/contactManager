package com.bartek.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Account {
	
	@Column(name = "account_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty
	@Column(name = "password")
	private String password;

	@NotEmpty
	@Column(name = "email")
	@Email
	private String email;

	@Column(name = "dateOfCreation")
	private LocalDate dateOfCreateAccount;

	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Contact> listOfContacts;

	public Account () {
		dateOfCreateAccount = LocalDate.now();
		listOfContacts = new ArrayList<Contact>();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public LocalDate getDateOfCreateAccount() {
		return dateOfCreateAccount;
	}

	public List<Contact> getListOfContacts() {
		return listOfContacts;
	}
	
	
}
