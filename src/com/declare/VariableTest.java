package com.declare;

public class VariableTest {

	public static void main (String[] args) {
		
		//����� ���� Ȱ���ϱ�
		//����� ������ �� �����ϱ�
		//������ ���� �����Ҷ��� "="(���Կ�����)�� Ȱ���Ѵ�.
		//�⺻������ ���Կ����� ���ʿ��� ������, �����ʿ��� ��(���ͷ�)�� �ۼ�
		//��) int age;
		//	age=19;
		//���ͷ����� �ڷ����� ���� ǥ�ø�  ������Ѵ�.
		//byte, short, int : �׳� ����
		//long :  ����L
		//float : ����f
		//double : �Ǽ�
		//char : '���Ϲ���'
		//String : "���ڿ�"
		//boolean : true, false
		boolean flag;
		flag=true;
		//�� ���Խÿ��� ���ԵǴ� ������ ������ �ڷ����� ���ͷ��� �־���Ѵ�.
		//flag=200;
		
		flag = false;
		int age;
		age=19;//���� default �ڷ��� == int
		
		byte bnum=127;
		short snum=19999;
		//byte, short �ڷ����� int ���ͷ��� �ڵ����� ����ȯ�ؼ� ��������.
		
		float height=180.5f;
		double weight =166.5;
		
		long memberNumber;
		memberNumber=200;
		memberNumber=20000000000l;
		
		//����, ���ڿ� ������ �� �����ϱ�
		char gender;
		gender='m';
		//gender='ab';
		//�ݵ�� �Ѱ��� ���ڸ� ����
		gender='��';
		//gender='����';
		
		String msg;
		msg="����";
		msg="ab";
		msg="������������3�����׿�";
		msg="10";
		String nickName="�赿��";
		
		//������ ����Ǿ��ִ� �� ��������
		//�������� �̿��Ѵ�.
		
		//flag �� �������� ������
		boolean flag2=flag;
		//������ ����� �� Ȯ���ϱ�
		//Ư�� �ڹٿ��� �����ϴ� ���(�޼ҵ�) - System.out.println()
		System.out.println(flag2);
		//age ������ ����� �� Ȯ���ϱ�
		System.out.println(age);
		age=20;
		System.out.println(age);
		
		
		System.out.println(height);
		System.out.println(weight);
		System.out.println(nickName);
		
		
		//������ ������ �� �ִ� ������ �����ϰ� ���
		//������ ������������ �����Ұ�.
		
		double schoolGrade=3.5;
		
		System.out.println(schoolGrade);
		
		//Ÿ���� ������ ������ ���� �ѹ��� �����ϱ�.
		
	/*	int korean = 99;
		int math = 98;
		int english = 100; */
		int korean,english,math;
		
		String name, phone, address;
		
		korean=100;
		english=98;
		math=99;
		name="�赿��";
		phone="01039356293";
		address="����ñ�õ��";
		
		int coding=90,science=99;
		char blood='a',gender2='��';
				
				//������ �ѱ� ��� ����? �ϱ��� �ٵ� ������
		String �赿��;
		�赿��="�ΰ�";
		
		
		//����̿��ϱ�
		//����� ���α׷������� ���������� Ȱ���ؾ��ϴ� �����͸�
		//�����Ҷ� ��� - > ������ �ѵ�
		//����� �빮�ڷ� �ۼ��ϰ� ���� �ܾ �������� ����ٷ� ����
		//ex) ADMIN_NUMBER, ERROR_E202
		
		//������ : FINAL ����� ���.
		//FINAL String name;
		
		final String ERROR;
		ERROR="���α׷�����";
		System.out.println(ERROR);
		//ERROR="�ý��ۿ���";
		
		
	}
}
