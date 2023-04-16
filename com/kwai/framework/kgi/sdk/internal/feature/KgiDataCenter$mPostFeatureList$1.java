package com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$mPostFeatureList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import q76.a;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KgiDataCenter$mPostFeatureList$1 extends Lambda implements l	// class@001596
{
    public static final KgiDataCenter$mPostFeatureList$1 INSTANCE;

    static {
       KgiDataCenter$mPostFeatureList$1.INSTANCE = new KgiDataCenter$mPostFeatureList$1();
    }
    public void KgiDataCenter$mPostFeatureList$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiDataCenter$mPostFeatureList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$receiver");
       return p0.f();
    }
}
