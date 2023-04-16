package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$b;
import android.os.Handler;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import iq7.j;

public final class ProgressPreviewElement$b extends Handler	// class@0013b8
{
    public final ProgressPreviewElement a;

    public void ProgressPreviewElement$b(ProgressPreviewElement p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressPreviewElement$b.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       ProgressPreviewElement$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, ProgressPreviewElement.class, "10")) {
          ta.E().h(true);
       }
       return;
    }
}
