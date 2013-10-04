package com.i4c.ws.springserver;

import java.util.Date;

public interface HumanResourceService {

    void bookHoliday(Date startDate, Date endDate, String name);

}
