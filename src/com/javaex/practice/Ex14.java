package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int number = sc.nextInt();
		
		//조건
		if(number>=0) {//양의 정수
			
			if(number%3==0) {//나머지 0
					System.out.println("A팀입니다.");
			}else if(number%3==1) {//나머지1
					System.out.println("B팀입니다.");
			}else {//나머지2
					System.out.println("C팀입니다.");
			}
			
		}else {//양의 정수가 아닐 경우
			System.out.println("잘못입력하셨습니다.");
		}

		sc.close();
	}

}
