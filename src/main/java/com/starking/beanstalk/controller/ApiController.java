package com.starking.beanstalk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pedroRhamon
 */

@RestController
public class ApiController {
	
	@GetMapping
	public ResponseEntity<ApiResponse> hello() {
		return ResponseEntity.ok(new ApiResponse("Hello Aws!"));
	}

}
