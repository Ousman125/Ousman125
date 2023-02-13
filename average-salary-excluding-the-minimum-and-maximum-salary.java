class Solution {
    public double average(int[] salary) {
        int n=salary.length;int sum=0;
        Arrays.sort(salary);
        for(int i=1;i<n-1;i++)
        sum+=salary[i];
        return sum*1d/(n-2);
    }
}
