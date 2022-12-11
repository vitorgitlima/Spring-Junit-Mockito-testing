package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class SomeBusinessStubTest {

    @Test
    public void  calculateSumUsingDataService_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());

        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSumUsingDataService_basic_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());

        int actualResult = business.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSum_basic_oneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new int[] {5});
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}
