package com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion;
import nsd.u;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import java.lang.Math;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.framework.kgi.sdk.internal.store.b;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$mPostFeatureList$1;
import msd.l;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$mAllFeatureList$1;
import q76.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.StringBuilder;
import y76.b;

public final class KgiDataCenter	// class@001597
{
    public final b a;
    public final b b;
    public final int c;
    public static final int d;
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;
    public static final KgiDataCenter$Companion g;

    static {
       KgiDataCenter.g = new KgiDataCenter$Companion(null);
       KgiDataCenter.d = Math.max(40, Math.min(100, (KgiConfig.g.b() / 10)));
       KgiDataCenter.e = new ConcurrentHashMap();
       KgiDataCenter.f = new ConcurrentHashMap();
    }
    public void KgiDataCenter(int p0){
       super();
       this.c = p0;
       KgiConfig g = KgiConfig.g;
       int d = KgiDataCenter.d;
       this.a = new b(g.b(), d, KgiDataCenter$mPostFeatureList$1.INSTANCE);
       this.b = new b(g.b(), d, KgiDataCenter$mAllFeatureList$1.INSTANCE);
    }
    public final void a(a p0){
       boolean b;
       KgiDataCenter kgiDataCente = KgiDataCenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kgiDataCente, "2")) {
          return;
       }
       KgiDataCenter tc = this.c;
       if (PatchProxy.isSupport(kgiDataCente)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(tc), this, kgiDataCente, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_0029 :
             Objects.requireNonNull(KgiDataCenter.g);
             b = (tc == null)? true: false;
             if (b) {
                b = p0.e();
             }else {
                b = p0.d(tc);
             }
          }
       }else {
          goto label_0029 ;
       }
       if (!b) {
          b.b("#KgiDataCenter.addFeature: "+"the feature is not apply to the data center["+this.c+"], feature = "+p0.b(), false, 2, null);
          return;
       }else {
          this.a.b(p0);
          return;
       }
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, KgiDataCenter.class, "4")) {
          return;
       }
       KgiDataCenter.f.remove(Integer.valueOf(this.c));
       this.b.c();
       this.a.c();
       return;
    }
}
