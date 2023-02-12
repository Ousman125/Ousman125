class Solution {
    public int unequalTriplets(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int x:nums) map.put(x,map.getOrDefault(x,0)+1);
       int res = 0;
        int left = 0, right = nums.length;
       for(int x:map.values()){
            right -=x;
            res += left * x * right;
            left += x;
      }
      return res;
    }
}
