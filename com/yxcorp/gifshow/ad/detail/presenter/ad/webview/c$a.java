package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.c$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import mxb.o;
import u09.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import joc.z;
import com.yxcorp.gifshow.widget.SwipeLayout;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.u;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import brd.t;
import t45.d;
import brd.z;
import u09.i;
import erd.g;
import tw.j;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import u09.h;

public class c$a extends a	// class@001642
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "2")) {
          return;
       }
       b9.a(this.b.H);
       k1.m(this.b.P);
       b9.a(this.b.F);
       b9.a(this.b.I);
       o.b = objArray;
       k1.r(new j(this), 0);
       c d = this.b.D;
       if (d != null) {
          d.a();
       }
       d = this.b.E;
       if (d != null) {
          d.a();
       }
       c$a tb = this.b;
       c z = tb.z;
       if (z != null) {
          z.m(tb.p);
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "1")) {
          return;
       }
       if (u.d(this.b.r)) {
          this.b.H = RxBus.f.f(s.class).observeOn(d.a).subscribe(new i(this.b));
          c$a tb = this.b;
          k1.r(tb.P, j.v(tb.r));
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, c.class, "15")) {
             GifshowActivity activity = tb.getActivity();
             if (activity != null && !activity.isFinishing()) {
                tb.I = activity.m().subscribe(new h(tb));
             }
          }
       }
       return;
    }
}
