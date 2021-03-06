package com.example.aop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.service.MessageService;

@RestController
@RequestMapping("/api")
public class MessageController {

	private MessageService messageService;

	@Autowired
	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	@PostMapping("/getMessage")

	public ResponseEntity<String> getMessage(String message) {
		return ResponseEntity.ok(messageService.getMessage(message));
	}
}
