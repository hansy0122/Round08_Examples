import java.io.*;
public class Round_Ex11 {
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		// ar[]�� �ݼ� �Է�
		int x[][][]=new int[Integer.parseInt(ar[0])][][]; // ���� ���� �Է�
		String n[]={"����","����","����"};
		for(int i=0;i<x.length;i++){ 
			System.out.print((i+1)+"�� �л����� �Է��ϼ���");
			x[i]=new int[Integer.parseInt(in.readLine())][6];
		}
	     
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				for(int k=0;k<3;k++){
					System.out.print((i+1)+"��"+(j+1)+"��° �л���"+n[k]+"������ �Է��ϼ���");
					x[i][j][k]=Integer.parseInt(in.readLine());
					x[i][j][3]+=x[i][j][k]; //3�� ���� 4�� �ݼ��� 5�� ��������
					x[i][j][4]=1;
					x[i][j][5]=1;
				}
				
			}
		}
		
                //�������
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
		//�ݵ�� 
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
				System.out.println("����:"+x[i][j][3]);
				System.out.println("���:"+(float)x[i][j][3]/3.0f);
				System.out.println("�������:"+x[i][j][4]);
				System.out.println("�ݵ��:"+x[i][j][5]);
				System.out.println();
			}
			
		}
	
	
	}
}
