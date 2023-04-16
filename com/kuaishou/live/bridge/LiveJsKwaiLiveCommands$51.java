package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$51;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus;

public final class LiveJsKwaiLiveCommands$51 extends Lambda implements a	// class@000da3
{
    public static final LiveJsKwaiLiveCommands$51 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$51.INSTANCE = new LiveJsKwaiLiveCommands$51();
    }
    public void LiveJsKwaiLiveCommands$51(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$51.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdQueryFollowStatus();
    }
}
