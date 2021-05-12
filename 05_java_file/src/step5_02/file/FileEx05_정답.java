package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//# 파일 로드하기 : 연습문제


public class FileEx05_정답 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		String[] pws   = new String[3];
		int[] moneys   = new int[3];
		
		String fileName = "fileTest02.txt";
		File file = new File(fileName);		// 파일 객체 생성
	
		if (file.exists()) {  				// exists() : 파일이 존재하면 , 결과는 true or false
			
			FileReader fr = null;				// 파일 읽어오기
			BufferedReader br = null;			// 텍스트 읽어오기
			int i = 0;
			
			try {
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				// 전체 텍스트를 읽어오는 예시
				while (true) {
					
					String data = br.readLine();	// 읽어올 텍스트가 없으면 null을 반환한다.
					
					if (data == null) {		
						break;
					}
					
					String[] slash = data.split("/");
					names[i] = slash[0];
					pws[i] = slash[1];
					moneys[i] = Integer.parseInt(slash[2]);
					
					i++;
					
					
				}
				
				
				for (int j = 0; j < moneys.length; j++) {
					System.out.println(names[j] + ":" + pws[j] + ":" + moneys[j] + "\n");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 가장 나중에 open한 객체를 먼저 close한다.
				try {br.close();} catch (IOException e) {e.printStackTrace();}
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
			
		}
		
		
		
		

	}

}
