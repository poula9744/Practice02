package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year = sc.nextInt();
		
		System.out.println("올해: 2023");
		System.out.println("태어난해: "+ year);
		int age = (2023-year);
		
		System.out.println("나이: "+ age);
		System.out.println("=======================================");
		
		//조건
		if(age>=20) {//20세 이상
			System.out.println("20살 이상");
			
			if(year%2==1) { //홀수
				System.out.println("건강검진해");
				
				if(age>=40) {//40세 이상
					System.out.println("암 검사");
				}else {//40세 미만
					System.out.println("암 검사X");
				}
				
			} else {//짝수
				System.out.println("건강검진해 아님");
			}
			
		}else {//20세 미만
			System.out.println("20살미만 건강검진대상이 아님");
		}
		
		sc.close();
	}

}
