package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$39;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNavigateToH5;

public final class LiveJsKwaiLiveCommands$39 extends Lambda implements a	// class@000d95
{
    public static final LiveJsKwaiLiveCommands$39 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$39.INSTANCE = new LiveJsKwaiLiveCommands$39();
    }
    public void LiveJsKwaiLiveCommands$39(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$39.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdNavigateToH5();
    }
}
