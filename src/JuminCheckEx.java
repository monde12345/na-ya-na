import java.util.Scanner;

public class JuminCheckEx {
	public static void main(String[] args) {
		//준비 단계 
		String juminNum;
		int sum = 0;	
		int temp, result;
		int [] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};// 중괄호 중요함
		
		
		//입력 단계
		System.out.print("주민번호 입력: ");
		Scanner scan =new Scanner(System.in);
		juminNum = scan.nextLine();
		
		//처리 단계
		//1단계 : sum값 구하기
		//"961024-1023411"
		// 해결방법 1
		for(int i=0; i<weight.length; ) {
			if(juminNum.charAt(i) == '-')  continue; //주민이 참이면 컨티뉴로 해도 된다 거짓이면 밑에로 하는 것 // else로 해도 된
				sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			System.out.println("sum값 출력: " + sum);
		
		//출력 단계
		scan.close();}
		
		
	}

	

		
		