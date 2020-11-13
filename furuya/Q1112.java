import java.util.*;
public class Q1112{
	public static void main(String[] args){	
		
		//配列を生成
		String ans[] = new String[5];
		
		//配列に格納
		for(int i=0;i<5;i++){
			System.out.print(i + 1 + "つ目＞");
			String ans0 = new Scanner(System.in).nextLine();
			ans[i] = ans0;
		}

		//シャッフル
		for (int i = 0; i < ans.length;i++) {
    	int rnd = new java.util.Random().nextInt(ans.length);
    	String temp = ans[ i ];
    	ans[ i ] = ans[ rnd ];
    	ans[ rnd ] = temp;
		}
    
		//出力
		System.out.println("私の好きなことは");
		int rnd2 = new Random().nextInt(4)+1;
		for(int i=0;i<rnd2;i++){
			System.out.print("[" + ans[i]+"]");
		}		
		System.out.println("です");
	
	}	
}
