package com.kuaishou.live.basic.tk.LiveTkBridge$mainScope$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ftd.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.l0;

public final class LiveTkBridge$mainScope$2 extends Lambda implements a	// class@000d19
{
    public static final LiveTkBridge$mainScope$2 INSTANCE;

    static {
       LiveTkBridge$mainScope$2.INSTANCE = new LiveTkBridge$mainScope$2();
    }
    public void LiveTkBridge$mainScope$2(){
       super(0);
    }
    public final k0 invoke(){
       Object obj = PatchProxy.apply(null, this, LiveTkBridge$mainScope$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l0.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
