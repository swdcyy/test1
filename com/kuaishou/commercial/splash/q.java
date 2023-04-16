package com.kuaishou.commercial.splash.q;
import tjc.c;
import java.lang.Object;
import crd.a;
import com.kuaishou.commercial.splash.m;
import ok.x;
import com.google.common.base.Suppliers;
import com.kuaishou.commercial.splash.q$a;
import yy.o0;
import yy.h0;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.w$b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import wl9.y;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import lnc.b9;
import yx.j0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.h0;
import java.lang.Number;
import tjc.c$a;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import com.yxcorp.gifshow.log.b;
import java.lang.StringBuilder;
import android.content.ComponentName;
import hn5.n;
import hn5.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.commercial.splash.SplashV2Activity;
import android.content.Context;
import java.util.List;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import android.app.Activity;
import tjc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.k4;
import wh5.c;
import tjc.c$b;
import rw.a;
import o56.d;
import mrd.a;
import com.kuaishou.commercial.splash.o;
import yy.k0;
import erd.g;
import brd.t;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import t45.d;
import brd.z;
import com.kuaishou.commercial.perf.tracker.d;
import zf6.l;
import com.kuaishou.commercial.splash.UnnaturalStartHelper;
import com.kuaishou.commercial.splash.i;
import tjc.d;
import yy.m0;
import erd.r;
import java.util.concurrent.TimeUnit;
import com.kuaishou.commercial.splash.n;
import brd.w;
import yy.l0;
import com.kuaishou.commercial.splash.p;
import tw.l;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.SplashInfo;
import lnc.l1;
import com.kuaishou.commercial.splash.SplashException;
import android.os.SystemClock;
import android.content.Intent;
import l1.a;
import android.os.Bundle;
import yy.j0;
import com.kwai.framework.activitycontext.ActivityContext;
import androidx.fragment.app.FragmentActivity;
import tjc.a;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.fragment.app.c;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.commercial.splash.v3.view.SplashFragment;
import androidx.fragment.app.e;
import com.kuaishou.commercial.splash.v3.view.SplashV3Activity;
import uh5.e;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import az.a;
import yy.h;
import yy.g;
import java.lang.Integer;
import iz.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import cz.b;
import cz.d;

public class q implements c	// class@001619
{
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public WeakReference i;
    public a j;
    public a k;
    public b l;
    public boolean m;
    public int n;
    public int o;
    public final x p;
    public final w$b q;
    public final Runnable r;
    public c$a s;
    public final Runnable t;

    public void q(){
       super();
       this.k = new a();
       this.m = true;
       this.n = -1;
       this.o = 3000;
       this.p = Suppliers.a(m.b);
       q$a uoa = new q$a(this);
       this.q = uoa;
       this.r = new o0(this);
       this.t = new h0(this);
       b.a(-1343064608).W(uoa);
       this.m = a.t().d("eyemaxInsertNotifyEarlier", true);
       this.n = a.t().a("eyemaxMaxTimeoutRunnableOpt", -1);
       this.o = a.t().a("eyemaxMaxTimeoutTimeMs", 3000);
    }
    public static void b(q p0,y p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, q.class, "16")) {
       }else {
          k1.m(p0.r);
          b9.a(p0.l);
          Object[] objArray = new Object[0];
          j0.f("SplashDataManager", "handleSplashImproveActiveEvent >>> ", objArray);
       }
       return;
    }
    public boolean D2(){
       Object[] obj = PatchProxy.apply(null, this, q.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.S()) {
          obj = new Object[0];
          j0.f("SplashDataManager", "enter needEyemaxSplash hasn\'t splash", obj);
          return 0;
       }else if(this.h != null){
          obj = new Object[0];
          j0.f("SplashDataManager", "needEyemaxSplash resume start return false", obj);
          return 0;
       }else if(this.N()){
          obj = new Object[0];
          j0.f("SplashDataManager", "enter needEyemaxSplash isForbidSplashImprove", obj);
          return 0;
       }else if(!d.a(-536296199).D2()){
          obj = new Object[0];
          j0.f("SplashDataManager", "enter needEyemaxSplash SplashPlugin not permitted", obj);
          return 0;
       }else {
          return true;
       }
    }
    public int G(){
       Object obj = PatchProxy.apply(null, this, q.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.I();
       if (!i) {
          return 1;
       }
       if (i == 2) {
          return 2;
       }
       if (i == 1) {
          return 3;
       }
       return 0;
    }
    public void H(c$a p0){
       this.s = p0;
    }
    public int I(){
       int i;
       if (this.g != null) {
          i = 0;
       }else if(this.h != null){
          i = 1;
       }else {
          i = 2;
       }
       return i;
    }
    public boolean J(){
       Object[] objArray2;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, q.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(0x4b316083).l0();
       if (obj != null) {
          objArray = obj.c();
       }
       if (objArray != null) {
          Object[] objArray1 = new Object[0];
          j0.f("SplashDataManager", "now "+objArray.H(), objArray1);
          GifshowActivity gifshowActiv = m.a().gB();
          if (gifshowActiv == null) {
             objArray2 = new Object[0];
             j0.f("SplashDataManager", "No home", objArray2);
             return 0;
          }else if((objArray.H().getClassName()).equals(new ComponentName(a.a().a(), SplashV2Activity.class).getClassName())){
             List list = obj.e();
             if (new ComponentName(a.b(), UriRouterActivity.class).equals(list.get(0).H())) {
                objArray = list.get(1);
             }else if(list.size() > 2){
                return 0;
             }else {
                objArray = list.get(0);
             }
          }
          if (gifshowActiv.getComponentName().equals(objArray.H())) {
             return 1;
          }else {
             objArray = new Object[0];
             j0.f("SplashDataManager", "the chosen "+objArray.H(), objArray);
          }
       }
       objArray2 = new Object[0];
       j0.f("SplashDataManager", " no nowActivityRecord", objArray2);
       return 0;
    }
    public void K(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "38")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashDataManager", "onRealtimeSplashFail", objArray);
       this.e();
       b uob = this.a();
       if (uob != null && !TextUtils.x(p0)) {
          this.n(uob, p0);
       }
       return;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, q.class, "37")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashDataManager", "onRealtimeSplashShow", objArray);
       this.e();
       return;
    }
    public boolean M(){
       return this.m;
    }
    public boolean N(){
       Object obj = PatchProxy.apply(null, this, q.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (k4.d()) {
          return b;
       }
       if (c.b() || this.f != null) {
          b = true;
       }
       return b;
    }
    public int O(){
       return this.o;
    }
    public void P(c$b p0){
       Object[] objArray1;
       boolean b;
       String e;
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oq, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashDataManager", "init "+p0, objArray);
       if (p0.e == null) {
          b.a(0xc5bd719).a();
       }
       if (this.S()) {
          objArray1 = new Object[i];
          j0.l("SplashDataManager", "splash is working!!, drop this init", objArray1);
          return;
       }else {
          this.b = p0.b;
          this.c = p0.c;
          this.e = p0.f;
          this.f = p0.d;
          this.h = p0.e;
          this.d = p0.a;
          this.g = d.b;
          this.k.dispose();
          this.k = new a();
          this.j = a.g();
          b9.a(this.l);
          objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, oq, "25")) {
             this.k.c(this.j.subscribe(new o(this, this.p.get().booleanValue()), new k0(this)));
          }
          CommercialSplashTracker uCommercialS = CommercialSplashTracker.E();
          Objects.requireNonNull(uCommercialS);
          if (!PatchProxy.applyVoid(objArray1, uCommercialS, CommercialSplashTracker.class, "7")) {
             uCommercialS.p = RxBus.f.f(e.class).observeOn(d.a).subscribe(new d(uCommercialS));
          }
          int i1 = 1;
          this.k(i1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoid(objArray1, this, oq, "19")) {
             if (d.f && l.p()) {
                d.a(-536296199).pe(i1);
             }
             Object obj = PatchProxy.apply(objArray1, this, oq, "22");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!d.f || (!l.p() && (!this.d() && (this.c == null && (this.d != null || UnnaturalStartHelper.c.c(this.e)))))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                this.k(5);
                if (!PatchProxy.applyVoid(objArray1, this, oq, "21") && this.h != null) {
                   UnnaturalStartHelper obj1 = PatchProxy.apply(objArray1, this, oq, "23");
                   if (obj1 != patchProxyRe) {
                      objArray1 = obj1;
                   }else if(d.f && l.p()){
                      e = i.E;
                   }else if(this.d()){
                      e = i.G;
                   }else if(this.c != null){
                      e = i.H;
                   }else if(this.d != null){
                      e = i.F;
                   }else {
                      obj1 = UnnaturalStartHelper.c;
                      if (obj1.c(this.e)) {
                         e = obj1.a(this.e, i1);
                      }
                   }
                   if (!TextUtils.x(objArray1)) {
                      i.e(objArray1);
                   }
                }
             }else {
                d uod = this.j();
                if (uod != null && uod.isEnabled()) {
                   if (this.N()) {
                      if (a.t().d("adForbidSplashImproveStateOpt", i1)) {
                         this.k(5);
                      }else {
                         this.i();
                      }
                   }else if(PatchProxy.applyVoid(objArray1, this, oq, "42")){
                      objArray1 = new Object[i];
                      j0.f("SplashDataManager", "realtimeSplash delay runnable start", objArray1);
                      k1.r(this.t, a.t().b("realtimeSplashTimeoutMs", 2000));
                   }
                   if (this.g != null || d.a(-536296199).LG()) {
                      t ot = uod.b(this.I()).filter(new m0(this));
                      if (this.h != null) {
                         ot = ot.timeout((long)this.Z(), TimeUnit.MILLISECONDS, new n(this));
                      }else {
                         this.k(6);
                      }
                      this.k.c(ot.subscribe(new l0(this), p.b));
                   }else {
                      b uob = uod.a();
                      if (this.l(uob)) {
                         this.c(uob);
                         this.j.onNext(uob);
                         this.k(2);
                      }else {
                         this.i();
                      }
                   }
                }else {
                   this.i();
                }
             }
          }
       label_023c :
          return;
       }
    }
    public a Q(){
       return this.j;
    }
    public int R(){
       return this.n;
    }
    public boolean S(){
       Object[] obj = PatchProxy.apply(null, this, q.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!this.m()) {
          obj = new Object[i];
          j0.f("SplashDataManager", "Manager is not init.", obj);
          return i;
       }else {
          q ta = this.a;
          if (ta != 2 && (ta == 3 || ta == 6)) {
             i = true;
          }
          return i;
       }
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, q.class, "39")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashDataManager", "onRealtimeSplashCancel", objArray);
       this.e();
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       this.f();
       this.k(3);
       return;
    }
    public void V(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashDataManager", "enterEnhancedSplash mState:"+this.a, objArray);
       boolean b = this.D2();
       Object[] objArray1 = new Object[0];
       j0.f("SplashDataManager", "enterEnhancedSplash needEyemaxSplash:"+b, objArray1);
       if (!b) {
          if (this.p.get().booleanValue()) {
             this.h(p0, 0);
          }else {
             this.g(p0);
          }
       }
       return;
    }
    public boolean W(){
       Object obj = PatchProxy.apply(null, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.S() && this.p.get().booleanValue())? true: false;
       return b;
    }
    public boolean X(){
       Object obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a() != null)? true: false;
       return b;
    }
    public boolean Y(){
       q obj = PatchProxy.apply(null, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f();
       obj = this.a;
       boolean b = (obj == 2 || obj == 6)? true: false;
       return b;
    }
    public int Z(){
       Object obj = PatchProxy.apply(null, this, q.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("keySplashStartupTimeout", 2000);
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.f();
       return this.j.i();
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       this.f();
       if (this.a == 4) {
          return;
       }
       this.k(4);
       return;
    }
    public final void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "20")) {
          return;
       }
       if (this.h != null && p0 != null) {
          p0 = p0.b;
          if (!PatchProxy.applyVoidOneRefs(p0, null, l.class, "13")) {
             SplashInfo splashInfo = l.e(p0);
             if (splashInfo != null) {
                splashInfo.mIsLandscape = l1.a();
             }
          }
       }
       return;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, q.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       int i = 0;
       if (this.b == null || !a.t().d("enableAvoidSplashFromPush", b)) {
          b = false;
       }
       Object[] objArray = new Object[i];
       j0.f("SplashDataManager", "avoidPush :"+b+", is resume start :"+this.h, objArray);
       return b;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, q.class, "44")) {
          return;
       }
       k1.m(this.t);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, q.class, "34")) {
          return;
       }
       if (this.m()) {
          return;
       }
       throw new SplashException("No inited");
    }
    public final void g(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "11")) {
          return;
       }
       Intent intent = new Intent(p0, SplashV2Activity.class);
       intent.putExtra("startActivityTimeStamp", SystemClock.elapsedRealtime());
       p0.startActivity(intent, a.a(p0, 0, 0).d());
       p0.overridePendingTransition(0, 0);
       b9.a(this.l);
       this.l = RxBus.f.f(y.class).observeOn(d.a).subscribe(new j0(this));
       k1.r(this.r, 5000);
       return;
    }
    public int getState(){
       return this.a;
    }
    public final void h(Activity p0,boolean p1){
       Object[] obj;
       Activity uActivity1;
       Iterator iterator;
       Object[] objArray;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oq, "12")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       CommercialSplashTracker.E().L(SystemClock.elapsedRealtime());
       int i = 2;
       if (!p1) {
          obj = PatchProxy.applyOneRefs(uActivity, this, oq, "13");
          int i1 = 1;
          if (obj != PatchProxyResult.class) {
             obj = obj.booleanValue();
          }else if(uActivity instanceof FragmentActivity && uActivity instanceof a){
             uActivity1 = 1;
          }else {
             uActivity1 = null;
          }
          if (uActivity1) {
             uActivity1 = uActivity;
             if (uActivity1.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED) {
                iterator = uActivity1.getSupportFragmentManager().getFragments().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Fragment uFragment = iterator.next();
                      if (uFragment instanceof DialogFragment) {
                         objArray = new Object[0];
                         j0.f("SplashDataManager", "isSplashAttachAvailable, logo visible on "+uFragment+", is a dialog.", objArray);
                         CommercialSplashTracker.E().T(3);
                      }
                   }else {
                      iterator = true;
                   }
                }
                b9.a(this.l);
                this.l = RxBus.f.f(y.class).observeOn(d.a).subscribe(new j0(this));
                k1.r(this.r, 5000);
                return;
             }else {
                objArray = new Object[0];
                j0.f("SplashDataManager", "isSplashAttachAvailable, activity status:"+uActivity1.getLifecycle().getCurrentState()+"is not visible.", objArray);
                CommercialSplashTracker.E().T(i);
             }
          }else {
             objArray = new Object[0];
             j0.f("SplashDataManager", "isSplashAttachAvailable, activity:"+uActivity.getClass()+" is not splash anchor.", objArray);
             CommercialSplashTracker.E().T(i1);
          }
          iterator = false;
          if (obj) {
             p0 = uActivity;
             if (!PatchProxy.applyVoidOneRefs(p0, this, oq, "14")) {
                if (!d.a(-1883158055).U3(p0)) {
                   i1 = 3;
                }
                e uoe = p0.getSupportFragmentManager().beginTransaction();
                uoe.f(0x1020002, SplashFragment.ch(i1));
                uoe.m();
                obj = new Object[0];
                j0.f("SplashDataManager", "splashfragment is attach to "+p0.getClass().getName(), obj);
             }
             CommercialSplashTracker.E().O(3);
             obj = new Object[0];
             j0.f("SplashDataManager", "enterSplashV3, logo visible on "+uActivity, obj);
             goto label_019d ;
          }
       }
       CommercialSplashTracker.E().O(i);
       if (!PatchProxy.applyVoidOneRefs(p0, this, oq, "15")) {
          p0.startActivity(new Intent(p0, SplashV3Activity.class), a.a(p0, 0, 0).d());
          p0.overridePendingTransition(0, 0);
       }
       obj = new Object[0];
       j0.f("SplashDataManager", "enterSplashV3, other activity, logo visible on"+p0, obj);
       goto label_019d ;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, q.class, "28")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashDataManager", "mIsResumeStart: "+this.h+" mIsColdStart: "+this.g, objArray);
       if (this.h != null) {
          this.k(5);
       }else if(e.f() && RealtimeTabRequester.y()){
          Object[] objArray1 = new Object[i];
          j0.f("SplashDataManager", "isRequestingPersonalizedTab", objArray1);
          this.k(6);
       }else if(this.g != null){
          this.k(6);
       }else {
          this.k(5);
       }
       return;
    }
    public boolean isColdStart(){
       return this.g;
    }
    public final d j(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.apply(null, this, q.class, "30");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (a.a()) {
          obj = PatchProxy.apply(null, null, h.class, "1");
          if (obj != patchProxyRe) {
          }else {
             obj = new g();
          }
       }else {
          d uod = d.a(-536296199).Hv();
       }
       return obj;
    }
    public final void k(int p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "31")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashDataManager", "state change "+this.a+", "+p0, objArray);
       q ta = this.a;
       if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(ta), Integer.valueOf(p0), null, oq, "32")) {
          switch (p0){
              case 1:
              case 5:
                break;
              case 2:
              case 4:
              case 6:
              case 3:
                if (ta == 5) {
                   throw new SplashException("why call this when no splash"+p0);
                }
                break;
              default:
                throw new SplashException("illegal state change "+p0);
          }
       }
       this.a = p0;
       d.g = this.S();
       if (!PatchProxy.applyVoid(null, this, oq, "33")) {
          RxBus.f.b(new e(this.a));
       }
       b.a(-1343064608).X(p0);
       return;
    }
    public final boolean l(b p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, q.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       SplashInfo mSplashAdMat = p0.a.mSplashAdMaterialType;
       boolean b1 = true;
       if (mSplashAdMat != b1 && mSplashAdMat != 2) {
          b1 = false;
       }
       if (b1) {
          obj = new Object[b];
          j0.f("SplashDataManager", "receive data "+a.a(p0), obj);
       }else {
          obj = new Object[b];
          j0.l("SplashDataManager", "data is not valid, ignore "+p0, obj);
       }
       return b1;
    }
    public final boolean m(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public final void n(b p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "41")) {
          return;
       }
       i.d(d.b(RequestTiming.ON_FOREGROUND, p0, p1));
       return;
    }
}
