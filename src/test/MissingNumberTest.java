package test;

import alog.MissingNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    private List<Integer> missingMax = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    private List<Integer> missingNone = new ArrayList<>(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ));
    private List<Integer> missingSeven = new ArrayList<>(Arrays.asList( 1, 2, 3, 4, 5, 6, 8, 9, 10 ));
    private MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(10, mn.missingNumber(missingMax, 10));
    }

    @Test
    public void testMissingNumber_NoneMissing() {
        assertEquals(0, mn.missingNumber(missingNone, 10));
    }

    @Test
    public void testMissingNumber_MissingSeven() {
        assertEquals(7, mn.missingNumber(missingSeven, 10));
    }


}