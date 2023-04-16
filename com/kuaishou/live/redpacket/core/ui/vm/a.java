package com.kuaishou.live.redpacket.core.ui.vm.a;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$b;
import zh3.c;

public class a extends RedPacketBaseViewModel	// class@000f40
{

    public void a(w p0){
       super(p0);
    }
    public void x0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.x0(p0);
       if (p0 instanceof RedPacketBaseViewModel$b) {
          this.b.q(p0);
       }
       return;
    }
}
