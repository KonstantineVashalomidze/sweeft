package org.example;

/**
 * Problem statement:
 * 1. მოცემულია სტრინგი, რომელიც შეიცავს არითმეტიკულ ოპერაციებს (+,-). დაწერეთ ფუნცქია,
 * რომელიც გამოთვლის მოცემული არითმეტიკული ოპერაციის შედეგს int evaluateExpression(String
 * expression);
 * მაგ. expression = “5+20-8+5”. result = 22.
 *
 * @author Konstantine Vashalmidze
 */
public class Solution1
{

    /**
     * This method evaluates expression containing integers and two operations
     * - addition and subtraction.
     * @param expression expression to be evaluated
     * @return value of evaluated expression
     * @throws IllegalArgumentException when empty string is given
     */
    int evaluateExpression(String expression)
    {
        int value = 0; // value after evaluating expression
        int sign = 1; // represents sign of the next integer being added to value
        int expressionLength = expression.length(); // length of the expression

        if (expressionLength == 0) // if length of expression is zero
            throw new IllegalArgumentException("expression can't be empty"); // then throw exception

        for (int i = 0; i < expressionLength; i++)
        {
            int charAtI = expression.charAt(i); // character at index i
            if (!Character.isDigit(charAtI))
            // if character is not digit
            {
                // determine its sign
                if (charAtI == '+')
                {
                    sign = 1;
                }
                else if (charAtI == '-')
                {
                    sign = -1;
                }
            }
            else
            // if character is digit
            {
                StringBuilder integer = new StringBuilder(); // next number to be added to value
                while (i < expressionLength && Character.isDigit(expression.charAt(i)))
                // while i is less than expression length and current character is digit
                {
                    integer.append(expression.charAt(i)); // add character to variable integer
                    i++; // increment i
                }
                i--; // last increment was pointing + or - so move it one step back
                /*
                * cast StringBuilder to string parse integer from it multiply to the sign and
                * add it to the value.
                 */
                value += sign * Integer.parseInt(integer + "");
            }
        }

        return value;

    }




}