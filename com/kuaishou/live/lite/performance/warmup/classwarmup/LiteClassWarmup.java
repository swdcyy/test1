package com.kuaishou.live.lite.performance.warmup.classwarmup.LiteClassWarmup;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiteClassWarmup$needStartExecuteWarmup$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiteClassWarmup$isExecuting$2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiteClassWarmup	// class@000a51
{
    public static final p a;
    public static final p b;
    public static GifshowActivity c;
    public static LiveLiteFakeFragment d;
    public static final LiteClassWarmup e;

    static {
       LiteClassWarmup.e = new LiteClassWarmup();
       LiteClassWarmup.a = s.c(LiteClassWarmup$needStartExecuteWarmup$2.INSTANCE);
       LiteClassWarmup.b = s.c(LiteClassWarmup$isExecuting$2.INSTANCE);
    }
    public void LiteClassWarmup(){
       super();
    }
    public final AtomicBoolean a(){
       Object obj = PatchProxy.apply(null, this, LiteClassWarmup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiteClassWarmup.a.getValue();
    }
    public final AtomicBoolean b(){
       Object obj = PatchProxy.apply(null, this, LiteClassWarmup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiteClassWarmup.b.getValue();
    }
}
