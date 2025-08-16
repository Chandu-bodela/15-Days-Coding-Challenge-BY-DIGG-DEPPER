class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int start=0;start<nums.length;start++){
            int sum=0;
            for(int end=start;end<nums.length;end++){
                sum+=nums[end];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Solution sol=new Solution();
        int result=sol.subarraySum(nums,k);
        System.out.println(result);
    }

}
