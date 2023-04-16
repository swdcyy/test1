package com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$mAttachChangedListener$2$a;
import qp7.y0;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$mAttachChangedListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement;
import qp7.b;

public final class LocalSimpleLabelElement$mAttachChangedListener$2$a extends y0	// class@000f8b
{
    public final LocalSimpleLabelElement$mAttachChangedListener$2 a;

    public void LocalSimpleLabelElement$mAttachChangedListener$2$a(LocalSimpleLabelElement$mAttachChangedListener$2 p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
    }
    public void f(boolean p0){
       LocalSimpleLabelElement$mAttachChangedListener$2$a omAttachChan = LocalSimpleLabelElement$mAttachChangedListener$2$a.class;
       if (PatchProxy.isSupport(omAttachChan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omAttachChan, "1")) {
          return;
       }
       LocalSimpleLabelElement$mAttachChangedListener$2 this$0 = this.a.this$0;
       this$0.w = false;
       if (this$0.v != null) {
          this$0.c0();
       }
       return;
    }
}
