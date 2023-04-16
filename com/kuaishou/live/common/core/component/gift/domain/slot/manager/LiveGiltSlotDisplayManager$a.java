package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager$a;
import yj1.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import gk1.b;
import gk1.d;
import java.lang.Boolean;

public class LiveGiltSlotDisplayManager$a implements b	// class@001269
{
    public final LiveGiltSlotDisplayManager a;

    public void LiveGiltSlotDisplayManager$a(LiveGiltSlotDisplayManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       LiveGiltSlotDisplayManager$a uoa = LiveGiltSlotDisplayManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (this.a.d.a().size() > p0) {
          this.a.d.a().get(p0).d3(2);
       }
       this.a.e();
       return;
    }
    public void b(){
    }
    public void c(int p0){
       LiveGiltSlotDisplayManager$a uoa = LiveGiltSlotDisplayManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a.d.a().size() > p0) {
          this.a.d.a().get(p0).d3(2);
       }
       this.a.e();
       return;
    }
    public void d(boolean p0){
       LiveGiltSlotDisplayManager$a uoa = LiveGiltSlotDisplayManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (!p0) {
          this.a.e();
       }
       return;
    }
    public void e(){
    }
    public void f(){
    }
}
