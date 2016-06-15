package com.bartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bartek.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
