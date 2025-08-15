class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] newArr=new int[nums.length];
        int[] prefix=new int[nums.length];
        int[] suffix=new int [nums.length];
        prefix[0]=1;
        int  n=nums.length;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];

        }
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            newArr[i]=prefix[i]*suffix[i];
        }
        return newArr;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();

        }
        Solution sol=new Solution();
        int[] result=sol.productExceptSelf(nums);
        System.out.println(result);

    }
}
