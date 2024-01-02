package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int number01 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int number02 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int number03 = sc.nextInt();
		
		//조건, 출력
		if(number01>=number02 && number01>=number03) {
			System.out.println("가장 큰수는 "+number01+" 입니다." );
		} else if(number02>=number01 && number02>=number03) {
			System.out.println("가장 큰수는 "+number02+" 입니다.");
		} else if(number03>=number01 && number03>=number02) {
			System.out.println("가장 큰수는 "+number03+" 입니다.");
		}
		
		sc.close();

	}

}

/*  //if문 다음에 아래의 if문이 실행됩니다.(if~else문 X  비교해볼것)
	
	max = number01;
		if(max < number02) {
			max = number2;
		}  
		
		if(max < number03) {
			max = number03;
		}
		 

*/