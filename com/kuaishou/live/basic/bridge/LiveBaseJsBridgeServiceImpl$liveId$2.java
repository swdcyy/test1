package com.kuaishou.live.basic.bridge.LiveBaseJsBridgeServiceImpl$liveId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.UUID;

public final class LiveBaseJsBridgeServiceImpl$liveId$2 extends Lambda implements a	// class@000ca4
{
    public static final LiveBaseJsBridgeServiceImpl$liveId$2 INSTANCE;

    static {
       LiveBaseJsBridgeServiceImpl$liveId$2.INSTANCE = new LiveBaseJsBridgeServiceImpl$liveId$2();
    }
    public void LiveBaseJsBridgeServiceImpl$liveId$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl$liveId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "liveId-"+UUID.randomUUID();
    }
}
