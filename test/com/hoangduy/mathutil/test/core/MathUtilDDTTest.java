package com.hoangduy.mathutil.test.core;

import com.hoangduy.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// Câu lệnh này của Junit báo hiệu rằng sẽ cần loop qua tập data để lấy cặp input
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    // ta sẽ trả về mảng 2 ciều gồm nhieuf cặp .....
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},};
    }

    @Parameterized.Parameter(value = 0)
    public int n; //biến map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1)
    public long expected;  // kieeur long vi nos la gia tri cua ham getF()

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
