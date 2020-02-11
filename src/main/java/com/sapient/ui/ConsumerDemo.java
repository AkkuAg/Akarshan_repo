package com.sapient.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sapient.service.Consumer;
import com.sapient.service.ConsumerManager;
import com.sapient.service.ConsumerValidator;
import com.sapient.service.Grade;

public class ConsumerDemo {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws ParseException {
		System.out.println("Enter Number of consumers :");
		int number = sc.nextInt();
		Consumer consumers[] = new Consumer[number];
		for(int i=0;i<consumers.length;i++) {
			consumers[i] = ConsumerManager.getConsumerDetails(i);
			if(consumers[i] == null)
				i--;
		}
		
		System.out.println("Press 1 to view consumer details :");
		int opt = sc.nextInt();
		if(opt == 1) {
			for(int i=0;i<consumers.length;i++) {
				System.out.println("Consumer "+ (i+1) + " details :");
				System.out.println();
				ConsumerManager.showConsumerDetails(consumers[i]);
				System.out.println();
			}
		}
	}
}
