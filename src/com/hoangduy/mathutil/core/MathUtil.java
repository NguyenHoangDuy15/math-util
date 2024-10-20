package com.hoangduy.mathutil.core;

import java.util.*;
import java.lang.*;

public class MathUtil {
    // trong class nay cung cap cho ai nhieu ham xu li toan hoc
    // clone math cua JDK
    // ham thu vien xai chung cho ai do, khong can luu lai gia tri
    // chon thiet ke la ham static

    // ham tinh giai thua
    //n! = .......
    //khong co giai thua cho so am
    // 0! = 1! = 1 quy uoc
    // giai thua ham do doc, tang nhanh ve gia tri
    // 20 giai thua 18 con so 0 vua du cho kieu long
    // 21 la tran kieu long
    // tinh n giai thua cho khoang 0 den 20
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid argrument. n need be beetween 1...20");
//        if (n == 0 || n == 1)
//            return 1;
//        long product = 1; // tich nhan don 
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        return product;
//    }
//    
    // hOC DE QUY
    // GOI LAI CHINH MINH VOI 1 QUY MO KHAC
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argrument. n need be beetween 1...20");
        if (n == 0 || n == 1) 
            return 1;
        return n * getFactorial(n - 1);
    }
}
