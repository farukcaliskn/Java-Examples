package com.example.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String getMessage(String message) {
		System.out.println("Service mesaj verdi : " + message);
		return message;
	}
}
