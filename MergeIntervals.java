//You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).

//You may assume that the intervals were initially sorted according to their start times.

// Given intervals [1, 3], [6, 9] insert and merge [2, 5] .Output [ [1, 5], [6, 9] ]

// Given intervals [1, 3], [6, 9] insert and merge [2, 6] . Output  [ [1, 9] ]

// ---------------------------------------------------------------------------------------------------------------------------------------

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res=new ArrayList<Interval>();
        for(int i=0;i<intervals.size();i++){
            boolean isOverlapping=Math.max(intervals.get(i).start,newInterval.start)<=Math.min(intervals.get(i).end,newInterval.end);
            if(isOverlapping){
                newInterval=new Interval(Math.min(intervals.get(i).start,newInterval.start),Math.max(intervals.get(i).end,newInterval.end));             
            }else{
                if(newInterval.end<intervals.get(i).start){
                    res.add(newInterval);
                    res.addAll(intervals.subList(i,intervals.size()));
                    
                    return res;
                }else{
                    res.add(intervals.get(i));
                }
            }
        }
        res.add(newInterval);
        return res;
    }
}
