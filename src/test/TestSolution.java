package test;

import solution.LeetcodeSolution_1;

public class TestSolution {
    public static void main(String[] args) {
        int[] nums = {1, 9, 2, 7, 11, 3};
        int target = 10;
        int[] result =LeetcodeSolution_1.twoSum2(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
