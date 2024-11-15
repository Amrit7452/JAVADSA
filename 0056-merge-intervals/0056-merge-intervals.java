class Solution {
     public int[][] merge(int[][] intervals) {
    // Sort the intervals by starting time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    // Initialize a list to hold merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();
    
    // Start with the first interval
    int[] currentInterval = intervals[0];
    mergedIntervals.add(currentInterval);
    
    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];
        
        if (currentEnd >= nextStart) {
            // Overlapping intervals, merge them
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            // Non-overlapping interval, add it to the list
            currentInterval = interval;
            mergedIntervals.add(currentInterval);
        }
    }
    
    // Convert list to an array
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}

}