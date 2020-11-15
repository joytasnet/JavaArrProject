import java.util.*;
public class Ans{
  public static void main(String[] args){
    //要素数の入力、配列の作成
    System.out.print("要素数を入力>");
    int element=new Scanner(System.in).nextInt();
    int[] nums=new int[element];
    //カウントする値、カウント数
    int[] target={1,7,17};
    int[] count={0,0,0};
    //乱数作成の繰り返し
    for(int i=0;i<nums.length;i++){
      int rand=new Random().nextInt(20)+1;
      //targetの値以外は０に
      rand = rand==target[0]||rand==target[1]||rand==target[2]?rand:0;
      //配列に格納
      nums[i]=rand;
      //それぞれ何回出たかカウント
      for(int j=0;j<target.length;j++){
        if(nums[i]==target[j]){
          count[j]++;
        }
      }
    }
    //numsに格納された値を出力
    System.out.println(Arrays.toString(nums));
    for(int i=0;i<count.length;i++){
      //求める値が出なかった場合
      if(count[i]==0){
        System.out.printf("%dは出ませんでした。%n",target[i]);
      //求める値が出ていたら
      }else{
        System.out.printf("%dは%d回出ました。%n",target[i],count[i]);
      }
    }
  }
}
