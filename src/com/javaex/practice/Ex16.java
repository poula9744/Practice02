package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int number = sc.nextInt();
		double result;
		
		//조건
		if(number<=0) {
			result = (number*number*number-9*number+2);
		} else {
			result = (7*number+2);
		}
		
		//출력
		System.out.println("계산결과는 " + result + " 입니다.");
		
		sc.close();
	}

}
