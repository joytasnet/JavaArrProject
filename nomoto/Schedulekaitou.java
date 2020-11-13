import java.util.*;
public class Schedule{
	public static void main(String[] args){
		//文字形の要素を７個作る
		String[] schedule=new String[7];
		//宣言と同時に月から日までの７個分の文字列を代入
		String[] dayWeek={"月","火","水","木","金","土","日"};
		//schedule=7個の要素なので7回回す
		for(int i=0;i<schedule.length;i++){
		// %s=String　dayWeek0~6を順番に出力
		System.out.printf("%s曜日の予定は>",dayWeek[i]);
		//ここで予定を入力
		schedule[i]=new Scanner(System.in).nextLine();
		}
		//改行
		System.out.println();
		//例文
		System.out.print("何曜日の予定が知りたいです(例：木)>");
		//曜日を入力して改行　文字を入力するための変数
		String day=new Scanner(System.in).nextLine();
		for(int i=0;i<dayWeek.length;i++){
			if(day .equals(dayWeek[i])){
				System.out.printf("%s曜日の予定は%sです。%n",day,schedule[i]);
			}
		}
			System.out.println();
	}
}
