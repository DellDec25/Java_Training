/**
 * 
 */
package ph.com.bpi.practice.main;

 
//import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

	
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	 
	private double balance = 10000;

	public void deposit(double amount) throws InvalidAmountException {
		logger.info(String.format("Deposit requested: P%.2f", amount));

		if (amount <= 0) {
			logger.error(String.format("Invalid deposit amount: P%.2f", amount));
			throw new InvalidAmountException("Deposit amount must be positive");
		}

		if (amount > 50000) {
			logger.warn(String.format("Large deposit: P%.2f - requires verification", amount));
		}

		balance += amount;
		logger.info(String.format("Deposit completed: P%.2f, New balance: P%.2f", amount, balance));
	}

	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {

		logger.info(String.format("Withdrawal requested: P%.2f", amount));

		if (amount <= 0) {
			logger.error(String.format("Invalid withdrawal amount: P%.2f", amount));
			throw new InvalidAmountException("Withdrawal amount must be positive");
		}

		if (amount > balance) {
			logger.warn(String.format("Insufficient funds: P%.2f available", balance));
			throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);
		}

		balance -= amount;
		logger.info(String.format("Withdrawal completed: P%.2f, New balance: P%.2f", amount, balance));
	}

	public static void runTest(BankTestOperation operation, String operationName) {

		try {
			operation.execute();
		} catch (InvalidAmountException e) {
			logger.error("{} failed: {}", operationName, e.getMessage(), e);
		} catch (InsufficientFundsException e) {
			logger.error("{} failed: {}", operationName, e.getMessage(), e);
		}
	}

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		runTest(() -> account.deposit(5000), "Deposit");
		runTest(() -> account.withdraw(3000), "Withdrawal");
		runTest(() -> account.deposit(-500), "Deposit");
		runTest(() -> account.withdraw(20000), "Withdrawal");
		runTest(() -> account.deposit(60000), "Deposit");
	}
 

}
