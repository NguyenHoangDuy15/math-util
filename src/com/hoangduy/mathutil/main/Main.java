package com.hoangduy.mathutil.main;

/**
 *
 * @author DELL
 */
import com.hoangduy.mathutil.core.MathUtil;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // thu nghiem ham tinh giai thua xem tinh dung khong
        // ta phai dua cac tinh huong su dung ham trong thuc te
        // vi du -5 co tinh duoc khong
        // 0 coi tinh được bao nhiêu^
        // 20 xem ra bao nhiêu
        // 21
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);     
        System.out.println("5 != " + expected + " expected");
        System.out.println("5 != " + actual + " actual");
    }
}
