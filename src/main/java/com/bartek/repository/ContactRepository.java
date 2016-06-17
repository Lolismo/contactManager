package com.bartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bartek.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	Contact findContactByLastName(String lastName);
	
}
