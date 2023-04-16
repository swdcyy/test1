package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager$b;
import tj1.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import java.lang.String;
import tj1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class LiveGiltSlotDisplayManager$b implements b	// class@00126a
{
    public final LiveGiltSlotDisplayManager a;

    public void LiveGiltSlotDisplayManager$b(LiveGiltSlotDisplayManager p0){
       this.a = p0;
       super();
    }
    public void a(GiftSlotMessage p0,GiftSlotMessage p1,String p2,int p3){
       a.h(this, p0, p1, p2, p3);
    }
    public void b(GiftSlotMessage p0,int p1){
       a.g(this, p0, p1);
    }
    public void c(GiftSlotMessage p0,int p1){
       a.f(this, p0, p1);
    }
    public void d(GiftSlotMessage p0,int p1){
       a.d(this, p0, p1);
    }
    public void e(GiftSlotMessage p0,GiftSlotMessage p1,int p2){
       a.c(this, p0, p1, p2);
    }
    public void f(GiftSlotMessage p0,int p1){
       a.a(this, p0, p1);
    }
    public void g(GiftSlotMessage p0,int p1){
       a.b(this, p0, p1);
    }
    public void h(GiftSlotMessage p0,int p1){
       a.e(this, p0, p1);
    }
    public void i(int p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveGiltSlotDisplayManager$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LiveGiltSlotDisplayManager$b.class, "1")) {
          return;
       }
       if (!p1) {
          LiveGiltSlotDisplayManager$b ta = this.a;
          ta.d(ta.c());
       }
       return;
    }
}
