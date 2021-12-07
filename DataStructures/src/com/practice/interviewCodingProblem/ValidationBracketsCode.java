
package interviewCodingProblem;

import java.util.HashMap;
import java.util.Map;

public class ValidationBracketsCode {


    public static void main(String[] args) {
       System.out.print(validate("}{][)("));
    }

    public static boolean validate(String s) {
        String[] squareBracs = {"[", "]"};
        String[] curlyBracs = {"{", "}"};
        String[] circularBracs = {"(", ")"};
        Map<String, Integer> map = new HashMap<>();
        char[] string = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = string[i];
            Integer count = map.get(String.valueOf(currentChar));
            if (null == count) {
                map.put(String.valueOf(currentChar), 1);
            } else {
                map.put(String.valueOf(currentChar), ++count);
            }
        }
        if (!(map.get(squareBracs[0]).equals(map.get(squareBracs[1])))) {
            return false;
        }
        if (!(map.get(curlyBracs[0]).equals(map.get(curlyBracs[1])))) {
            return false;
        }
        if (!map.get(circularBracs[0]).equals(map.get(circularBracs[1]))) {
            return false;
        }
        return true;
    }

}

