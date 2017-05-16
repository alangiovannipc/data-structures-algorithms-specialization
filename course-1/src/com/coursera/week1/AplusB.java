package com.coursera.week1;

import java.util.Scanner;

/*
 * Read n values from console
 * calculate the max pair wise product
 */

public class AplusB {

    public static void main(String[] args) {
	// write your code here
        int i;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");

        System.out.print("Enter cantidad de numeros:\t");
        Integer n = scanner.nextInt();
        Long[] numbers = new Long[n];
        for(i=0;i<n;i++){
            numbers[i] = scanner.nextLong();
        }

        Long result1 = MaxPairWiseProduct(numbers);
        Long result2 = MaxPairwiseProductFast(numbers);
        System.out.print("El resultado1 es : " + result1);
        System.out.print("El resultado2 es : " + result2);
    }

    static Long MaxPairWiseProduct(Long[] numbers){
        Long result = 0L;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ( numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    static Long MaxPairwiseProductFast(Long[] numbers) {
        int n = numbers.length;

        int max_index1 = -1;
        for (int i = 0; i < n; ++i)
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;

        int max_index2 = -1;
        for (int j = 0; j < n; ++j)
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
                max_index2 = j;

        return numbers[max_index1] * numbers[max_index2];
    }
}
