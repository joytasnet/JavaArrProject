import java.util.*;
public class fujimuraQ{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		final int balls_Num=99;
		int[] balls=new int[balls_Num];
		int[] score=new int [num];
		String[] player=new String[num];
		for(int i=0;i<balls_Num;i++){
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
			player[i]=name;
			score[i]=balls[i];
			System.out.printf("%sさんの点数:%d点%n",name,balls[i]);
			System.out.println();
		}
		for(int i=0;i<score.length;i++){
			for(int j=i+1;j<score.length;j++){
				if(score[i] < score[j]){
					int temp=score[i];
					String temp2=player[i];
					score[i]=score[j];
					player[i]=player[j];
					score[j]=temp;
					player[j]=temp2;
				}
			}
					System.out.printf("%d位:%d点:%sさん%n",i+1,score[i],player[i]);
					//pullreq出来なかったので文字追加
		}
	}
}

