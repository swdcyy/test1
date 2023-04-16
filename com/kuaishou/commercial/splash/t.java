package com.kuaishou.commercial.splash.t;
import nl9.h0;
import java.lang.Object;
import yy.u0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import yy.p;
import java.util.List;
import java.util.Collection;
import ekd.q;
import tjc.c;
import tjc.b;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.feed.VideoFeed;
import uh5.e;
import yx.j0;
import java.lang.StringBuilder;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import fz.e;
import com.kuaishou.commercial.splash.l;
import com.kuaishou.commercial.splash.e;
import com.kwai.framework.model.user.QCurrentUser;
import tjc.d;
import zy.d;
import yy.i;
import yy.a;
import o56.a;
import com.kwai.framework.model.feed.BaseFeed;
import fz.a;
import com.kwai.video.hodor.HodorConfig;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import jg5.c;
import gg5.c;
import yy.j;
import nl9.h0$d;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import android.os.SystemClock;
import com.kuaishou.commercial.splash.SplashUtils;
import java.lang.System;
import java.lang.Long;
import hz.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kwai.component.uiconfig.tab.model.DefaultTabConfig;
import java.lang.reflect.Type;
import th5.c;
import kotlin.jvm.internal.a;
import com.kwai.component.uiconfig.tab.model.DefaultTabConfig$PriorityTabConfig;
import yy.f0;
import java.lang.Runnable;
import t45.c;
import hz.b;
import hz.d;
import hz.d$a;
import cz.e;
import cz.d;
import com.kuaishou.commercial.splash.i;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import z1.a;
import nx8.g;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import android.app.Application;
import yy.l1;
import qe6.b;
import wa5.e;
import java.lang.Throwable;
import com.kuaishou.commercial.config.StartupBirthdayInfo;
import qw.f;
import android.widget.FrameLayout;
import com.kuaishou.commercial.splash.presenter.SplashFrameLayout;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jz.r;
import jz.n;
import tl8.d;
import tkd.b;
import tkd.d;
import ju5.g;
import yy.f1;
import ekd.k1;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import tw.l;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.splash.SplashV2Activity;
import com.kuaishou.commercial.splash.v3.view.SplashV3Activity;
import nl9.h0$b;
import fg6.a;
import com.yxcorp.gifshow.commercial.model.RealtimeSplashInfo;
import com.google.gson.Gson;
import fz.d;
import fz.c;
import yy.c1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.commercial.splash.playable.SplashPlayableFragment;
import java.util.Iterator;
import hn5.n;
import w1.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import mxb.c;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Intent;
import nx.b;
import yy.d1;
import java.util.concurrent.Future;
import com.kuaishou.commercial.splash.presenter.q;
import yy.e1;

public class t implements h0	// class@001626
{
    public d b;
    public final u0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public PhotoAdvertisement j;
    public e k;
    public boolean l;
    public String m;
    public boolean n;

    public void t(){
       super();
       this.c = new u0();
       this.f = false;
       this.g = true;
       this.l = true;
    }
    public boolean BJ(){
       Object obj = PatchProxy.apply(null, this, t.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(b.a(0x946a02c).h()) ^ 0x01);
    }
    public boolean Cb(){
       Object obj = PatchProxy.apply(null, this, t.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.h != null) {
          return b;
       }
       int i = -1608526086;
       if (!b.a(i).S() && b.a(i).getState() != 4) {
          return false;
       }
       if (b.a(i).a() == null) {
          b = false;
       }
       return b;
    }
    public boolean D2(){
       b a;
       String str1;
       Object[] objArray1;
       b obj = PatchProxy.apply(null, this, t.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-1608526086).a();
       int i = 0;
       if (obj != null) {
          a = obj.a;
          if (a != null) {
             String str = 1;
             if (a.mSplashAdMaterialType != str || (a.mSplashAdType == str && obj.b instanceof VideoFeed)) {
                if (!e.f() && !e.e()) {
                   objArray1 = new Object[i];
                   j0.f("SplashPluginImpl", "needEyemaxSplash is not Thanos or nasa return false", objArray1);
                   return i;
                }else {
                   objArray1 = new Object[i];
                   j0.f("SplashPluginImpl", "needEyemaxSplash return true", objArray1);
                   return str;
                }
             }
          }
       }
       if (obj != null) {
          a = obj.a;
          if (a != null) {
             str1 = String.valueOf(a.mSplashAdType);
          label_0065 :
             Object[] objArray = new Object[i];
             j0.f("SplashPluginImpl", "needEyemaxSplash splash data not permit data:"+obj+"mSplashAdType:"+str1, objArray);
             return i;
          }
       }
       str1 = "unknow";
       goto label_0065 ;
    }
    public void Dx(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "36")) {
          return;
       }
       t tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, u0.class, "4")) {
             tc.b.set(true);
          }
       }
       return;
    }
    public void ED(Context p0,RequestTiming p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "1")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       if (!SystemUtil.L(p0)) {
          return;
       }
       this.g = a.t().d("enableInsertEyemaxAdapterPreloadNasa", true);
       if (p1 == RequestTiming.COLD_START) {
          this.n().j0(p1);
          if (!this.LG()) {
             l ol = b.a(-1790720308);
             Objects.requireNonNull(ol);
             if (!PatchProxy.applyVoidOneRefs(p1, ol, l.class, "24")) {
                ol.f.d(p1);
             }
          }
       }
       this.d = true;
       return;
    }
    public final boolean F(){
       Object[] obj = PatchProxy.apply(null, this, t.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.l == null) {
          obj = new Object[0];
          j0.f("SplashPluginImpl", "not cold start", obj);
          return 0;
       }else if(!QCurrentUser.ME.isLogined()){
          obj = new Object[0];
          j0.f("SplashPluginImpl", "not login", obj);
          return 0;
       }else {
          return this.Ym();
       }
    }
    public boolean GV(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, t.class, "37");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (obj == null) {
          return true;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, u0.class, "5");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.b.get();
       return b;
    }
    public d Hv(){
       Object obj = PatchProxy.apply(null, this, t.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F()) {
          if (!this.b instanceof d) {
             this.b = new d();
          }
       }else if(this.LG()){
          if (!this.b instanceof i) {
             this.b = new i();
          }
       }else if(!this.b instanceof a){
          this.b = new a();
       }
       return this.b;
    }
    public boolean LG(){
       Object obj = PatchProxy.apply(null, this, t.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.F()) {
          return b;
       }
       if (a.t().d("enableRealtimeSplash", true)) {
          b = true;
       }
       return b;
    }
    public boolean Li(boolean p0){
       this.f = p0;
       return p0;
    }
    public boolean Q4(){
       return this.f;
    }
    public List QV(){
       Object obj = PatchProxy.apply(null, this, t.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.ED(a.B, RequestTiming.COLD_START);
       }
       return b.a(0x946a02c).h();
    }
    public void Qu(BaseFeed p0){
       this.i = true;
    }
    public void R3(RequestTiming p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "12")) {
          return;
       }
       if (this.n() instanceof a) {
          this.n().R3(p0, p1);
       }
       return;
    }
    public void RK(){
       if (PatchProxy.applyVoid(null, this, t.class, "41")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       HodorConfig.setCacheBytesLimitForCacheGroup((long)((a.t().a("prefetchEyemaxDiskLimitSize", 200) * 1024) * 1024), "splash_ad_eyemax");
       return;
    }
    public PhotoAdvertisement RR(){
       return this.j;
    }
    public c RW(){
       Object obj = PatchProxy.apply(null, this, t.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1471653231).c(j.class);
    }
    public void VE(RequestTiming p0,h0$d p1){
       PatchProxyResult patchProxyRe1;
       b uob;
       int i;
       boolean b;
       Object[] objArray1;
       boolean b1;
       Integer integer;
       DefaultTabConfig uDefaultTabC;
       String str = this;
       Object obj = p0;
       Object obj1 = p1;
       t ot = t.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, str, ot, "7")) {
          return;
       }
       CommercialSplashTracker uCommercialS = CommercialSplashTracker.E();
       long l = SystemClock.elapsedRealtime();
       if (!uCommercialS.z - null) {
          uCommercialS.z = l;
       }
       if (obj1 != null) {
          str.m = obj1.b;
       }
       if (SplashUtils.e()) {
          if (!PatchProxy.applyVoidTwoRefs(obj, obj1, str, ot, "43")) {
             e uoe = this.n();
             long l1 = uoe.f0();
             long l2 = uoe.h0(System.currentTimeMillis());
             long l3 = b.a(-1790720308);
             Objects.requireNonNull(l3);
             l ol = l.class;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (PatchProxy.isSupport(ol)) {
                patchProxyRe1 = patchProxyRe;
                uob = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(l1), Long.valueOf(l2), l3, l.class, "31");
                if (uob != patchProxyRe1) {
                }else {
                label_007f :
                   Object[] objArray = null;
                   if (obj1 != null) {
                      Object[] obj2 = PatchProxy.apply(objArray, obj1, h0$d.class, "1");
                      i = 1;
                      int i1 = 0;
                      if (obj2 != patchProxyRe1) {
                         b = obj2.booleanValue();
                      }else if(TextUtils.isEmpty(obj1.b) && (TextUtils.isEmpty(obj1.c) && TextUtils.isEmpty(obj1.d))){
                         b = true;
                      }else {
                         b = false;
                      }
                      if (!b) {
                         l3.g = SystemClock.elapsedRealtime();
                         int i2 = 5;
                         if (!TextUtils.x(obj1.c)) {
                            h0$d e = obj1.e;
                            d$a obj3 = PatchProxy.applyOneRefs(e, objArray, SplashUtils.class, "59");
                            if (obj3 != patchProxyRe1) {
                               b = obj3.booleanValue();
                            }else if(e != null){
                               integer = ArraysKt___ArraysKt.Eb(e);
                            }else {
                               integer = objArray;
                            }
                            if (integer == null || integer.intValue() != i2) {
                               if (a.t().d("enableEyemaxWithoutPriorityTab", i)) {
                                  if (e != null) {
                                     uDefaultTabC = (!e.length)? 1: null;
                                     if (!uDefaultTabC) {
                                     label_0133 :
                                        b = false;
                                     }
                                  }
                                  uDefaultTabC = c.a(DefaultTabConfig.class);
                                  DefaultTabConfig mPriorityTab = (uDefaultTabC != null)? uDefaultTabC.mPriorityTabConfig: objArray;
                                  if (mPriorityTab != null) {
                                     mPriorityTab = uDefaultTabC.mPriorityTabConfig;
                                     a.o(mPriorityTab, "defaultTabConfig.mPriorityTabConfig");
                                     if (mPriorityTab.isValidNow()) {
                                        DefaultTabConfig$PriorityTabConfig mDefaultTab = uDefaultTabC.mPriorityTabConfig.mDefaultTab;
                                        Integer integer1 = (mDefaultTab != null)? ArraysKt___ArraysKt.Eb(mDefaultTab): objArray;
                                        if (integer1 == null || integer1.intValue() != i2) {
                                        }
                                     }else {
                                        goto label_0133 ;
                                     }
                                  }else {
                                     goto label_0133 ;
                                  }
                               }else {
                                  goto label_0133 ;
                               }
                            }
                            b = true;
                            if (b) {
                               b1 = true;
                            label_013b :
                               if (PatchProxy.isSupport(ol)) {
                                  obj2 = new Object[i2];
                                  obj2[i1] = obj;
                                  obj2[i] = obj1;
                                  obj2[2] = Long.valueOf(l1);
                                  obj2[3] = Long.valueOf(l2);
                                  obj2[4] = Boolean.valueOf(b1);
                                  if (PatchProxy.applyVoid(obj2, l3, ol, "32")) {
                                  label_0171 :
                                     objArray1 = objArray;
                                  label_0188 :
                                     if (b1) {
                                        uob = b.g(p0, p1, obj1.c, l1, l2, true);
                                     }else if(!TextUtils.x(obj1.b)){
                                        uob = b.g(p0, p1, obj1.b, l1, l2, false);
                                     }else if(!TextUtils.x(obj1.d)){
                                        if (PatchProxy.isSupport(d.class)) {
                                           uob = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(l1), Long.valueOf(l2), null, d.class, "5");
                                           if (uob != patchProxyRe1) {
                                           }
                                        }
                                        obj3 = d.h;
                                        Objects.requireNonNull(obj3);
                                        if (PatchProxy.isSupport(d$a.class)) {
                                           uob = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(l1), Long.valueOf(l2), obj3, d$a.class, "1");
                                           if (uob != patchProxyRe1) {
                                           }
                                        }
                                        a.p(obj, "requestTiming");
                                        a.p(obj1, "splashResponse");
                                        uob = new d(p0, p1, l1, l2);
                                     }else {
                                        i.o(d.f(obj, obj1, Long.valueOf(l1), Long.valueOf(l2)));
                                        l3.l();
                                     label_0240 :
                                        obj2 = objArray1;
                                     }
                                  }
                               }
                               if (!a.t().d("enableReportFilteredSplash", i)) {
                                  goto label_0171 ;
                               }else {
                                  objArray1 = objArray;
                                  f0 uof0 = new f0(b1, p1, p0, l1, l2);
                                  c.a(v17);
                                  goto label_0188 ;
                               }
                            }
                         }
                         b1 = false;
                         goto label_013b ;
                      }
                   }
                   objArray1 = objArray;
                   i.o(d.f(obj, obj1, Long.valueOf(l1), Long.valueOf(l2)));
                   l3.l();
                   goto label_0240 ;
                }
             }else {
                patchProxyRe1 = patchProxyRe;
                goto label_007f ;
             }
             if (uob != null) {
                uob.b();
             }
          }
       }else {
          this.n().i0(obj, obj1);
       }
       return;
    }
    public boolean VP(){
       return this.g;
    }
    public void Vd(){
       this.i = false;
       this.j = null;
    }
    public void Vn(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "42")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashPluginImpl", "setClipBoardTokenShowed clipBoardTokenShowed: "+p0, objArray);
       l ol = b.a(-1790720308);
       Objects.requireNonNull(ol);
       l ol1 = l.class;
       if (!PatchProxy.isSupport(ol1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ol, ol1, "29")) {
          Object[] objArray1 = new Object[i];
          j0.f("SplashAdManager", "setHasClipBoardToken hasClipBoardToken: "+p0, objArray1);
          ol.k = p0;
       }
       return;
    }
    public void WK(Activity p0,AdDataWrapper p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, t.class, "23")) {
          return;
       }
       if (p1 != null && p1.getPhoto() != null) {
          g.a.b(p0, p1).m();
       }
       return;
    }
    public boolean Xe(){
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, t.class, "40");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!SplashUtils.Q()) {
          return i;
       }
       obj = b.a(-1790720308);
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, l.class, "30");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.k == null){
          Application uApplication = a.b();
          Object obj2 = PatchProxy.applyOneRefs(uApplication, objArray, l1.class, "3");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(!b.a()){
             if (e.f()) {
                objArray1 = new Object[i];
                j0.f("SplashToken", "clipboard privacy permission is not agreed in menu setting", objArray1);
             }else {
                CharSequence uCharSequenc = l1.a(uApplication);
                Object[] objArray2 = new Object[i];
                j0.f("SplashToken", "first isClipboardToken: "+uCharSequenc, objArray2);
                int i1 = a.t().a("adSplashForbiddenByClipboardTimes", 10);
                int i2 = 0;
                while (i2 < i1 && TextUtils.x(uCharSequenc)) {
                   i2 = i2 + 1;
                   uCharSequenc = l1.a(uApplication);
                   Object[] objArray3 = new Object[i];
                   j0.f("SplashToken", " i: "+i2+" isClipboardToken: "+uCharSequenc, objArray3);
                   if (TextUtils.x(uCharSequenc)) {
                      SystemClock.sleep(50);
                   }
                }
                if (!TextUtils.x(uCharSequenc) && uCharSequenc.length() > 1000) {
                   objArray1 = new Object[i];
                   j0.f("SplashToken", " token to long", objArray1);
                }else if(!TextUtils.x(uCharSequenc)){
                   boolean b1 = l1.b("##\([X|Y][\\\\+\\\\-]?[A-Za-z0-9]{6,18}_?[\\\\+\\\\-]?[A-Za-z0-9]+\)##|[\xa4\x20\x02\x20\x02\x20\x02\x20\x02\xff\x02\x04\x02\x21\x02\xa7\x20\x02\x20\x02\xfe\x02\x04\x02\x04\x02\x26\x02\xa5&\x20\x02\x20\x02\x20\x02\x20\x02\x20\x02\x21\x02\x21\x02\x21\x02\x22\x02\x03\x02\x03\x02\x03\x02$]\([X|Y][\\\\+\\\\-]?[A-Za-z0-9]{6,18}_?[\\\\+\\\\-]?[A-Za-z0-9]+\)[\xa4\x20\x02\x20\x02\x20\x02\x20\x02\xff\x02\x04\x02\x21\x02\xa7\x20\x02\x25\x02\xfe\x02\x04\x02\x04\x02\x26\x02\xa5&\x20\x02\x20\x02\x20\x02\x20\x02\x20\x02\x21\x02\x21\x02\x21\x02\x22\x02\x03\x02\x03\x02\x03\x02$]|\([A-Za-z0-9\\\\-]*\(?:M3|Mw|Mi|MU|MG|M5|M6|MX|M8|Mm|MH|Mj|Mx|MK|My\)+[A-Za-z0-9\\\\-]*\)[\\\\s\\\\S]*|\([A-Za-z0-9\\\\-]*\(?:MV|MW|M7|Ml|MZ|MI|Mk|MY|M9\)+[A-Za-z0-9\\\\-]*\)[\\\\s\\\\S]*|\([A-Za-z0-9\\\\-]*\(?:CS|C3|Cw|Ci|CU|CG|C5|C6|CX|C8|Cm|CH|Cj|Cx\)+[DdOo0pP9LlfIi18B3]{1}[A-Za-z0-9\\\\-]*\)[\\\\s\\\\S]*|\([A-Za-z0-9\\\\-]*\(?:Cy|CV|CW|C7|Cl|CZ|CI|Ck|CY|C9|CJ|CL|Cz|Qn\)+[DdOo0pP9LlfIi18B3]{1}[A-Za-z0-9\\\\-]*\)[\\\\s\\\\S]*|\([A-Za-z0-9\\\\-]*\(?:Eo|EN|Eb|Ep|EA|EO|Ec|Eq|E0|EB|EP|Ed|Er|E1|EC\)+[A-Z]{2}[A-Za-z0-9\\\\-]*\)[\\\\s\\\\S]*|\([A-Za-z0-9\\\\-]*\(?:Ee|Es|E2|ED|ER|Ef|Et|E4|EF|ET|Eh|Ev|Eu|Eg|ES\)+[A-Z]{2}[A-Za-z0-9\\\\-]*\)[\\\\s\\\\S]*|[\\\\s\\\\S]*[\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\x26\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02]\(.{6,500}[\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\x26\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02]\)[\\\\s\\\\S]*|[\\\\s\\\\S]*[\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\x26\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02]\(.{6
    ,500}[\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\x26\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02]\)[\\\\s\\\\S]*|[\\\\s\\\\S]*\(?<=\\\\[em\\\\]e400345\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400333\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400348\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400123\\\\[\\\\/em\\\\]|\\\\[em\\\\]e401255\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400109\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400650\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400336\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400295\\\\[\\\\/em\\\\]|\\\\[em\\\\]e402271\\\\[\\\\/em\\\\]|\\\\[em\\\\]e402393\\\\[\\\\/em\\\\]]\)\(.{6,500}\(\\\\[em\\\\]e400345\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400333\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400348\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400123\\\\[\\\\/em\\\\]|\\\\[em\\\\]e401255\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400109\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400650\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400336\\\\[\\\\/em\\\\]|\\\\[em\\\\]e400295\\\\[\\\\/em\\\\]|\\\\[em\\\\]e402271\\\\[\\\\/em\\\\]|\\\\[em\\\\]e402393\\\\[\\\\/em\\\\]\)\)[\\\\s\\\\S]*|[\\\\s\\\\S]*[\x7e\x02|\x68\x02|\x7d\x02|\x7a\x02|\x6f\x02|\x79\x02|\x6d\x02|\x82\x02|\x72\x02|\x6e\x02|\x72\x02]\([\\ud83c\\udf00-\\ud83c\\udfff|\\u2600-\\u2B55|\\ud83d\\udc00-\\ud83d\\ude4f|\\ud83d\\ude80-\\ud83d\\udeff|\\ud83e\\udd00-\\ud83e\\uddff]{3,10}[\x7e\x02|\x68\x02|\x7d\x02|\x7a\x02|\x6f\x02|\x79\x02|\x6d\x02|\x82\x02|\x72\x02|\x6e\x02|\x72\x02]\)[\\\\s\\\\S]*|[\\\\s\\\\S]*[\x7e\x02|\x68\x02|\x7d\x02|\x7a\x02|\x6f\x02|\x79\x02|\x6d\x02|\x82\x02|\x72\x02|\x6e\x02|\x72\x02]\(\(\\\\[em\\\\]e\\\\d+\\\\[\\\\/em\\\\]\){3,10}[\x7e\x02|\x68\x02|\x7d\x02|\x7a\x02|\x6f\x02|\x79\x02|\x6d\x02|\x82\x02|\x72\x02|\x6e\x02|\x72\x02]\)[\\\\s\\\\S]*|[\\\\s\\\\S]*\([\x53\x02\x53\x02\x53\x02\x54\x02\x56\x02\x56\x02\x51\x02\x56\x02\x57\x02\x57\x02\x57\x02\x59\x02\x59\x02\x5a\x02\x5b\x02\x5a\x02\x5a\x02\x5a\x02\x5b\x02\x5b\x02\x5b\x02\x5b\x02\x5c\x02\x5c\x02\x5c\x02\x65\x02\x53\x02\x5d\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5e\x02\x5f\x02\x5f\x02\x5f\x02\x5f\x02\x5f\x02\x5f\x02\x5f\x02\x61\x02\x61\x02\x61\x02\x72\x02\x62\x02\x64\x02\x64\x02\x65\x02\x64\x02\x64\x02\x64\x02\x64\x02\x65\x02\x65\x02\x65\x02\x65\x02\x65\x02\x65\x02\x65\x02\x65\x02\x66\x02\x66\x02\x67\x02\x67\x02\x67\x02\x67\x02\x6a\x02\x6a\x02\x69\x02\x6a\x02\x6a\x02\x6b\x02\x6b\x02\x70\x02\x70\x02\x71\x02\x98\x02\x71\x02\x72\x02\x72\x02\x72\x02\x72\x02\x6f\x02\x6f\x02\x70\x02\x6c\x02\x6a\x02\x6a\x02\x69\x02\x67\x02\x65\x02\x5d\x02\x5b\x02\x74\x02\x7f\x02\x74\x02\x97\x02\x7a\x02\x52\x02\x66\x02\x54\x02\x55\x02\x56\x02\x59\x02\x5a\x02\x5d\x02\x5d\x02\x53\x02\x5e\x02\x61\x02\x65\x02\x66\x02\x69\x02\x69\x02\x6d\x02\x71\x02\x71\x02\x9c\x02]+\)[\\\\s\\\\S]*|[\\\\s\\\\S]*\([0-9X]{17
    ,19}\)[\\\\s\\\\S]*|\([\\\\s\\\\S]*[\\ud83c\\udf00-\\ud83c\\udfff|\\u2600-\\u2B55|\\ud83d\\udc00-\\ud83d\\ude4f|\\ud83d\\ude80-\\ud83d\\udeff|\\ud83e\\udd00-\\ud83e\\uddff]+[\\\\s\\\\S]*\){1,10}|\([\\\\s\\\\S]*\(\\\\[em\\\\]e\\\\d+\\\\[\\\\/em\\\\]\)+[\\\\s\\\\S]*\){1,10}|\([\x20\x02|\x20\x02|\x20\x02]{10,}\)|[\\\\s\\\\S]*##\(X[\\\\+\\\\-]?[A-Za-z0-9]+_[\\\\+\\\\-]?[A-Za-z0-9]+\)##[\\\\s\\\\S]*|[\\\\s\\\\S]*https?://[\\\\S^/]+/s/\([A-Za-z0-9\\\\+\\\\-_]{8}\)[\\\\s\\\\S]*|[\\\\s\\\\S]*https?://[\\\\S^/]+/f/\([A-Za-z0-9\\\\+\\\\-_]+\)[\\\\s\\\\S]*|[\\\\s\\\\S]*https?://[a-z]\\\\.kuaishouapp\\\\.com/\([A-Za-z0-9\\\\+\\\\-_]+\)[\\\\s\\\\S]*|[\\\\s\\\\S]*https?://[v]\\\\.kuaishou\\\\.com/\([A-Za-z0-9\\\\+\\\\-_]+\)[\\\\s\\\\S]*|[\\\\s\\\\S]*##\(X?[\\\\+\\\\-]?[A-Za-z0-9\\\\-_]+_[\\\\+\\\\-]?[A-Za-z0-9]+\)##[\\\\s\\\\S]*|[\\\\s\\\\S]*[\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\x26\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02]\(.+[\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\x26\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02|\xff\x02\xff\x02\xff\x02\xff\x02]\)[\\\\s\\\\S]*\x00", uCharSequenc);
                   objArray2 = new Object[i];
                   j0.f("SplashToken", " matchedToken "+b1, objArray2);
                   if (b1) {
                      b = (SplashUtils.R() && l1.b("##\([X|Y][\\+\\-]?[A-Za-z0-9]{6,18}_?[\\+\\-]?[A-Za-z0-9]+\)##\\|\\|\\|[A-Za-z0-9]*%3D", uCharSequenc))? true: false;
                      objArray = new Object[i];
                      j0.f("SplashToken", " matchedReason "+b, objArray);
                      b = b ^ 1;
                   }
                }
             }
          }
          if (!b) {
             b = false;
          label_013d :
             objArray = new Object[i];
             j0.f("SplashAdManager"
    , "isClipBoardTokenShowed : "+b, objArray);
          }
       }
       b = true;
       goto label_013d ;
       return b;
    }
    public void YZ(RequestTiming p0,h0$d p1){
       PatchProxyResult this;
       b uob;
       int i;
       boolean b;
       Object[] objArray1;
       boolean b1;
       Integer integer;
       DefaultTabConfig uDefaultTabC;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, t.class, "43")) {
          return;
       }
       e uoe = this.n();
       long l = uoe.f0();
       long l1 = uoe.h0(System.currentTimeMillis());
       long l2 = b.a(-1790720308);
       Objects.requireNonNull(l2);
       l ol = l.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ol)) {
          this = patchProxyRe;
          uob = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(l), Long.valueOf(l1), l2, l.class, "31");
          if (uob != this) {
          }else {
          label_0057 :
             Object[] objArray = null;
             if (obj1 != null) {
                Object[] obj2 = PatchProxy.apply(objArray, obj1, h0$d.class, "1");
                Long longx = null;
                i = 1;
                if (obj2 != this) {
                   b = obj2.booleanValue();
                }else if(TextUtils.isEmpty(obj1.b) && (TextUtils.isEmpty(obj1.c) && TextUtils.isEmpty(obj1.d))){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                   l2.g = SystemClock.elapsedRealtime();
                   int i1 = 5;
                   if (!TextUtils.x(obj1.c)) {
                      h0$d e = obj1.e;
                      d$a obj3 = PatchProxy.applyOneRefs(e, objArray, SplashUtils.class, "59");
                      if (obj3 != this) {
                         b = obj3.booleanValue();
                      }else if(e != null){
                         integer = ArraysKt___ArraysKt.Eb(e);
                      }else {
                         integer = objArray;
                      }
                      if (integer == null || integer.intValue() != i1) {
                         if (a.t().d("enableEyemaxWithoutPriorityTab", i)) {
                            if (e != null) {
                               uDefaultTabC = (!e.length)? 1: null;
                               if (!uDefaultTabC) {
                               label_010b :
                                  b = false;
                               }
                            }
                            uDefaultTabC = c.a(DefaultTabConfig.class);
                            DefaultTabConfig mPriorityTab = (uDefaultTabC != null)? uDefaultTabC.mPriorityTabConfig: objArray;
                            if (mPriorityTab != null) {
                               mPriorityTab = uDefaultTabC.mPriorityTabConfig;
                               a.o(mPriorityTab, "defaultTabConfig.mPriorityTabConfig");
                               if (mPriorityTab.isValidNow()) {
                                  DefaultTabConfig$PriorityTabConfig mDefaultTab = uDefaultTabC.mPriorityTabConfig.mDefaultTab;
                                  Integer integer1 = (mDefaultTab != null)? ArraysKt___ArraysKt.Eb(mDefaultTab): objArray;
                                  if (integer1 == null || integer1.intValue() != i1) {
                                  }
                               }else {
                                  goto label_010b ;
                               }
                            }else {
                               goto label_010b ;
                            }
                         }else {
                            goto label_010b ;
                         }
                      }
                      b = true;
                      if (b) {
                         b1 = true;
                      label_0113 :
                         if (PatchProxy.isSupport(ol)) {
                            obj2 = new Object[i1];
                            obj2[longx] = obj;
                            obj2[i] = obj1;
                            obj2[2] = Long.valueOf(l);
                            obj2[3] = Long.valueOf(l1);
                            obj2[4] = Boolean.valueOf(b1);
                            if (PatchProxy.applyVoid(obj2, l2, ol, "32")) {
                            label_0149 :
                               objArray1 = objArray;
                            label_0160 :
                               if (b1) {
                                  uob = b.g(p0, p1, obj1.c, l, l1, true);
                               }else if(!TextUtils.x(obj1.b)){
                                  uob = b.g(p0, p1, obj1.b, l, l1, false);
                               }else if(!TextUtils.x(obj1.d)){
                                  if (PatchProxy.isSupport(d.class)) {
                                     uob = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(l), Long.valueOf(l1), null, d.class, "5");
                                     if (uob != this) {
                                     }
                                  }
                                  obj3 = d.h;
                                  Objects.requireNonNull(obj3);
                                  if (PatchProxy.isSupport(d$a.class)) {
                                     uob = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(l), Long.valueOf(l1), obj3, d$a.class, "1");
                                     if (uob != this) {
                                     }
                                  }
                                  a.p(obj, "requestTiming");
                                  a.p(obj1, "splashResponse");
                                  uob = new d(p0, p1, l, l1);
                               }else {
                                  i.o(d.f(obj, obj1, Long.valueOf(l), Long.valueOf(l1)));
                                  l2.l();
                               label_0218 :
                                  obj2 = objArray1;
                               }
                            }
                         }
                         if (!a.t().d("enableReportFilteredSplash", i)) {
                            goto label_0149 ;
                         }else {
                            objArray1 = objArray;
                            f0 uof0 = new f0(b1, p1, p0, l, l1);
                            c.a(v17);
                            goto label_0160 ;
                         }
                      }
                   }
                   b1 = false;
                   goto label_0113 ;
                }
             }
             objArray1 = objArray;
             i.o(d.f(obj, obj1, Long.valueOf(l), Long.valueOf(l1)));
             l2.l();
             goto label_0218 ;
          }
       }else {
          this = patchProxyRe;
          goto label_0057 ;
       }
       if (uob != null) {
          uob.b();
       }
       return;
    }
    public boolean Ym(){
       Object[] objArray;
       StartupBirthdayInfo obj = PatchProxy.apply(null, this, t.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = f.p(StartupBirthdayInfo.class);
       int i = 0;
       if (obj == null || obj.mShowBirthday == null) {
          StringBuilder str = "birthdayInfo mShowBirthday: ";
          String str1 = (obj == null)? "null": Boolean.FALSE;
          objArray = new Object[i];
          j0.f("SplashPluginImpl", str+str1, objArray);
          return i;
       }else if(obj.mShowTimes > null && f.k() - (long)obj.mShowTimes >= 0){
          objArray = new Object[i];
          j0.f("SplashPluginImpl", "can show :"+obj.mShowTimes+" times , has show "+f.k()+"  times", objArray);
          return i;
       }else if(!SplashUtils.F((obj.mBirthdayTs * 1000))){
          objArray = new Object[i];
          j0.f("SplashPluginImpl", "birthday: time:"+obj.mBirthdayTs, objArray);
          return i;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f("SplashPluginImpl", "birthday splash enabled", objArray1);
          return true;
       }
    }
    public FrameLayout ZP(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SplashFrameLayout(p0);
    }
    public PresenterV2 aN(boolean p0){
       if (PatchProxy.isSupport2(t.class, "45")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, t.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          PatchProxy.onMethodExit(t.class, "45");
          return new r();
       }else {
          PatchProxy.onMethodExit(t.class, "45");
          return new n();
       }
    }
    public void b70(b p0){
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ot, "21")) {
          return;
       }
       this.h = true;
       if (p0 != null) {
          this.n().g0(p0);
          if (a.t().d("mini_enable_splash_preload", false) && !PatchProxy.applyVoidOneRefs(p0, this, ot, "22")) {
             p0 = p0.b;
             if (p0 != null) {
                PhotoAdvertisement photoAdverti = p0.get("AD");
                if (photoAdverti != null) {
                   photoAdverti = photoAdverti.mScheme;
                   if (d.a(0x6ea0c3d0).rM(photoAdverti)) {
                      k1.o(new f1(photoAdverti));
                   }
                }
             }
          }
       }
       return;
    }
    public boolean bY(BaseFeed p0){
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 == null) {
          objArray = new Object[i];
          j0.f("SplashPluginImpl", "canShowPlayablePopup baseFeed wrong , return false", objArray);
          return i;
       }else {
          SplashInfo$SplashPlayableInfo splashPlayab = l.f(p0);
          if (splashPlayab == null) {
             objArray = new Object[i];
             j0.f("SplashPluginImpl", "canShowPlayablePopup playableInfo wrong , return false", objArray);
             return i;
          }else {
             splashPlayab = splashPlayab.mPlayablePopupInfo;
             if (splashPlayab == null) {
                objArray = new Object[i];
                j0.f("SplashPluginImpl", "canShowPlayablePopup playablePopupInfo wrong , return false", objArray);
                return i;
             }else {
                SplashInfo$PlayablePopupInfo mPopupMateri = splashPlayab.mPopupMaterialType;
                if (mPopupMateri != 2 && mPopupMateri != true) {
                   objArray = new Object[i];
                   j0.f("SplashPluginImpl", "canShowPlayablePopup mPopupMaterialType wrong , return false", objArray);
                   return i;
                }else if(2 == mPopupMateri && TextUtils.isEmpty(splashPlayab.mPopupImageMaterialUri)){
                   objArray = new Object[i];
                   j0.f("SplashPluginImpl", "canShowPlayablePopup mPopupImageMaterialUri wrong , return false", objArray);
                   return i;
                }else if(true == splashPlayab.mPopupShowType && (splashPlayab.mPopupMaterialType == true && (TextUtils.isEmpty(splashPlayab.mPopupVideoMaterialUri) || TextUtils.isEmpty(splashPlayab.mPopupImageMaterialUri)))){
                   objArray = new Object[i];
                   j0.f("SplashPluginImpl", "canShowPlayablePopup MaterialUri wrong , return false", objArray);
                   return i;
                }else if(2 == splashPlayab.mPopupShowType && (splashPlayab.mPopupMaterialType == true && TextUtils.isEmpty(splashPlayab.mPopupVideoMaterialUri))){
                   objArray = new Object[i];
                   j0.f("SplashPluginImpl", "canShowPlayablePopup surprised MaterialUri wrong , return false", objArray);
                   return i;
                }else {
                   objArray = new Object[i];
                   j0.f("SplashPluginImpl", "canShowPlayablePopup can", objArray);
                   return true;
                }
             }
          }
       }
    }
    public boolean c70(Context p0){
       Object[] objArray;
       b obj = PatchProxy.applyOneRefs(p0, this, t.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.m30()) {
          objArray = new Object[0];
          j0.f("SplashPluginImpl", "canShowSurprisedOnSplash can not Show PlayablePopup return ", objArray);
          return 0;
       }else {
          obj = b.a(-1608526086).a();
          if (obj != null) {
             obj = obj.b;
             if (obj != null) {
                SplashInfo$SplashPlayableInfo splashPlayab = l.f(obj);
                if (splashPlayab == null) {
                   objArray = new Object[0];
                   j0.f("SplashPluginImpl", "canShowSurprisedOnSplash playableInfo wrong , return false", objArray);
                   return 0;
                }else {
                   SplashInfo$SplashPlayableInfo mPlayablePop = splashPlayab.mPlayablePopupInfo;
                   if (mPlayablePop == null) {
                      objArray = new Object[0];
                      j0.f("SplashPluginImpl", "canShowSurprisedOnSplash mPlayablePopupInfo wrong , return false", objArray);
                      return 0;
                   }else if(mPlayablePop.mPopupMaterialType != 1){
                      Object[] objArray1 = new Object[0];
                      j0.f("SplashPluginImpl", "canShowSurprisedOnSplash mPopupMaterialType wrong:"+splashPlayab.mPlayablePopupInfo.mPopupMaterialType+" return", objArray1);
                      return 0;
                   }else {
                      return this.uc(obj, p0);
                   }
                }
             }
          }
          objArray = new Object[0];
          j0.f("SplashPluginImpl", "canShowSurprisedOnSplash splashAdData wrong , return false", objArray);
          return 0;
       }
    }
    public void d0(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "13")) {
          return;
       }
       if (this.n() instanceof a) {
          this.n().d0(p0);
       }
       return;
    }
    public c dS(RequestTiming p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.a(-1343064608).d0();
       return new j(p0);
    }
    public boolean e0(){
       t obj = PatchProxy.apply(null, this, t.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj != null) {
          return obj.e0();
       }
       return false;
    }
    public QPhoto e9(){
       l obj = PatchProxy.apply(null, this, t.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1790720308);
       l c = obj.c;
       obj.c = null;
       return c;
    }
    public boolean hV(){
       Object obj = PatchProxy.apply(null, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enable4GSplashCache", true);
    }
    public boolean isAvailable(){
       return this.d;
    }
    public boolean isEnabled(){
       return true;
    }
    public boolean je(Context p0){
       boolean b = (p0 instanceof SplashV2Activity || p0 instanceof SplashV3Activity)? true: false;
       return b;
    }
    public boolean m30(){
       b obj = PatchProxy.apply(null, this, t.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-1608526086).a();
       if (obj != null) {
          obj = obj.b;
          if (obj != null) {
             return this.bY(obj);
          }
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPluginImpl", "canShowPlayablePopup splashAdData wrong , return false", objArray);
       return 0;
    }
    public void mA(h0$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "34")) {
          return;
       }
       t tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, u0.class, "1") && p0 != null) {
             tc.a.add(p0);
          }
       }
       return;
    }
    public void mB(RequestTiming p0,h0$d p1){
       h0$d a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "14")) {
          return;
       }
       if (p1 != null) {
          this.m = p1.b;
       }
       if (p1 != null && !TextUtils.isEmpty(p1.b)) {
          p1.f(a.a.h(p1.b, RealtimeSplashInfo.class));
       }
       if (p1 != null) {
          a = p1.a;
          if (a != null) {
             i.n(p0, true, a.mSplashId, a.mIsFakeSplash, p1.f);
          }
       }
       return;
    }
    public boolean mI(){
       Object obj = PatchProxy.apply(null, this, t.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.m) ^ 0x01);
    }
    public final e n(){
       Object obj = PatchProxy.apply(null, this, t.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F()) {
          if (!this.k instanceof d) {
             this.k = new d();
          }
       }else if(!this.k instanceof c){
          this.k = new c();
       }
       return this.k;
    }
    public SplashInfo ob(){
       b obj = PatchProxy.apply(null, this, t.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1608526086;
       if (b.a(i).S() || b.a(i).getState() == 4) {
          obj = b.a(i).a();
          if (obj != null) {
             return obj.a;
          }
       }
       return null;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, t.class, "8")) {
          return;
       }
       c.a(new c1(this));
       this.l = false;
       return;
    }
    public void pe(boolean p0){
       this.n = p0;
    }
    public BaseFragment qz(){
       Object obj = PatchProxy.apply(null, this, t.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SplashPlayableFragment();
    }
    public boolean si(){
       return this.i;
    }
    public void u5(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "38")) {
          return;
       }
       t tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, u0.class, "3")) {
             tc.b.set(false);
             Iterator iterator = tc.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
          }
       }
       if (!d.a(-1883158055).Vi()) {
          boolean b = SystemUtil.P();
          if (b) {
             k.a("splash_finish_");
          }
          int i = -1608526086;
          if (b.a(i).S()) {
             b.a(i).a0();
          }
          if (b) {
             k.b();
          }
       }
       return;
    }
    public boolean uc(BaseFeed p0,Context p1){
       Object[] objArray;
       SplashInfo mLiveStreamI;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplashInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, t.class, "27");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = null;
       obj = PatchProxy.applyOneRefs(p0, obj1, SplashUtils.class, "29");
       if (obj != patchProxyRe) {
       }else if(p0 != null){
          obj1 = p0.get("AD");
       }
       if (obj1 != null) {
          PhotoAdvertisement mAdData = obj1.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mSplashInfo = mAdData.mSplashInfo;
             if (mSplashInfo != null) {
                mLiveStreamI = mSplashInfo.mLiveStreamIds;
                if (mLiveStreamI != null) {
                label_003f :
                   obj = mLiveStreamI;
                }
             }
          }
       }
       mLiveStreamI = "";
       goto label_003f ;
       boolean b = true;
       if (!TextUtils.isEmpty(obj)) {
          objArray = new Object[0];
          j0.f("SplashPluginImpl", "canDeeplink has live streamIds", objArray);
          return b;
       }else {
          String str = c.i(p0);
          if (TextUtils.isEmpty(str)) {
             objArray = new Object[0];
             j0.f("SplashPluginImpl", "canDeeplink no applink, return", objArray);
             return 0;
          }else if(b.a(0x66dce92a).c(p1, x0.f(str), 0, b) != null){
             b = false;
          }
          return b;
       }
    }
    public void v00(h0$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "35")) {
          return;
       }
       t tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, u0.class, "2") && p0 != null) {
             tc.a.remove(p0);
          }
       }
       return;
    }
    public String w0(RequestTiming p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.m = null;
       this.h = false;
       this.Dx();
       String str = "";
       if (this.n() instanceof a) {
          String str1 = this.n().w0(p0);
          if (p0 != RequestTiming.ON_HOME_PAGE_CREATED || (this.n != null || (a.t().d(b.a, true) && TextUtils.isEmpty(str1)))) {
             this.u5();
          }else if(a.t().d(b.a, true)){
             c.k(new d1(this));
          }
          str = str1;
       }
       this.n = false;
       return str;
    }
    public PresenterV2 yj(){
       Object obj = PatchProxy.applyWithListener(null, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(t.class, "4");
       return new q();
    }
    public boolean yz(){
       Object obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b uob = b.a(-1608526086).a();
       if (b.a(-1608526086).getState() == 4 || (uob == null || uob.a.mIsFakeSplash == null)) {
          return false;
       }
       c.a(new e1(this, uob));
       return true;
    }
    public boolean zV(){
       return false;
    }
}
