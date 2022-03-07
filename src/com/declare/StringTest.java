package com.declare;

public class StringTest {
	
	public static void main(String[] args) {
		//String 자료형 활용하기
		//String은 클래스/객체이다.
		//기본자료형처럼 사용할 수 있다.
		//이름 저장하기
		String name="김동영"; // 기본자료형처럼 사용.
		//클래스형식처럼 사용하려면
		String nameObject=new String("김동영");
		
		System.out.println(name);
		System.out.println(nameObject);
		
		//문자열은 +연산을 사용했을때 문자열을 합치는 기능을 수행
		
		int su=20+20;
		System.out.println(su);
		String temp="20"+"20";
		System.out.println(temp);
		temp=10+"30";
		System.out.println(temp);
		temp=10+20+"30";
		System.out.println(temp);
		temp="30"+10+20;		//String 스타트면 그 열 전체 String으로.
		System.out.println(temp);
		temp="30"+(10+20);
		System.out.println(temp);
		
		//나이와 성별을 출력하는 프로그램 작성하기
		
		int age=27;
		char gender='m';
		
		System.out.println("your age?"+age+"성별은?"+gender);
		
		String msg="니나이?"+age+"성별"+gender;
		System.out.println(msg);
		
		//클래스는 유용한 기능(메소드) 가지고있음.
		//1. String이 저장ㅎ라고 있는 문자열의 길이(문자갯수)
		
		// length()
		String lengthTest="점심은 맛있게";
		//lengthTest에 저장된 문자열의 갯수 출력
		System.out.println(lengthTest.length());
		int size=lengthTest.length();
		System.out.println(size);
		
		//2. String이 저장하고 있는 문자열의 단일문자를 확인
		//charAT(숫자)
		System.out.println(lengthTest.charAt(0));
		System.out.println(lengthTest.charAt(1));
		//lengthTest엣 ㅓ맛 출력하기
		System.out.println(lengthTest.charAt(4));
		
		//리터럴 이용해서 메소드 활용가능
		size="구디아카데미".length();
		System.out.println(size);
		
		System.out.println("구디아카데미".charAt(4));
		
		//본인의 이름, 나이, 성별(한글자M/F), 주소, 키, 몸무게, 결혼여부
		//를 저장하는 변수를 만들고 값을 
		//나의 이름은 김동영이고 나이는 27살 남입니다. 사는곳은 금천구이고 키는 181 몸무게는 76kg 결혼은 false입니다.
		
		String name1="김동영";
		int age2=27;
		char gender1='m';
		String living="금천구";
		
		double height1=181.1;
		double weight=76;
		boolean married;
		married=false;
		
		String target="나의 이름은 "+name1+"이고 나이는 "+age2+"살 "+gender1+"입니다. 사는곳은 "+living+"이고 키는 "+height1+"몸무게는 "+weight+"kg 결혼은 "+married+"입니다.";
		System.out.println(target);
		System.out.println(target.length());
		System.out.println(target.charAt(0)+target.charAt(1));
		
	}

}
