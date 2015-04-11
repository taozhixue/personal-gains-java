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
		
		//�Ƴ�ָ��Ԫ�� removeElement(A,10,1);
		//�����б�ȥ���ظ�Ԫ�� removeDuplicates1(B,8);    
		//�����б�����ظ����� removeDuplicates2(B,8);
		//��˹������ generate(5);
		//��˹�����ǵ����� getRow(5);*/
		//�ϲ����������б� merge(C,6,B,8);
	    
	}
	/**
	 * Given an array and a value, remove all instances of that > value in place and return the new length.
		The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	 	˼·������Ҫɾ��������ļ��� �����ڵ�ʱ��ֵ  �����±�����  Ȼ���ͼ����
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
	 *  ˼·����һ����������һ����ʱ�� ��ֵ �����±�����   ��ͼ����
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
		˼·����һ����������һ����ʱ���ҳ��ִ���num>2 ���� �����±�����   ���� ��ֵ    ��ͼ����
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
		��k����k��Ԫ��
		ÿ���һ���Լ����һ��Ԫ��ֵΪ1
		���ڵ�k��k > 2�����n��n > 1 && n < k����Ԫ��A[k][n]��A[k][n] = A[k-1][n-1] + A[k-1][n]
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
	     * 014641    just���
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
	        rs.add(1);  //��һ������  
	        for(int i=1; i<=rowIndex-1; i++){ //2-rowIndex ������
	            rs.add(0,1); // ��һ����Զ��1
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
