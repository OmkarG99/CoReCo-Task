package com.BasicQuestions;

public class ReverseWord {

	public static void main(String[] args) {

		String str="Hello World";
		String temp="";
		String str1[]=str.split(" ");

		for(int i=str1.length-1;i>=0;i--)
		{
			temp=temp+ " " + str1[i];
		}
		
		for(int i=temp.length()-1;i>=0;i--)
		{
			System.out.print(temp.charAt(i));
		}
	}
}
