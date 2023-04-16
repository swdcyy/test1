package com.kuaishou.live.lite.krn.LiveLiteJsCommands$9;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser;

public final class LiveLiteJsCommands$9 extends Lambda implements a	// class@0009da
{
    public static final LiveLiteJsCommands$9 INSTANCE;

    static {
       LiveLiteJsCommands$9.INSTANCE = new LiveLiteJsCommands$9();
    }
    public void LiveLiteJsCommands$9(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteJsCommands$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdFollowUser();
    }
}
