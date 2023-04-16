package com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import androidx.lifecycle.LifecycleOwner;
import hx1.a;
import om1.e;
import qx1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import gm1.c;
import ah1.c;
import vj1.a;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import gm1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel$2;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel$3;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import pm1.b;

public class LiveGiftSlotModel extends Model	// class@001275
{
    public final a i;
    public final a j;
    public final e k;
    public final a l;
    public final a m;
    public CDNUrl[] n;
    public CDNUrl[] o;

    public void LiveGiftSlotModel(LifecycleOwner p0,a p1,e p2,a p3,LiveGiftSendModel p4,c p5,c p6,a p7){
       super(LiveGiftSlotModel.class.getName(), null, false, false);
       this.i = new a();
       this.n = null;
       this.o = null;
       this.m = p7;
       this.l = p1;
       this.j = p3;
       this.k = p2;
       p4.b(p0, new LiveGiftSlotModel$1(this));
       p5.b(p0, new LiveGiftSlotModel$2(this));
       p6.b(p0, new LiveGiftSlotModel$3(this));
    }
    public final void e(boolean p0,LiveSendGiftBaseTraceInfo p1,String p2,String p3,String p4,int p5){
       LiveGiftSlotModel liveGiftSlot = LiveGiftSlotModel.class;
       if (PatchProxy.isSupport(liveGiftSlot)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,p3,p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, liveGiftSlot, "9")) {
             return;
          }
       }
       if (!p0) {
          if (p5 != 1) {
             b.c0(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotModel][logTraceInfo]:", "message", p4);
          }
          return;
       }else {
          b uob = new b(p1, p2, p3);
          uob.h(p5, p4);
          this.k.k8(uob);
          return;
       }
    }
}
