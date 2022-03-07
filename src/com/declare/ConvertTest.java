package com.declare;

public class ConvertTest {
	public static void main(String[] args){ //메인 메소드(같은 지역)
		
		//자동형 변환하기
		//크기가 작은 자료형값을 큰 자료형으로 저장할때
		long lnum=100;//int 100을 long으로 형변환하여 대입한다.
		float fnum=lnum; //자동형변환해줌
		System.out.println(fnum); //fnum엔 100.0으로 표현
		
		//산술계산을 할때도 자동형변환이 발생한다.
		int result=10+10;
		double result2=10+10.5; // 두 리터러러의 자료형중 더 큰 리터럴의 자료형으로   변환
		
		
		char ch='A'; //유니코드(숫자)(로 저장하기 때문에 가능
		result=ch;
		System.out.println(result);
		
		
		//강제형변환
		//큰 자료형에서 작은 자료형으로 형변환할때
		//원하는 자료형으로 형변환할때. ->객체(상속, 다형성)
		//(변경할자료형)값
		
		int inum=(int)lnum;
		System.out.println(inum);
		lnum=4000000000L;
		inum=(int)lnum;
		System.out.println(inum);
		System.out.println(result);
		System.out.println((char)result);
		
		result=(int)180.5;
		System.out.println(result);
		
	}
}
