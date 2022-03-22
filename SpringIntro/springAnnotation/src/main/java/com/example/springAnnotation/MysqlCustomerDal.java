package com.example.springAnnotation;

import org.springframework.beans.factory.annotation.Value;

//@Component("database")
public class MysqlCustomerDal implements ICustomerDal {
	@Value("${database.connectionString}")
	String connectionString;
	@Value("${database.connectionAddress}")
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
