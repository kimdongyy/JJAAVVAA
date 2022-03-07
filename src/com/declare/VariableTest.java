package com.declare;

public class VariableTest {

	public static void main (String[] args) {
		
		//선언된 변수 활용하기
		//선언된 변수에 값 대입하기
		//변수에 값을 대입할때는 "="(대입연산자)를 활용한다.
		//기본적으로 대입연산자 왼쪽에는 변수명, 오른쪽에는 값(리터럴)을 작성
		//예) int age;
		//	age=19;
		//리터럴에는 자료형에 대한 표시를  해줘야한다.
		//byte, short, int : 그냥 숫자
		//long :  숫자L
		//float : 숫자f
		//double : 실수
		//char : '단일문자'
		//String : "문자열"
		//boolean : true, false
		boolean flag;
		flag=true;
		//값 대입시에는 대입되는 변수와 동일한 자료형의 리터럴을 넣어야한다.
		//flag=200;
		
		flag = false;
		int age;
		age=19;//숫자 default 자료형 == int
		
		byte bnum=127;
		short snum=19999;
		//byte, short 자료형은 int 리터럴을 자동으로 형변환해서 대입해줌.
		
		float height=180.5f;
		double weight =166.5;
		
		long memberNumber;
		memberNumber=200;
		memberNumber=20000000000l;
		
		//문자, 문자열 변수에 값 대입하기
		char gender;
		gender='m';
		//gender='ab';
		//반드시 한개의 글자만 가능
		gender='남';
		//gender='남자';
		
		String msg;
		msg="남자";
		msg="ab";
		msg="개강한지벌써3일차네요";
		msg="10";
		String nickName="김동영";
		
		//변수에 저장되어있는 값 가져오기
		//변수명을 이용한다.
		
		//flag 값 가져오고 싶을때
		boolean flag2=flag;
		//변수에 저장된 값 확인하기
		//특정 자바에서 제공하는 기능(메소드) - System.out.println()
		System.out.println(flag2);
		//age 변수에 저장된 값 확인하기
		System.out.println(age);
		age=20;
		System.out.println(age);
		
		
		System.out.println(height);
		System.out.println(weight);
		System.out.println(nickName);
		
		
		//학점을 저장할 수 있는 변수를 선언하고 출력
		//학점은 본인학점으로 저장할것.
		
		double schoolGrade=3.5;
		
		System.out.println(schoolGrade);
		
		//타입이 동일한 여러개 변수 한번에 선언하기.
		
	/*	int korean = 99;
		int math = 98;
		int english = 100; */
		int korean,english,math;
		
		String name, phone, address;
		
		korean=100;
		english=98;
		math=99;
		name="김동영";
		phone="01039356293";
		address="서울시금천구";
		
		int coding=90,science=99;
		char blood='a',gender2='여';
				
				//변수명에 한글 사용 가능? 하긴함 근데 쓰지마
		String 김동영;
		김동영="인간";
		
		
		//상수이용하기
		//상수는 프로그램내에서 고정적으로 활용해야하는 데이터를
		//저장할때 사용 - > 에러콛 ㅡ등
		//상수는 대문자로 작성하고 여러 단어가 있을때는 언더바로 포현
		//ex) ADMIN_NUMBER, ERROR_E202
		
		//선언방식 : FINAL 예약어 사용.
		//FINAL String name;
		
		final String ERROR;
		ERROR="프로그램에러";
		System.out.println(ERROR);
		//ERROR="시스템에러";
		
		
	}
}
