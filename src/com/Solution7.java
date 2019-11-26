package com;

public class Solution7 {
    public int reverse(int x) {
        if (x < 0) {
            String absStr = String.valueOf(Math.abs(x));
            String reStr = new StringBuffer(absStr).reverse().toString();
            try {
                int result = Integer.valueOf(reStr) * (-1);
                return result;
            } catch (Exception e) {
                return 0;
            }

        } else {
            String absStr = String.valueOf(Math.abs(x));
            String reStr = new StringBuffer(absStr).reverse().toString();
            try {
                int result = Integer.valueOf(reStr);
                return result;
            } catch (Exception e) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int a = solution7.reverse(964632435);
        System.out.println(a);
    }
}
