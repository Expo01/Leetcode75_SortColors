public class Main {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
       new Solution().sortColors(nums);

    }
}

class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0; // L boundary
        int curr = 0;
        int p2 = nums.length - 1; // R index boundary = 5

       // suppose nums = [2,0,2,1,1,0]

        int tmp;
        while (curr <= p2) { // curr = 0, which is < 5.
            if (nums[curr] == 0) {
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }
            else if (nums[curr] == 2) { // first loop, nums[0] =2.
                tmp = nums[curr]; // store index 0
                nums[curr] = nums[p2]; // index 0 reassoigned to # at R bounary [0,0,2,1,1,0]
                nums[p2--] = tmp; // i'm not understaninng the syanax here.. this should be nums[5-1] = 2 but it ends up
                // giving index 5 value of 2 thn decrementing p2 from 5 to 4???
            }
            else curr++;
        }
    }
}