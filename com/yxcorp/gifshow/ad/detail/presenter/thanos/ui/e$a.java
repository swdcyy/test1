package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.e$a;
import vy6.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import mn6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import ln6.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import t45.d;
import brd.z;
import r19.l;
import com.gifshow.tuna.player.poi.e;
import erd.g;

public class e$a implements a	// class@0016dc
{
    public b b;
    public final e c;

    public void e$a(e p0){
       this.c = p0;
       super();
       this.b = null;
    }
    public void B0(){
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       e$a tb = this.b;
       if (tb != null) {
          tb.dispose();
          this.b = null;
       }
       e t = this.c.t;
       if (t != null) {
          t.g();
       }
       this.c.t = null;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       if (!this.c.r.hasVote()) {
          return;
       }
       this.b = y6.s(b.class, LoadPolicy.SILENT_IF_DOWNLOADED).G(d.a).R(new l(this), e.b);
       return;
    }
    public void k1(){
    }
}
