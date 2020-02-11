package com.sapient.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsumerManager {
	private static Scanner sc = new Scanner(System.in);
	public static Consumer getConsumerDetails(int i) throws ParseException{
		Consumer consumer = new Consumer();
		System.out.println("Consumer "+(i+1) +" Details :");
		System.out.println("Enter consumerId for consumer"+(i+1) +" :");
		int consumerId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter username for consumer"+(i+1) +" :");
		String userName = sc.nextLine();
		System.out.println("Enter Date of Birth(dd/mm/yyyy) :");
		String date = sc.nextLine();
		Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println("Enter mobile for consumer"+(i+1) +" :");
		long mobile = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter password for consumer"+(i+1) +" :");
		String password = sc.nextLine();

		System.out.println("Enter email for consumer"+(i+1) +" :");
		String email = sc.nextLine();
		Grade grading = Grade.Silver;
		System.out.println("Select option for grading : ");
		System.out.println("1.Gold 2.Silver 3.Platinum");
		int option = sc.nextInt();
		if(option == 1)
			grading = Grade.Gold;
		else if(option == 3)
			grading = Grade.Platinum;
		sc.nextLine();
		System.out.println("Enter foodstorename for consumer"+(i+1) +" :");
		String foodStoreName = sc.nextLine();
		consumer = new Consumer();
		consumer.setConsumerId(consumerId);
		consumer.setEmail(email);
		consumer.setGrading(grading);
		consumer.setMobile(mobile);
		consumer.setFoodStoreName(foodStoreName);
		consumer.setPassword(password);
		consumer.setDateOfBirth(dateOfBirth);
		consumer.setUserName(userName);
		
		if(ConsumerValidator.validate(consumer)) {
			System.out.println("Consumer Details Added");
		}
		else {
			System.out.println("Please enter valid Details.");
			return null;
		}
		return consumer;
	}
	public static void showConsumerDetails(Consumer consumer){
		System.out.println("Username : " + consumer.getUserName());
		System.out.println("Consumer Id : "+ consumer.getConsumerId());
		System.out.println("Date Of Birth : " + consumer.getDateOfBirth());
		System.out.println("Email : " + consumer.getEmail());
		System.out.println("Mobile No. : " + consumer.getMobile());
	}
}
