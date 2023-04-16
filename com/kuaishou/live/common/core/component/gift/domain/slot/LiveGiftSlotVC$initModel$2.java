package com.kuaishou.live.common.core.component.gift.domain.slot.LiveGiftSlotVC$initModel$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import tj1.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import java.util.Iterator;
import java.util.List;
import gk1.d;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotQueueManager;

public final class LiveGiftSlotVC$initModel$2 implements Model$a	// class@00125b
{
    public final f b;

    public void LiveGiftSlotVC$initModel$2(f p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSlotVC$initModel$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSlotVC$initModel$2.class, "1")) {
       }else {
          a.p(p0, "source");
          p0.o = a.g(p2, Boolean.TRUE);
          Iterator iterator = this.b.j.iterator();
          while (iterator.hasNext()) {
             p1.t = this.b.o;
          }
          if (this.b.o != null) {
             b.Z(LiveGiftTag.GIFT_SLOT, "[LiveLiteSlotVC][giftSlotConfigModel]: disableGiftSlot = true");
             LiveGiltSlotDisplayManager liveGiltSlot = f.V2(this.b);
             Objects.requireNonNull(liveGiltSlot);
             if (!PatchProxy.applyVoid(null, liveGiltSlot, LiveGiltSlotDisplayManager.class, "6")) {
                liveGiltSlot.c.b();
             }
          }
       }
       return;
    }
}
