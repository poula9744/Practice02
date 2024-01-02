package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		double height;
		double weight;
		double standard;
		
		
		//키와 몸무게 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
		height = sc.nextInt();
		
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		standard = (height-100.0)*0.9;
				
		//조건문
		
		if(standard>weight) {
			System.out.println("저체중 입니다");
		} else if(standard==weight) {
			System.out.println("표준 입니다.");
		} else if (standard<weight){
			System.out.println("과체중 입니다.");
			
		}
		
		System.out.print("표준체중: " + standard);

		sc.close();
	}

}
