package com.declare;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸��� �����̳�");
		String name=sc.next();
		
		System.out.print("���̴� �����̳�");
		int age=sc.nextInt();
		
		System.out.print("Ű�� ��� �Ǵ���?");
		double height=sc.nextDouble();
		
		System.out.print("��ȭ��ȣ�� ��� �Ǽ���?");
		String number=sc.next();
		
		sc.nextLine();
		System.out.print("��޹��� �ּ����� �Է����ּ���");
		String address=sc.nextLine();

		System.out.println("�̸� : " +name+"\n���� : "+age+"\nŰ : "+height+"\n��ȭ��ȣ : "+number+"\n�ּ� : "+address);
	}

}
