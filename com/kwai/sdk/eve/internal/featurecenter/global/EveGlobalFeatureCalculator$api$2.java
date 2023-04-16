package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$api$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import com.kwai.sdk.eve.internal.api.EveApi;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import en7.r;
import java.util.concurrent.ConcurrentHashMap;
import vsd.d;
import nsd.m0;
import java.lang.ref.WeakReference;
import vm7.a;
import java.util.Map;

public final class EveGlobalFeatureCalculator$api$2 extends Lambda implements a	// class@0014fc
{
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$api$2(EveGlobalFeatureCalculator p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveApi invoke(){
       EveApi uEveApi = EveApi.class;
       Object[] objArray = null;
       EveGlobalFeatureCalculator obj = PatchProxy.apply(objArray, this, EveGlobalFeatureCalculator$api$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.eveContext;
       r b = r.b;
       ConcurrentHashMap uConcurrentH = b.a();
       _monitor_enter(uConcurrentH);
       WeakReference weakReferenc = b.a().get(m0.d(uEveApi));
       if (weakReferenc != null) {
          objArray = weakReferenc.get();
       }
       if (!objArray instanceof EveApi) {
          objArray = new EveApi(obj);
          b.a().put(m0.d(uEveApi), new WeakReference(objArray));
       }
       _monitor_exit(uConcurrentH);
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
