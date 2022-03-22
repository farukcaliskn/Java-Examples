package com.example.springAnnotation;

public class CustomerManeger implements ICustomerService {

	private ICustomerDal customerDal;

	public CustomerManeger(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}
}
