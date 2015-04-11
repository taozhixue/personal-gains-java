package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	 
	//Time Limit Exceeded
	 /*public int lengthOfLongestSubstring(String s) {
	       Set<Character> set=new HashSet<Character>(); 
	       int max=0;
	       for(int i=0;i<s.length();i++){
	    	   if(!set.contains(s.charAt(i))){
	    		   set.add(s.charAt(i));
	    	   }else{
	    		   i=i-set.size()+1;
	    		   max=set.size();
	    		   set.clear();
	    	   }
	       }
	       if(max>set.size())
	    	   return max;
	       else
	    	   return set.size();
	 }*/
	 
	//Time Limit Exceeded
	 /*public static int lengthOfLongestSubstring(String s) {
		    char[] arr = s.toCharArray();
			int pre = 0;
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 
			for (int i = 0; i < arr.length; i++) {
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], i);
				} else {
					pre = Math.max(pre, map.size());
					i = map.get(arr[i]);
					map.clear();
				}
			}
		 
			return Math.max(pre, map.size());
	 }*/
	 
	public static int lengthOfLongestSubstring(String s) {
	boolean[] flag = new boolean[256];
	int result = 0;
	int start = 0;
	char[] arr = s.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		char current = arr[i];
		if (flag[current]) {
			result = Math.max(result, i - start);
			for (int k = start; k < i; k++) {
				if (arr[k] == current) {
					start = k + 1; 
					break;
				}
				flag[arr[k]] = false;
			}
		} else {
			flag[current] = true;
		}
	}
		result = Math.max(arr.length - start, result);
		return result;
	 }
	 public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("cddabcdefgsafdg"));
	}
}
