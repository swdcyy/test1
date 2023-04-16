package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$h;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import qp7.b;

public final class ProgressPreviewElement$h implements g	// class@0013be
{
    public final ProgressPreviewElement b;

    public void ProgressPreviewElement$h(ProgressPreviewElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressPreviewElement$h.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             Object[] objArray = new Object[0];
             o.C().w("ProgressPreviewElement", "tryHide mCoronaPayPanelSubject "+this.b.s(), objArray);
             this.b.b0();
          }
       }
       return;
    }
}
