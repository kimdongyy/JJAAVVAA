package com.declare;

import java.util.Scanner;                  			//��ĳ��

public class InputOutputTest {

	public static void main(String[] args) {
		
		//System.out.print();//������� ������ ���
		System.out.print("�ȳ�");
		System.out.println("�ϼ���");
		
		
		//printf �������մ� ���Ŀ� ���缭 ���� ������ �ٹٲ� �������� 
//		%5d 5ĭȮ�� ���������� 
//		

		System.out.printf("���̸� %s ���̴� %d �����Դ� %f�̴�."	
					,"�赿��",27,76.5);
		//%s ���ڿ� %d ��Ʈ %f �Ǽ�(�Ҽ��������)
		
		System.out.println();//����
		System.out.println("�̸� ���� ����");
		System.out.println("�赿�� 27 ����");
		System.out.println("�赿�� 222 ����");
		
		System.out.printf("%3s %d %s\n", "�赿��",27,"����");
		System.out.printf("%4s %d %s", "����",20,"����");
		System.out.println();
		double dnum=3.141592;
		System.out.println(dnum);
		System.out.printf("%.2f", dnum); //�Ҽ�����°�ڸ�������ǥ��
		
		//���ڿ��� escape�� �ۼ��ϱ�
		//tap 
		String temp="�ȳ�\t�ϼ���";
		System.out.println(temp);
		temp="�ȳ�\n ���� �赿���̾�";
		System.out.println(temp);
		temp="c\\:Users\\a"; //��� ǥ���Ҷ��� �������� �ι�
		System.out.println(temp);
		temp="�״� \"�ȳ��̶��\" ���ߴ�!";
		System.out.println(temp);
		temp="<p stype=color:\"red\">�ȳ�</p>";  //�� ���� ���� ��
		System.out.println(temp);
		
		
		
		
		
		//Ű���忡�� �Է��� �� ��������
		//1. ScannerŬ���� import�ϱ�
		//	-import java.util.Scanner;
		//2.Scanner Ŭ���� �����ؼ� ������ �ֱ�
		//	-Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		//3. ���ϴ� ������ �Է¹ޱ�
		//	-Scanner�� ���(�޼ҵ�)
		//	-���� : nextInt();
		//	-�Ǽ� : nextDouble();
		//	-���ڿ� : NEXT()�Ǵ� NextLine();
		//	sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�");
		int inputSu=sc.nextInt();
		System.out.println("�Է°� : "+inputSu);
		
		
		System.out.print("��Ű?");
		double height=sc.nextDouble();
		System.out.println("�Է°� : "+height+"cm�Դϴ�");
		
		
		//���ڿ� �ޱ�
		//sc.next() :			������ �������� ���� �տ� �ִ� ���ڸ� ������
		//sc.nextLine() :		������ �������� ���� ���� ���ڿ�
		/*System.out.print("�ּ�����?");		//����ڴ��ν�x
		String address=sc.next();
		System.out.println(address);*/
		
		sc.nextLine();//nextloine�� �ޱ� ���� �Է� ���۸� ��������
		System.out.print("��¥�ּ�����?");
		String address1=sc.nextLine();
		System.out.println(address1);		//next double int �ּ�ó���ϸ� ���� �� ������ 
											//String name=sc.next();
											
		
		
		//���ο� ������Ʈ test2�� �����
		//com.test2��Ű���� VariableŬ���� �����ϰ�
		//����ڿ��� �̸�, ����, Ű, ��ȭ��ȣ, �ּҸ� �Է¹ް�
		//����ϴ� ��� �����ϱ�
		
		
	}

}
