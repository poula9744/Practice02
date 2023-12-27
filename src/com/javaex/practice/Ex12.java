package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//숫자입력
		System.out.println("숫자를 3개 입력해주세요");
		
		System.out.print("숫자1: ");
		int number01 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int number02 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int number03 = sc.nextInt();
		
		//조건
		if(number01<=number02 && number01<=number03) {
			System.out.println("가장 작은 수는 " + number01 + " 입니다.");
		} else if(number02<=number01 && number02<=number03) {
			System.out.println("가장 작은 수는 " + number02 + " 입니다.");
		} else if(number03<=number01 && number03<=number02) {
			System.out.println("가장 작은 수는 " + number03 + " 입니다.");
		}
		
		sc.close();
		
	}

}
