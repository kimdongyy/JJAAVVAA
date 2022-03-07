package com.declare;

import java.util.Scanner;                  			//스캐너

public class InputOutputTest {

	public static void main(String[] args) {
		
		//System.out.print();//개행없이 데이터 출력
		System.out.print("안녕");
		System.out.println("하세요");
		
		
		//printf 정해져잇는 형식에 맞춰서 같은 형식은 줄바꿈 하지않음 
//		%5d 5칸확보 오른쪽정렬 
//		

		System.out.printf("내이름 %s 나이는 %d 몸무게는 %f이다."	
					,"김동영",27,76.5);
		//%s 문자열 %d 인트 %f 실수(소숫점써야함)
		
		System.out.println();//개행
		System.out.println("이름 나이 성별");
		System.out.println("김동영 27 남자");
		System.out.println("김동영 222 남자");
		
		System.out.printf("%3s %d %s\n", "김동영",27,"남자");
		System.out.printf("%4s %d %s", "동여",20,"남자");
		System.out.println();
		double dnum=3.141592;
		System.out.println(dnum);
		System.out.printf("%.2f", dnum); //소숫점둘째자리까지만표현
		
		//문자열에 escape문 작성하기
		//tap 
		String temp="안녕\t하세요";
		System.out.println(temp);
		temp="안녕\n 나는 김동영이야";
		System.out.println(temp);
		temp="c\\:Users\\a"; //경로 표현할때는 역슬래쉬 두번
		System.out.println(temp);
		temp="그는 \"안녕이라고\" 말했다!";
		System.out.println(temp);
		temp="<p stype=color:\"red\">안녕</p>";  //웹 쓸때 많이 씀
		System.out.println(temp);
		
		
		
		
		
		//키보드에서 입력한 값 가져오기
		//1. Scanner클래스 import하기
		//	-import java.util.Scanner;
		//2.Scanner 클래스 생성해서 변수에 넣기
		//	-Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		//3. 원하는 데이터 입력받기
		//	-Scanner의 기능(메소드)
		//	-정수 : nextInt();
		//	-실수 : nextDouble();
		//	-문자열 : NEXT()또는 NextLine();
		//	sc.nextInt();
		System.out.print("나이를 입력하시오");
		int inputSu=sc.nextInt();
		System.out.println("입력값 : "+inputSu);
		
		
		System.out.print("니키?");
		double height=sc.nextDouble();
		System.out.println("입력값 : "+height+"cm입니다");
		
		
		//문자열 받기
		//sc.next() :			공백을 기준으로 공백 앞에 있는 문자를 가져옴
		//sc.nextLine() :		개행을 기준으로 개행 전의 문자열
		/*System.out.print("주소지가?");		//공백뒤는인식x
		String address=sc.next();
		System.out.println(address);*/
		
		sc.nextLine();//nextloine을 받기 전에 입력 버퍼를 비워줘야함
		System.out.print("진짜주소지가?");
		String address1=sc.nextLine();
		System.out.println(address1);		//next double int 주석처리하면 띄어쓰기 다 가져옴 
											//String name=sc.next();
											
		
		
		//새로운 프로젝트 test2를 만들고
		//com.test2패키지에 Variable클래스 생성하고
		//사용자에게 이름, 나이, 키, 전화번호, 주소를 입력받고
		//출력하는 기능 구현하기
		
		
	}

}
