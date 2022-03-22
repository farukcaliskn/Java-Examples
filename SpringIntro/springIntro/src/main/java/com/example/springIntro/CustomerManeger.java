package com.example.springIntro;

public class CustomerManeger implements ICustomerService {

	private ICustomerDal customerDal;

	// Constructor Injection
	public CustomerManeger(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	/*
	 * Setter Injection 
	 * public void setCustomerDal(ICustomerDal customerDal) {
	 * this.customerDal = customerDal; }
	 */

	public void add() {
		customerDal.add();
	}
}
