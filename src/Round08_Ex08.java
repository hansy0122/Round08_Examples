import java.io.*;
public class Round08_Ex08 {
	public static void main(String ar[]) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x[][][]=new int[2][3][6]; //+1 3은 평균 4는 반석차 5는 전교석차
		String y[]={"국어","영어","수학"};
		
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					System.out.print(y[k]+"점수는 ?");
					x[i][j][k]=Integer.parseInt(in.readLine());
					x[i][j][3]+=x[i][j][k];
					x[i][j][4]=1;
					x[i][j][5]=1;
				}
				

				
		
		
		
	}

}                  //전교등수
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<2;k++){
					for(int h=0;h<3;h++){
						if(x[i][j][3]>x[k][h][3]){
							x[k][h][4]++;
						}
					}
				}
			
				
				
			
		
	}
}
		//반등수 
		for(int i=0;i<2;i++){
		 for(int j=0;j<3;j++){
			 for(int k=0;k<3;k++){
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
