package com.example.demo.controller;

import com.example.demo.model.TestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TestController {
	@GetMapping("/view")
	public String index(TestModel testModel) {
		log.info("index");

		return "index";
	}

	@GetMapping("/view/exception")
	public String exception(TestModel testModel) {
		log.info("exception");

		throw new IllegalArgumentException(testModel.getMessage());
	}
}
