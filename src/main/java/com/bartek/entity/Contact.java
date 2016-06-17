package com.bartek.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "firstName")
	@NotEmpty
	private String firstName;
	
	@Column(name = "lastName")
	@NotEmpty
	private String lastName;
	
	@Column(name="phone")
	@Pattern(regexp="(^$|[0-9]{10})")
	@Size(min = 7, max = 9)
	private String phone;
	
	@Column(name = "mobile")
	@Pattern(regexp="(^$|[0-9]{10})")
	@Size(min = 9, max = 9)
	private String mobile;

	
	@Column(name = "email")
	@Email
	private String email;
	
	@Column(name = "description")
	@Size (max = 255)
	private String description;

	@ManyToOne
	@JoinColumn(name = "accountId")
	private Account account;
	
	public Contact() {
	}

	public long getId(){
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	
}
