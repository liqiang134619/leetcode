package com.example.leetcode.junior.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author liq
 * @date 2020/4/25
 */
public class demo05 {


    /**
     * 定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 说明：
     *
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {1,1,3,2,4,4,2};
        System.out.println(singleNumber2(nums));

    }


    /**
     * 排序之后 比较相邻的元素
     * @param nums
     * @return
     */
    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 1) {
            return nums[0];
        }
        if(nums[0] !=nums[1]) {
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length -2]) {
            return nums[nums.length -1];
        }
        for (int i = 1; i < nums.length-1 ; i++) {
            if(nums[i+1] != nums[i] && nums[i] != nums[i-1]) {
                return nums[i];
            }
        }

        return 0;

    }

    /**
     * 异或
     * @param nums
     * @return
     */
    private static int singleNumber2(int[] nums) {
        int a = 0;
        for (int num : nums) {
             a = a ^ num;
        }
        return a;
    }
}
