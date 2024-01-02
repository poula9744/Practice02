package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String symbol = sc.nextLine();
		
		System.out.print("숫자1: ");
		double number01 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double number02 = sc.nextDouble();
		
		
		//조건
		if(symbol.equals("+")) {
			System.out.println("결과는: " + (number01+number02));
		} else if(symbol.equals("-")) {
			System.out.println("결과는: " + (number01-number02));
		} else if(symbol.equals("*")) {
			System.out.println("결과는: " + number01*number02 );
		} else if(symbol.equals("/")) {
			if(number02==0) {//0일 때
				System.out.println("계산할 수 없습니다.");
			}else {
				System.out.println("결과는: " + number01/number02 );
			}
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();

	}

}

/* String mark;
 * 
 * switch(mark) {
			case "+":
				result = num01 + num02;
				System.out.println( "결과는: " +  result );
				break;
			case "-":
				result = num01 - num02;
				System.out.println( "결과는: " +  result );
				break;
			case "*":
				result = num01 * num02;
				System.out.println( "결과는: " +  result );
				break;
			case "/":
				if(num02==0) {
					System.out.println( "계산할 수 없습니다." );
				}else {
					result = num01 / num02;
					System.out.println( "결과는: " +  result );
				}
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
 * 
 */
