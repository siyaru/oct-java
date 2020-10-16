package com.example.talent.oct;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem {
    public int collect(int[] coins) {
        if(coins.length == 1)
            return 0;
        if(coins.length == 2)
            return coins[1];

        int[] sum = new int[coins.length + 1];//到第i级台阶最多可以捡sum[i]枚金币
        sum[0] = 0;
        sum[1] = 0;
        sum[2] = coins[1];
        for(int i = 3;i <= coins.length;i++){
            int max = sum[i - 2] > sum[i - 3] ? sum[i - 2] : sum[i - 3];
            sum[i] = max + coins[i - 1];
        }
        //问的是最多能收集到多少枚，到最后一级台阶最多sum[coins.length]枚，不是必须到最后一级台阶
        return sum[coins.length] > sum[coins.length - 1] ? sum[coins.length] : sum[coins.length - 1];
    }
}
