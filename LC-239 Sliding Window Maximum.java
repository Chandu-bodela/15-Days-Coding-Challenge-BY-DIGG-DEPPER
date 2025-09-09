class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         if (nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) res[i - k + 1] = nums[dq.peekFirst()];
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] nums = new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();

        }
        int k = sc.nextInt();
        Solution sol=new Solution();

        int[] result = sol.maxSlidingWindow(nums, k);

        System.out.println("Sliding window maximums:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
