package com.kuaishou.live.basic.bridge.LiveJsChannels$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m41.a;

public final class LiveJsChannels$2 extends Lambda implements a	// class@000ca7
{
    public static final LiveJsChannels$2 INSTANCE;

    static {
       LiveJsChannels$2.INSTANCE = new LiveJsChannels$2();
    }
    public void LiveJsChannels$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsChannels$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
