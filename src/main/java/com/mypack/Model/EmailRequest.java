package com.mypack.Model;

public class EmailRequest {
	
	String To;
	String Subject;
	String Message;
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public EmailRequest(String to, String subject, String message) {
		super();
		To = to;
		Subject = subject;
		Message = message;
	}
	public EmailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmailRequest [To=" + To + ", Subject=" + Subject + ", Message=" + Message + "]";
	}
	
	
	
	
	

}
