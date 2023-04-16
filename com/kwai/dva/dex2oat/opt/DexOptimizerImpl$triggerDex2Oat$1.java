package com.kwai.dva.dex2oat.opt.DexOptimizerImpl$triggerDex2Oat$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kwai.dva.dex2oat.opt.DexOptimizerImpl;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.ClassLoader;

public final class DexOptimizerImpl$triggerDex2Oat$1 extends ContinuationImpl	// class@000d18
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public Object result;
    public final DexOptimizerImpl this$0;

    public void DexOptimizerImpl$triggerDex2Oat$1(DexOptimizerImpl p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DexOptimizerImpl$triggerDex2Oat$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.b(null, null, null, null, this);
    }
}
