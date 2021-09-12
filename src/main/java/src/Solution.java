package src;

import org.junit.Test;

public class Solution {

    int[] m = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void testMethod() {
        System.out.println("Изменения.");
        System.out.println("Позиция: " + binarySearch(m, 10));
        System.out.println("Изменения 1.");
        System.out.println("Изменения 2.");
        System.out.println("Изменения 3.");

    }

   private int binarySearch(int[] m, int x) {
        int i = 0;
        int j = m.length;

        while (i != j) {
            int del = (i + j) / 2;

            if(x == m[del])
                return del;
            if (x < m[del])
                j = del;
            else
                i = del + 1;
        }
        return -1;
   }

}