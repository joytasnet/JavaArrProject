import java.util.*;
public class Dive{
	public static void main(String[] args){
		//飛んでからの経過秒t
		System.out.print("飛んでから何秒後？>");
		int t=new java.util.Scanner(System.in).nextInt();
		int[] jikansuii=new int[t];
		double[] kyorisuii=new double[t];
		for(int i=0;i<t;i++){
		jikansuii[i]=(i+1)*9;
		kyorisuii[i]=(i+1)*(i+1)*9/2.0;	
}	
			System.out.print("飛んでから"+t+"秒後までの1秒毎の速度推移は"+Arrays.toString(jikansuii));
			//suii[]=**9/2;
			System.out.print("飛んでから"+t+"秒後までの1秒毎の飛行機からの距離推移は"+Arrays.toString(kyorisuii));
	}
}

