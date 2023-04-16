package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$10;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5;

public final class LiveJsKwaiLiveCommands$10 extends Lambda implements a	// class@000d76
{
    public static final LiveJsKwaiLiveCommands$10 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$10.INSTANCE = new LiveJsKwaiLiveCommands$10();
    }
    public void LiveJsKwaiLiveCommands$10(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$10.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdOpenNonImmersiveH5();
    }
}
