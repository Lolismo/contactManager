package com.bartek.test.entity;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.bartek.entity.Account;
import com.bartek.entity.Contact;

public class AccountTest {

	private Account account;
	private Contact[] contact;
	
	@Before
	public void setUp() throws Exception {
		account = new Account();
		
		contact = new Contact[2];
		
		contact[0] = new Contact();
		contact[1] = new Contact();
		
		account.getListOfContacts().add(contact[0]);
		account.getListOfContacts().add(contact[1]);
	}

	@Test
	public void dateOfCreationAccountIsToday() {
		assertEquals(LocalDate.now(), account.getDateOfCreateAccount());
	}

	
	@Test
	public void itsAbleToAddMoreThanOneContactToAccount () {
		assertEquals(2, account.getListOfContacts().size());
	}
}
