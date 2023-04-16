package com.kuaishou.commercial.splash.l;
import java.lang.Object;
import yy.g1;
import yy.y0;
import com.kuaishou.commercial.splash.e;
import brd.v;
import tjc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import com.kuaishou.commercial.splash.SplashModel;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import yx.j0;
import com.kwai.sdk.switchconfig.a;
import brd.t;
import yy.x;
import io.reactivex.g;
import o56.d;
import android.app.Activity;
import wnc.a;
import wkd.b;
import tjc.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.splash.SplashUtils;
import java.io.File;
import android.net.Uri;
import nl9.h0$d;
import com.kuaishou.commercial.splash.i;
import cz.b;
import cz.d;
import java.lang.StringBuilder;
import tw.l;
import yy.g0;
import android.os.SystemClock;
import nx.b;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.yxcorp.gifshow.w;
import of6.a;
import g59.i;
import ok.x;
import com.kuaishou.commercial.splash.UnnaturalStartHelper;
import com.kwai.framework.activitycontext.ActivityContext;
import hn5.n;
import android.content.Context;
import yy.p;
import com.yxcorp.gifshow.feed.g;
import kfa.b;
import com.yxcorp.gifshow.feed.model.PhotoList;
import com.yxcorp.gifshow.feed.model.PhotoQuery;
import java.lang.Integer;
import cjd.e;
import erd.o;
import yy.z;
import com.kuaishou.commercial.splash.k;
import erd.g;
import crd.b;
import java.lang.Long;
import yy.y;
import java.util.concurrent.Callable;
import brd.a0;
import yy.c0;
import yy.a0;
import com.kuaishou.commercial.splash.j;

public class l	// class@0015b3
{
    public b a;
    public v b;
    public QPhoto c;
    public final g1 d;
    public final y0 e;
    public final e f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public int l;
    public boolean m;

    public void l(){
       super();
       g1 og1 = new g1();
       this.d = og1;
       y0 oy0 = new y0();
       this.e = oy0;
       this.f = new e(oy0, og1);
    }
    public final void a(v p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "9")) {
          return;
       }
       p0.onNext(p1);
       return;
    }
    public boolean b(boolean p0,SplashModel p1,SplashInfo p2,RequestTiming p3){
       Object[] obj;
       if (PatchProxy.isSupport(l.class)) {
          obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, l.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1.mNonEyeMaxData != null) {
          p2.mSplashAdType = 2;
          obj = new Object[0];
          j0.f("SplashAdManager", "checkEyemaxSplashCanShow, normal splash, permitted", obj);
          return true;
       }else if(p3 == RequestTiming.ON_FOREGROUND){
          p2.mSplashAdType = 2;
          obj = new Object[0];
          j0.f("SplashAdManager", "checkEyemaxSplashCanShow, warm start, forceDisplay permitted", obj);
          return true;
       }else if(p2.mSplashAdMaterialType == 2){
          obj = new Object[0];
          j0.f("SplashAdManager", "checkEyemaxSplashCanShow, image splash, permitted", obj);
          p2.mSplashAdType = 2;
          return true;
       }else {
          obj = new Object[0];
          j0.f("SplashAdManager", "checkEyemaxSplashCanShow, wait tab", obj);
          return true;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l.class, "28")) {
          return;
       }
       if (a.t().d("enableSplashClearData", true)) {
          this.a = null;
       }
       this.k = false;
       this.l = 0;
       this.m = false;
       return;
    }
    public int d(){
       return this.l;
    }
    public t e(){
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, l.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = objArray;
       obj = t.create(new x(this));
       l tf = this.f;
       RequestTiming cOLD_START = (d.b)? RequestTiming.COLD_START: RequestTiming.ON_HOME_PAGE_CREATED;
       tf.d(cOLD_START);
       return obj;
    }
    public boolean f(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.b(p0);
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, l.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a();
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, l.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = -1608526086;
       i = (b.a(i).getState() == 4 || b.a(i).getState() == 5)? true: false;
       return i;
    }
    public boolean i(b p0){
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          objArray = new Object[0];
          j0.f("SplashAdManager", "no splashAdData", objArray);
          return 0;
       }else if(p0.d != null){
          return true;
       }else {
          b b = p0.b;
          if (b != null && SplashUtils.H(b)) {
             return SplashUtils.C(p0.b);
          }
          if (p0.c != null && new File(p0.c.getPath()).exists()) {
             return true;
          }
          objArray = new Object[0];
          j0.c("SplashAdManager", "isSplashValid data Resource wrong", objArray);
          return 0;
       }
    }
    public void j(RequestTiming p0,h0$d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "10")) {
          return;
       }
       if (this.h()) {
          i.d(this.n(d.a(p0, p1, i.k)));
       }else {
          i.d(d.a(p0, p1, i.d));
       }
       return;
    }
    public void k(boolean p0,RequestTiming p1,SplashModel p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, l.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdManager", "makeSplashAdData requestTiming: "+p1+" isRealTime:"+p0, objArray);
       if (p2 == null) {
          objArray1 = new Object[0];
          j0.f("SplashAdManager", "makeSplashAdData no splashModel, return", objArray1);
          return;
       }else {
          SplashModel mBaseFeed = p2.mBaseFeed;
          if (mBaseFeed != null) {
             SplashInfo splashInfo = l.e(mBaseFeed);
             if (splashInfo == null) {
                objArray1 = new Object[0];
                j0.f("SplashAdManager", "makeSplashAdData no splashInfo, return", objArray1);
                return;
             }else {
                b uob = b.a(-1220313162).h(this.d, p2, p0, p1);
                this.j = SystemClock.elapsedRealtime();
                if (uob == null || (splashInfo.mSplashAdType == 1 && !this.b(p0, p2, uob.a, p1))) {
                   objArray1 = new Object[0];
                   j0.f("SplashAdManager", "makeSplashAdData, splash not permitted", objArray1);
                   return;
                }else {
                   this.a = uob;
                }
             }
          }
          if (p1 == RequestTiming.COLD_START || p0) {
             this.m(p1);
          }
          return;
       }
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       if (a.t().d(b.a, true)) {
          d.a(-536296199).u5();
       }
       return;
    }
    public void m(RequestTiming p0){
       t this;
       boolean b2;
       boolean b3;
       b uob = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, uob, l.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdManager", "notifySplashData", objArray);
       l a = uob.a;
       l b = uob.b;
       if (b != null) {
          objArray = new Object[0];
          j0.f("SplashAdManager", "notifySplashData has called async", objArray);
          uob.a = null;
       }
       uob.b = null;
       k ok = 1;
       if (!PatchProxy.applyVoidThreeRefs(p0, a, b, this, l.class, "11")) {
          Activity obj1 = PatchProxy.applyOneRefs(a, uob, l.class, "16");
          if (obj1 != PatchProxyResult.class) {
             b2 = obj1.booleanValue();
          }else if(a != null && (uob.i(a) && (a.a.mSplashBaseInfo == null || a.b == null))){
             b2 = true;
          }else {
             b2 = false;
          }
          if (!b2) {
             b2 = -1343064608;
             w ow = b.a(b2);
             boolean Object[] obj2 = PatchProxy.applyOneRefs(ow, uob, l.class, "15");
             if (obj2 != PatchProxyResult.class) {
                obj2 = obj2.booleanValue();
             }else if(ow != null && (ow.isColdStart() && (a.b() && i.b.get().booleanValue()))){
                obj2 = true;
             }else {
                obj2 = false;
             }
             if (obj2) {
                i.d(d.b(obj, a, i.f));
             }else if(SplashUtils.B()){
                obj2 = PatchProxy.applyTwoRefs(b, ow, uob, l.class, "14");
                if (obj2 != PatchProxyResult.class) {
                   b3 = obj2.booleanValue();
                }else if(ow != null && (ow.getLaunchSource() == 6 && b == null)){
                   b3 = true;
                }else {
                   b3 = false;
                }
                if (b3) {
                   i.d(d.b(obj, a, i.e));
                }else {
                   UnnaturalStartHelper c = UnnaturalStartHelper.c;
                   if (c.c(b.a(b2).getLaunchSource())) {
                      obj2 = new Object[0];
                      j0.f("SplashAdManager", "unnatural start logSplashFailedIfNeed", obj2);
                      i.d(d.b(obj, a, c.a(b.a(b2).getLaunchSource(), 0)));
                   }else if(this.h()){
                      i.d(uob.n(d.b(obj, a, i.k)));
                   }else {
                      obj1 = PatchProxy.applyOneRefs(b, uob, l.class, "13");
                      if (obj1 != PatchProxyResult.class) {
                         b2 = obj1.booleanValue();
                      }else {
                         obj1 = ActivityContext.g().e();
                         obj2 = new Object[0];
                         j0.f("SplashAdManager", "currentActivity:"+obj1, obj2);
                         b2 = (b == null && !d.a(-1883158055).U3(obj1))? true: false;
                      }
                      if (b2) {
                         i.d(d.b(obj, a, i.m));
                      }else if(b == null && a.t().d("enableReportNoRequestFailType", 0)){
                         i.d(d.b(obj, a, i.n));
                      }
                   }
                }
             }else if(b == null){
                i.d(d.b(obj, a, i.a));
             }else {
                i.d(d.b(obj, a, i.b));
             }
          }
       }
    label_019c :
       if (b != null && a != null) {
          uob.a(b, a);
          b.onComplete();
          if (!PatchProxy.applyVoidOneRefs(a, uob, l.class, "6") && uob.i(a)) {
             objArray = (a.a.mSplashAdType == ok)? 1: 0;
             if (objArray) {
                b.a(0x946a02c).L(a.b);
                b b1 = a.b;
                if (b1 != null) {
                   String id = b1.getId();
                   if (!PatchProxy.applyVoidOneRefs(id, uob, l.class, "22")) {
                      RequestTiming oN_FOREGROUN = RequestTiming.ON_FOREGROUND;
                      this = PatchProxy.applyThreeRefs(id, null, oN_FOREGROUN, null, g.class, "13");
                      if (this != PatchProxyResult.class) {
                      }else {
                         PhotoQuery[] photoQueryAr = new PhotoQuery[ok];
                         photoQueryAr[0] = new PhotoQuery(id, null);
                         this = g.a().a(new PhotoList(photoQueryAr), null, oN_FOREGROUN).map(new e()).map(g.k(id));
                      }
                      this.subscribe(new z(uob), k.b);
                   }
                }
             }
          }
       }
    label_0227 :
       return;
    }
    public final b n(b p0){
       long l;
       long l1;
       b uob = b.class;
       Long obj = PatchProxy.applyOneRefs(p0, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = Long.valueOf((this.h - this.g));
       l = 0;
       if (PatchProxy.applyOneRefs(obj, p0, uob, "1") != PatchProxyResult.class) {
       }else if(obj != null){
          l1 = obj.longValue();
       }else {
          l1 = l;
       }
       p0.i = l1;
       obj = Long.valueOf((this.i - this.h));
       if (PatchProxy.applyOneRefs(obj, p0, uob, "2") != PatchProxyResult.class) {
       }else if(obj != null){
          l1 = obj.longValue();
       }else {
          l1 = l;
       }
       p0.j = l1;
       obj = Long.valueOf((this.j - this.i));
       if (PatchProxy.applyOneRefs(obj, p0, uob, "3") != PatchProxyResult.class) {
       }else if(obj != null){
          l = obj.longValue();
       }
       p0.k = l;
       return p0;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, l.class, "33")) {
          return;
       }
       this.h = SystemClock.elapsedRealtime();
       Object[] objArray = new Object[0];
       j0.f("SplashAdManager", "parseLocalSplashProcess gson parsed used ms:"+(this.h - this.g), objArray);
       return;
    }
    public void p(int p0){
       this.l = p0;
    }
    public void q(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.a = null;
       a0.y(new y(this, p0)).C(new c0(this, p0)).R(new a0(this, p0), j.b);
       return;
    }
}
