package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Object;
import rd5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class SidebarProgressElement$g implements g	// class@0013cb
{
    public final SidebarProgressElement b;

    public void SidebarProgressElement$g(SidebarProgressElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$g.class, "1")) {
       }else {
          a.p(p0, "mediaPlayProgressEvent");
          SidebarProgressElement$g tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, SidebarProgressElement.class, "9") || (tb.K != null && tb.I == null)) {
             a = p0.a;
             tb.y0();
             long l = 0;
             if (!a - l) {
                tb.H = -1;
             }
             SidebarProgressElement h = tb.H;
             if (h - l < 0 || (h + (long)100) - a <= 0) {
                tb.H = -1;
             }
          }
       }
       return;
    }
}
