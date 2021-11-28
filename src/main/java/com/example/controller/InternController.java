package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.model.Intern;
import com.example.service.InternService;

@RestController
public class InternController {
	@Autowired
	InternService internService;

	@GetMapping("/getintern")
	public Intern getInternInfoById(@RequestParam(required = true) String id) {
		
			System.out.println("==== in getInternInfoById ====");
			Intern intern = this.internService.findIntern(id);
			if(intern == null) {
				  throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HTTP Status will be NOT FOUND (CODE 404)\n");
		    }

			return intern;
		
	

	}

	@PostMapping("/updateintern")
	public void updateIntern(@RequestBody Intern dto) {
		System.out.println("==== in updateIntern ====");
		System.out.println("==== in updateIntern ====" +dto.toString());
		this.internService.updateIntern(dto);
	}
}