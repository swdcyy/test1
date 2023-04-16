package com.kuaishou.live.core.show.template.f;
import k51.c;
import hl2.g;
import com.kuaishou.live.core.show.template.d;
import com.kuaishou.live.core.show.template.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.livestream.message.nano.SCLiveActivityPopup;
import lf3.g;
import hf3.a;
import mq5.h;
import mq5.b;
import ekd.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import t02.r1;
import lp3.e;

public class f extends c	// class@001184
{
    public m p;
    public e q;
    public a0 r;
    public r1 s;
    public a t;
    public LiveActivityPopupDialog u;
    public final h v;
    public final g w;
    public c x;
    public static String sLivePresenterClassName = "LiveActivityPopupPresenter";

    public void f(){
       super();
       this.v = new g(this);
       this.w = new d(this);
       this.x = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       f tr = this.r;
       if (tr != null && tr.h != null) {
          tr.y2.P4(this.x);
       }else {
          this.R8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       f tr = this.r;
       if (tr != null && tr.h != null) {
          tr.y2.d5(this.x);
       }
       this.S8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       x.E(this.u);
       this.u = null;
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       this.t.u0(678, SCLiveActivityPopup.class, this.w);
       f tr = this.r;
       if (tr != null) {
          tr.D2.Km(this.v);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.P8();
       f tr = this.r;
       if (tr != null) {
          tr.D2.le(this.v);
       }
       this.t.o(678, this.w);
       k1.n(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.s8(a0.class);
       this.s = this.s8(r1.class);
       this.t = this.r8("LIVE_LONG_CONNECTION");
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
