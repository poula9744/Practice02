package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String alphabet = sc.nextLine();
		String result;
		
		//조건
		if(alphabet.equals("a")) {
			result = "모음";
		} else if(alphabet.equals("e")) {
			result = "모음";
		} else if(alphabet.equals("i")) {
			result = "모음";
		} else if(alphabet.equals("o")) {
			result = "모음";
		} else if(alphabet.equals("u")) {
			result = "모음";
		} else {
			result = "자음";
		}
			
		//출력
		System.out.println(result + "입니다.");
		
		sc.close();
	}

}

/*	
 * if(	alphabet.equals("a") || alphabet.equals("e") || 
		    alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u") ) {
			
			System.out.println("모음입니다.");
		} else {
			
			System.out.println("자음입니다.");
		}
 */
