package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자 입력
		System.out.print("첫 번째 숫자: ");
		int number01 = sc.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int number02 = sc.nextInt();
		
		int result;
		
		//조건
		if(number01<=number02) {//조건1
			result = number02%number01;
			
			
			if(result==0) {//조건1-1
				System.out.println(number01 + " 는(은) " + number02 + "의 약수입니다.");
				} else {//조건1-2
				System.out.println(number01 + " 는(은) " + number02 + "의 약수가 아닙니다.");
				}
		
			
		}else {//조건2
			result = number01%number02;
			
			if(result==0) {//조건2-1
				System.out.println(number02 + " 는(은) " + number01 + "의 약수입니다.");
				} else {//조건2-2
				System.out.println(number02 + " 는(은) " + number01 + "의 약수가 아닙니다.");
				}
			
			
		}
		sc.close();
	}
}
		

