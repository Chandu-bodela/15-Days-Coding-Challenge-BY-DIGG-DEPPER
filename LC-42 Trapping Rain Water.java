class Solution {
    public int trap(int[] height) {
      int left=0,right=height.length-1 ;
      int leftMax=0,rightMax=0,water=0;
      while(left<right){
        if(height[left]<height[right]){

        
        if(height[left]>=leftMax){
            leftMax=height[left];
        }else{
            water+=leftMax-height[left];

        }left++;

      } else{
        if(height[right]>=rightMax){
            rightMax=height[right];
        }else{
            water+=rightMax-height[right];
        }right--;
      }
      }
      return water;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int height[]=new int[100];
        for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        int res=sol.trap(height);
        System.out.println(res);
    }
}
