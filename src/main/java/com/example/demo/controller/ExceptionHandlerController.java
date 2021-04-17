package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice(annotations = {Controller.class})
public class ExceptionHandlerController {
	@ExceptionHandler({Exception.class})
	public String exception(Exception e) {
		log.error("excpetion", e);

		return "index";
	}
}
