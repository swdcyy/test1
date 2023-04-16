package com.yxcorp.gifshow.retrofit.service.KwaiHttpsService;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import java.util.Map;

public interface abstract KwaiHttpsService	// class@001b10
{

    t getPassportServiceToken(String p0,RequestTiming p1);
    t getUnknownPassportServiceToken(String p0,RequestTiming p1);
    t webHttpCall(String p0,Map p1,String p2);
}
