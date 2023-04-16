package com.kuaishou.live.core.show.activitydialog.d;
import k51.c;
import g22.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g22.h;
import vq5.b;
import vq5.d;
import t02.a0;
import mq5.h;
import mq5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import t02.r1;

public class d extends c	// class@00092d
{
    public e p;
    public a0 q;
    public r1 r;
    public d s;
    public LiveActivityBottomDialog t;
    public final h u;
    public static String sLivePresenterClassName = "LiveActivityDialogPresenter";

    public void d(){
       super();
       this.u = new g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.s.t5("activityBottomDialog", new h(this));
       d tq = this.q;
       if (tq != null) {
          tq.D2.Km(this.u);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.s.Z4("activityBottomDialog");
       d tq = this.q;
       if (tq != null) {
          tq.D2.le(this.u);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_SERVICE_MANAGER");
       this.q = this.s8(a0.class);
       this.r = this.s8(r1.class);
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
