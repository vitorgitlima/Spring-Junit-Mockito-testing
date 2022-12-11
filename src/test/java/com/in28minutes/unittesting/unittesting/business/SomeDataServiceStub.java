package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.*;

class SomeDataServiceStub implements SomeDataService {

    @Override
    public int[] retrieveAllDatA() {
        return new int[]{1, 2, 3};
    }
}
