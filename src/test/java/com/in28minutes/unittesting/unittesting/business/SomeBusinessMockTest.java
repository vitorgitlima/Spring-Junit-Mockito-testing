package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessMockTest {

    SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @BeforeEach
    public void before(){
        business.setSomeDataService(dataServiceMock);
    }

    @Test
    public void  calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllDatA()).thenReturn(new int[] {1,2,3});
        assertEquals(6, business.calculateSumUsingDataService());
    }

    @Test
    void calculateSumUsingDataService_basic_empty() {
        when(dataServiceMock.retrieveAllDatA()).thenReturn(new int[] {});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    void calculateSum_basic_oneValue() {
        when(dataServiceMock.retrieveAllDatA()).thenReturn(new int[] {5});
        assertEquals(5, business.calculateSumUsingDataService());
    }
}
