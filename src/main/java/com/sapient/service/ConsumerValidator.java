package com.sapient.service;

import java.util.Date;

public class ConsumerValidator {
	public static void main(String args[]) {
//		System.out.println(ConsumerValidator.isValidConsumerName("Mr.Ritvik Jain"));
	}
	public static boolean isValidConsumerName(Consumer consumer){
		String username = consumer.getUserName();
		String pattern = "^[a-zA-Z]+[\\.]{0,1}[a-zA-Z]+[\\s]{1,2}[a-zA-Z]+$";
		return username.matches(pattern);
	}
	public static boolean isValidMobile(Consumer consumer){
		long mobile = consumer.getMobile();
		String mob = String.valueOf(mobile);
		String pattern = "^[1-9]{1}[0-9]{9}$";
		return mob.matches(pattern);
	}
	public static boolean isValidDateOfBirth(Consumer consumer){
		Date dob = consumer.getDateOfBirth();
		Date current = new Date();
		long diff = current.getTime() - dob.getTime();
		long years =  (diff / (1000l * 60 * 60 * 24 * 365));
		return years > 18;
	}
	public static boolean isValidEmail(Consumer consumer){
		String email = consumer.getEmail();
		String pattern = "^[a-zA-z]+[a-zA-Z0-9._]+@[a-zA-z]+.[a-zA-Z]{2,3}$";
		return email.matches(pattern);
	}
	public static boolean validate(Consumer consumer){
		return isValidConsumerName(consumer)&&isValidDateOfBirth(consumer)&&isValidEmail(consumer)&&isValidMobile(consumer);
	}
}
