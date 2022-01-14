import java.util.Calendar;
import java.util.Locale;
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
		for(int i=0; i<weight.length; i++) {
			if(juminNum.charAt(i) == '-')  continue; //�ֹ��� ���̸� ��Ƽ���� �ص� �ȴ� �����̸� �ؿ��� �ϴ� �� // else�� �ص� ��
				sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			//System.out.println("sum�� ���: " + sum);
			
			//2�ܰ�
			temp =11 - (sum%11); //11��ⷯ��, temp���� 10 �Ǵ� 11�� ��찡 �ִ�.
			
			//3�ܰ�
			result = temp%10;    //3�ܰ� ������ temp���� ���ڸ��� ��� �� �ڸ��� ����� ���ؼ� 
			
			//�ֹι�ȣ ���� ���� üũ
			if(result == juminNum.charAt(13)-48) {
				System.out.println("�Է��� �ֹι�ȣ ����"
						+ "�Դϴ�.");
				//������ �ֹι�ȣ�� ���� �����ϱ�
				//���� ���� => �ó������� ���α׷����� �ű��
				//cal�� ����Ű => ��,��,��,��,��,��,���� ���� ���� => Calendar Ŭ���� Ÿ���� ��ü(Instance)�̴�.
				Calendar cal =Calendar.getInstance(Locale.KOREA);
				int year = cal.get(Calendar.YEAR); //2022 ��� ��
				
				/*
				String  yyString = juminNum.substring(0, 2);
					int yy =Integer.parseInt(yyString);
					/
					 * 
					 */
				
				
				int yy = Integer.parseInt(juminNum.substring(0, 2)); //"96" => 96
				
				if((juminNum.charAt(7)-48) < 3 ) { //1, �Ǵ� 2�̸�
					yy = yy +1900;         //1996�� ����
				System.out.println();
				}else {
						yy = yy +2000;      //3, �Ǵ� 4�̸�
				}
				int age = year - yy + 1; //������ => ���߿�"��"�� ���� ���ؼ� ������ �����
				System.out.println("����: " +age);
			
				//"����" ����
				if((juminNum.charAt(7)-48) %2 ==0) {   //2�Ǵ� 4�� "����"
					System.out.println("����: ����");
				}else {       //1 �Ǵ� 3�� "����"
					System.out.println("����: ����");
				}
				//"�������" �˾ƺ���
				//2���� �迭�� �ʱ�ȭ 
				String[][] localeCode = {{"����","00","08"},{"�λ�","09","12"},
				     					{"��õ","13","15"},{"���","16","25"},
				     					{"����","26","34"},{"���","35","39"},
				     					{"����","40","40"},{"�泲","41","43"},
				     					{"�泲","45","57"},{"����","44","44"},
				     					{"����","96","96"},{"����","48","54"},
				     					{"����","55","64"},{"����","65","66"},	
				     					{"�뱸","67","70"},{"���","71","80"},
				     					{"�泲","81","84"},{"���","86","90"},
				     					{"���","85","85"},{"���","91","95"}};
				String localeCodeString = juminNum.substring(8, 10);
				int locale = Integer.parseInt(localeCodeString);
				String birthPlace = null;
				for(int j=0; j<=19; j++) {
					if(locale >= Integer.parseInt(localeCode[j][1]) &&
						locale <= Integer.parseInt(localeCode[j][2])){
					birthPlace = localeCode[j][0];		
						}
				}
				System.out.println("�������: " + birthPlace);
				
				System.out.println("������� "+yy+ "/"+juminNum.substring(2, 4)+"/"+juminNum.substring(4, 6));
				//"��" ���ϱ� => ����=> ����⵵%12 ������ ó��
				String ddi = null;
				String[] gangi = {"������","��", "��", "����","��","��",
										"��","�䳢","��","��","��","��"};
				ddi =gangi[yy%12];
				System.out.println("��:" +ddi);
			
			}else {
					
					System.out.println("�Է��� �ֹι�ȣ�� Ʋ�� �ֹι�ȣ�Դϴ�.");
			}
			//"�������" �����ϱ�
			
			//��� �ܰ�
			
		}
		
		
	}

	

		
		