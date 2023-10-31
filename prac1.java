package practice;

import java.util.Scanner;

public class prac1 {
	
	public static void findOccurance(String main,String str) {
		
		int count=0;
		
		for(int i =0;i<main.length();i++) {
			char ch = main.charAt(i);
			
			
			if(ch==str.charAt(0)) {
				int temp = i;
				for(int j=0;(temp+j)<main.length()&&j<str.length();j++) {
					if(main.charAt(temp+j)!=str.charAt(j)) {
						break;
					}
					if(str.length()-1==(j)) {
						count++;
					}
				}
			}
			
		}
		System.out.println(count);	
	}

	public static void main(String[] args) {
		String str = "neere";
//		String str1 = str+" "; FOR CASE-TO FIND NUMBER OF TIME FULL WORD OCCUR
		
		String main = "i am neere neere aneerej and neere naj";
		findOccurance(main,str);
	}

}
