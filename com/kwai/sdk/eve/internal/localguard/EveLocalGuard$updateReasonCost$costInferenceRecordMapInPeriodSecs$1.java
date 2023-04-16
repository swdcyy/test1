package com.kwai.sdk.eve.internal.localguard.EveLocalGuard$updateReasonCost$costInferenceRecordMapInPeriodSecs$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kn7.p;
import java.lang.Object;
import kn7.j;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EveLocalGuard$updateReasonCost$costInferenceRecordMapInPeriodSecs$1 extends Lambda implements l	// class@00156c
{
    public final p $totalCostLimit;

    public void EveLocalGuard$updateReasonCost$costInferenceRecordMapInPeriodSecs$1(p p0){
       this.$totalCostLimit = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveLocalGuard$updateReasonCost$costInferenceRecordMapInPeriodSecs$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (p0.e - this.$totalCostLimit.value > 0)? true: false;
       return b;
    }
}
