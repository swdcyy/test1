package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$3;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveGlobalFeatureCalculator$activate$3 implements g	// class@0014fb
{
    public static final EveGlobalFeatureCalculator$activate$3 INSTANCE;

    static {
       EveGlobalFeatureCalculator$activate$3.INSTANCE = new EveGlobalFeatureCalculator$activate$3();
    }
    public void EveGlobalFeatureCalculator$activate$3(){
       super();
    }
    public void accept(Object p0){
       this.accept(p0);
    }
    public final void accept(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator$activate$3.class, "1")) {
          return;
       }
       a.o(p0, "it");
       EveLog.e$default("EveGlobalFeatureCalculator#result calculate error", p0, false, 4, null);
       return;
    }
}
