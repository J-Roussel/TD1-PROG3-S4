package com.PROG3S4.TD1;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractClass1 {
    @Autowired
    private ConcreteDependance1 dependance1;

    @Autowired
    private ConcreteDependance2 dependance2;
}
