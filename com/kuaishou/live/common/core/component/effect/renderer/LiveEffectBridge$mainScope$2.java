package com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$mainScope$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ftd.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.l0;

public final class LiveEffectBridge$mainScope$2 extends Lambda implements a	// class@0010ea
{
    public static final LiveEffectBridge$mainScope$2 INSTANCE;

    static {
       LiveEffectBridge$mainScope$2.INSTANCE = new LiveEffectBridge$mainScope$2();
    }
    public void LiveEffectBridge$mainScope$2(){
       super(0);
    }
    public final k0 invoke(){
       Object obj = PatchProxy.apply(null, this, LiveEffectBridge$mainScope$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l0.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
