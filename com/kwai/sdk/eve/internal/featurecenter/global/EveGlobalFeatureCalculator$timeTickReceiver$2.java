package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveGlobalFeatureCalculator$timeTickReceiver$2 extends Lambda implements a	// class@001506
{
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$timeTickReceiver$2(EveGlobalFeatureCalculator p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveGlobalFeatureCalculator$timeTickReceiver$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator$timeTickReceiver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveGlobalFeatureCalculator$timeTickReceiver$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
