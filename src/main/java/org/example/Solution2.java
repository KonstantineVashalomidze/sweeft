package org.example;

import java.util.List;

/**
 * Problem statement:
 * 2. სტრინგი არის ‘ბედნიერი’ თუ მისი შემადგენელი ყოველი სიმბოლოს მომდევნო ელემენტი არ
 * უდრის ამ სიმბოლოს. სტრინგები შედგება მარტო ‘a’, ‘b’, ‘c’ სიმბოლოებისგან. თქვენ შემოგდით
 * სტრინგების ლისტი, გამოთვალეთ რამდენი სტრინგი არის ‘ბედნიერი’. int
 * numberOfHappyStrings(List<String> strings);
 * მაგ. strings = [“abbcc”, “abc”, “abcabc”, “cabcbb”], result = 2.
 *
 * @author Konstantine Vashalmidze
 */
public class Solution2
{

    /**
     * This method counts number of happy strings in list.
     * "String is happy if there is not two consecutive characters in it
     * such that they are same."
     * @param strings list of strings
     * @return count of happy strings
     */
    int numberOfHappyStrings(List<String> strings)
    {
        int countHappyStrings = 0; // number of happy strings
        for (String string : strings)
        {
            if (stringIsHappy(string)) // if string is happy
                countHappyStrings++; // increment count by one
        }
        return countHappyStrings;
    }


    private boolean stringIsHappy(String string)
    // checks if the string is happy, true - if happy, false - otherwise.
    // this is helper function for numberOfHappyStrings(List) method
    {
        for (int i = 0; i < string.length() - 1; i++)
        {
            if (string.charAt(i) == string.charAt(i + 1)) // if two consecutive characters are same
                return false; // then string is not happy and return false
        }
        return true; // because there was not any two consecutive characters same then string is happy
    }

}
