package com.maveric.accountservice.repository;

import com.maveric.accountservice.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AccountRepository extends MongoRepository<Account,String> {

}