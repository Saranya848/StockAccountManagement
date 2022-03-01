package com.stocksmanagement;

import java.util.*;

public class Account {

	static double amount = 0;

	Scanner scan = new Scanner(System.in);

	// getter and setter for amount
	public static double getAmount() {
		return amount;
	}

	public static void setAmount(double amount) {
		Account.amount = amount;
	}
	public static boolean debit(double debitamount) { // method to debit account balance

		if (Account.getAmount() - debitamount < 0) { // if amount value - debit value is greater than alert user
			System.out.println(" Insufficient funds!");
			return false;
		}

		double currentamount = Account.getAmount(); // assigning the account balance
		currentamount -= debitamount; // debit the account
		System.out.println(" Updated amount: " + currentamount); // displaying the amount

		return true;
	}
	public static void credit(double creditamount) { // method to credit account

		double currentamount = Account.getAmount(); // assigning amount balance to temp
		currentamount += creditamount; // adding the amount with credit amount
		Account.setAmount(currentamount); // setting the amount with setters
		System.out.println(" Updated amount: " + currentamount); // displaying the amount
	}



}
