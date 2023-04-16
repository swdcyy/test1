package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$b;
import aq5.b;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import x14.b;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;

public final class LivePendantRightArea$b implements b	// class@0018a4
{
    public final LivePendantRightArea b;

    public void LivePendantRightArea$b(LivePendantRightArea p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       LivePendantRightArea$b uob = LivePendantRightArea$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (this.b.b().size() > 0) {
          Pair[] pairArray = new Pair[]{r0.a("biz", p0),r0.a("enabled", Boolean.valueOf(p1))};
          this.b.f("onBizChanged", t0.W(pairArray));
          boolean b = this.b.w();
          uob = this.b;
          if ((b ^ 0x01) != uob.h) {
             uob.B(b, "bizChanged");
          }
       }
       return;
    }
}
