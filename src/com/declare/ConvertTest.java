package com.declare;

public class ConvertTest {
	public static void main(String[] args){ //���� �޼ҵ�(���� ����)
		
		//�ڵ��� ��ȯ�ϱ�
		//ũ�Ⱑ ���� �ڷ������� ū �ڷ������� �����Ҷ�
		long lnum=100;//int 100�� long���� ����ȯ�Ͽ� �����Ѵ�.
		float fnum=lnum; //�ڵ�����ȯ����
		System.out.println(fnum); //fnum�� 100.0���� ǥ��
		
		//�������� �Ҷ��� �ڵ�����ȯ�� �߻��Ѵ�.
		int result=10+10;
		double result2=10+10.5; // �� ���ͷ����� �ڷ����� �� ū ���ͷ��� �ڷ�������   ��ȯ
		
		
		char ch='A'; //�����ڵ�(����)(�� �����ϱ� ������ ����
		result=ch;
		System.out.println(result);
		
		
		//��������ȯ
		//ū �ڷ������� ���� �ڷ������� ����ȯ�Ҷ�
		//���ϴ� �ڷ������� ����ȯ�Ҷ�. ->��ü(���, ������)
		//(�������ڷ���)��
		
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
