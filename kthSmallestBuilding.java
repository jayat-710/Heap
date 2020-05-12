//We can use sorting in this question which will take O(nlogn) time but if we use heap than it will take O(nlogk) time.


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++){
	     arr[i]=sc.nextInt();
	 }
		int k=sc.nextInt();
	 System.out.println(kthSmallestBuilding(arr,n,k));
	}
	
	static int kthSmallestBuilding(int arr[],int n,int k){
	    
	    PriorityQueue<Integer> maxh = new PriorityQueue<Integer>(Collections.reverseOrder());
	    
	    for(int i:arr){
	        maxh.add(i);
	        
	        if(maxh.size()>k){
	            maxh.remove();
	        }
	    }
	    
	    return maxh.peek();
	}
}
