class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
        return false;
     }   
     char[] chars1=s.toCharArray();
     char[] chars2=t.toCharArray();
     Arrays.sort(chars1);
     Arrays.sort(chars2);
     return Arrays.equals(chars1,chars2);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        Solution sol=new Solution();
        boolean result=sol.isAnagram(s,t);
        System.out.println(result);

    }
}
