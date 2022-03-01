package com.jcvh.domain;

import java.util.Date;

public interface ISchedulable {

    void schedule(Date date, String time);
}
