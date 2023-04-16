package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$7;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdProvideTreasureBoxParams;

public final class LiveJsKwaiLiveCommands$7 extends Lambda implements a	// class@000dc2
{
    public static final LiveJsKwaiLiveCommands$7 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$7.INSTANCE = new LiveJsKwaiLiveCommands$7();
    }
    public void LiveJsKwaiLiveCommands$7(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$7.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdProvideTreasureBoxParams();
    }
}
