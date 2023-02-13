import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(missingNumber(new ArrayList<>(Arrays.asList(2, 1, 4, 3, 6, 5, 7, 10, 9)), 10));

//        System.out.println(balancedBrackets("(sd))"));

//        quickSort();
    }

    //1. solution


        //2. solution 1



    //3-sorting (quick sort)
    //1. generally specking merge sort is faster
    //2. merge sort is faster for larger data because it is external , insertion sort is faster for smaller data set because it uses quick sort as a precursor to sort first, quick sort is good for memory and better in real life situations

        static void quickSort(){

        //java sort algorithm uses quick sort

            List<Integer> nums= new ArrayList<>();
            nums.add(2);
            nums.add(1);
            nums.add(4);

//            Collections.sort(nums);
//            System.out.println(nums);

            for (int i = 0; i < nums.size(); i++) {
                for (int j = 0; j < nums.size(); j++) {

                if(nums.get(i)<(nums.get(j))){
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);



                }
                }
            }


            System.out.println(nums
            );

        }




}