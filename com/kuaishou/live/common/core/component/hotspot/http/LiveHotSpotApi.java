package com.kuaishou.live.common.core.component.hotspot.http.LiveHotSpotApi;
import com.kuaishou.live.common.core.component.hotspot.http.LiveHotSpotApi$hotSpotApiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import xn1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveHotSpotApi	// class@001429
{
    public static final p a;
    public static final LiveHotSpotApi b;

    static {
       LiveHotSpotApi.b = new LiveHotSpotApi();
       LiveHotSpotApi.a = s.c(LiveHotSpotApi$hotSpotApiService$2.INSTANCE);
    }
    public void LiveHotSpotApi(){
       super();
    }
    public static final a a(){
       Object obj = PatchProxy.apply(null, null, LiveHotSpotApi.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveHotSpotApi.a.getValue();
    }
}
