package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$45;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage;

public final class LiveJsKwaiLiveCommands$45 extends Lambda implements a	// class@000d9c
{
    public static final LiveJsKwaiLiveCommands$45 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$45.INSTANCE = new LiveJsKwaiLiveCommands$45();
    }
    public void LiveJsKwaiLiveCommands$45(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$45.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdUpdateBarrage();
    }
}
