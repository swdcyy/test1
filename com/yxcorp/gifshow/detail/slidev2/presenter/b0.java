package com.yxcorp.gifshow.detail.slidev2.presenter.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.a2;
import b8a.y1;
import b8a.z1;
import r7a.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.util.Objects;
import java.util.HashSet;
import java.util.Set;
import r7a.g$c;
import android.content.Context;
import android.view.View;
import ekd.m1;
import java.util.List;

public class b0 extends PresenterV2	// class@0018ee
{
    public List p;
    public ScaleHelpView q;
    public g r;
    public final g$e s;
    public final g$c t;
    public final g$d u;

    public void b0(){
       super();
       this.s = new a2(this);
       this.t = new y1(this);
       this.u = new z1(this);
    }
    public void E8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, b0.class, "4")) {
          return;
       }
       this.r.f(this.q);
       b0 tr = this.r;
       b0 ts = this.s;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(ts, tr, og, "2")) {
          if (tr.c == null) {
             tr.c = new HashSet();
          }
          tr.c.add(ts);
       }
       this.r.a(this.t);
       tr = this.r;
       ts = this.u;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(ts, tr, og, "6")) {
          if (tr.e == null) {
             tr.e = new HashSet();
          }
          tr.e.add(ts);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       g og = new g(this.getContext());
       this.r = og;
       og.h(true);
       return;
    }
    public void J8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, b0.class, "5")) {
          return;
       }
       this.r.i(this.q);
       b0 tr = this.r;
       b0 ts = this.s;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(ts, tr, og, "3")) {
          g c = tr.c;
          if (c != null) {
             c.remove(ts);
          }
       }
       this.r.g(this.t);
       tr = this.r;
       ts = this.u;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(ts, tr, og, "7")) {
          og = tr.e;
          if (og != null) {
             og.remove(ts);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_TAP_CLICK_ADAPTER");
       return;
    }
}
