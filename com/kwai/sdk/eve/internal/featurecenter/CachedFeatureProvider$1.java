package com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CachedFeatureProvider$1 extends Lambda implements a	// class@0014c6
{
    public final CachedFeatureProvider this$0;

    public void CachedFeatureProvider$1(CachedFeatureProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, CachedFeatureProvider$1.class, "1")) {
          return;
       }
       this.this$0.notifyFeatureChange();
       return;
    }
}
