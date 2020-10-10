package com.cloudnative.eventsourcingaxonspringboot.services.commands;

import java.util.concurrent.CompletableFuture;

import com.cloudnative.eventsourcingaxonspringboot.dto.commands.AccountCreateDTO;
import com.cloudnative.eventsourcingaxonspringboot.dto.commands.MoneyCreditDTO;
import com.cloudnative.eventsourcingaxonspringboot.dto.commands.MoneyDebitDTO;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
