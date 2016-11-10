import java.io.*;
public class Round08_Ex10 {
public static void main(String  ar[]) throws IOException {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int x[]=new int[5];
	
	for(int i=0;i<5;i++){
		System.out.print("숫자를 입력하세요");
		x[i]=Integer.parseInt(in.readLine());
	}
	
	for (int i=0;i<5;i++){
		for( int j=i+1;j<5;j++){
			if(x[i]<x[j]){
				int imsi=x[i];
				x[i]=x[j];
				x[j]=imsi;
			}
			
		}
	}
	for (int i=0;i<5;i++){
	System.out.println(x[i]);
	}
	
	
}
}
