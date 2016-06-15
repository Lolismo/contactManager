package com.bartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bartek.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

	Contact findContactByLastName(String lastName);
	
}
