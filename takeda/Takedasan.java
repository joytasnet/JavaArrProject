import java.util.*;
public class Takedasan{
	public static void main(String[] args){
		int[] numsA=new int[10];
		int[] numsB=new int[10];
		int index;
		int count=0;
		boolean a=false;
		for(int i=0;i<numsA.length;i++){
			int num=new Random().nextInt(6);
			numsA[i]=num;
		}
		System.out.println(Arrays.toString(numsA));
		for(int i=0;i<numsB.length;i++){
			int num1=new Random().nextInt(6);
			numsB[i]=num1;
		}
		System.out.println(Arrays.toString(numsB));
		for(int i=0;i<numsA.length;i++){
			if(numsA[i] == numsB[i]){
				count++;
				index=i;
				System.out.printf("[%d],",i);
				a=true;
			}
		}
		if(a == false){
			System.out.println("一致するindexはありませんでした。");
		}else{
		System.out.printf("の合計%dつが一致しています。%n",count);
		}
	}
}
