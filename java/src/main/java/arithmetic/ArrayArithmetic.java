package arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ArrayArithmetic {
	
	public static void main(String[] args) {
		int A[]=new int[]{1,1,2,3,1,4,5,1,6,1};
		int B[]=new int[]{1,2,2,4,4,5,5,5};
		int C[]=new int[16];
		C[0]=0;
		C[1]=1;
		C[2]=2;
		C[3]=3;
		C[4]=4;
		C[5]=5;
		
		//移除指定元素 removeElement(A,10,1);
		//有序列表去除重复元素 removeDuplicates1(B,8);    
		//有序列表最多重复二次 removeDuplicates2(B,8);
		//帕斯卡三角 generate(5);
		//帕斯卡三角第五行 getRow(5);*/
		//合并二个有序列表 merge(C,6,B,8);
	    
	}
	/**
	 * Given an array and a value, remove all instances of that > value in place and return the new length.
		The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	 	思路：等于要删除这个数的继续 不等于的时候赋值  并且下标增加  然后截图数组
	 */
	public static int[] removeElement(int A[], int n, int elem) {
	        int i = 0;
	        int j = 0;
	        for(i = 0; i < n; i++) {
	            if(A[i] == elem) {
	                continue;
	            }
	            A[j] = A[i];
	            j++;
	        }
	        return  Arrays.copyOf(A, j);
	}
	
	/**
	 * Given a sorted array, remove the duplicates in place such that > each element appear 
	 * only once and return the new length.
	 *	Do not allocate extra space for another array, you must do this in place with constant memory.
	 *	For example, Given input array A = [1,1,2],
	 *	Your function should return length = 2, and A is now [1,2].
	 *  思路：下一个不等于上一个的时候 赋值 并且下标增加   截图数组
	 */
	public static int[] removeDuplicates1(int A[], int n) {
	        if(n == 0) {
	            return new int[0];
	        }
	        int j = 0;
	        for(int i = 1; i < n; i++) {
	            if(A[j] != A[i]) {
	                A[++j] = A[i];
	            }
	        }
	        return  Arrays.copyOf(A, j+1);
	}
	
	
	/**
	 * Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
		For example, Given sorted array A = [1,1,1,2,2,3],
		Your function should return length = 5, and A is now [1,1,2,2,3].
		思路：下一个不等于上一个的时候并且出现次数num>2 跳过 并且下标增加   否则 赋值    截图数组
	 */
	public static int[] removeDuplicates2(int A[], int n) {
	        if(n == 0) {
	        	return new int[0];
	        }
	        int j = 0;
	        int num = 0;
	        for(int i = 1; i < n; i++) {
	            if(A[j] == A[i]) {
	                num++;
	                if(num < 2) {
	                    A[++j] = A[i];
	                }
	            } else {
	                A[++j] = A[i];
	                num = 0;
	            }
	        }
	        return  Arrays.copyOf(A, j+1);
	  }
	
	/**
	 * Given numRows, generate the first numRows of Pascal's triangle.
		For example, given numRows = 5, Return
		第k层有k个元素
		每层第一个以及最后一个元素值为1
		对于第k（k > 2）层第n（n > 1 && n < k）个元素A[k][n]，A[k][n] = A[k-1][n-1] + A[k-1][n]
		[
		     [1],
		    [1,1],
		   [1,2,1],
		  [1,3,3,1],
		 [1,4,6,4,1]
		]
	 */
	
	public static void generate(int numRows) {
	   	int[][] strs;
	   	strs=new int[numRows+1][];
	    for(int i=1;i<=numRows;i++){
	    	strs[i]=new int[i+1];
	    	for(int j=1;j<=i;j++){
	    		if(i==1||i==j){
	    			strs[i][j]=1;
	    			System.out.println(strs[i][j]);
	    		}else{
	    			strs[i][j]=strs[i-1][j-1]+strs[i-1][j];
	    			System.out.print(strs[i][j]+"\t"); 
	    		}
	    	}
	    }
	    System.out.println("--------------------");
	    for(int i=1;i<strs.length;i++){
	    	for(int j=1;j<strs[i].length;j++){
	    		 System.out.print(strs[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    /**
	     * 01
	     * 011
	     * 0121
	     * 01331
	     * 014641    just输出
	     */
	}
	
	/**
	 * Given an index k, return the kth row of the Pascal's triangle.
		For example, given k = 3, Return [1,3,3,1].
	 */
	  public static ArrayList<Integer> getRow(int rowIndex) {  
	        ArrayList<Integer> rs = new ArrayList<Integer>();  
	        if(rowIndex == 0) {  
	            rs.add(1);  
	            return rs;  
	        }  
	        rs.add(1);  //第一行数据  
	        for(int i=1; i<=rowIndex-1; i++){ //2-rowIndex 的数据
	            rs.add(0,1); // 第一个永远是1
	            for (int j=1; j<=i-1; j++){ 
	                rs.set(j, rs.get(j) + rs.get(j+1));  
	            }  
	        }  
	        for(int i=0;i<rs.size();i++){
	        	System.out.println(rs.get(i));
	        }
	        return rs;  
	    }  
	  
	  /**
	   * Given two sorted integer arrays A and B, merge B into A as one sorted array.
		Note: You may assume that A has enough space (size that is greater or equal to m + n) 
		to hold additional elements from B. The number of elements initialized in A and B are
		 m and n respectively.
		 
	   */
	  public static void merge(int A[],int m, int B[],int n) {
		  	int j = m  - 1;
	        int k = n - 1;
	        int i = m + n - 1;
	        while(i >= 0) {
	            if(j >= 0 && k >= 0) {
	                if(A[j] > B[k]) {
	                    A[i] = A[j];
	                    j--;
	                } else {
	                    A[i] = B[k];
	                    k--;
	                }
	            } else if(j >= 0) {
	                A[i] = A[j];
	                j--;
	            } else if(k >= 0) {
	                A[i] = B[k];
	                k--;
	            }
	            i--;
	        }
	        for (int l = 0; l < m+n-1; l++) {
				System.out.println(A[l]);
			}
	    }
	  
	  
}
