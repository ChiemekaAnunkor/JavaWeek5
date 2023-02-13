package test;

import alog.MissingNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberPerformanceTest {

    private List<Integer> missingMax = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    private List<Integer> missingNone = new ArrayList<>(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ));
    private List<Integer> missingSeven = new ArrayList<>(Arrays.asList( 1, 2, 3, 4, 5, 6, 8, 9, 10 ));
    private int max = 10;
    private MissingNumber mn = new MissingNumber();

    @Test(timeout=100)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mn.missingNumber(missingMax, max);
            mn.missingNumber(missingNone, max);
            mn.missingNumber(missingSeven, max);
        }
    }

//    @Test(timeout=100)
//    public void testMissingNumberSort_Performance() {
//        for (int i = 0; i < 1000000; i += 1) {
//            mn.missingNumberSort(missingMax, max);
//            mn.missingNumberSort(missingNone, max);
//            mn.missingNumberSort(missingSeven, max);
//        }
//    }

//    @Test(timeout=100)
//    public void testMissingNumberSum_Performance() {
//        for (int i = 0; i < 1000000; i += 1) {
//            mn.missingNumberSum(missingMax, max);
//            mn.missingNumberSum(missingNone, max);
//            mn.missingNumberSum(missingSeven, max);
//        }
//    }
}