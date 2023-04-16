package com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import yh9.j;
import android.widget.FrameLayout;
import android.view.View;
import oc9.y;
import oc9.x;
import wd9.a;
import com.kwai.gifshow.post.api.feature.ktv.KtvMode;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$onCreateView$1;
import md9.d;
import msd.l;
import erd.g;
import crd.b;
import fe9.a;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$a;
import hc9.e$a;
import hc9.e;
import md9.b;
import android.view.View$OnLayoutChangeListener;
import md9.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import ekd.m1;
import com.yxcorp.utility.n;
import usd.q;
import wc9.z;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$b;
import wc9.w;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$c;
import ed9.b;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$d;
import v4b.n;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$onViewCreated$4;
import eoc.f;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import qrd.l1;

public class GrowthFloatingGuideController extends d0	// class@000df7
{
    public FrameLayout o;
    public View p;
    public View q;
    public View r;
    public View s;
    public boolean t;

    public void GrowthFloatingGuideController(CameraPageType p0,b p1){
       a.p(p0, "cameraPage");
       a.p(p1, "callerContext");
       super(p0, p1);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, GrowthFloatingGuideController.class, "11")) {
          return;
       }
       if (this.a2() || (this.d.d(j.i).a - (float)0 <= 0 && this.k2())) {
          GrowthFloatingGuideController to = this.o;
          if (to == null) {
             a.S("floatContainer");
          }
          to.setVisibility(0);
       }
    label_0037 :
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, GrowthFloatingGuideController.class, "9")) {
          return;
       }
       if (this.k2()) {
          GrowthFloatingGuideController to = this.o;
          if (to == null) {
             a.S("floatContainer");
          }
          to.setVisibility(4);
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, GrowthFloatingGuideController.class, "12")) {
          return;
       }
       if (this.k2()) {
          GrowthFloatingGuideController to = this.o;
          if (to == null) {
             a.S("floatContainer");
          }
          to.setVisibility(0);
       }
       return;
    }
    public void Q(View p0){
       View view;
       a a;
       GrowthFloatingGuideController growthFloati = GrowthFloatingGuideController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, growthFloati, "3")) {
          return;
       }
       a.p(p0, "view");
       x.a(this, p0);
       this.s = p0;
       view = p0.findViewById(R.id.action_bar_layout);
       a.o(view, "view.findViewById\(R.id.action_bar_layout\)");
       this.r = view;
       view = p0.findViewById(R.id.camera_flash_bar_root);
       a.o(view, "view.findViewById\(R.id.camera_flash_bar_root\)");
       this.q = view;
       p0 = p0.findViewById(R.id.guide_floating_view);
       a.o(p0, "view.findViewById\(R.id.guide_floating_view\)");
       this.o = p0;
       if (p0 == null) {
          a.S("floatContainer");
       }
       p0.setVisibility(0);
       if (this.d.d(a.i).a != null) {
          this.d.l(KtvMode.class, new d(new GrowthFloatingGuideController$onCreateView$1(this)));
       }
       a = this.d.d(a.c).a;
       if (a != null) {
          a.b(new GrowthFloatingGuideController$a(this));
       }
       if (!PatchProxy.applyVoid(null, this, growthFloati, "13")) {
          GrowthFloatingGuideController tq = this.q;
          if (tq == null) {
             a.S("flashTopBar");
          }
          tq.addOnLayoutChangeListener(new b(this));
          tq = this.r;
          if (tq == null) {
             a.S("actionBarLayout");
          }
          tq.addOnLayoutChangeListener(new c(this));
       }
       return;
    }
    public final int g2(){
       Object obj = PatchProxy.apply(null, this, GrowthFloatingGuideController.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a1.g();
       GrowthFloatingGuideController ts = this.s;
       String str = "rootView";
       if (ts == null) {
          a.S(str);
       }
       View view = m1.f(ts, R.id.control_speed_layout);
       if (view != null && view.isShown()) {
          i = n.o(view)[1];
       }
       if (this.p == null) {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          this.p = m1.f(ts, 0x7f0a031a);
       }
       ts = this.p;
       if (ts != null && ts.isShown()) {
          i = q.u(i, n.o(ts)[1]);
       }
       ts = this.r;
       if (ts == null) {
          a.S("actionBarLayout");
       }
       return q.u(i, n.o(ts)[1]);
    }
    public final int h2(){
       GrowthFloatingGuideController obj = PatchProxy.apply(null, this, GrowthFloatingGuideController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj == null) {
          a.S("flashTopBar");
       }
       return (n.o(obj)[1] + a1.e(44.00f));
    }
    public final FrameLayout i2(){
       GrowthFloatingGuideController obj = PatchProxy.apply(null, this, GrowthFloatingGuideController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null) {
          a.S("floatContainer");
       }
       return obj;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFloatingGuideController.class, "4")) {
          return;
       }
       super.k(p0);
       this.t = false;
       this.Y1(this.d.l(z.class, new GrowthFloatingGuideController$b(this)));
       this.Y1(this.d.l(w.class, new GrowthFloatingGuideController$c(this)));
       this.Y1(this.d.l(b.class, new GrowthFloatingGuideController$d(this)));
       this.Y1(f.a(n.class, new d(new GrowthFloatingGuideController$onViewCreated$4(this))));
       return;
    }
    public boolean k2(){
       return true;
    }
    public final void l2(int p0,int p1){
       GrowthFloatingGuideController growthFloati = GrowthFloatingGuideController.class;
       if (PatchProxy.isSupport(growthFloati) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, growthFloati, "16")) {
          return;
       }
       p1 = p1 - p0;
       growthFloati = this.o;
       String str = "floatContainer";
       if (growthFloati == null) {
          a.S(str);
       }
       GrowthFloatingGuideController to = this.o;
       if (to == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = to.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.topMargin = p0;
       layoutParams.height = p1;
       growthFloati.setLayoutParams(layoutParams);
       return;
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, GrowthFloatingGuideController.class, "10")) {
          return;
       }
       if (this.k2()) {
          GrowthFloatingGuideController to = this.o;
          if (to == null) {
             a.S("floatContainer");
          }
          to.setVisibility(4);
       }
       return;
    }
}
