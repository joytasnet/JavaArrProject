import java.util.*;
public class fujimuraQ{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		final int Balls_Num=99;
		int[] balls=new int[Balls_Num];
		int[] hit=new int [num];
		String[] p=new String[num];
		for(int i=0;i<Balls_Num;i++){
			balls[i]=i+1;
		}
		for(int i=0;i<balls.length;i++){
			int index=new Random().nextInt(balls.length-i);
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
		for(int i=0;i<num;i++){
			System.out.printf("%d人目の名前>",i+1);
			String name=new Scanner(System.in).nextLine();
			p[i]=name;
			hit[i]=balls[i];
			System.out.printf("%sさんの点数:%d点",name,balls[i]);
			System.out.println();
			System.out.println("");
		}
		for(int i=0;i<hit.length;i++){
			for(int j=i+1;j<hit.length;j++){
				if(hit[i] < hit[j]){
					int temp=hit[i];
					String temp2=p[i];
					hit[i]=hit[j];
					p[i]=p[j];
					hit[j]=temp;
					p[j]=temp2;
				}
			}
					System.out.printf("%d位:%d点:%sさん%n",i+1,hit[i],p[i]);
		}
	}
}

