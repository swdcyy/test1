package com.kwai.live.gzone.accompanyplay.audience.a1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.s1;
import erd.g;
import crd.b;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import k37.r1;
import android.view.View$OnClickListener;
import android.content.Context;
import d61.f0;

public class a1 extends PresenterV2	// class@000b66
{
    public k0$g p;
    public TextView q;
    public View r;
    public TextView s;
    public TextView t;
    public a u;
    public b v;

    public void a1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "3")) {
          return;
       }
       this.X7(this.p.n().subscribe(new s1(this)));
       return;
    }
    public void J8(){
       a1 uoa1 = a1.class;
       if (PatchProxy.applyVoid(null, this, uoa1, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa1, "5")) {
          uoa1 = this.v;
          if (uoa1 != null && uoa1.K()) {
             this.v.o();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1213);
       this.r = m1.f(p0, 0x7f0a11d3);
       this.s = m1.f(p0, 0x7f0a11dd);
       this.t = m1.f(p0, 0x7f0a1222);
       m1.a(p0, new r1(this), R.id.gzone_accompany_wait_bottom_button);
       f0.i(this.q, this.getContext());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       return;
    }
}
