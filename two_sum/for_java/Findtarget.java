package two_add;
import java.util.HashMap;
import java.util.Map;

public class Findtarget {
	 public int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++){
	            map.put(nums[i],i);
	        }
	        for (int i = 0; i < nums.length;i++){
	            int ans = target - nums[i];
	            if (map.containsKey(ans) && map.get(ans) != i){
	                return new int[]{i,map.get(ans)};
	            }
	        }
	        return null;
	 }

}
