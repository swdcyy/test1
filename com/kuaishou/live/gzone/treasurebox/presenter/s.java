package com.kuaishou.live.gzone.treasurebox.presenter.s;
import c12.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import j77.b;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import r53.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.gzone.treasurebox.presenter.s$a;
import erd.g;
import crd.b;
import brd.t;

public class s extends f	// class@001c9b
{
    public b K;
    public b L;
    public a M;
    public TreasureBoxCommonModel N;
    public long O;
    public static String sLivePresenterClassName = "LiveTreasureBoxTaskCountDownPresenter";

    public void s(){
       super();
    }
    public void Q(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "4")) {
          return;
       }
       this.a9();
       s tL = this.L;
       if (tL != null) {
          tL.c("treasure_task_count_down");
       }
       tL = this.K;
       if (tL != null && tL.p() != null) {
          this.K.p().u(null);
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       s tL = this.L;
       if (tL != null) {
          tL.d("treasure_task_count_down");
       }
       this.O = 0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.t8("LIVE_GZONE_TREASUREBOX_SERVICE");
       this.L = this.s8(b.class);
       return;
    }
    public void x(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "2")) {
          return;
       }
       if (this.L != null) {
          s tK = this.K;
          if (tK != null) {
             this.O = 0;
             TreasureBoxCommonModel treasureBoxC = tK.p();
             this.N = treasureBoxC;
             treasureBoxC = treasureBoxC.s;
             this.M = treasureBoxC;
             this.X7(treasureBoxC.subscribe(new s$a(this)));
             this.L.e("treasure_task_count_down");
          }
       }
       return;
    }
}
