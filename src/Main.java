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
        //B [201]

        int tmp;
        while (curr <= p2) { // curr = 0, which is < 5.
            if (nums[curr] == 0) { // pass example of [0,0,2,1,1,2], where curr = 0, p0=0
                tmp = nums[p0]; // temp = 0
                nums[p0] = nums[curr]; // first index = 0
                p0++;
                nums[curr] = tmp; // first index = 0 again...
                curr++;
                // basically just confirmed 0 for first index and ++ p0 and curr
            }
            else if (nums[curr] == 2) { // first loop, nums[0] =2.
                tmp = nums[curr]; // store index 0
                nums[curr] = nums[p2]; // index 0 reassoigned to # at R bounary [0,0,2,1,1,0]
                nums[p2] = tmp; // R boundary changed [0,0,2,1,1,2]
                p2--; // decrement R boundary since
            }
            else curr++; // in [201] ex. curr goes to index 1 while p0 stays at index 0. 0 value found index 1 and swapped
            // for index 0 then increment p0 and curr
        }
    }
}