import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.printf("========= MENU =========%n"
				+ "1. Memo manager (�޸����)%n"
				+ "2. Calculator (����)%n"
				+ "3. Account book (�����)%n"
				+ "4. Exit (����)%n"
				+ "========================%n");
		System.out.printf("�޴� ��ȣ �Է�: ");
		int sel = scan.nextInt();	// ��ȣ �Է�
		
		if (sel==1) ;// �޸���� �޴� ȣ��
		else if (sel==2) ;// ���� �޴� ȣ��
		else if (sel==3) ;// ����� �޴� ȣ��	
		else if (sel==4) { // ����
			while(scan.hasNextLine()) scan.nextLine();
			while(scan.hasNextInt()) scan.nextInt();
		} 
		else {
			System.out.printf("�ٽ� �Է��ϼ���. ");
			sel = scan.nextInt(); //���Է�
		}
		scan.close();
	}
}
