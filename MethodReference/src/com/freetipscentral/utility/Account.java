package com.freetipscentral.utility;

public class Account {
	private int term;
	private float amount;
	
	public Account(int term, float amount){
		this.term = term;
		this.amount = amount;
	}
	
	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float calculateInterest(float interestRate){
		return amount * 1 * interestRate;
	}
}
