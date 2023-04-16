package com.yxcorp.gifshow.camera.record.breakpoint.a;
import in6.b;
import oh9.v;
import oc9.d0;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import rc9.a;
import com.yxcorp.gifshow.camera.record.breakpoint.b;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.a;
import rc9.h;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import rc9.c;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import rc9.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import com.yxcorp.gifshow.camera.record.breakpoint.BreakpointIndicator;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import android.util.SparseIntArray;
import qr4.k$p;
import qr4.k$j;
import in6.a;
import android.content.Context;
import ekd.r;
import oc9.w;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Integer;
import java.lang.Float;
import android.view.View;
import oh9.a;
import com.kwai.video.player.KsMediaPlayer;
import com.yxcorp.gifshow.camera.record.base.g;
import yb9.b;
import yb9.b$a;
import android.widget.RelativeLayout;
import java.lang.Math;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import qxc.b;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.View$OnClickListener;
import c35.p;
import lnc.s6;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.graphics.drawable.Drawable;
import pi9.i;
import tg9.b;
import j36.d;
import j36.g;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;
import android.content.Intent;
import ekd.j0;
import rg9.a;
import rc9.e;
import erd.g;
import crd.b;
import rc9.f;
import rc9.d;

public class a extends d0 implements b, v	// class@000dae
{
    public final b o;
    public final a p;
    public final a q;
    public final h r;
    public BreakpointPanel s;
    public ViewStubInflater2 t;
    public View u;
    public BreakpointIndicator v;
    public j w;
    public a$a x;
    public static final float y;

    static {
       a.y = (float)a1.e(4.00f);
    }
    public void a(CameraPageType p0,b p1){
       super(p0, p1);
       this.p = new a();
       this.o = new b(this);
       this.q = new a(this);
       this.r = new h(this);
       d tf = this.f;
       if (tf instanceof c) {
          this.w = tf.E6();
       }
       this.d.n(a.class, new c(this));
       this.d.n(b.class, new b(this));
       this.d.n(v.class, new b(this));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a0.i(this);
       this.v.c(-1, true);
       this.v.d(a.y, true);
       if (this.p.f()) {
          this.i2();
       }
       a ts = this.s;
       if (ts != null && ts.b()) {
          this.s.a();
       }
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       h b = this.r.b;
       p0 = p0.e;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyOneRefs(b, p0, VideoContext.class, "85") != PatchProxyResult.class) {
       }else {
          VideoContext.b();
          k$p[] opArray = new k$p[b.size()];
          p0.a.c.x = opArray;
          for (int i = 0; i < b.size(); i = i + 1) {
             p0.a.c.x[i] = new k$p();
             object oobject = p0.a.c.x[i];
             oobject.a = (long)b.keyAt(i);
             oobject.b = (long)b.valueAt(i);
          }
       }
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a0.h(this);
       this.v.d(a.y, false);
       this.v.c(r.b(this.e, R.color.arg_RES_7f060751), false);
       this.p.b(this.d.b().getRecordDuration(), this.d);
       this.h2();
       a ts = this.s;
       if (ts != null && ts.b()) {
          this.s.a();
       }
       this.k2();
       return;
    }
    public int R(){
       return 0x7f0d012a;
    }
    public int T(){
       return a.a(this);
    }
    public void T1(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().y("breakpoint", "录制总时长变化. isChanged:"+p0, objArray);
       if (p0) {
          this.i2();
       }
       return;
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "25")) {
          return;
       }
       this.v.c(-1, true);
       this.v.d(a.y, true);
       return;
    }
    public void X7(int p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uoa, "10")) {
          return;
       }
       a tu = this.u;
       if (tu != null && p1 - 0x3f7e0000 >= 0) {
          boolean b = false;
          tu.setEnabled(b);
          this.o.b(b);
       }
       if (this.p.h() && !this.p.f()) {
          tu = this.q.c;
          if (tu != null && this.d.d(a.f).c == null) {
             KsMediaPlayer ksMediaPlaye = tu.r();
             if (ksMediaPlaye != null && (ksMediaPlaye.getCurrentPosition() - (long)this.p.c > 0 && ksMediaPlaye.isPlaying())) {
                ksMediaPlaye.pause();
             }
          }
       label_006e :
          if (p1 - this.p.c() > 0) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, uoa, "11")) {
                this.d.b().A0();
                this.p.b(this.d.b().getRecordDuration(), this.d);
                a tp = this.p;
                uoa = tp.a;
                tp.d = uoa;
                tp.e = uoa;
                tp.f = tp.b;
                tp = this.r;
                Objects.requireNonNull(tp);
                if (!PatchProxy.applyVoid(objArray, tp, h.class, "3")) {
                   tu = tp.a.p.c;
                   h b1 = tp.b;
                   b1.put(tu, (b1.get(tu) + 1));
                }
                this.h2();
             }
          }
       }
    label_00cc :
       return;
    }
    public int Y0(){
       return 8;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       super.d5(p0);
       b uob = this.d.h();
       uoa = this.u;
       int i = (this.f2())? 0: 8;
       uob.e(uoa, i, null);
       return;
    }
    public boolean g2(){
       a obj = PatchProxy.apply(null, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       boolean b = (obj != null && obj.b())? true: false;
       return b;
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       this.v.a();
       this.o.a();
       a ts = this.s;
       if (ts != null && ts.b()) {
          this.s.c();
          this.s.d();
          this.s.requestLayout();
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "21")) {
          return;
       }
       this.p.b(this.d.b().getRecordDuration(), this.d);
       boolean b = this.p.e();
       if (!this.d.b().H5() || b) {
          this.p.d();
       }
       this.h2();
       a tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, a.class, "11") && tq.c(false)) {
          a e = tq.e;
          tq.j = e.b;
          a d = e.d;
          tq.k = d;
          a k = e.k;
          if (k) {
             tq.k = Math.min(d, (int)k);
          }
       }
       return;
    }
    public void k(View p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       super.k(p0);
       View view = null;
       this.u = view;
       a tw = this.w;
       AbsRecordSideBarViewBinder uAbsRecordSi = (tw != null && tw.r2() instanceof AbsRecordSideBarViewBinder)? this.w.r2(): view;
       View view1 = (uAbsRecordSi == null)? view: uAbsRecordSi.L();
       this.u = b.a(view1, p0, 0x7f0a0510);
       this.v = p0.findViewById(0x7f0a34a5);
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0518, 0x7f0a0516);
       this.t = viewStubInfl;
       viewStubInfl.d(p0);
       a to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoidTwoRefs(p0, uAbsRecordSi, to, b.class, str)) {
          View view2 = (uAbsRecordSi == null)? view: uAbsRecordSi.L();
          p0 = b.a(view2, p0, R.id.breakpoint_combinant);
          to.b = p0;
          if (p0 != null) {
             p.a(uAbsRecordSi, p0, to.d);
             to.b.setVisibility(false);
          }
          to.a();
       }
       p0.f = this;
       this.s = view;
       if (this.u != null) {
          if (s6.m()) {
             a tu = this.u;
             if (tu instanceof TextImageView) {
                tu.b(a1.f(R.drawable.arg_RES_7f080443), a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d));
                i.b(this.u);
             }
          }
          this.d.j().addView(this.u);
       }
       this.v.d(a.y, false);
       this.v.c(r.b(this.e, R.color.arg_RES_7f060751), false);
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a tu = this.u;
       if (tu != null) {
          tu.setEnabled(true);
          this.o.b(true);
       }
       return;
    }
    public boolean onBackPressed(){
       a obj = PatchProxy.apply(null, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj == null || !obj.b()) {
          return false;
       }
       this.s.a();
       return true;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.onDestroyView();
       if (this.x != null) {
          d.c().f(this.x);
          this.x = null;
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       super.onPause();
       a ts = this.s;
       if (ts != null) {
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoid(objArray, ts, BreakpointPanel.class, "14") && ts.i != null) {
             ts.a();
          }
       }
       ts = this.q;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, a.class, "6") && ts.c(false)) {
          ts.g();
       }
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       a0.m(this);
       this.p.b(this.d.b().getRecordDuration(), this.d);
       this.p.a();
       this.h2();
       this.k2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.w1(p0);
       String str = "key_break_point_pos";
       if (j0.g(p0, str)) {
          int i = j0.b(p0, str, 0);
          if (i > 0) {
             this.p.b(this.d.b().getRecordDuration(), this.d);
             a tp = this.p;
             tp.c = i;
             tp.d = i;
          }
       }
       this.d.l(a.class, new e(this));
       this.d.l(f.class, new d(this));
       return;
    }
}
