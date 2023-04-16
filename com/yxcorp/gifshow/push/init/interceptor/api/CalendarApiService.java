package com.yxcorp.gifshow.push.init.interceptor.api.CalendarApiService;
import com.android.kwai.foundation.network.IRpcService;
import java.lang.String;
import com.google.gson.JsonObject;
import java.util.List;
import com.android.kwai.foundation.network.SyncResult;

public interface abstract CalendarApiService implements IRpcService	// class@001659
{

    SyncResult ackCalendarCreateAsync(String p0,int p1,String p2,JsonObject p3,List p4);
}
