import java.io.*;
public class Round08_Ex08 {
	public static void main(String ar[]) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x[][][]=new int[2][3][6]; //+1 3�� ��� 4�� �ݼ��� 5�� ��������
		String y[]={"����","����","����"};
		
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					System.out.print(y[k]+"������ ?");
					x[i][j][k]=Integer.parseInt(in.readLine());
					x[i][j][3]+=x[i][j][k];
					x[i][j][4]=1;
					x[i][j][5]=1;
				}
				

				
		
		
		
	}

}                  //�������
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
		//�ݵ�� 
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
				System.out.println("����:"+x[i][j][3]);
				System.out.println("���:"+(float)x[i][j][3]/3.0f);
				System.out.println("�������:"+x[i][j][4]);
				System.out.println("�ݵ��:"+x[i][j][5]);
				System.out.println();
			}
			
		}
		
	}
}
