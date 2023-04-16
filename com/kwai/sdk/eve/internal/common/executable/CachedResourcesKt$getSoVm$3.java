package com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$getSoVm$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.sdk.eve.internal.inference.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CachedResourcesKt$getSoVm$3 extends FunctionReferenceImpl implements l	// class@001477
{
    public static final CachedResourcesKt$getSoVm$3 INSTANCE;

    static {
       CachedResourcesKt$getSoVm$3.INSTANCE = new CachedResourcesKt$getSoVm$3();
    }
    public void CachedResourcesKt$getSoVm$3(){
       super(1, CachedResourcesKt.class, "releaseResource", "releaseResource\(Lcom/kwai/sdk/eve/internal/inference/EveInference;\)V", 1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CachedResourcesKt$getSoVm$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CachedResourcesKt.f(p0);
       return;
    }
}
