package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.EveManager;

public final class EveGlobalFeatureCalculator$activate$1 extends Lambda implements l	// class@0014f8
{
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$activate$1(EveGlobalFeatureCalculator p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       EveGlobalFeatureCalculator obj = PatchProxy.applyOneRefs(p0, this, EveGlobalFeatureCalculator$activate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0.lock;
       _monitor_enter(obj);
       String str = String.valueOf(SystemClock.elapsedRealtimeNanos());
       if (a.g(p0, "featureReport")) {
          EveGlobalFeatureCalculator uEveGlobalFe = this.this$0.featureReportInferenceId;
          StringBuilder str1 = (uEveGlobalFe == null || !uEveGlobalFe.length())? 1: null;
          if (!str1) {
             EveLog.i$default("EveGlobalFeatureCalculator cancel last feature report infer: "+this.this$0.featureReportInferenceId, false, 2, null);
             EveGlobalFeatureCalculator uEveGlobalFe1 = this.this$0.featureReportInferenceId;
             a.m(uEveGlobalFe1);
             EveManager.p.d("EveGlobalFeatureCalculate", uEveGlobalFe1);
             this.this$0.featureReportInferenceId = str;
          }
       }
       EveLog.i$default("EveGlobalFeatureCalculator#idGenerator calculate start "+str+" for pipeline:"+p0, false, 2, null);
       _monitor_exit(obj);
       return str;
    }
}
