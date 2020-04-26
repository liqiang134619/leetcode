package com.example.leetcode.junior.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liq
 * @date 2020/4/25
 */
public class demo04 {


    /**
     * 给定一个整数数组，判断是否存在重复元素。
     *
     * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }


    /**
     * hash判定
     * @param nums
     * @return
     */
    private static boolean containsDuplicate(int[] nums) {
        Set<Integer>  sets  = new HashSet<>();
        for (int num : nums) {
            boolean add = sets.add(num);
            if (!add) {
                return true;
            }
        }
        return false;
    }
}