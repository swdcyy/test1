package com.kwai.live.gzone.accompanyplay.audience.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.g;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.f;
import erd.g;
import crd.b;
import java.lang.Boolean;
import android.widget.TextView;
import android.view.View;
import j77.c;
import j77.b;
import ekd.m1;
import k37.p1;

public class r extends PresenterV2	// class@000bb0
{
    public k0$g p;
    public b q;
    public c r;
    public TextView s;
    public View t;
    public TextView u;
    public View v;

    public void r(){
       super();
    }
    public void E8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "4") && this.r == null) {
          this.r = new g(this, "AccompanyCountdown");
       }
       this.X7(this.p.n().subscribe(new f(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "8")) {
          return;
       }
       this.R8();
       return;
    }
    public void P8(boolean p0,boolean p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, or, "5")) {
          return;
       }
       or = this.u;
       int i = 0;
       int i1 = (p0 && !p1)? 0: 8;
       or.setVisibility(i1);
       or = this.v;
       i1 = (p0 && !p1)? 0: 8;
       or.setVisibility(i1);
       or = this.s;
       i1 = (p0 && p1)? 0: 8;
       or.setVisibility(i1);
       or = this.t;
       if (!p0 || !p1) {
          i = 8;
       }
       or.setVisibility(i);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, r.class, "7")) {
          return;
       }
       this.q.g(this.r);
       this.q.d("AccompanyCountdown");
       this.P8(false, false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a11c8);
       this.t = m1.f(p0, 0x7f0a11c7);
       this.u = m1.f(p0, 0x7f0a11e7);
       this.v = m1.f(p0, 0x7f0a11e6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       k0$g og = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.p = og;
       this.q = og.w().c;
       return;
    }
}
