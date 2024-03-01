package org.example;


import java.util.*;

/**
 * Problem statement:
 * 4. მოცემულია მთელი რიცხვების ორი მასივი. nums1 და nums2. იპოვეთ ამ მასივების საერთო
 * ელემენტთა სიმრავლე, რომელიც შეიცავს უნიკალურ მთელ რიცხვებს. int[] findIntersection(int[]
 * nums1, int[] nums2);
 *
 * მაგ. nums1 = [1,2,3,3,4,5], nums2 = [3,4,4,5,6,7], result = [3,4,5].
 *
 * @author Konstantine Vashalmidze
 */
public class Solution4
{
    /**
     * This is the method for finding intersection between two arrays.
     * @param nums1 array of integers
     * @param nums2 array of integers
     * @return array of integers that are contained in both nums1 and nums2
     */
    int[] findIntersection(int[] nums1, int[] nums2)
    {

        Set<Integer> nums1Set = new HashSet<>(); // will contain all elements of nums1
        for (int element : nums1)
            // add every element of nums1 to nums1Set
            nums1Set.add(element);

        // for every element in nums2 check what nums1 contains and add it to
        Set<Integer> intersection = new HashSet<>(); // intersection
        for (int element : nums2)
        {
            if (nums1Set.contains(element)) // contains check is done in O(1)
                intersection.add(element);  // if nums1Set contains element that is ni nums2 then
                                            // this is intersection.
        }

        // convert intersection set into array
        int arrayIndex = 0;
        int[] result = new int[intersection.size()];
        for (int element : intersection)
            result[arrayIndex++] = element; // put element from intersection to array and increment arrayIndex

        return result;
    }

}
