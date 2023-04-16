package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$43;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser;

public final class LiveJsKwaiLiveCommands$43 extends Lambda implements a	// class@000d9a
{
    public static final LiveJsKwaiLiveCommands$43 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$43.INSTANCE = new LiveJsKwaiLiveCommands$43();
    }
    public void LiveJsKwaiLiveCommands$43(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$43.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdFollowUser();
    }
}
