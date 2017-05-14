package easy;

/**
 * 找不同
 * 	主要思路：
 * 		思路一：如果两个数据的二进制位数不同，那么首先拼成一个长度相同的，然后比较
 * 		思路二：从后往前比较，先比较有位数的，然后加上没有位数的长度，应该也能得到最终结果
 * 	从时间复杂度上来说，没有区别，因为没有循环嵌套都是T(n) = θ(n)
 * @author young
 *
 */
public class HarmingDistance {

	public static void main(String[] args) {
		int count = hammingDistance(1,4);
		System.out.println(count);
	}

	public static int hammingDistance(int x, int y) {
			String x1 = Integer.toBinaryString(x);
			String x2 = Integer.toBinaryString(y);
			int count = 0;
			int ans = 0;
			if(x1.length() >= x2.length()){
				ans = x1.length() - x2.length();
				x2 = geiZero(x2,ans);
			}else{
				ans = x2.length() - x1.length();
				x1 = geiZero(x1,ans);
			}
			System.out.println(x1 + " -- " + x2);
			for(int i = 0; i < x1.length();i++){
				if(x1.charAt(i) != x2.charAt(i))
					count++;
			}
			return count;
			
	}

	private static String geiZero(String x2, int ans) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0;i < ans;i++){
			stringBuffer.append("0");
		}
		
		return stringBuffer.append(x2).toString();
	}

}
