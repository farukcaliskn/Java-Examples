package com.example.springIntro;

public class MysqlCustomerDal implements ICustomerDal {
	String connectionString;
	String connectionAddress;

	public String getConnectionAddress() {
		return connectionAddress;
	}

	public void setConnectionAddress(String connectionAddress) {
		this.connectionAddress = connectionAddress;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Mysql veritabanına eklendi " + connectionString + connectionAddress);
	}

}
