import java.util.Scanner;

public class JuminCheckEx {
	public static void main(String[] args) {
		//�غ� �ܰ� 
		String juminNum;
		int sum = 0;	
		int temp, result;
		int [] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};// �߰�ȣ �߿���
		
		
		//�Է� �ܰ�
		System.out.print("�ֹι�ȣ �Է�: ");
		Scanner scan =new Scanner(System.in);
		juminNum = scan.nextLine();
		
		//ó�� �ܰ�
		//1�ܰ� : sum�� ���ϱ�
		//"961024-1023411"
		// �ذ��� 1
		for(int i=0; i<weight.length; ) {
			if(juminNum.charAt(i) == '-')  continue; //�ֹ��� ���̸� ��Ƽ���� �ص� �ȴ� �����̸� �ؿ��� �ϴ� �� // else�� �ص� ��
				sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			System.out.println("sum�� ���: " + sum);
		
		//��� �ܰ�
		scan.close();}
		
		
	}

	

		
		