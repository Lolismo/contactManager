package com.bartek.test.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bartek.entity.Contact;
import com.bartek.main.ContactManagerApplication;
import com.bartek.repository.ContactRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactManagerApplication.class)
@DataJpaTest
public class ContactRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private ContactRepository contactRepository;

	private Contact c;
	@Before
	public void setUp() {
		c = new Contact();
		c.setFirstName("aaa");
		c.setLastName("lala");
	}

	@Test
	public void test() {

		this.entityManager.persistAndFlush(c);
		
		assertEquals(1, contactRepository.findAll().size());
	}

}
