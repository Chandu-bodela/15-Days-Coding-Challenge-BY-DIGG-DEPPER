class Solution {
    public boolean isValid(String s) {
        Deque<Character>stack=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if((c==')'&&top!='(')||
                (c=='}'&&top!='{')||
                (c==']'&&top!='[')){
                    return false;
                }
            }
        }return stack.isEmpty();

        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution sol=new Solution();
        boolean result=sol.isValid(s);
        System.out.println(result);
    }
}
