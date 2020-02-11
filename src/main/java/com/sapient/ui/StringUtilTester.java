package com.sapient.ui;

import java.text.ParseException;
import java.time.LocalDate;

import com.sapient.util.StringUtil;

public class StringUtilTester {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Capitalized: "+StringUtil.printCapitalized("Hello world"));
		System.out.println("Pan Validation: "+StringUtil.isValidPAN("AKKU1234S"));
		System.out.println("String Reshape: "+StringUtil.reshape("AKKU1234S", "-"));
		System.out.println("Word Sum: "+StringUtil.calculateWordSum("SAPIENT TECHNOLOGIES SAPIENT"));
		System.out.println("Word Length: ");
		StringUtil.countWordLength("Hello world");
		System.out.println("Duplicates Removal: "+StringUtil.removeDuplicates("Hello"));
		System.out.println("Number Of Occurences: "+StringUtil.numberOfOccurencesOfSubstring("SAPIENT TECHNOLOGIES SAPIENT", "SAPIENT"));
		System.out.println("Word split:");
		String[][] str2d = StringUtil.splitText("Hello How are you?", " ");
		for(String[] s1:str2d) {
			for(String s2:s1) {
				System.out.print(s2+" ");
			}
			System.out.println();
		}
		System.out.println("Days in between: "+StringUtil.daysBetween(LocalDate.of(2019, 8, 8), LocalDate.of(2019, 8, 15)));
		System.out.println("Converting string to Calendar object:\n"+StringUtil.getBirthdate("09/06/1997"));

	}

}