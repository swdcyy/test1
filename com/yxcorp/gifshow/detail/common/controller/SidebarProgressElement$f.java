package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SidebarProgressElement$f implements g	// class@0013ca
{
    public final SidebarProgressElement b;

    public void SidebarProgressElement$f(SidebarProgressElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$f.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.O = p0.booleanValue();
       }
       return;
    }
}
