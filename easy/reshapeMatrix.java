package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 根据要求，重构矩阵的规格
 * 	思路
 * 		1. 获取矩阵中的所有数据组成一个集合，并获取集合的大小
 * 		2. 根据集合的大小和r*c的值来判断是不是可以重新组成矩阵，如果可以走3，否则返回原数组
 * 		3. 根据要求重新建立数组
 * @author young
 *
 */
public class reshapeMatrix {

	public static void main(String[] args) {
     int[][] array = new int[][]{
    	  {1,2},
    	  {3,4}
      };
      int[][] reshape = matrixReshape(array,1,5);
      for(int i = 0;i < reshape.length;i++)
    	  for(int j = 0;j < reshape[i].length;j++){
    		  System.out.println(reshape[i][j]);
    	  }
      
	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i < nums.length;i++){
			for(int j = 0;j < nums[i].length;j++){
				arrayList.add(nums[i][j]);
				count ++;
			}
		}
		
		if(count < r * c){
			return nums;
		}
		
		
		int[][] array = new int[r][c];
		int temp = -c;
		for(int i = 0;i < r;i++){
			temp += c;
			for(int j = 0; j < c;j++){
				array[i][j] = arrayList.get(j + temp);
			}
		}
		
		return array;
		
	}


}
