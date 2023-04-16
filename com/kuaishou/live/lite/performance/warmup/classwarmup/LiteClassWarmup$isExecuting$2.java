package com.kuaishou.live.lite.performance.warmup.classwarmup.LiteClassWarmup$isExecuting$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiteClassWarmup$isExecuting$2 extends Lambda implements a	// class@000a4f
{
    public static final LiteClassWarmup$isExecuting$2 INSTANCE;

    static {
       LiteClassWarmup$isExecuting$2.INSTANCE = new LiteClassWarmup$isExecuting$2();
    }
    public void LiteClassWarmup$isExecuting$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final AtomicBoolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiteClassWarmup$isExecuting$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AtomicBoolean(false);
    }
}
