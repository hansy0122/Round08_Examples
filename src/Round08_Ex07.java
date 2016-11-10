
public class Round08_Ex07 {
	public static void main(String ar[]){
		int a[][]={{1,2},{2,3}};
		int b[][]=new int[][]{{1,2},{3,4}};
		int c[][]=new int[3][2];
		int d[][]=new int[3][];
		
		int na[][]=new int[3][];
		na[0]=new int[6];
		na[1]=new int[4];
		na[2]=new int[3];
		
		for(int i=0;i<na[0].length;i++){
			na[0][i]=i;
		}
		
		for(int i=0;i<na[1].length;i++){
			na[1][i]=i;
		}
		
		for(int i=0;i<na[2].length;i++){
			na[2][i]=i;
		}
	
		for(int i=0;i<na[0].length;i++){
			System.out.println(na[0][i]);
		}
		for(int i=0;i<na[1].length;i++){
			System.out.println(na[1][i]);
		}
		for(int i=0;i<na[2].length;i++){
			System.out.println(na[2][i]);
	}
		char f=2;
		System.out.println(f);

}
}

