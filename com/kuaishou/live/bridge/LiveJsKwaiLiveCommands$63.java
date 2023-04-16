package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$63;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation;

public final class LiveJsKwaiLiveCommands$63 extends Lambda implements a	// class@000db0
{
    public static final LiveJsKwaiLiveCommands$63 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$63.INSTANCE = new LiveJsKwaiLiveCommands$63();
    }
    public void LiveJsKwaiLiveCommands$63(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$63.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdStartPKInvitation();
    }
}
