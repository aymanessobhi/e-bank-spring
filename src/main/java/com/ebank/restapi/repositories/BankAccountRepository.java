package com.ebank.restapi.repositories;

import com.ebank.restapi.entities.BankAccount;
import com.ebank.restapi.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
