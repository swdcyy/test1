package com.kuaishou.live.gzone.treasurebox.presenter.n;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.p;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import fq5.b;
import brd.t;
import p53.y0;
import p53.x0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p53.w0;
import p53.v0;

public final class n implements g	// class@001c8e
{
    public final p b;

    public void n(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, op, "4")) {
          p e = tb.E;
          if (e != null && e.mTaskID != null) {
             if (e.mTaskStatus == 3) {
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(e, Integer.valueOf(i), tb, op, "6")) {
                   tb.X7(tb.V8(tb.t.getLiveStreamId(), e.mTaskID, e.mPrizeId).subscribe(new y0(tb, e, i), new x0(tb, e, i)));
                }
             }else if(PatchProxy.isSupport(op) && (PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, op, "5") || tb.E == null)){
                tb.X7(tb.S8(tb.t.getLiveStreamId(), tb.E.mTaskID).subscribe(new w0(tb, i), new v0(tb, i)));
             }
          }
       }
       return;
    }
}
