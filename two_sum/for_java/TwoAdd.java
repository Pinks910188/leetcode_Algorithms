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
			System.out.println("�п�J�Ʀr�A0�N�����I");
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
		System.out.println("�п�Jtarget");
		int target = scanner.nextInt();
		
		Findtarget findtarget = new Findtarget();
		
		ans = findtarget.twoSum(givearr,target);
		for (int i = 0; i < givearr.length;i++) {
			System.out.printf("%d  ",givearr[i]);
		}
		System.out.printf("\n�A��J����%d�ӼƦr �P ��%d�ӼƦr�[�_�Ӭ��A��target",ans[0]+1,ans[1]+1);

	}

}
