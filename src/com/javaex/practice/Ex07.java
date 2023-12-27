package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//나이 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		String group;
		String price;
		
		//조건 입력
		if(age >=0 && age<=7) {
			group = "취학전아동";
			price = "무료";
		} else if(13>=age && age >= 8) {
			group = "초등학생";
			price = "2000원 ";
		} else if(age >= 14 && age <= 16) {
			group = "중학생";
			price = "3000원 ";
		} else if(age >= 17 && age <= 19) {
			group = "고등학생";
			price = "4000원 ";
		} else {
			group = "성인";
			price = "5000원 ";
		}
		
		System.out.println(group + "//" + price + "입니다.");

		sc.close();
	}

}
