package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess;

public final class LiveJsKwaiLiveCommands$3 extends Lambda implements a	// class@000d96
{
    public static final LiveJsKwaiLiveCommands$3 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$3.INSTANCE = new LiveJsKwaiLiveCommands$3();
    }
    public void LiveJsKwaiLiveCommands$3(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdNotifySendGiftSuccess();
    }
}
