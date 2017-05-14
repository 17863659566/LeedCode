package medium;

import java.util.HashMap;

/**
 * 找出三个最接近的数，并求出最后结果 思路 这个最接近的数，要用target和这些数的差值来做衡量 1.
 * 1. 计算出target和目标数组中的所有数据的差值（除了它本身）组成一个Map集合 
 * 2. 根据差值的大小进行从小到大的顺序进行排序 
 * 3. 找出前两个差值对应的原始数据和目标数据做加法，返回这个结果
 * 		刑法是正确的，但是map集合无法使用，但是可以使用二维数组来做，需要快速排序的变种了
 * 
 * @author young
 *
 */
public class ThreeSumClosest {

	public static void main(String[] args) {

	}

	public static int threeSumClosest(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == target)
				continue;
			int diff = (target - nums[i]) > 0 ? (target - nums[i]):(nums[i] - target);
			map.put(nums[i], diff);
		}
		
		sortMap(map);
		
		return map.get(key);
		
	}

	private static void sortMap(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		
	}

}
