package alog;

import java.util.HashMap;
import java.util.Map;

public class BalancedBrackets {

    public BalancedBrackets(){

    }

    public  boolean balancedBrackets(String str){
        Map<String, String> map= new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put( "[", "]");
        map.put("<", ">");

        String[] strArr=str.split("");

        int opening=0;
        int closing=0;


        for (int i = 0; i < strArr.length; i++) {

            if(map.containsKey(strArr[i])){
                opening++;
            }
            if(map.containsValue(strArr[i])){
                closing++;
            }


        }

        if(opening==closing){
            return true;
        }


        return false;
    }

    //2 reflections:
    //- the run time complexity of my solution is using a hashmap is 0(n) and space complexity of 0(1),
    // i wasnt able to figure out how to use a stack for this problem. i tried but the code wasnt working so i decided to move on .
    //-the solution using hashmap was consistant and performed the same but the code is alittle bit different.
    //-the implementation would be the same but the order in which it would run would be different.

}
