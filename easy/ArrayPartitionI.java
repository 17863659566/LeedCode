package easy;

/**
 * 主要思路：
 * 	1.进行排序，以保证每一组的最小值都是最大的，这样得到的结果也是最大的
 * @author young
 *
 */
public class ArrayPartitionI {

	public static void main(String[] args) {
		int[] array = new int[]{1,4,3,2};
		int count = arrayPairSum(array);
		System.out.println(count);
	}
	
	public static int arrayPairSum(int[] nums) {
        int[] sortArray = sortArray(nums);
        int count = 0;
        for(int i = 0;i < sortArray.length;i+=2){
        	count += sortArray[i];
        }
        
        return count;
    }


	private static int[] sortArray(int[] nums) {
		
		quickSort(nums,0,nums.length - 1);
		
		
		
		return nums;
	}

	private static void quickSort(int[] nums, int p, int q) {
		
		if(p < q){
			int r = partition(nums,p,q);
			quickSort(nums, p, r - 1);
			quickSort(nums, r + 1, q);
		}
		
	}

	private static int partition(int[] nums, int p, int q) {
		int x = nums[p];
		int i = p;
		for(int j = i + 1;j <= q;j++){
			if(nums[j] <= x){
				i++;
				swap(nums,i,j);
			}
		}
		
		swap(nums,p,i);
		return i;
	}

	private static void swap(int[] nums, int p, int i) {
		int temp = nums[p];
		nums[p] = nums[i];
		nums[i] = temp;
	}

}
