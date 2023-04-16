package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$f;
import io.reactivex.g;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ProgressPreviewElement$f implements g	// class@0013bc
{
    public final ProgressPreviewElement b;

    public void ProgressPreviewElement$f(ProgressPreviewElement p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressPreviewElement$f.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.b.J = p0;
       return;
    }
}
