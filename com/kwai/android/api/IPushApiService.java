package com.kwai.android.api.IPushApiService;
import com.android.kwai.foundation.network.IRpcService;
import java.lang.String;
import java.util.Map;
import com.android.kwai.foundation.network.SyncResult;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.core.ICancelFeature;

public interface abstract IPushApiService implements IRpcService	// class@00096f
{

    SyncResult fetchInitiativePush(String p0,long p1,String p2,int p3,Map p4);
    ICancelFeature registerPushToken(String p0,Map p1,String p2,String p3,String p4,IRpcService$Callback p5);
    ICancelFeature reportPushClick(String p0,Map p1,String p2,String p3,String p4);
    ICancelFeature reportPushReceive(String p0,Map p1,String p2,String p3,int p4,int p5,String p6);
    ICancelFeature reportSystemNotifyState(String p0,Map p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,IRpcService$Callback p9);
}
