package com.declare;

public class StringTest {
	
	public static void main(String[] args) {
		//String �ڷ��� Ȱ���ϱ�
		//String�� Ŭ����/��ü�̴�.
		//�⺻�ڷ���ó�� ����� �� �ִ�.
		//�̸� �����ϱ�
		String name="�赿��"; // �⺻�ڷ���ó�� ���.
		//Ŭ��������ó�� ����Ϸ���
		String nameObject=new String("�赿��");
		
		System.out.println(name);
		System.out.println(nameObject);
		
		//���ڿ��� +������ ��������� ���ڿ��� ��ġ�� ����� ����
		
		int su=20+20;
		System.out.println(su);
		String temp="20"+"20";
		System.out.println(temp);
		temp=10+"30";
		System.out.println(temp);
		temp=10+20+"30";
		System.out.println(temp);
		temp="30"+10+20;		//String ��ŸƮ�� �� �� ��ü String����.
		System.out.println(temp);
		temp="30"+(10+20);
		System.out.println(temp);
		
		//���̿� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		
		int age=27;
		char gender='m';
		
		System.out.println("your age?"+age+"������?"+gender);
		
		String msg="�ϳ���?"+age+"����"+gender;
		System.out.println(msg);
		
		//Ŭ������ ������ ���(�޼ҵ�) ����������.
		//1. String�� ���夾��� �ִ� ���ڿ��� ����(���ڰ���)
		
		// length()
		String lengthTest="������ ���ְ�";
		//lengthTest�� ����� ���ڿ��� ���� ���
		System.out.println(lengthTest.length());
		int size=lengthTest.length();
		System.out.println(size);
		
		//2. String�� �����ϰ� �ִ� ���ڿ��� ���Ϲ��ڸ� Ȯ��
		//charAT(����)
		System.out.println(lengthTest.charAt(0));
		System.out.println(lengthTest.charAt(1));
		//lengthTest�� �ø� ����ϱ�
		System.out.println(lengthTest.charAt(4));
		
		//���ͷ� �̿��ؼ� �޼ҵ� Ȱ�밡��
		size="�����ī����".length();
		System.out.println(size);
		
		System.out.println("�����ī����".charAt(4));
		
		//������ �̸�, ����, ����(�ѱ���M/F), �ּ�, Ű, ������, ��ȥ����
		//�� �����ϴ� ������ ����� ���� 
		//���� �̸��� �赿���̰� ���̴� 27�� ���Դϴ�. ��°��� ��õ���̰� Ű�� 181 �����Դ� 76kg ��ȥ�� false�Դϴ�.
		
		String name1="�赿��";
		int age2=27;
		char gender1='m';
		String living="��õ��";
		
		double height1=181.1;
		double weight=76;
		boolean married;
		married=false;
		
		String target="���� �̸��� "+name1+"�̰� ���̴� "+age2+"�� "+gender1+"�Դϴ�. ��°��� "+living+"�̰� Ű�� "+height1+"�����Դ� "+weight+"kg ��ȥ�� "+married+"�Դϴ�.";
		System.out.println(target);
		System.out.println(target.length());
		System.out.println(target.charAt(0)+target.charAt(1));
		
	}

}
