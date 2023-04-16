package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$62;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetDevicePerformanceScore;

public final class LiveJsKwaiLiveCommands$62 extends Lambda implements a	// class@000daf
{
    public static final LiveJsKwaiLiveCommands$62 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$62.INSTANCE = new LiveJsKwaiLiveCommands$62();
    }
    public void LiveJsKwaiLiveCommands$62(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$62.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdGetDevicePerformanceScore();
    }
}
