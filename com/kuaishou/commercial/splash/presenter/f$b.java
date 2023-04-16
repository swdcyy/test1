package com.kuaishou.commercial.splash.presenter.f$b;
import yy.x0;
import com.kuaishou.commercial.splash.presenter.f;
import tjc.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import yx.j0;
import l66.c;
import ujc.h;
import m66.a;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import gz.j;
import erd.g;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import yy.w0;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import cz.b;
import cz.d;
import com.kuaishou.commercial.splash.i;
import ujc.c;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mxb.c;
import ujc.j;
import ujc.a;
import ujc.l;
import android.view.View;
import java.lang.ref.WeakReference;
import android.os.SystemClock;
import ujc.k;
import java.util.Objects;
import com.kuaishou.android.model.ads.SplashInfo;
import com.yxcorp.gifshow.log.c0;

public class f$b implements x0	// class@0015e8
{
    public final b a;
    public final f b;

    public void f$b(f p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "13")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logRotateToConvert stay time: "+l, objArray);
       h oh = new h(this.a, p0);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.e(this.b.P8());
       c.a().b(oh);
       p0.v = true;
       return;
    }
    public void b(double[] p0){
       this.b.w = p0;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "12")) {
          return;
       }
       i0.a().e(656, this.a.b).d(new j(this)).a();
       CommercialSplashTracker.E().N = true;
       return;
    }
    public void d(){
       w0.b(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "14")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logShakeToConvert stay time: "+l, objArray);
       h oh = new h(this.a, 166);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.c(this.b.x);
       c.a().b(oh);
       this.b.v = true;
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       i.d(d.b(RequestTiming.DEFAULT, this.a, p0));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report ActionBar Show", objArray);
       if (this.b.X8()) {
          return;
       }
       c.a().b(new c(this.a, 5, 2));
       return;
    }
    public void h(int p0){
       this.b.z = p0;
    }
    public void i(int p0,int p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "8")) {
          return;
       }
       this.t(0, p0, p1);
       p0.v = true;
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "17")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logClickEggToConvert stay time: "+l, objArray);
       h oh = new h(this.a, 201);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.f(this.b.R8());
       c.a().b(oh);
       this.b.v = true;
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report SkipBtn Show", objArray);
       if (this.b.X8()) {
          return;
       }
       c uoc = new c(this.a, 5, 3);
       uoc.a(this.b.V8());
       c.a().b(uoc);
       return;
    }
    public void l(int p0,int p1,int p2,int p3,int p4){
       f$b uob = f$b.class;
       int i = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "16")) {
             return;
          }
       }
       long l = this.b.W8();
       Object[] objArray1 = new Object[i];
       j0.f("SplashAdLogPresenter", "logSlideUpToConvert stay time: "+l, objArray1);
       h oh = new h(this.a, 190);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.p = p0;
       oh.d(p1, p2);
       oh.k = p3;
       oh.l = p4;
       oh.q = 1;
       c.a().b(oh);
       p0.v = true;
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "15")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logSlideToConvert stay time: "+l, objArray);
       h oh = new h(this.a, 167);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.f(this.b.R8());
       c.a().b(oh);
       this.b.v = true;
       return;
    }
    public void n(int p0,int p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "6")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report ActionBarClick stay time: "+l, objArray);
       h oh = new h(this.a, 2);
       oh.d(p0, p1);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.e(this.b.P8());
       oh.c(this.b.x);
       oh.f(this.b.R8());
       c.a().b(oh);
       p0.v = true;
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "20")) {
          return;
       }
       i0.a().e(928, this.b.t).a();
       return;
    }
    public void p(int p0){
       this.b.y = p0;
    }
    public String q(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.a(-536296199).uc(this.a.b, this.b.getContext())) {
          return c.i(this.a.b);
       }
       return "";
    }
    public void r(int p0,int p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "19")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logCardTitleClick stay time: "+l, objArray);
       h oh = new h(this.a, 217);
       oh.d(p0, p1);
       oh.b(this.b.S8(this.a));
       oh.a(l);
       oh.e(this.b.P8());
       oh.c(this.b.x);
       oh.f(this.b.R8());
       c.a().b(oh);
       p0.v = true;
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "10")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report FeedAnimStart, stay time: "+l, objArray);
       if (this.b.X8()) {
          return;
       }
       j oj = new j(this.a);
       oj.d = l;
       oj.e = this.b.V8();
       oj.f = this.b.P8();
       f$b tb = this.b;
       oj.g = tb.x;
       oj.h = tb.R8();
       c.a().b(oj);
       return;
    }
    public void t(int p0,int p1,int p2){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, f$b.class, "9")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report SkipBtn Click, stay time: "+l, objArray);
       a uoa = new a(this.a, 5, 3);
       uoa.f = l;
       uoa.i = p1;
       uoa.j = p2;
       uoa.h = p0;
       uoa.g = this.b.V8();
       uoa.k = this.b.P8();
       f$b tb = this.b;
       uoa.l = tb.x;
       uoa.m = tb.R8();
       c.a().b(uoa);
       tb.v = true;
       return;
    }
    public void u(int p0,int p1,int p2){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, f$b.class, "4")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report SplashClick stay time: "+l, objArray);
       c uoc = c.a();
       h oh = new h(this.a, 1);
       oh.a(l);
       oh.b(this.b.S8(this.a));
       oh.d(p1, p2);
       if (!p0) {
          p0 = 6;
       }
       oh.g = p0;
       oh.g(this.b.V8());
       oh.e(this.b.P8());
       oh.c(this.b.x);
       oh.f(this.b.R8());
       uoc.b(oh);
       p0.v = true;
       return;
    }
    public void v(float p0){
       this.b.x = p0;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "11")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report Splash PlayEnd stay time: "+l, objArray);
       if (this.b.X8()) {
          return;
       }
       l ol = new l(this.a.b, 5);
       ol.e = l;
       ol.f = this.b.P8();
       f$b tb = this.b;
       ol.g = tb.x;
       ol.h = tb.R8();
       c.a().b(ol);
       return;
    }
    public void x(View p0,int p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logSplashShow £º mDisplayStartTime£º"+this.b.r, objArray);
       this.b.B = new WeakReference(p0);
       uob = this.b;
       uob.C = p1;
       if (uob.X8()) {
          return;
       }
       uob = this.b;
       uob.s = true;
       if (uob.r >= 0) {
          uob.r = SystemClock.elapsedRealtime();
       }
       k ok = new k(this.a);
       ok.a(this.b.V8());
       k ok1 = ok.b(p0);
       ok1.c(p1);
       c.a().b(ok1);
       f$b tb = this.b;
       f$b ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, f.class, "11") && (!tb.Y8() && (ta != null && (ta.a.mSplashAdMaterialType == true && ta.b != null)))) {
          c0.q().k(ta.b);
       }
    label_00a4 :
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "18")) {
          return;
       }
       boolean b = this.b.X8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "logCardTitleShow hasSplashCanceled:"+b, objArray);
       if (b) {
          return;
       }
       c uoc = new c(this.a, 5, 217);
       uoc.a(this.b.V8());
       c.a().b(uoc);
       return;
    }
    public void z(int p0,int p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       long l = this.b.W8();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "report SplashClick stay time: "+l, objArray);
       h oh = new h(this.a, 1);
       oh.a(l);
       oh.d(p0, p1);
       oh.b(this.b.S8(this.a));
       oh.g(this.b.V8());
       oh.e(this.b.P8());
       oh.c(this.b.x);
       c.a().b(oh);
       p0.v = true;
       return;
    }
}
