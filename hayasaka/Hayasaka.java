import java.util.*;
public class Hayasaka{
	public static void main(String[] args){
		System.out.print("整数を入力>");
		int times=new Scanner(System.in).nextInt();
		int[] nums=new int[time];
		int sum=0;
		for (int i=0;i<nums.length;i++){
			nums[i]=new Random().nextInt(100)+1;
			sum+=nums[i];
		}
		System.out.println(Arrays.toString(nums));
		for (int i=0;i<nums.length;i++){
			for (int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.printf("合計:%d%n",sum);
		System.out.printf("平均:%d%n",sum/times);
	}
}
