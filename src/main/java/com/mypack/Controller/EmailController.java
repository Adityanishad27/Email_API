package com.mypack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.Model.EmailRequest;
import com.mypack.Model.EmailResponse;
import com.mypack.Services.EmailServices;

@RestController
@CrossOrigin
public class EmailController {
	@Autowired
	private EmailServices emailServices;
	
	@GetMapping("/test")
	public String test() {
		
		return " test successfull";
	}

	
	@PostMapping("/sendEmail")
	public ResponseEntity<?> SendEmail(@RequestBody EmailRequest request){
		System.out.println(request);
	boolean result=	this.emailServices.SendEmail(request.getSubject(), request.getMessage(),request.getTo());
	
		if(result) {
			return ResponseEntity.ok(new EmailResponse("Email sent Successfully"));
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new EmailResponse("Email Not Sent "));
		}
		
	}
}
