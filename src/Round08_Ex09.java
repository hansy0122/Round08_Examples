import java.io.*;
public class Round08_Ex09 {
	public static void main(String ar[]) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x[]=new int[13];
		System.out.println("태어난 년:");
			int a=System.in.read()-48;
			int b=System.in.read()-48;
			x[0]=System.in.read()-48;
			x[1]=System.in.read()-48;
			in.readLine();
		System.out.println("태어난 월:");
		x[2]=System.in.read()-48;
		x[3]=System.in.read()-48;
		in.readLine();
		System.out.println("태어난 일:");
		x[4]=System.in.read()-48;
		x[5]=System.in.read()-48;
		in.readLine();
		System.out.println("태어난 지역:");
		x[7]=System.in.read()-48;
		in.readLine();
		System.out.println("성별:");
		x[6]=System.in.read()-48;
		in.readLine();
		
		for(int i=8;i<x.length-1;i++){
			x[i]=0;
		}
		
		
		if(a==1){
		switch(b){
		case(8): x[6]= (x[6]==0 ? 9:0); break;
		case(9): x[6]= (x[6]==0 ? 1:2); break;
		}
		}
		else if(a==2)
		 x[6]= (x[6]==0 ? 3:4); 
		
		// 90 12 34 
		
		
	   int hap=0,cre=2;
	   for(int i=0;i<x.length-1;i++){
		   hap+=x[i]*cre;
		   cre++;
		   if(cre==10)cre=2;
		   
	   }
	   
	   float temp=(int)(hap/11.0f)*11.0f+11.0f-hap;
	   float temp1=temp-(int)(temp/10.0f)*10.0f;
	   x[x.length-1]=(int)temp1;
	   
		
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]);
			if(i==5)System.out.println("-");
		}
		

	
		
		
		
	}
}
