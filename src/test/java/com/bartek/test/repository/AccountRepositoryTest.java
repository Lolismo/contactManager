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

import com.bartek.entity.Account;
import com.bartek.main.ContactManagerApplication;
import com.bartek.repository.AccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactManagerApplication.class)
@DataJpaTest
public class AccountRepositoryTest {

private Account a;	
	
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private AccountRepository accountRepository;

	@Before
	public void setUp() throws Exception {
		
		a = new Account();
		a.setEmail("bba@email.com");
		a.setPassword("sa");
	}

	@Test
	public void test() {
		this.entityManager.persist(a);

		assertEquals(1, accountRepository.findAll().size());
	}

}
