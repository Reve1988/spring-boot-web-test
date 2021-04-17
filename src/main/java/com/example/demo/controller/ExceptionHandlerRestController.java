package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(annotations = {RestController.class})
public class ExceptionHandlerRestController {
	@ExceptionHandler({Exception.class})
	public String exception(Exception e) {
		log.error("excpetion", e);

		return e.getMessage();
	}
}
