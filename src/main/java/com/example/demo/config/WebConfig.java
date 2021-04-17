package com.example.demo.config;

import com.example.demo.common.TestArgumentResolver;
import com.example.demo.common.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	private final TestInterceptor testInterceptor;
	private final TestArgumentResolver testArgumentResolver;

	public WebConfig(
		TestInterceptor testInterceptor,
		TestArgumentResolver testArgumentResolver
	) {
		this.testInterceptor = testInterceptor;
		this.testArgumentResolver = testArgumentResolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(testInterceptor)
			.addPathPatterns("/");
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		resolvers.add(testArgumentResolver);
	}
}
