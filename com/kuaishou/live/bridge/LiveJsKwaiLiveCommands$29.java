package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$29;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j71.d;

public final class LiveJsKwaiLiveCommands$29 extends Lambda implements a	// class@000d8a
{
    public static final LiveJsKwaiLiveCommands$29 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$29.INSTANCE = new LiveJsKwaiLiveCommands$29();
    }
    public void LiveJsKwaiLiveCommands$29(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$29.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}