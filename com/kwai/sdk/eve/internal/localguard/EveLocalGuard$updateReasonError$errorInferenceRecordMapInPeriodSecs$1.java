package com.kwai.sdk.eve.internal.localguard.EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kn7.j;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.InferenceState;

public final class EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1 extends Lambda implements l	// class@00156d
{
    public static final EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1 INSTANCE;

    static {
       EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1.INSTANCE = new EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1();
    }
    public void EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveLocalGuard$updateReasonError$errorInferenceRecordMapInPeriodSecs$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (p0.c() == InferenceState.ERROR)? true: false;
       return b;
    }
}
