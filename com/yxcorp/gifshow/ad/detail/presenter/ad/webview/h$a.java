package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import mxb.o;
import u09.w;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import joc.z;
import com.yxcorp.gifshow.widget.SwipeLayout;
import u09.v;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.g;
import erd.g;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import t45.d;
import brd.z;
import u09.u;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.j;

public class h$a extends a	// class@001648
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$a.class, "2")) {
          return;
       }
       b9.a(this.b.H);
       k1.m(this.b.K);
       b9.a(this.b.F);
       b9.a(this.b.J);
       o.a = objArray;
       this.b.R = false;
       k1.r(new w(this), 0);
       h d = this.b.D;
       if (d != null) {
          d.a();
       }
       d = this.b.E;
       if (d != null) {
          d.a();
       }
       h$a tb = this.b;
       h z = tb.z;
       if (z != null) {
          z.m(tb.x);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       c c = o.c;
       if (c != null) {
          h$a tb = this.b;
          tb.J = c.subscribe(new v(tb), g.b);
       }
       this.b.H = RxBus.f.f(s.class).observeOn(d.a).subscribe(new u(this.b));
       if (j.F(this.b.q)) {
          h$a tb1 = this.b;
          k1.r(tb1.K, j.v(tb1.q));
       }
       return;
    }
}
