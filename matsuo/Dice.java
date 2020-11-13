import java.util.*;
public class Dice{
	public static void main(String[] args){
		System.out.print("何回サイコロを振る?>");
		int nums=new Scanner(System.in).nextInt();
		int[] dice=new int[nums];
		for(int i=0;i<dice.length;i++){
			dice[i]=new Random().nextInt(6)+1;
		}
		for(int i=0;i<dice.length-1;i++){
			for(int j=i+1;j<dice.length;j++){
				if(dice[i] > dice[j]){
					int temp=dice[i];
					dice[i]=dice[j];
					dice[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(dice));
	}
}
