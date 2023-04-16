package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$b;
import mc6.b;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import qp7.x0;
import qp7.b;
import kq7.k;

public final class SidebarProgressElement$b extends b	// class@0013c3
{
    public final SidebarProgressElement a;

    public void SidebarProgressElement$b(SidebarProgressElement p0){
       this.a = p0;
       super();
    }
    public void c(long p0,long p1){
       SidebarProgressElement$b uob = SidebarProgressElement$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.E().l((int)(((float)((long)0x2710 * p0) * 0x3f800000) / (float)p1));
       return;
    }
}
