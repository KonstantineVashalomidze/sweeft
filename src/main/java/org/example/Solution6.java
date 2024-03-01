package org.example;


/**
 * 6. მოცემული გვაქვს მთელი რიცხვების ორი მასივი, array და sequence. იპოვეთ თუ მეორე მასივი
 * პირველი მასივის ქვესიმრავლეა და ელემენტები იგივე მიმდევრობით არის მოცემული. boolean
 * isValidSequence(int[] array, int[] sequence);
 * მაგ. array = [5,1,22,25,6,-1,8,10], sequence = [1,6-1,10], result = true. (edited)
 */
public class Solution6
{

    /**
     * This method checks whether two 'sequence' is subsequence of 'array'
     * @param array of integers.
     * @param sequence must be checked if array contains it.
     * @return true - if array contains subsequence 'sequence' false otherwise.
     */
    boolean isValidSequence(int[] array, int[] sequence)
    {
        int lengthArray = array.length, lengthSequence = sequence.length;
        if (lengthArray < lengthSequence) // if array contains fewer elements than its subset then
            return false;
        int arrayIndex = 0, sequenceIndex = 0;
        while (arrayIndex < lengthArray && sequenceIndex < lengthSequence)
        {
            if (array[arrayIndex] == sequence[sequenceIndex])
            {
                sequenceIndex++; // move to the next element in the sequence
            }
            arrayIndex++; // always move to the next element in the array
        }
        return sequenceIndex == lengthSequence; // means we already have seen sequence in array
    }
}
