package com.kuaishou.live.gzone.treasurebox.presenter.s$a;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.s;
import java.lang.Object;
import o53.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import j77.b;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import mrd.a;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;
import java.lang.Math;

public class s$a implements g	// class@001c9a
{
    public final s b;

    public void s$a(s p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
       }else {
          s$a tb = this.b;
          p0 = p0.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, s.class, "3")) {
             s l = tb.L;
             if (l != null && (p0 != null && p0.mTaskStatus == 2)) {
                LiveTreasureBoxListResponse liveTreasure = null;
                if (p0.mTaskProgress - liveTreasure > 0) {
                   if ((l.f("treasure_task_count_down") / 1000) - liveTreasure > 0) {
                      if (tb.N.r.i() != null) {
                         liveTreasure = tb.N.r.i().mToleranceSecond;
                      }
                      if (Math.abs((tb.O - p0.mTaskProgress)) - (liveTreasure * 1000) >= 0) {
                      label_0066 :
                         LiveGzoneTreasureTask mTaskProgres = p0.mTaskProgress;
                         tb.O = mTaskProgres;
                         tb.L.b("treasure_task_count_down", mTaskProgres, true);
                      }
                   }else {
                      goto label_0066 ;
                   }
                }
             }
             tb.a9();
          }
       }
       return;
    }
}
