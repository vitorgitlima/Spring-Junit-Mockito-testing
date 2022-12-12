package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl business;
    @Mock
    SomeDataService dataServiceMock = mock(SomeDataService.class);


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
