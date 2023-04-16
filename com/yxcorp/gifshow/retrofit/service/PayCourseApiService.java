package com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import java.lang.String;
import brd.t;

public interface abstract PayCourseApiService	// class@001b15
{

    t addOrder(String p0,String p1);
    t addOrder(String p0,String p1,String p2,boolean p3,String p4);
    t checkOrder(String p0);
    t checkOrder(String p0,String p1);
    t evaluateLesson(long p0,String p1);
    t getPrepayInfo(String p0,int p1);
}
