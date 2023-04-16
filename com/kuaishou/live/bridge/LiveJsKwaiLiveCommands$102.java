package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$102;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdSwitchEffectRenderBannedBizBit;

public final class LiveJsKwaiLiveCommands$102 extends Lambda implements a	// class@000d71
{
    public static final LiveJsKwaiLiveCommands$102 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$102.INSTANCE = new LiveJsKwaiLiveCommands$102();
    }
    public void LiveJsKwaiLiveCommands$102(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$102.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdSwitchEffectRenderBannedBizBit();
    }
}
