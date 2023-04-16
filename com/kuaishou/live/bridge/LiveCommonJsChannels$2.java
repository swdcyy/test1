package com.kuaishou.live.bridge.LiveCommonJsChannels$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate;

public final class LiveCommonJsChannels$2 extends Lambda implements a	// class@000d69
{
    public static final LiveCommonJsChannels$2 INSTANCE;

    static {
       LiveCommonJsChannels$2.INSTANCE = new LiveCommonJsChannels$2();
    }
    public void LiveCommonJsChannels$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCommonJsChannels$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsInteractChatMediaInfoUpdate();
    }
}
