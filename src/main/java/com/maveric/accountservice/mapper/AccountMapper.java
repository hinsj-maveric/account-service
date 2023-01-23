package com.maveric.accountservice.mapper;

import com.maveric.accountservice.dto.AccountDto;
import com.maveric.accountservice.entity.Account;
import org.springframework.http.MediaType;

import java.util.List;

public interface AccountMapper {
    Account map(AccountDto accountDto);

    AccountDto map(Account account);

    List<Account> mapToModel (List<AccountDto> accounts);

    MediaType mapToDto(List<Account> accounts);
}