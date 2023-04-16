package com.kuaishou.live.lite.krn.LiveLiteJsCommands$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter;

public final class LiveLiteJsCommands$3 extends Lambda implements a	// class@0009d4
{
    public static final LiveLiteJsCommands$3 INSTANCE;

    static {
       LiveLiteJsCommands$3.INSTANCE = new LiveLiteJsCommands$3();
    }
    public void LiveLiteJsCommands$3(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteJsCommands$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCmdDispatchLiveRouter();
    }
}
