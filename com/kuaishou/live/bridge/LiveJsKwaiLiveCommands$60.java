package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$60;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo;

public final class LiveJsKwaiLiveCommands$60 extends Lambda implements a	// class@000dad
{
    public static final LiveJsKwaiLiveCommands$60 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$60.INSTANCE = new LiveJsKwaiLiveCommands$60();
    }
    public void LiveJsKwaiLiveCommands$60(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$60.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdGetInteractMagicFaceInfo();
    }
}
