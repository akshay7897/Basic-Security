package com.ap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome To SBI Bank";
	}
	
	@GetMapping("/transfer")
	public String transferFund() {
		return "Fund Transfered 2 Lakh";
	}
	
	@GetMapping("/balance")
	public String checkBalance() {
		return "Your Balance Is - 8000000";
	}

	@GetMapping("/about")
	public String aboutUS() {
		return "This Is SBI Bank Goverment Bank";
	}
	
}
