package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$c;
import jta.f;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import qp7.x0;
import qp7.b;
import kq7.k;

public final class SidebarProgressElement$c extends f	// class@0013c4
{
    public final SidebarProgressElement a;

    public void SidebarProgressElement$c(SidebarProgressElement p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       SidebarProgressElement$c uoc = SidebarProgressElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.a.E().k(false);
       return;
    }
    public void b(float p0){
       SidebarProgressElement$c uoc = SidebarProgressElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.E().k(true);
       return;
    }
}
