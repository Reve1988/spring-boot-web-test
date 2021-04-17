package com.example.demo.controller;

import com.example.demo.model.TestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestRestController {
	@GetMapping("/api")
	public TestModel api(TestModel testModel) {
		log.info("api");

		return testModel;
	}

	@GetMapping("/api/exception")
	public TestModel exception(TestModel testModel) {
		log.info("exception");

		throw new IllegalArgumentException(testModel.getMessage());
	}
}
