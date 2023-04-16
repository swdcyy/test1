package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$84;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus;

public final class LiveJsKwaiLiveCommands$84 extends Lambda implements a	// class@000dc7
{
    public static final LiveJsKwaiLiveCommands$84 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$84.INSTANCE = new LiveJsKwaiLiveCommands$84();
    }
    public void LiveJsKwaiLiveCommands$84(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$84.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdQueryUserChatInviteStatus();
    }
}
