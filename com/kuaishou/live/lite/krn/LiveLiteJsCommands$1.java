package com.kuaishou.live.lite.krn.LiveLiteJsCommands$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n41.c;

public final class LiveLiteJsCommands$1 extends Lambda implements a	// class@0009d2
{
    public static final LiveLiteJsCommands$1 INSTANCE;

    static {
       LiveLiteJsCommands$1.INSTANCE = new LiveLiteJsCommands$1();
    }
    public void LiveLiteJsCommands$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteJsCommands$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
