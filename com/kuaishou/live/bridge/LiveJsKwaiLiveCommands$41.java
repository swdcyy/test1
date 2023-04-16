package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$41;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor;

public final class LiveJsKwaiLiveCommands$41 extends Lambda implements a	// class@000d98
{
    public static final LiveJsKwaiLiveCommands$41 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$41.INSTANCE = new LiveJsKwaiLiveCommands$41();
    }
    public void LiveJsKwaiLiveCommands$41(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$41.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdSendGiftToAnchor();
    }
}
