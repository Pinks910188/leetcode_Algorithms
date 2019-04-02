package two_add;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoAdd {

	public static void main(String[] args) {
		int[] ans = new int[1];
		ArrayList<Integer>arr = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		int temp;
		while(true) {
			System.out.println("請輸入數字，0代表結束！");
			temp = scanner.nextInt();
			if ( 0 != temp ) {
				arr.add(temp);
			}
			else {
				break;
			}
		}
		int[] givearr = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			givearr[i] = arr.get(i);
		}
		System.out.println("請輸入target");
		int target = scanner.nextInt();
		
		Findtarget findtarget = new Findtarget();
		
		ans = findtarget.twoSum(givearr,target);
		for (int i = 0; i < givearr.length;i++) {
			System.out.printf("%d  ",givearr[i]);
		}
		System.out.printf("\n你輸入的第%d個數字 與 第%d個數字加起來為你的target",ans[0]+1,ans[1]+1);

	}

}
