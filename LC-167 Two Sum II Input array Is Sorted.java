class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1=0;
        int p2=numbers.length-1;
        int s=0;
        while(p1<p2){
            s=numbers[p1]+numbers[p2];
            if(s==target){
                return new int []{p1+1,p2+1};

            }else if(s>target){
                p2-=1;
            }else{
                p1+=1;
            }
        }return new int[]{};
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number[]=new int[100];
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution sol=new Solution();
        int[] res=sol.twoSum(number,target);
        System.out.println(res);


    }
}
