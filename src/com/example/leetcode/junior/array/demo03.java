package com.example.leetcode.junior.array;

import java.util.Arrays;

/**
 * @author liq
 * @date 2020/4/25
 */
public class demo03 {

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);


    }


    /**
     * 移动一步 最后一位移动到第一位 ， 移动n次则循环n次
     * @param nums
     * @param k
     */
    private static void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(nums.length == k) {
            System.out.println(Arrays.toString(nums));
        }

        for (int i = 0; i < k ; i++) {
            int tmp;
            for (int j = nums.length -1 ; j > 0; j--) {
                tmp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));

    }


}
