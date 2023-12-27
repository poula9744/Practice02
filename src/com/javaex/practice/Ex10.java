package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		int number01 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int number02 = sc.nextInt();
		
		if(number01>number02) {
			System.out.println("큰수: " + number01 + "   작은수: " + number02 + "입니다.");
		}else {
			System.out.println("큰수: " + number02 + "   작은수: " + number01 + "입니다.");
		}
		
		sc.close();
	}

}
