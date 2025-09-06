class Solution {
    public int climbStairs(int n) {
      if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;  
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        int res=sol.climbStairs(n);
        System.out.println(res);
    }
}
