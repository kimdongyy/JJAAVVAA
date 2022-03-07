package com.declare;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름은 무엇이냐");
		String name=sc.next();
		
		System.out.print("나이는 무엇이냐");
		int age=sc.nextInt();
		
		System.out.print("키는 어떻게 되느냐?");
		double height=sc.nextDouble();
		
		System.out.print("전화번호가 어떻게 되세요?");
		String number=sc.next();
		
		sc.nextLine();
		System.out.print("배달받을 주소지를 입력해주세요");
		String address=sc.nextLine();

		System.out.println("이름 : " +name+"\n나이 : "+age+"\n키 : "+height+"\n전화번호 : "+number+"\n주소 : "+address);
	}

}
