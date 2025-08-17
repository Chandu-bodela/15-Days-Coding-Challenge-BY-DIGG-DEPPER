class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target) 
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }return l;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int[] nums=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();

        }
        int target=sc.nextInt();
        Solution sol=new Solution();
        int res=sol.searchInsert(nums,target);
        System.out.println(res);
    }
}
