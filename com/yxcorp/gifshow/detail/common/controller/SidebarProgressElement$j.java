package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$j;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import kq7.k;
import java.util.Objects;
import pp7.b;

public final class SidebarProgressElement$j implements g	// class@0013ce
{
    public final SidebarProgressElement b;

    public void SidebarProgressElement$j(SidebarProgressElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$j.class, "1")) {
       }else {
          k ok = this.b.E();
          int i = p0.intValue();
          Objects.requireNonNull(ok);
          k ok1 = k.class;
          if (!PatchProxy.isSupport(ok1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ok, ok1, "18")) {
             ok.k.f(Integer.valueOf(i));
          }
       }
       return;
    }
}
