import java.io.*;
public class Round08_Ex06 {
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int x[]=new int[14];
		int hap=0;
		System.out.println("주민등록번호를 입력해보세요!");
		
		for(int i=0;i<x.length;i++){
			
			x[i]=System.in.read()-48;
		}
		in.readLine();
		
		for(int i=0,s=2;i<x.length-1;i++){
			
			if(i==6)continue;
			hap+=x[i]*s;
			s++;
			if(s==10)s=2;
					
		}
		
		float temp=(int)(hap/11.0f)*11.0f+11.0f-hap;
		float temp1=temp-(int)(temp/10.0f)*10.0f;
		
		if(temp1==x[x.length-1]){
			System.out.println("너 주민번호는 맞구나");
		} else {
			System.out.println("너 거짓말 쟁이지");
		}
		for(int i=0;i<x.length;i++){
			System.out.print((char)(x[i]+48));
		}
		System.out.println();
	
		}
	
	

}
