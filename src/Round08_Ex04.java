import java.io.*;
public class Round08_Ex04 {
	public static void main(String ar[])throws IOException{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	
	String subn[]=new String[3];
	int sub[]=new int[4];
	float av;
	
	System.out.println("������� 3�� �Է��ϼ���");
	
	for(int i=0;i<subn.length;i++){
		System.out.print("�����=");
		subn[i]=in.readLine();
		
	}
	
	System.out.println("���������� 3�� �Է��ϼ���");
	for(int i=0;i<sub.length-1;i++){
		System.out.print(subn[i]+"=");
		sub[i]=Integer.parseInt(in.readLine());
		sub[3]+=sub[i];
		
	}
	
      av=sub[3]/3.0f;
      
      for(int i=0;i<subn.length;i++){
  		System.out.println(subn[i]+"="+sub[i]);
      }
      System.out.println("����="+sub[sub.length-1]);
      System.out.println("���="+av);
      
	
	}
	

}
