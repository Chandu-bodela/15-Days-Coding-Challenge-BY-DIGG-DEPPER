import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            current_sum=Math.max(nums[i],current_sum+nums[i]);
            max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int nums[]=new int[100];
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            
        }
        Solution sol=new Solution();
        int larSum=sol.maxSubArray(nums);
        System.out.println(larSum);
    }
}
