package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$12;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect;

public final class LiveJsKwaiLiveCommands$12 extends Lambda implements a	// class@000d78
{
    public static final LiveJsKwaiLiveCommands$12 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$12.INSTANCE = new LiveJsKwaiLiveCommands$12();
    }
    public void LiveJsKwaiLiveCommands$12(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$12.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdMockSelfSendGiftEffect();
    }
}
