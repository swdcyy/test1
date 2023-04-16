package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$71;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdGetCurrentMagicFaceId;

public final class LiveJsKwaiLiveCommands$71 extends Lambda implements a	// class@000db9
{
    public static final LiveJsKwaiLiveCommands$71 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$71.INSTANCE = new LiveJsKwaiLiveCommands$71();
    }
    public void LiveJsKwaiLiveCommands$71(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$71.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdGetCurrentMagicFaceId();
    }
}
