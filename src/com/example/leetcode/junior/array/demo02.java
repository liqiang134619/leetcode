package com.example.leetcode.junior.array;

/**
 * @author liq
 * @date 2020/4/25
 */
public class demo02 {


    /**
     * 买卖股票的最佳时机 II
     *
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {7,6,4,3,1};
        int i = maxProfit(nums);
        System.out.println(i);


    }

    /**
     *  贪心算法： 只要后一天的股票价格大于前一天的今天即卖出
     * @param prices 股票价格
     * @return 获利
     */
    private static int maxProfit(int[] prices) {

        int sum = 0;
        for (int i = 0; i < prices.length -1; i++) {
            if(prices[i +1] > prices[i]) {
                sum += prices[i+1] - prices[i];
            }
        }
        return sum;

    }
}
