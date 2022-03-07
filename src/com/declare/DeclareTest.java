package com.declare;

public class DeclareTest {

	public static void main (String[] args) {
		//석주 컨트롤 슬래쉬
		
		/*변수선언하기 자료형 변수명; 으로 선언함
		변수선언은 ram영역에 저장공간을 자료형의 크기만큼 공간을 확보하는 작업이다.
		 * 변수 선언 방법은 자료형 변수명;
		 * 자료형에는 기본자료형과 참조형자료형으로 나눠진다.
			논리형을 저장하는 변수언언하기
			boolean 표현식 사용. 1byte	*/
			boolean flag;
			
			
		//문자형 자료형 저장하는 변수선언하기
//		문자형을 단일문자 예) 가, A, B, 1 등등
//		CHAR 표현식 사용. 2byte
		char gender;
		
//		문자열은 문자를 여러개 보관 할 수 있는 저장공간 예) 안녕, 잘 살고있니?, hello, 남 등등
		//String 표현식을 사용 참조형
		String name;
		
		
//		정수형 변수를 선언하기
//		byte  파일 처리, 암호화 처리.		   			  1byte
//		short 숫자 처리							  2byte
//		int		일반적 숫자 처리할대. default 자료형	  4byte
//		long	회원 아이디, 클래스 아이디 번호, 금액 처리할때 8byte
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
//		실수형 변수 선언하기
//		소수점 값을 저장하는 변수
//실제값을 젖아하지않고 계산식에 활용될 값을 저장(가수, 지수)
//		계산식으로 표현을 하기 때문에 범위가 커지면 오차범위가 발생함
//		float	4byte
//		double	8byte default 자료형
		float fnum;
		double dnum;
//		변수명령 시 주의 할점
//		1. 대소문자 구분 같은 영역안에서는 동일한 이름의 변수명은 사용 불가
		int age;
		int aGe; 
		// 가능. age 불가.
//		2. 예약어 사용 불가
		
		//3. 변수 명은 숫자로 시작 할 수 없다.
//		double 1weight; 불가능
		double weight1;
		
		//4. 특수기호는 달러와 언더바만 사용가능. $, _
		long member$id;
		long $memberid;
		long _memberid;
		long member_id;
		long member__id;
		
		//5. 여러 단어로 변수명 설정할 경우 camelcase를 사용한다.
//		변수명의 첫글자는 소문자로 작성
		
		//5. 
	}
}
