package solution;

import java.util.HashMap;

public class LeetcodeSolution_1 {
    /**
     * 暴力算法（穷举）,时间复杂度O(n^2),缺点耗时
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    /**
     * 利用HashMap保存目标值与数组的差值和索引,时间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(target-nums[i], i);
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    /**
     * main方法测试方法是否可行
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 9, 2, 7, 11, 3};
        int target = 10;
        int[] result =LeetcodeSolution_1.twoSum2(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");  //打印结果
        }
    }
}
