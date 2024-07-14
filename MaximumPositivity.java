// Given an array of integers A, of size N.

// Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

// NOTE: It is guaranteed that an answer always exists.

// Input 1:

 // A = [5, 6, -1, 7, 8]
// Output:-[5, 6]

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

    ArrayList<Integer> res=new ArrayList<>();

    for(int i=0;i<A.size();i++){
        if(A.get(i)<0)
            continue;
        else{
            ArrayList<Integer> temp=new ArrayList<>();
            while(i<A.size() && A.get(i)>0){
                temp.add(A.get(i));
                i++;
            }
            if(temp.size()>res.size())
                res=temp;
        }
    }
    return res;
 
    }
}
        
      
