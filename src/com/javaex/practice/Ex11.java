package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//숫자 입력
		System.out.print("첫번째 숫자: ");
		int number01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int number02 = sc.nextInt();
		
		int division;
		int remainder;
		
		//조건
		if(number01>number02) {
			division = number01/number02;
			remainder = number01%number02;
		} else {
			division = number02/number01;
			remainder = number02%number01;
		}
		
		//출력
		System.out.println("몫: " + division);
		System.out.println("나머지: " + remainder);
		
		sc.close();
	}

}
