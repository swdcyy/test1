package com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$mAttachChangedListener$2$a;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$mAttachChangedListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement;
import qp7.x0;
import qp7.b;
import gq7.d;
import kotlin.jvm.internal.a;

public final class BasePlayPauseElement$mAttachChangedListener$2$a extends y0	// class@0013a8
{
    public final BasePlayPauseElement$mAttachChangedListener$2 a;

    public void BasePlayPauseElement$mAttachChangedListener$2$a(BasePlayPauseElement$mAttachChangedListener$2 p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
       BasePlayPauseElement$mAttachChangedListener$2$a omAttachChan = BasePlayPauseElement$mAttachChangedListener$2$a.class;
       if (PatchProxy.isSupport(omAttachChan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omAttachChan, "2")) {
          return;
       }
       this.a.this$0.I0(false);
       if (a.g(this.a.this$0.E().g(), Boolean.TRUE) ^ 0x01) {
          this.a.this$0.F0();
       }
       this.a.this$0.C0();
       return;
    }
    public void f(boolean p0){
       BasePlayPauseElement$mAttachChangedListener$2$a omAttachChan = BasePlayPauseElement$mAttachChangedListener$2$a.class;
       if (PatchProxy.isSupport(omAttachChan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omAttachChan, "1")) {
          return;
       }
       this.a.this$0.I0(true);
       this.a.this$0.F0();
       this.a.this$0.B0();
       return;
    }
}
