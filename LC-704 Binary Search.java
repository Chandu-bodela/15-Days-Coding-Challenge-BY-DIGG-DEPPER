class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
        
    

        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution sol=new Solution();
        int res=sol.search(nums,target);
        System.out.println(res);
    }
}
