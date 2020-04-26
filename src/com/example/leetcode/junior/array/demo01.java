package com.example.leetcode.junior.array;

import java.awt.print.Printable;

/**
 * @author liq
 * @date 2020/4/25
 */
public class demo01 {

    /**
     *
     * 删除排序数组中的重复项
     * Given a sorted array nums, remove the duplicates in-place such that each
     * element appear only once and return the new length.
     *
     * Do not allocate extra space for another array,
     * you must do this by modifying the input array in-place with O(1) extra memory.
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int num = removeDuplicates(nums);
        for (int i = 0; i < num; i++) {
            System.out.println(nums[i]);
        }



    }

    /**
     *  采用双指针算法，慢指针是唯一的元素，和快指针比较。 不相同就放在i+1的位置上
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums [j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }
}
