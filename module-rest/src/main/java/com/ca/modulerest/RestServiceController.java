package com.ca.modulerest;

import com.ca.modulecalc.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestServiceController {

	private final CalculatorService calculatorService;

	@Autowired
	public RestServiceController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("/")
	public ResponseEntity<Object> handleGetRoot() {
		try {
			return ResponseEntity.ok("Welcome to the Calculator Service");
		}catch (Exception e) {
			return ResponseEntity.ok("Something went wrong");
		}
	}

	//GETS or something
	@GetMapping("/sum")
	public ResponseEntity<Object> handleGetSum(
			@RequestParam(name = "a", defaultValue = "0") BigDecimal bdFirst,
			@RequestParam(name = "b", defaultValue = "0") BigDecimal bdSecond) {
		Map<String,Object> mResponse = new HashMap<String,Object>();
		try {
			mResponse.put("First Value:", bdFirst);
			mResponse.put("Second Value:", bdSecond);
			mResponse.put("Sum:", calculatorService.addition(bdFirst, bdSecond));
			return ResponseEntity.ok(mResponse);

		}catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Error: " + e.getMessage());
		}
	}

	@GetMapping("/multiply")
	public ResponseEntity<Object> handleGetMultiply(
			@RequestParam(name = "a", defaultValue = "0") BigDecimal bdFirst,
			@RequestParam(name = "b", defaultValue = "0") BigDecimal bdSecond) {
		Map<String,Object> mResponse = new HashMap<String,Object>();
		try {
			mResponse.put("First Value:", bdFirst);
			mResponse.put("Second Value:", bdSecond);
			mResponse.put("Multiplication:", calculatorService.multiplication(bdFirst, bdSecond));
			return ResponseEntity.ok(mResponse);

		}catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Error: " + e.getMessage());
		}
	}

	@GetMapping("/divide")
	public ResponseEntity<Object> handleGetDivide(
			@RequestParam(name = "a", defaultValue = "0") BigDecimal bdFirst,
			@RequestParam(name = "b", defaultValue = "0") BigDecimal bdSecond) {
		Map<String,Object> mResponse = new HashMap<String,Object>();
		try {
			mResponse.put("First Value:", bdFirst);
			mResponse.put("Second Value:", bdSecond);
			mResponse.put("Division:", calculatorService.division(bdFirst, bdSecond));
			return ResponseEntity.ok(mResponse);

		}catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Error: " + e.getMessage());
		}
	}

	@GetMapping("/subtract")
	public ResponseEntity<Object> handleGetSubtract(
			@RequestParam(name = "a", defaultValue = "0") BigDecimal bdFirst,
			@RequestParam(name = "b", defaultValue = "0") BigDecimal bdSecond) {
		Map<String,Object> mResponse = new HashMap<String,Object>();
		try {
			mResponse.put("First Value:", bdFirst);
			mResponse.put("Second Value:", bdSecond);
			mResponse.put("Subraction:", calculatorService.subtraction(bdFirst, bdSecond));
			return ResponseEntity.ok(mResponse);

		}catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Error: " + e.getMessage());
		}	}

}
