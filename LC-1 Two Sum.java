import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                }            
                }
            
        }
        return new int[]{-1,-1};

        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

    int[] nums=new int[10];
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    Solution s=new Solution();
    int[] res=s.twoSum(nums,target);
    if(res[0]!=0){
        System.out.print("["+res[0]+","+res[1]+"]");
    }
    
    }
}
