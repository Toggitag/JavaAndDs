package com.rk.client;

import com.rk.customer.AccountHolder;
import com.rk.model.Account;

public class Client {

	public static void main(String[] args) {

		Account account = new Account();

		AccountHolder accountHolder = new AccountHolder(account);

		Thread windrawrer = new Thread(accountHolder);

		accountHolder.getDetails();
		windrawrer.setName(AccountHolder.name);

		windrawrer.start();

	}

}