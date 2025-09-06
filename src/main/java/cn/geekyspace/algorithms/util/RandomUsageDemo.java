package cn.geekyspace.algorithms.util;

import java.util.Random;
import java.util.Arrays;

/**
 * RandomUsageDemo
 *
 * 演示随机数在算法学习中的常用场景：
 * 1. 生成随机数组（模拟随机输入）
 * 2. 随机选择枢轴（随机化算法思想）
 * 3. 模拟概率问题（抽奖/概率模拟）
 */
public class RandomUsageDemo {

    public static void main(String[] args) {
        Random rand = new Random();

        // 1️⃣ 生成随机整数数组（模拟算法测试数据）
        int[] arr = generateRandomArray(rand, 10, 0, 99);
        System.out.println("1️⃣ 随机数组:" + Arrays.toString(arr));

        // 2️⃣ 随机化算法示例：随机选择枢轴（快速排序思想）
        int pivot = selectRandomPivot(rand, arr);
        System.out.println("2️⃣ 随机选择的枢轴元素: " + pivot);

        // 3️⃣ 概率问题示例：抽奖
        int prize = drawPrize(rand);
        System.out.println("3️⃣ 抽奖结果: " + (prize == 0 ? "未中奖" : prize + "等奖"));
    }

    // 生成指定长度、指定范围的随机整数数组
    public static int[] generateRandomArray(Random rand, int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min; // 左闭右闭 [min,max]
        }
        return arr;
    }

    // 随机选择数组中的一个元素作为枢轴
    public static int selectRandomPivot(Random rand, int[] arr) {
        int index = rand.nextInt(arr.length);
        return arr[index];
    }

    // 模拟抽奖（概率问题）
    public static int drawPrize(Random rand) {
        int r = rand.nextInt(100) + 1; // 1~100
        if (r <= 5) return 1;    // 一等奖 5%
        if (r <= 15) return 2;   // 二等奖 10%
        if (r <= 65) return 3;   // 三等奖 50%
        return 0;                // 未中奖 35%
    }
}
