package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
	}

}
/* 다음중 에러가 발생하는 문장은
(1) if( i=0 ) {....} ==> i=0은 0을 i에 대입한다는 뜻으로 조건으로는 적절하지 못하다. if(i==0)로 고쳐야 한다. 

(2) if( j<10 ) {...} 

(3) switch( 'A' ){....} char 가능
(4) switch( 100 ){...} byte, short, int 가능
(5) switch( "A" ){...} string 가능 

(6) if( name == "홍길동" )==> if절에 참고자료형을 쓸 때에는 code.equals("홍길동")을 넣어야 한다. 
*/