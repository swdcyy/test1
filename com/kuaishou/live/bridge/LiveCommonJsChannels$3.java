package com.kuaishou.live.bridge.LiveCommonJsChannels$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange;

public final class LiveCommonJsChannels$3 extends Lambda implements a	// class@000d6a
{
    public static final LiveCommonJsChannels$3 INSTANCE;

    static {
       LiveCommonJsChannels$3.INSTANCE = new LiveCommonJsChannels$3();
    }
    public void LiveCommonJsChannels$3(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCommonJsChannels$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsInteractBizChange();
    }
}
