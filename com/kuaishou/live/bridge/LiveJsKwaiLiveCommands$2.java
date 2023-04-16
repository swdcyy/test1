package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter;

public final class LiveJsKwaiLiveCommands$2 extends Lambda implements a	// class@000d8b
{
    public static final LiveJsKwaiLiveCommands$2 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$2.INSTANCE = new LiveJsKwaiLiveCommands$2();
    }
    public void LiveJsKwaiLiveCommands$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdDispatchLiveRouter();
    }
}
