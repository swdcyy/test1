package com.kuaishou.live.basic.bridge.LiveJsChannels$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel;

public final class LiveJsChannels$1 extends Lambda implements a	// class@000ca6
{
    public static final LiveJsChannels$1 INSTANCE;

    static {
       LiveJsChannels$1.INSTANCE = new LiveJsChannels$1();
    }
    public void LiveJsChannels$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsChannels$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsTickChannel();
    }
}
