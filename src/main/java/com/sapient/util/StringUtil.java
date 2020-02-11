package com.sapient.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class StringUtil {
	
	public static String printCapitalized(String str) {
		char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) {
        	if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 

                if (ch[i] >= 'a' && ch[i] <= 'z') { 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
        String st = new String(ch); 
        return st;
	}
	
	public static boolean isValidPAN(String panCard) {
		if(panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String reshape(String str,String ch) {
		String string = "" + str.charAt(0);

	    for (int i=1; i<=str.length()-1; i++){
	        string += ch + str.charAt(i);
	    }
	    StringBuilder rev = new StringBuilder();
	    rev.append(string);
	    rev = rev.reverse();

	    return String.valueOf(rev);
		
	}
	
	public static int calculateWordSum(String string) {
		String [] arr = string.split(" ");
		if(arr[0].equals(arr[arr.length-1])) {
			return arr[0].length();
		}else {
			return arr[0].length()+arr[arr.length-1].length();
		}
		
	}
	
	public static void countWordLength(String string) {
		String [] arr = string.split(" ");
		for(String a:arr) {
			System.out.println(a+" : "+a.length());
		}
	}
	
	public static String removeDuplicates(String string) {
		String result = "";
	    for (int i = 0; i < string.length(); i++) {
	        if(!result.contains(String.valueOf(string.charAt(i)))) {
	            result += String.valueOf(string.charAt(i));
	        }
	    }
	    return result;
	}
	
	public static int numberOfOccurencesOfSubstring(String string1,String subString) {
		String [] arr = string1.split(" ");
		Integer i = 0;
		for(String a:arr) {
			if(a.equals(subString)) {
				i++;
			}
		}
		return i;
	}
	
	public static String[][] splitText(String text,String delimiter){
		String[] str = text.split(delimiter);
		Integer i = (int) Math.sqrt(str.length);
		String [][] str2d = new String[i][i];
		int s = 0;
		for(int j=0;j<i;j++) {
			for(int k=0;k<i;k++) {
				str2d[j][k] = str[s];
				s++;
			}
		}
		return str2d;
	}
	
	public static int daysBetween(LocalDate orderDate,LocalDate shipmentDate) {
		if(shipmentDate.isBefore(orderDate)) {
			return -1;
		}else {
			return (int) ChronoUnit.DAYS.between(orderDate, shipmentDate);
		}
	}
	
	public static Calendar getBirthdate(String bdate) throws ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		cal.setTime(sdf.parse(bdate));
		return cal;
		
	}

}