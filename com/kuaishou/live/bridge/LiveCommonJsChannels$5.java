package com.kuaishou.live.bridge.LiveCommonJsChannels$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g71.b;

public final class LiveCommonJsChannels$5 extends Lambda implements a	// class@000d6c
{
    public static final LiveCommonJsChannels$5 INSTANCE;

    static {
       LiveCommonJsChannels$5.INSTANCE = new LiveCommonJsChannels$5();
    }
    public void LiveCommonJsChannels$5(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCommonJsChannels$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
