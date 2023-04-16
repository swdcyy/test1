package com.yxcorp.gifshow.camera.record.album.b0;
import oc9.b0;
import oh9.v;
import com.yxcorp.gifshow.camera.record.album.o;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import ekd.j0;
import tkd.b;
import tkd.d;
import f16.a;
import com.yxcorp.gifshow.camera.record.album.slideup.c;
import oc9.t;
import oc9.q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import sb9.n0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import zb9.p0;
import zb9.p0$a;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Integer;
import android.view.ViewParent;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import sb9.p0;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import oc9.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qxc.b;
import androidx.constraintlayout.widget.Guideline;
import gg9.p;
import sb9.o0;
import erd.g;
import crd.b;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;

public class b0 extends o implements b0, v	// class@001cb0
{
    public int G;
    public ConstraintLayout H;
    public View I;
    public Guideline J;
    public View K;
    public View L;
    public AbsRecordBottomBarViewBinder M;

    public void b0(CameraPageType p0,b p1,boolean p2){
       super(p0, p1);
       this.G = -1;
       int i = j0.b(this.e.getIntent(), "camera_page_source", 0);
       if (d.a(0x13cfc0fa).isAvailable() && (p2 && (i != 3 && i != 16))) {
          this.L0(new c(p0, p1));
       }
    label_0033 :
       if (p1.f() instanceof a) {
          this.M = p1.f().zb();
       }
       this.d.n(v.class, new n0(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, b0.class, "9")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.A0();
          }
       }
       if (this.A != null || (!this.a2() && !this.d.d(p0.j.a()).c())) {
          n.Y(this.t, 0, 0);
       }
       return;
    }
    public final void A2(int p0,int p1){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob0, "13")) {
          return;
       }
       if (this.l != null && (this.H != null && (this.t != null && (this.K != null && (this.L != null && (this.I == null || (this.J != null && !this.d.d(p0.j.a()).c()))))))) {
          int i = 0;
          float f = (float)n.o(this.t)[i] + ((float)this.t.getWidth() / 2.00f);
          if (this.t.getParent() == this.H) {
             a uoa = new a();
             uoa.i(this.H);
             uoa.g(this.t.getId(), 1);
             if (p1 == 5) {
                uoa.l(this.t.getId(), 1, this.L.getId(), 2);
             }else {
                uoa.l(this.t.getId(), 1, this.K.getId(), 2);
             }
             if (this.A == null) {
                uoa.V(this.t.getId(), i);
             }
             uoa.b(this.H);
          }
          if (f > 0) {
             f.F(this.t, new p0(this, p1, f));
          }
       }
    label_00c2 :
       return;
    }
    public void E0(){
       a0.n(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, b0.class, "7")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.I7();
          }
       }
       if (this.A != null) {
          return;
       }
       o tt = this.t;
       if (tt == null || (!tt.getVisibility() || this.d.d(p0.j.a()).c())) {
          n.Y(this.t, 4, true);
          this.t.setClickable(false);
       }
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, b0.class, "8")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.P1();
          }
       }
       if (this.A != null) {
          return;
       }
       if (!this.d.d(p0.j.a()).c()) {
          n.Y(this.t, 0, 0);
       }
       o tt = this.t;
       if (tt != null) {
          tt.setClickable(true);
       }
       return;
    }
    public boolean R0(){
       Iterator obj = PatchProxy.apply(null, this, b0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getChildren().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          t ot = obj.next();
          if (ot instanceof b0 && ot.R0()) {
             break ;
          }
       }
       return true;
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "10")) {
          return;
       }
       this.I7();
       return;
    }
    public void X7(int p0,float p1){
       a0.k(this, p0, p1);
    }
    public void d5(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "11")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.d5(p0);
          }
       }
       this.A2(this.G, p0);
       this.G = p0;
       return;
    }
    public void e2(){
       a0.f(this);
    }
    public long ie(){
       return a0.a(this);
    }
    public void k(View p0){
       AbsRecordBottomBarViewBinder f;
       Guideline guideline;
       ConstraintLayout uConstraintL;
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob0, "1")) {
          return;
       }
       super.k(p0);
       b0 tM = this.M;
       Object[] objArray = null;
       View view = (tM == null)? objArray: tM.g;
       this.K = b.a(view, p0, 0x7f0a2c6b);
       tM = this.M;
       view = (tM == null)? objArray: tM.y();
       this.H = b.a(view, p0, 0x7f0a0086);
       tM = this.M;
       view = (tM == null)? objArray: tM.A();
       this.I = b.a(view, p0, 0x7f0a0ff7);
       tM = this.M;
       view = (tM == null)? objArray: tM.z();
       this.J = b.a(view, p0, 0x7f0a0081);
       tM = this.M;
       view = (tM == null)? objArray: tM.f;
       this.L = b.a(view, p0, 0x7f0a34a6);
       o0 oo0 = null;
       if (this.A != null) {
          this.t.setVisibility(8);
          if (!PatchProxy.applyVoid(objArray, this, uob0, "3")) {
             a uoa = new a();
             uoa.i(this.H);
             uoa.l(R.id.button_switch_music_layout, 2, oo0, 2);
             uoa.b(this.H);
          }
       }else if(this.d.d(p0.j.a()).c()){
          n.Y(this.t, 4, oo0);
       }else {
          n.Y(this.t, oo0, oo0);
       }
       this.Y1(this.d.l(p.class, new o0(this)));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       super.onDestroyView();
       this.G = -1;
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, b0.class, "5")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.q1();
          }
       }
       return;
    }
    public boolean q2(){
       return a0.d(this);
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, b0.class, "6")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.qb();
          }
       }
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public void s0(){
       a0.m(this);
    }
}
