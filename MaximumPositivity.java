// Given an array of integers A, of size N.

// Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

// NOTE: It is guaranteed that an answer always exists.

// Input 1:

 // A = [5, 6, -1, 7, 8]
// Output:-[5, 6]

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int maxLength=Integer.MIN_VALUE;
        if(A.size()==1){
            return 0;
        }
        int i=0,j=i+1;
        int start=0,end=0;
        while(i<A.size() && j<A.size()){
            if(A.get(j)<0){
                if(j-1-i+1>maxLength){
                    maxLength=j-1-i+1;
                    start=i;
                    end=j-1;
                    i=j+1;
                }
            }
            
            j++;
        }
    }
}
