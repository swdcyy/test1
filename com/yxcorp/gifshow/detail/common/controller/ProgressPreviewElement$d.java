package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$d;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import rf5.u;
import qp7.b;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import qp7.x0;
import iq7.j;

public final class ProgressPreviewElement$d implements g	// class@0013ba
{
    public final ProgressPreviewElement b;

    public void ProgressPreviewElement$d(ProgressPreviewElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressPreviewElement$d.class, "1")) {
       }else {
          Log.g("ProgressPreviewElement", "navigationVideoProgressDragTrigger: "+p0+", "+ProgressPreviewElement.n0(this.b).w()+", "+this.b.K());
          if (ProgressPreviewElement.n0(this.b).w() || !this.b.K()) {
             Log.g("ProgressPreviewElement", "side bar is expand, no preview!!!!");
          }else {
             a.o(p0, "it");
             if (p0.booleanValue()) {
                this.b.c0();
                this.b.q0();
             }else {
                this.b.b0();
                this.b.E().i(false);
             }
          }
       }
       return;
    }
}
