package org.example;


/**
 * 5. მოცემულია მთელ რიცხვა მასივი. იპოვეთ ელემენტების მაქსიმალური რაოდენობა, რომელთა
 * ჯამით მიიღება რიცხვი k. int lenOfLongSubarr(int[] array, int k); მაგ. array=[6,2,2,3,4,1], k = 8,
 * result= 4.
 * @author Konstantine Vashalomdize
 */
public class Solution5
{
    /**
     * Finds the maximum number of elements that sum up to k.
     * Note: I assumed that input was positive numbers. instead of all integers.
     * @param array elements
     * @param k target number to be summed
     * @return maximum number of elements that sum up to k.
     */
    int lenOfLongSubarr(int[] array, int k)
    {
        int n = array.length; // length of array

        // create matrix to store results
        int[][] dp = new int[n + 1][k + 1];
        // fill with -1's
        for (int i = 0; i < n + 1; i++)
        {
            for (int j = 0; j < k + 1; j++)
            {
                if (j == 0)
                // longest when k is 0
                {
                    dp[i][j] = 0;
                }
                else
                {
                    dp[i][j] = -1;
                }
            }
        }


        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < k + 1; j++)
            {
                // set the result to be same as the result of the previous element, initially.
                dp[i][j] = dp[i - 1][j];

                // check if the current element can contribute to the current sum.
                if (j >= array[i - 1] && dp[i - 1][j - array[i - 1]] != -1)
                    dp[i][j] = Math.max(1 + dp[i - 1][j - array[i - 1]], dp[i][j]);
            }
        }

        return dp[n][k];


    }

}
