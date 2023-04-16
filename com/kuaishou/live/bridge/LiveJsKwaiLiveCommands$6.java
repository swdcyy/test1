package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.a;

public final class LiveJsKwaiLiveCommands$6 extends Lambda implements a	// class@000db7
{
    public static final LiveJsKwaiLiveCommands$6 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$6.INSTANCE = new LiveJsKwaiLiveCommands$6();
    }
    public void LiveJsKwaiLiveCommands$6(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
