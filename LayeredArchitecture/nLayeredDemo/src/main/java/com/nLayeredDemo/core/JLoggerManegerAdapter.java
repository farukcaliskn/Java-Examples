package com.nLayeredDemo.core;

import com.nLayeredDemo.jLogger.JLoggerManeger;

public class JLoggerManegerAdapter implements LoggerService {

	@Override
	public void logSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManeger jLoggerManeger = new JLoggerManeger();
		jLoggerManeger.log(message);

	}

}
