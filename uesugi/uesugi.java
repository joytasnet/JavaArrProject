import java.util.*;
 public class uesugi{
	 public static void main(String[] args){
		 String[] items = {"いつ","誰が","どこで","何をした",};
		 String[][] data = new String[items.length][];
		 for(int i = 0; i < data.length; i++){
			 System.out.printf("%sはいくつ>",items[i]);
			 int count = new Scanner(System.in).nextInt();
			 data[i] = new String[count];
			 for(int j = 0; j < data[i].length; j++){
				 System.out.printf("%sをいれて>",items[i]);
				 data[i][j] = new Scanner(System.in).nextLine();
			 }
		 }
		 String[] seps = {"、","が、","で、","。",};
		 for(int i = 0; i < data.length; i++){
				 int index = new Random().nextInt(data[i].length);
				 System.out.print(data[i][index]+seps[i]);
			 }
			 System.out.println();
	}
}

