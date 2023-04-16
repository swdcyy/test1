package com.kwai.live.gzone.accompanyplay.audience.u0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.TextView;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.f1;
import erd.g;
import crd.b;
import ekd.m1;
import android.content.Context;
import d61.f0;
import k37.e1;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;

public class u0 extends PresenterV2	// class@000bba
{
    public k0$g p;
    public p0$e q;
    public TextView r;
    public View s;
    public TextView t;
    public TextView u;
    public View v;
    public TextView w;
    public a x;

    public void u0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "3")) {
          return;
       }
       this.v.getLayoutParams().width = -1;
       this.w.setText(R.string.arg_RES_7f10237c);
       this.X7(this.p.n().subscribe(new f1(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1213);
       this.s = m1.f(p0, 0x7f0a11d3);
       this.t = m1.f(p0, 0x7f0a11dd);
       this.u = m1.f(p0, 0x7f0a1222);
       this.v = m1.f(p0, 0x7f0a11ea);
       this.w = m1.f(p0, 0x7f0a11eb);
       f0.i(this.r, this.getContext());
       m1.a(p0, new e1(this), R.id.gzone_accompany_wait_bottom_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.q = this.r8("LIVE_GZONE_ACCOMPANY_SDK_SERVICE");
       return;
    }
}
