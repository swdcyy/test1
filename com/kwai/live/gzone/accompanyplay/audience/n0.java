package com.kwai.live.gzone.accompanyplay.audience.n0;
import f37.b0;
import k37.t0;
import k37.u0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import mq5.h;
import mq5.b;
import oq5.c;
import oq5.a;
import android.view.View;
import ekd.m1;
import com.kwai.live.gzone.accompanyplay.audience.n0$a;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;

public class n0 extends b0	// class@000b9e
{
    public LiveGzoneAccompanyTabHostFragment$e q;
    public k0$g r;
    public View s;
    public h t;
    public c u;

    public void n0(){
       super();
       this.t = new t0(this);
       this.u = new u0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "3")) {
          return;
       }
       this.r.w().e.Km(this.t);
       this.r.w().d.W0(this.u, false);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "5")) {
          return;
       }
       super.J8();
       this.r.w().e.le(this.t);
       this.r.w().d.Q0(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.gzone_menu_button);
       this.s = p0;
       p0.setOnClickListener(new n0$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_TAB_HOST_SERVICE");
       this.r = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       return;
    }
}
