import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
        return i+1;
        
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[25];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int res=s.removeDuplicates(nums);
        
        
        for(int i=0;i<res;i++){
            System.out.print("nums = "+nums[i]);
        }
        
    }
}
