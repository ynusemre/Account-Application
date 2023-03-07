package com.folksdev.account.dto.converter;

import com.folksdev.account.dto.CustomerAccountDto;
import com.folksdev.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerAccountDtoConverter {

    private final TransactionDtoConverter transactionDtoConverter;

    public CustomerAccountDtoConverter(TransactionDtoConverter transactionDtoConverter) {
        this.transactionDtoConverter = transactionDtoConverter;
    }

    public CustomerAccountDto convert(Account from){
        return new CustomerAccountDto(
                from.getId(),
                from.getBalance(),
                from.getTransaction().stream().map(transactionDtoConverter::convert).collect(Collectors.toSet()),
                from.getCreationDate());
    }
}
