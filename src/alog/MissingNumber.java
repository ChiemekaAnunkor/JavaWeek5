package alog;

import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public MissingNumber() {
    }


    public int missingNumber(List<Integer> arr, int max_num){

        Collections.sort(arr);
        int start=arr.get(0);

        for (int i  = 0; i<arr.size();i++){
//            if(arr.get(i).equals(start)){
//
//            }



            if(arr.get(i)!=start){
                return start;
            }
            start++;

        }
        return 0;
    }
    // 1. reflections
    // our solution is similar in that we were able to return the same value, we utilize a for loop,
    // difference include, using list vs array,  if statement,  collections vs streams

}
