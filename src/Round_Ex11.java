import java.io.*;
public class Round_Ex11 {
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		// ar[]에 반수 입력
		int x[][][]=new int[Integer.parseInt(ar[0])][][]; // 반의 갯수 입략
		String n[]={"국어","영어","수학"};
		for(int i=0;i<x.length;i++){ 
			System.out.print((i+1)+"반 학생수를 입력하세요");
			x[i]=new int[Integer.parseInt(in.readLine())][6];
		}
	     
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				for(int k=0;k<3;k++){
					System.out.print((i+1)+"반"+(j+1)+"번째 학생의"+n[k]+"점수를 입력하세요");
					x[i][j][k]=Integer.parseInt(in.readLine());
					x[i][j][3]+=x[i][j][k]; //3은 총점 4는 반석차 5는 전교석차
					x[i][j][4]=1;
					x[i][j][5]=1;
				}
				
			}
		}
		
                //전교등수
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				for(int k=0;k<x.length;k++){
					for(int h=0;h<x[k].length;h++){
						if(x[i][j][3]>x[k][h][3]){
							x[k][h][4]++;
						}
					}
				}
		
	}
}
		//반등수 
		for(int i=0;i<x.length;i++){
		 for(int j=0;j<x[i].length;j++){
			 for(int k=0;k<x[i].length;k++){
				 if(x[i][j][3]>x[i][k][3]){
					 x[i][k][5]++;
				 }
			 }
			 
		 }
		}
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.println("총점:"+x[i][j][3]);
				System.out.println("평균:"+(float)x[i][j][3]/3.0f);
				System.out.println("전교등수:"+x[i][j][4]);
				System.out.println("반등수:"+x[i][j][5]);
				System.out.println();
			}
			
		}
	
	
	}
}
