package com.bartek.test.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bartek.entity.Contact;

public class ContactTest {

	private Contact contact;
	
	@Before
	public void setUp() throws Exception {
		contact = new Contact();
	}

	@Test
	public void contactAfterCreationCannotBeNull() {
		
		assertNotNull(contact);
	}

}
