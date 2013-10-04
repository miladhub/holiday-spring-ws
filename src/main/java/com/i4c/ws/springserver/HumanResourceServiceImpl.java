package com.i4c.ws.springserver;

import java.util.Date;

public class HumanResourceServiceImpl implements HumanResourceService {

    @Override
    public void bookHoliday(Date startDate, Date endDate, String name) {
        System.out.println("WORKS!!!!");
    }

}
