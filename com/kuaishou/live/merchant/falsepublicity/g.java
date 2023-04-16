package com.kuaishou.live.merchant.falsepublicity.g;
import k51.c;
import com.kuaishou.live.merchant.falsepublicity.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ft5.d;
import ft5.b;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SurveyClientPushInfoSignal;
import brd.t;
import ks3.k0;
import com.kuaishou.live.merchant.falsepublicity.f;
import erd.r;
import dg3.f;
import com.kuaishou.live.merchant.falsepublicity.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Dialog;
import com.kuaishou.live.merchant.falsepublicity.d;
import p91.m;
import ks3.r;

public class g extends c	// class@000cb4
{
    public m p;
    public a0 q;
    public r r;
    public k0 s;
    public boolean t;
    public d u;
    public d v;
    public static String sLivePresenterClassName = "LiveMerchantAudienceFalsePublicityPresenter";

    public void g(){
       super();
       this.v = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       a0 y1 = this.q.Y1;
       if (y1 != null) {
          y1.Le(this.v);
       }
       this.X7(this.s.a("merchantSurveyClientPush", LiveRoomSignalMessage$SurveyClientPushInfoSignal.class).filter(f.b).subscribe(new f(this), e.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       a0 y1 = this.q.Y1;
       if (y1 != null) {
          y1.Yj(this.v);
       }
       g tu = this.u;
       if (tu != null && tu.isShowing()) {
          this.u.dismiss();
          this.u = null;
       }
       this.t = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.q8(a0.class);
       this.r = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.s = this.r8("LIVE_MERCHANT_SIGNAL_SERVICE");
       return;
    }
}
