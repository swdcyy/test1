package com.kuaishou.live.lite.performance.warmup.classwarmup.LiteClassWarmup$needStartExecuteWarmup$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiteClassWarmup$needStartExecuteWarmup$2 extends Lambda implements a	// class@000a50
{
    public static final LiteClassWarmup$needStartExecuteWarmup$2 INSTANCE;

    static {
       LiteClassWarmup$needStartExecuteWarmup$2.INSTANCE = new LiteClassWarmup$needStartExecuteWarmup$2();
    }
    public void LiteClassWarmup$needStartExecuteWarmup$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final AtomicBoolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiteClassWarmup$needStartExecuteWarmup$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AtomicBoolean(true);
    }
}
