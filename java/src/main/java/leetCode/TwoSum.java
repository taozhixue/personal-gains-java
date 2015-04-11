package leetCode;

import java.util.HashMap;


public class TwoSum {
	
	public static void main(String[] args) {
		int[] A=new int[]{2,7,9,11};
		int[] i=twoSum(A,9);
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
	}
	public static int[] twoSum(int[] numbers,int target){
		HashMap<Integer, Integer> ht=new HashMap<Integer, Integer>();
		 int[] ret = new int[2]; 
	        for(int i=0; i<numbers.length; i++){ 
	            if(ht.get(target-numbers[i]) != null){ 
	                ret[0] = ht.get(target-numbers[i]) + 1; 
	                ret[1] = i+1; 
	            }else{ 
	                ht.put(numbers[i], i); 
	            } 
	        } 
	        return ret;  
				
			
		
	}
}
