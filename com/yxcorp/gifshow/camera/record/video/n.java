package com.yxcorp.gifshow.camera.record.video.n;
import oh9.v;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import oh9.j0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import qg9.a;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import java.util.Objects;
import com.yxcorp.gifshow.widget.record.DeleteSegmentButton;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import tg9.b;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Integer;
import java.lang.Float;
import oh9.f0;
import java.lang.Runnable;
import ekd.k1;
import wd9.a;
import yh9.j;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaImageView;
import pi9.e;
import android.widget.ImageView;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import oc9.w;
import yb9.b;
import th0.e;
import android.view.animation.Interpolator;
import yb9.b$a;
import com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView;
import oh9.e0;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import com.yxcorp.gifshow.camera.record.video.m;
import android.view.ViewStub$OnInflateListener;
import oh9.h0;
import com.yxcorp.gifshow.camera.record.video.l;
import zb9.j;
import oh9.m0;
import erd.g;
import crd.b;
import java.lang.Boolean;
import aj9.b;
import dg.e;
import ekd.f;
import dg.j;
import dg.c;
import dg.f;
import ekd.g;
import dg.h;
import android.animation.ValueAnimator;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;
import android.content.Intent;
import rg9.a;
import oh9.n0;

public class n extends d0 implements v	// class@000f8d
{
    public boolean A;
    public int B;
    public boolean C;
    public RecordButton o;
    public RecordInnerAnimView p;
    public ViewStub q;
    public View r;
    public DeleteSegmentButton s;
    public TextView t;
    public PressedDisableWithAlphaImageView u;
    public View v;
    public ViewStubInflater2 w;
    public View x;
    public boolean y;
    public boolean z;

    public void n(CameraPageType p0,b p1){
       super(p0, p1);
       this.C = false;
       this.d.n(v.class, new j0(this));
    }
    public void A0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "8")) {
          return;
       }
       a0.j(this);
       if (this.a2()) {
          if (!a.a(this.d)) {
             this.o.e();
             n ts = this.s;
             Objects.requireNonNull(ts);
             if (!PatchProxy.applyVoid(objArray, ts, DeleteSegmentButton.class, "3")) {
                ts.setSelected(false);
                if (ts.b == null) {
                   ts.b = true;
                   ts.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f081e03, false, false, false);
                }
                n.Y(ts, false, true);
             }
             this.l2();
          }
          this.o.i();
       }else {
          this.o.i();
          this.o.d();
          this.s.a();
       }
       this.y = false;
       return;
    }
    public void E0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "11")) {
          return;
       }
       a0.n(this);
       n ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, DeleteSegmentButton.class, "5")) {
          ts.setSelected(true);
       }
       return;
    }
    public void I7(){
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "6")) {
          return;
       }
       a0.i(this);
       this.g2();
       this.k2(true);
       this.d.j().addView(this.u);
       this.z = true;
       boolean b = a.a(this.d);
       this.o.f(b);
       n ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(null, ts, DeleteSegmentButton.class, "2")) {
          ts.setSelected(0);
          if (!ts.getVisibility()) {
             n.Y(ts, 4, 0);
          }
       }
       if (b) {
          ts = this.t;
          if (ts != null) {
             ts.setVisibility(0);
          }
       }
       if (this.y != null || (b && this.C == null)) {
          if (!PatchProxy.applyVoid(null, this, on, "18")) {
             on = this.v;
             if (on != null) {
                n.Y(on, 4, 0);
             }else {
                n.Y(this.u, 4, 0);
             }
          }
       }else {
          this.l2();
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, n.class, "9")) {
          return;
       }
       if (this.z == null) {
          return;
       }
       this.k2(false);
       this.o.setEnabled(true);
       this.o.d();
       n tt = this.t;
       if (tt != null) {
          tt.setVisibility(8);
       }
       this.s.a();
       tt = this.v;
       if (tt != null) {
          n.Y(tt, 4, false);
       }else {
          n.Y(this.u, 4, false);
       }
       return;
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "14")) {
          return;
       }
       this.C = true;
       this.I7();
       this.A0();
       this.s.setClickable(true);
       this.o.setEnabled(true);
       this.C = false;
       return;
    }
    public void X7(int p0,float p1){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, n.class, "7")) {
          return;
       }
       if (p1 - 0x3f800000 >= 0) {
          k1.o(new f0(this));
       }
       return;
    }
    public void d5(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "15")) {
          return;
       }
       super.d5(p0);
       if (this.d.d(a.i).a == null) {
          this.i2();
       }
       return;
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       a0.f(this);
       this.s.b();
       if (this.d.d(j.i).a - 0x3f800000 >= 0) {
          this.o.setEnabled(false);
       }
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, n.class, "20")) {
          return;
       }
       if (this.v == null) {
          this.v = this.w.b(0x7f0a0eb5);
       }
       if (this.u == null) {
          PressedDisableWithAlphaImageView pressedDisab = this.w.b(R.id.finish_record_btn);
          this.u = pressedDisab;
          if (pressedDisab != null && e.e()) {
             e.j(this.u);
             e.h(this.w.b(R.id.tv_preview));
             e.i(this.v, this.r);
             this.u.setImageResource(R.drawable.arg_RES_7f081c9f);
          }
       }
       return;
    }
    public void h2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "17")) {
          return;
       }
       if (this.d.d(p0.j.a()).c()) {
          objArray = CameraLogger.h();
       }
       CameraLogger.z(406, "click_next_button", objArray);
       if (this.d.d(a.i).a == null) {
          this.d.b().e2();
       }
       return;
    }
    public final void i2(){
       View[] viewArray;
       if (PatchProxy.applyVoid(null, this, n.class, "16")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       if (this.f2()) {
          d uod = (this.n == 6)? 1: null;
          if (!uod) {
             if (!this.d.d(p0.j.a()).c()) {
                viewArray = new View[i];
                viewArray[i1] = this.o;
                n.Z(i1, viewArray);
                this.d.h().d(this.p, 0, new e(), new e(), null);
             }
          }else {
          label_0053 :
             viewArray = new View[i];
             viewArray[i1] = this.o;
             n.Z(4, viewArray);
             viewArray = new View[i];
             viewArray[i1] = this.p;
             n.Z(4, viewArray);
          }
       }else {
          goto label_0053 ;
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       super.k(p0);
       this.o = p0.findViewById(0x7f0a34a7);
       this.p = p0.findViewById(0x7f0a13f7);
       this.x = p0.findViewById(0x7f0a34a4);
       DeleteSegmentButton uDeleteSegme = p0.findViewById(R.id.delete_segment_btn);
       this.s = uDeleteSegme;
       int i = 8;
       uDeleteSegme.setVisibility(i);
       this.t = p0.findViewById(0x7f0a08ed);
       this.r = p0.findViewById(0x7f0a0086);
       n tt = this.t;
       if (tt != null) {
          tt.setVisibility(i);
          this.t.setOnClickListener(new e0(this));
       }
       i = 0x7f0a0eb6;
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(i, 0x7f0a0eb5);
       this.w = viewStubInfl;
       viewStubInfl.d(p0);
       this.u = p0.findViewById(0x7f0a0eb4);
       this.v = p0.findViewById(0x7f0a0eb5);
       ViewStub viewStub = p0.findViewById(i);
       this.q = viewStub;
       if (viewStub != null) {
          viewStub.setOnInflateListener(new m(this));
       }else {
          n tv = this.v;
          if (tv != null) {
             tv.setOnClickListener(new h0(this));
          }
       }
       this.b2(new l(this));
       this.Y1(this.d.l(j.class, new m0(this)));
       return;
    }
    public final void k2(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "21")) {
          return;
       }
       on = this.x;
       if (on != null) {
          int i = (p0)? 0: 4;
          n.Y(on, i, false);
       }
       return;
    }
    public void l2(){
       if (PatchProxy.applyVoid(null, this, n.class, "19")) {
          return;
       }
       this.g2();
       n tv = this.v;
       boolean b = true;
       int i = 0;
       if (tv != null) {
          n.Y(tv, i, b);
       }else if(!this.h.B() && this.d.d(a.i).a == null){
          b = 0;
       }
       n.Y(this.u, i, (b ^ 0x01));
       if (b) {
          f.o(this.u, 0x3f333333, 0x3f800000, 600.00f, 60.00f);
          e uoe = j.d().b();
          uoe.g(new f(600.00f, 60.00f));
          uoe.a(new g(this.u));
          uoe.e((double)0);
          uoe.f((double)0x3f800000);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tq = this.q;
       if (tq != null) {
          tq.setOnInflateListener(null);
       }
       super.onDestroyView();
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "3")) {
          return;
       }
       n tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, RecordInnerAnimView.class, "5")) {
          RecordInnerAnimView b = tp.b;
          if (b != null && (!tp.getVisibility() && !b.isRunning())) {
             b.start();
          }
       }
       return;
    }
    public void onStop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "4")) {
          return;
       }
       n tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, RecordInnerAnimView.class, "6")) {
          RecordInnerAnimView b = tp.b;
          if (b != null) {
             b.cancel();
          }
       }
       return;
    }
    public void q1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "13")) {
          return;
       }
       n to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoid(objArray, to, BaseRecordButton.class, "8") && (to.d == 2 && to.i == null)) {
          to.p();
          to.i = true;
       }
    label_002b :
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, n.class, "12")) {
          return;
       }
       a0.m(this);
       this.o.setEnabled(true);
       this.s.b();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(a.class, new n0(this));
       return;
    }
}
