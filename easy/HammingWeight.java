package easy;

/**
 * 找出一个二进制数据中的所有的1 主要思路，可以使用位运算，n
 * 
 * @author young
 *
 */
public class HammingWeight {

	public static void main(String[] args) {
		int i = hammingWeight(11);
		System.out.println(i);
	}

	public static int hammingWeight(int n) {
		int count = 0;
		String nS = Integer.toBinaryString(n);
		int length = nS.length();
		
		String zeros = geiZero(length);
		System.out.println(nS + " -- " +zeros);
		for(int i = 0; i < length;i++){
			if(zeros.charAt(i) != nS.charAt(i))
				count++;
		}
		
		return count;
		
	}
	
	private static String geiZero(int ans) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0;i < ans;i++){
			stringBuffer.append("0");
		}
		
		return stringBuffer.toString();
	}

}
