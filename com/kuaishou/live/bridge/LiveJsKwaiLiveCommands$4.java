package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k71.p;

public final class LiveJsKwaiLiveCommands$4 extends Lambda implements a	// class@000da1
{
    public static final LiveJsKwaiLiveCommands$4 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$4.INSTANCE = new LiveJsKwaiLiveCommands$4();
    }
    public void LiveJsKwaiLiveCommands$4(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p();
    }
}
