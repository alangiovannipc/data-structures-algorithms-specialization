package com.coursera.week1;

import java.util.Arrays;

/**
 * Created by AlanPolar on 16/05/2017.
 */
public class StressTest {

    public static void main(String[] args) {
        while (true) {
            int n = (int )(Math.random() * 10 + 2);
            System.out.println("\n");
            Long[] a = new Long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = (long) (Math.random() * 100 + 1) % 100000;
            }
            for (int i = 0; i < n; ++i) {
                System.out.print(a[i] + " ");
            }
            System.out.println("\n");
            long res1 = AplusB.MaxPairWiseProduct(a);
            long res2 = AplusB.MaxPairwiseProductFast(a);
            if (res1 != res2) {
                System.out.println("Wrong answer: " + res1 + " " + res2 + "\n");
                break;
            } else {
                System.out.println("OK\n");
            }
        }

    }
}
