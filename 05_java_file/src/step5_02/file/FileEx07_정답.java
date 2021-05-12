package step5_02.file;

import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx07_정답 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int accsCnt = 0;
		int identifier = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		int check = -1;
		String fileName = "atm.txt";
		
		while(true) {
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
			// 로그아웃된 상태	
				
				scan.nextLine();
				
				System.out.println("┌────────────────────┐");
				System.out.println("│      회원가입      │");
				System.out.println("└────────────────────┘");
				System.out.print("계좌번호를 입력해주세요 : ");
				String accNumber = scan.nextLine();
				
				if (accNumber.length() == 4) {
					
					// 중복성 검사
					for (int i = 0; i < accs.length; i++) {
						
						if(!accs[i].equals(accNumber)) {
							check = 0;
						} 
						
						else if (accs[i].equals(accNumber)) {
							System.out.println("이미 있는 계좌입니다.");
							check = -1;
							break;
						}
					}
					
					// 중복이 아니면
					if (check != -1) {
						
						System.out.print("비밀번호를 입력해주세요 : ");
						String passwordNumber = scan.nextLine();
						
						if (passwordNumber.length() == 4) {
							
							for (int i = 0; i < accs.length; i++) {
								
								if (accs[i] == null) {
									accs[i] = accNumber;
									pws[i]  = passwordNumber;
									System.out.println("계좌 생성 완료");
									break;
								}
								
							}
							
						} else {
							System.out.println("비밀번호는 4자리를 입력해주세요");
						}
						
						
					} 
				} else {
					System.out.println("계좌번호는 4자리를 입력해주세요");
				}
				
				System.out.print("{");
				for (int i = 0; i < accs.length; i++) {
					System.out.print(accs[i]);
					if (i < accs.length - 1) {
						System.out.print(", ");
					}
				}
				System.out.println("}");
				
				System.out.println();
				
			}
			else if (sel == 2) {
				System.out.println("[2]회원탈퇴");
			}
			else if (sel == 3) {
				System.out.println("[3]로그인");
			}
			else if (sel == 4) {
				System.out.println("[4]로그아웃");
			}
			else if (sel == 5) {
				System.out.println("[5]입금");
			}
			else if (sel == 6) {
				System.out.println("[6]출금");
			}
			else if (sel == 7) {
				System.out.println("[7]이체");
			}
			else if (sel == 8) {
				System.out.println("[8]잔액조회");
			}
			else if (sel == 9) {
				System.out.println("[9]저장");
			}
			else if (sel == 10) {
				System.out.println("[10]로드");
			}
			else if (sel == 0) {
				System.out.println("[0]종료");
				break;
			}
			
		}
		
	}
}
