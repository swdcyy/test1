package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$context$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vm7.a;
import java.lang.RuntimeException;

public final class EveGlobalFeatureCalculator$context$2 extends Lambda implements a	// class@0014fd
{
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$context$2(EveGlobalFeatureCalculator p0){
       this.this$0 = p0;
       super(0);
    }
    public final Context invoke(){
       Context obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator$context$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.eveContext.a();
       if (obj != null) {
          return obj;
       }
       throw new RuntimeException("null context");
    }
    public Object invoke(){
       return this.invoke();
    }
}
