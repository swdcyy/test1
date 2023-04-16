package com.yxcorp.gifshow.retrofit.service.KwaiAdService;
import java.lang.String;
import brd.t;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public interface abstract KwaiAdService	// class@001b0e
{

    t collectAdLog(String p0,String p1);
    t reportPoiAdLog(long p0,String p1,String p2);
    t requestTKTemplate(String p0,RequestTiming p1);
    t uploadClipboardText(String p0);
}
