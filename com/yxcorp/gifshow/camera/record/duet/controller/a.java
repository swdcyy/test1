package com.yxcorp.gifshow.camera.record.duet.controller.a;
import ml8.d;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import bd9.d;
import android.graphics.RectF;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import bd9.g;
import cd9.a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import cd9.d;
import erd.g;
import crd.b;
import uc9.b;
import cd9.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import androidx.constraintlayout.widget.ConstraintLayout;
import qxc.b;
import ekd.m1;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import android.view.ViewGroup;
import pi9.e;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import cd9.b;
import com.yxcorp.gifshow.camera.record.widget.CameraView$c;
import tg9.b;
import java.util.Objects;
import j8c.a;
import q87.c;

public class a extends d0 implements d	// class@000dbd
{
    public AbsRecordBottomBarViewBinder A;
    public g B;
    public View o;
    public View p;
    public View q;
    public View r;
    public View s;
    public View t;
    public ViewStubInflater2 u;
    public View v;
    public RectF w;
    public RectF x;
    public d y;
    public j z;

    public void a(CameraPageType p0,b p1,d p2){
       super(p0, p1);
       this.w = new RectF();
       this.x = new RectF();
       this.y = p2;
       d tf = this.f;
       if (tf instanceof c) {
          this.z = tf.E6();
       }
       tf = this.f;
       if (tf instanceof a) {
          this.A = tf.zb();
       }
       this.B = new g();
       this.d.n(g.class, new a(this));
       this.d.l(c.class, new d(this));
       this.d.l(b.class, new c(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       n.Y(this.s, 0, true);
       n.Y(this.p, 0, true);
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       n.Y(this.o, 8, true);
       this.o.setClickable(false);
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       n.Y(this.o, 0, true);
       this.o.setClickable(true);
       return;
    }
    public void doBindView(View p0){
       ViewGroup viewGroup;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       int i = 0x7f0a36d9;
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a36da, i);
       this.u = viewStubInfl;
       viewStubInfl.d(p0);
       this.o = this.u.b(i);
       a tA = this.A;
       View view = (tA == null)? null: tA.y();
       this.q = b.a(view, p0, 0x7f0a0086);
       this.t = m1.f(p0, 0x7f0a29e1);
       tA = this.A;
       view = (tA == null)? null: tA.C();
       this.p = b.a(view, p0, 0x7f0a0620);
       tA = this.A;
       view = (tA == null)? null: tA.I();
       this.s = b.a(view, p0, 0x7f0a05c9);
       tA = this.z;
       SideBarViewBinder sideBarViewB = (tA != null && tA.r2() != null)? this.z.r2(): null;
       view = (sideBarViewB == null)? null: sideBarViewB.C();
       this.r = b.a(view, p0, 0x7f0a0635);
       if (!PatchProxy.applyVoid(null, this, uoa, "9") && e.e()) {
          a tu = this.u;
          if (tu != null) {
             ImageView imageView = tu.b(R.id.same_frame_layout_btn);
             if (imageView != null) {
                imageView.setImageDrawable(a1.f(R.drawable.arg_RES_7f081caa));
             }
             this.v = this.u.b(0x7f0a05ce);
             e.b(imageView, this.v, this.u.b(R.id.same_frame_layout_text));
             e.i(this.o, this.q);
          }
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       super.k(p0);
       this.doBindView(p0);
       this.e.findViewById(R.id.preview).setFocusViewActiveAreaProvider(new b(this));
       int i = 0;
       this.o.setVisibility(i);
       this.o.setClickable(true);
       if (this.t != null) {
          this.d.j().addView(this.t);
       }
       a tB = this.B;
       a tx = this.x;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoidOneRefs(tx, tB, g.class, "1")) {
          tB.a = tx;
          Object[] objArray = new Object[i];
          a.D().w("DuetMagicController", "bind", objArray);
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "8")) {
          return;
       }
       super.onDestroyView();
       a tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, g.class, "2")) {
          objArray = new Object[0];
          a.D().w("DuetMagicController", "unBind", objArray);
       }
       return;
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       n.Y(this.r, 4, true);
       n.Y(this.s, 4, true);
       n.Y(this.p, 4, true);
       n.Y(this.o, 8, true);
       this.o.setClickable(false);
       return;
    }
}
