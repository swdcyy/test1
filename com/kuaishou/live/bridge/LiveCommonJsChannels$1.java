package com.kuaishou.live.bridge.LiveCommonJsChannels$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g71.c;

public final class LiveCommonJsChannels$1 extends Lambda implements a	// class@000d68
{
    public static final LiveCommonJsChannels$1 INSTANCE;

    static {
       LiveCommonJsChannels$1.INSTANCE = new LiveCommonJsChannels$1();
    }
    public void LiveCommonJsChannels$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCommonJsChannels$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}