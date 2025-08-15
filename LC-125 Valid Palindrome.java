class Solution {
    public boolean isPalindrome(String s) {
        char[] chs=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(chs[l])){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(chs[r])){
                r--;
                continue;

            }
            if(Character.toLowerCase(chs[l])!=Character.toLowerCase(chs[r])){
                return false;
            }
            else
            l++;
            r--;

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution sol=new Solution();
        boolean result=sol.isPalindrome(s);
        System.out.println(result);
    }
}
