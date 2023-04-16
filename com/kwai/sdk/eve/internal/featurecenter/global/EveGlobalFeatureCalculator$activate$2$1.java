package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$2$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$2;
import sm7.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ml5.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;

public final class EveGlobalFeatureCalculator$activate$2$1 implements Runnable	// class@0014f9
{
    public final l $it;
    public final EveGlobalFeatureCalculator$activate$2 this$0;

    public void EveGlobalFeatureCalculator$activate$2$1(EveGlobalFeatureCalculator$activate$2 p0,l p1){
       this.this$0 = p0;
       this.$it = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveGlobalFeatureCalculator$activate$2$1.class, "1")) {
          return;
       }
       EveLog.i$default("EveGlobalFeatureCalculator#result calculate finish "+this.$it.b()+", pipeline:"+this.$it.d()+", result:"+this.$it.f(), false, 2, objArray);
       EveGlobalFeatureCalculator$activate$2$1 t$it = this.$it;
       a.o(t$it, "it");
       this.this$0.this$0.onInferResult(t$it);
       return;
    }
}
