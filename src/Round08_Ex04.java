import java.io.*;
public class Round08_Ex04 {
	public static void main(String ar[])throws IOException{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	
	String subn[]=new String[3];
	int sub[]=new int[4];
	float av;
	
	System.out.println("과목명을 3개 입력하세요");
	
	for(int i=0;i<subn.length;i++){
		System.out.print("과목명=");
		subn[i]=in.readLine();
		
	}
	
	System.out.println("과목점수을 3개 입력하세요");
	for(int i=0;i<sub.length-1;i++){
		System.out.print(subn[i]+"=");
		sub[i]=Integer.parseInt(in.readLine());
		sub[3]+=sub[i];
		
	}
	
      av=sub[3]/3.0f;
      
      for(int i=0;i<subn.length;i++){
  		System.out.println(subn[i]+"="+sub[i]);
      }
      System.out.println("총합="+sub[sub.length-1]);
      System.out.println("평균="+av);
      
	
	}
	

}
