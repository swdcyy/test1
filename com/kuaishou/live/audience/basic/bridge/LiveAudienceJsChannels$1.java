package com.kuaishou.live.audience.basic.bridge.LiveAudienceJsChannels$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState;

public final class LiveAudienceJsChannels$1 extends Lambda implements a	// class@000a34
{
    public static final LiveAudienceJsChannels$1 INSTANCE;

    static {
       LiveAudienceJsChannels$1.INSTANCE = new LiveAudienceJsChannels$1();
    }
    public void LiveAudienceJsChannels$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceJsChannels$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsChannelChatApplyState();
    }
}
