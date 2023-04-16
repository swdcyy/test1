package com.kuaishou.live.lite.krn.LiveLiteJsCommands$8;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k71.z;

public final class LiveLiteJsCommands$8 extends Lambda implements a	// class@0009d9
{
    public static final LiveLiteJsCommands$8 INSTANCE;

    static {
       LiveLiteJsCommands$8.INSTANCE = new LiveLiteJsCommands$8();
    }
    public void LiveLiteJsCommands$8(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteJsCommands$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new z();
    }
}
