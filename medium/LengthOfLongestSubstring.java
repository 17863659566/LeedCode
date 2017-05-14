package medium;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	static int[] length = new int[1024];
	static String s2[] = new String[1024];

	public static void main(String[] args) {
		int max = lengthOfLongestSubstring("aab");
		System.out.println(max);
	}

	 public static int lengthOfLongestSubstring(String s) {
	        Set<Character> set = new HashSet<Character>();
	        int i = 0,j = 0;
	        int ans = 0;
	        int n = s.length();
	        while(i < n && j < n){
	        	if(!set.contains(s.charAt(j))){
	        		set.add(s.charAt(j++));
	        		ans = Math.max(ans, j - i);
	        	}else{
	        		set.remove(s.charAt(i++));
	        	}
	        }
	        return ans;
	    }

	    

}
