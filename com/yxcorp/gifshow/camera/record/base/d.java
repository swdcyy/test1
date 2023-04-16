package com.yxcorp.gifshow.camera.record.base.d;
import oc9.t;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.util.LinkedList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import oc9.y;
import oc9.n;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;
import java.lang.Runnable;
import oc9.p;
import ekd.k1;
import oc9.s;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import android.view.View;
import oc9.x;
import androidx.fragment.app.FragmentActivity;
import q16.a$a;
import crd.b;
import crd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import aj9.b;
import java.util.List;
import z3b.t0;
import com.yxcorp.gifshow.util.resource.f$c;
import com.yxcorp.gifshow.util.resource.f;
import com.yxcorp.gifshow.util.resource.g;
import android.content.Context;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.util.resource.c;
import oc9.w;
import com.yxcorp.gifshow.camerasdk.q;
import ui9.j;
import android.content.Intent;
import lnc.b9;
import android.view.KeyEvent;
import android.os.Handler;
import oc9.o;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;

public abstract class d implements t	// class@000da8
{
    public g b;
    public final CameraPageType c;
    public final b d;
    public GifshowActivity e;
    public final BaseFragment f;
    public j g;
    public q h;
    public boolean i;
    public final Queue j;
    public a k;
    public View l;
    public boolean m;

    public void d(CameraPageType p0,b p1){
       super();
       this.j = new LinkedList();
       this.m = false;
       this.c = p0;
       this.d = p1;
       this.f = p1.f();
       this.e = p1.a();
       p1.n(y.class, new n(this));
    }
    public static void W1(d p0){
       p0.Z1();
    }
    public static void X1(d p0){
       p0.Z1();
    }
    private void Z1(){
       if (PatchProxy.applyVoid(null, this, d.class, "16")) {
          return;
       }
       Runnable runnable = this.j.poll();
       if (runnable != null) {
          runnable.run();
          k1.o(new p(this));
       }
       return;
    }
    public void E1(boolean p0){
       s.e(this, p0);
    }
    public void G(){
    }
    public void L3(a p0){
    }
    public void N(long p0,long p1){
       s.f(this, p0, p1);
    }
    public void Q(View p0){
       x.a(this, p0);
    }
    public boolean V3(FragmentActivity p0,a p1,a$a p2){
       return s.c(this, p0, p1, p2);
    }
    public void Y1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       d tk = this.k;
       if (tk == null || tk.isDisposed()) {
          this.k = new a();
       }
       this.k.c(p0);
       return;
    }
    public boolean a2(){
       d obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null && obj.B())? true: false;
       return b;
    }
    public void b2(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       if (this.i != null) {
          p0.run();
       }else {
          this.j.offer(p0);
       }
       return;
    }
    public void c2(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "10")) {
          return;
       }
       this.d2(p0, p1, null, null);
       return;
    }
    public void d2(List p0,String p1,t0 p2,f$c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d.class, "11")) {
          return;
       }
       d tb = this.b;
       if (tb != null) {
          tb.dismiss();
       }
       g og = new g(this.e, p0);
       this.b = og;
       if (p1 != null) {
          c.b(og, u1.k(), p1);
       }
       if (p2 != null) {
          this.b.i(p2);
       }
       if (p3 != null) {
          this.b.h(p3);
       }
       this.b.show();
       return;
    }
    public void de(a$a p0,a p1){
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.l = p0;
       if (this.f != null && this.d.b().G2() != null) {
          q oq = this.d.b().G2();
          this.h = oq;
          this.g = oq.q();
       }
       this.m = false;
       return;
    }
    public void lc(a$a p0){
       s.a(this, p0);
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       this.h = p0;
       this.g = p0.q();
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       s.d(this, p0, p1, p2);
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.g = null;
       this.h = null;
       this.j.clear();
       return;
    }
    public void onDestroyView(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uod, "12")) {
          uod = this.b;
          if (uod != null) {
             uod.dismiss();
             this.b = null;
          }
       }
       this.i = false;
       uod = this.k;
       if (uod != null) {
          b9.a(uod);
       }
       this.l = null;
       this.m = true;
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return false;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       while (!this.j.isEmpty()) {
          Runnable runnable = this.j.poll();
          if (runnable != null) {
             runnable.run();
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.i == null) {
          this.i = true;
          if (!this.j.isEmpty()) {
             this.e.V2().post(new o(this));
          }
       }
       return;
    }
    public void onStart(){
    }
    public void onStop(){
    }
    public boolean onTouch(View p0,MotionEvent p1){
       return false;
    }
    public boolean pc(){
       return s.b(this);
    }
    public void t1(){
    }
    public void w(){
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (this.e == null) {
          this.e = this.f.getActivity();
       }
       if (this.d.b().G2() != null) {
          q oq = this.d.b().G2();
          this.h = oq;
          this.g = oq.q();
       }
       return;
    }
}
