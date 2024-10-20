package com.hoangduy.mathutil.test.core;

import com.hoangduy.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
//import junit.framework.Assert;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {

    // day la class se su dung cac ham cua thu vien de kiem tra code chinh
    // viet code de test code chinh ben kia
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long exptected = 1;
        long actual = MathUtil.getFactorial(n);

        // so sanh dung framework
        Assert.assertEquals(exptected, actual);
        //
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));

    }// ham giup so sanh 2 gia tri oc giong nhau khong

    // đưa data sai vào trong thiết kế là phải ném ra ngoại lệ
    // kì vọng ngoại lệ xuất hiện khi n < 0 và n > 20
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentReturnsWell(){
//          MathUtil.getFactorial(-5); // ham @Test chay hay math chay
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentReturnsWell() {
        MathUtil.getFactorial(-5); // ham @Test chay hay math chay
    }

    // cách viết ngoại lệ tự nhiên hơn
    //Xai lambda
    // nem ve ngoai le neu nem ve 21
    @Test
    public void testGetFactorialGivenWrongArgumentReturnsWell_LambdaVersion() {
//        Assert.assertThrows(tham số 1: ngoại lệ muốn so sánh , tham số 2: đoạn code chạy văng ra ngoại runnable)
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        //MathUtil.getFactorial(-5); // ham @Test chay hay math chay
    }

    // bat ngoại lệ với n sai
    @Test
    public void testGetFactorialGivenWrongArgumenThrowException_lambdaVesion() {
//        Assert.assertThrows(tham số 1: ngoại lệ muốn so sánh , tham số 2: đoạn code chạy văng ra ngoại runnable)
        //Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        try {
            MathUtil.getFactorial(-5); // ham @Test chay hay math chay
        } catch (Exception e) {
            Assert.assertEquals("Invalid argrument. n need be beetween 1...20", e.getMessage());
        }

    }
}
