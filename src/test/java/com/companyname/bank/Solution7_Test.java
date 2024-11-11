package com.companyname.bank;

// L2022211873_1_Test.java
// 测试用例设计原则：等价类划分原则

import org.junit.jupiter.api.Test; // 修改导入路径
import static org.junit.jupiter.api.Assertions.assertEquals; // 修改断言导入路径
import java.util.Arrays;

public class Solution7_Test {

    // 测试目的：验证输入 "dcab" 经过交换后，得到的最小字符串为 "bacd"
    // 用到的测试用例：输入 "dcab" 和索引对 [[0, 3], [1, 2]]
    @Test
    public void testSmallestStringWithSwapsCase1() {
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("dcab",
                Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2)));
        assertEquals("bacd", result);
    }

    // 测试目的：验证输入 "dcab" 经过多次交换后，得到的最小字符串为 "abcd"
    // 用到的测试用例：输入 "dcab" 和索引对 [[0, 3], [1, 2], [0, 2]]
    @Test
    public void testSmallestStringWithSwapsCase2() {
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("dcab",
                Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2)));
        assertEquals("abcd", result);
    }

    // 测试目的：验证输入 "cba" 经过交换后，得到的最小字符串为 "abc"
    // 用到的测试用例：输入 "cba" 和索引对 [[0, 1], [1, 2]]
    @Test
    public void testSmallestStringWithSwapsCase3() {
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("cba",
                Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2)));
        assertEquals("abc", result);
    }
}
