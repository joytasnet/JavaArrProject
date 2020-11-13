import java.util.*;
 public class MakeQ{
	 public static void main(String[] args){
     String[] when = new String[]{"昨夜未明、","10年前、","今夜","年明けに"};
     String[] who = new String[]{"私が","おじいさんが","50代男性が","みんなが"};
     String[] where = new String[]{"代々木公園のベンチで、","六本木駅で","映画館で","異世界で"};
     String[] what = new String[]{"一日中眠る","暴れる","踊る","怒られる"};
     int[] temp = new int[when.length];
		 for (int i = 0; i < when.length; i++){
			int ran = new Random().nextInt(when.length);
			temp[i] = ran;
		}
		System.out.println(when[temp[0]]+who[temp[1]]+where[temp[2]]+what[temp[3]]);
	}
}

