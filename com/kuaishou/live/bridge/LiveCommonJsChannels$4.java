package com.kuaishou.live.bridge.LiveCommonJsChannels$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate;

public final class LiveCommonJsChannels$4 extends Lambda implements a	// class@000d6b
{
    public static final LiveCommonJsChannels$4 INSTANCE;

    static {
       LiveCommonJsChannels$4.INSTANCE = new LiveCommonJsChannels$4();
    }
    public void LiveCommonJsChannels$4(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCommonJsChannels$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsInteractRoomInfoUpdate();
    }
}
