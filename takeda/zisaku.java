/*★★★成績低い人ランキング～★★★(点数だけを表示させます～)
 ★人数を入力しそれぞれに点数をつけ成績の低い順に並べてください★
　
[実行例]
何人ですか~ >5
1人目の点数>50
1人目の点数>2
1人目の点数>10
1人目の点数>98
[2,10,47,50,98]
*/
import java.util.*;
public class zisaku{
	public static void main(String[] args){
		System.out.println("何人ですか~ >");
		int num =new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		for(int i=0;i<nums.length;i++){
			System.out.println((i+1)+"人目の点数>");
			nums[i]=new Scanner(System.in).nextInt();
		}
		System.out.println("★★★成績の低い順に並べてください★★★");
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
