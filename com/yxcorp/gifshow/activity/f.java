package com.yxcorp.gifshow.activity.f;
import zr6.e;
import com.yxcorp.gifshow.activity.f$a;
import com.yxcorp.gifshow.activity.f$b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;
import wq6.d;
import isa.a;
import fr6.a;
import fr6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import fw8.i;
import erd.g;
import crd.b;
import lnc.u1;
import wkd.b;
import cta.e;
import cta.c;
import com.yxcorp.gifshow.w;
import tra.b;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.web.HomeTabPreloadWebViewConfig;
import java.lang.reflect.Type;
import java.lang.System;
import tra.a;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import gy7.l;
import android.app.Application;
import o56.a;
import android.content.Context;
import ou6.c;
import com.kwai.kxb.preload.PreloadSource;
import com.kwai.kxb.PlatformType;
import lnc.b9;
import com.yxcorp.gifshow.reddot.model.RedDot;
import com.kwai.component.menudot.b;
import nc5.c;
import com.yxcorp.gifshow.activity.web.JsActivityTabParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import isa.b;
import com.kwai.framework.model.kcube.TabViewInfo;
import ro5.a;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import com.yxcorp.gifshow.activity.g;
import com.kwai.component.menudot.b$b;
import js6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import fw8.h;
import lnc.c3$a;
import lnc.c3;
import sta.n;
import java.lang.Integer;
import sta.k;
import erd.o;
import t45.d;
import brd.z;
import sta.i;
import com.kwai.component.menudot.b$a;
import fw8.f;
import fw8.g;

public class f extends e	// class@00134a
{
    public a e;
    public b f;
    public c g;
    public b$a h;
    public b$b i;
    public int j;
    public final g k;
    public final c l;
    public b m;
    public static boolean n;

    public void f(){
       super();
       this.k = new f$a(this);
       this.l = new f$b(this);
    }
    public void f(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       if (this.n().s()) {
          this.q();
       }
       return;
    }
    public void g(Fragment p0){
    }
    public void h(h p0){
       f uof1;
       Object[] objArray;
       Object[] objArray1;
       SharedPreferences a;
       a uoa = this;
       Object[] obj = p0;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(obj, uoa, uof, "3")) {
       }else {
          uoa.e = obj.q("KEY_OPERATE_TAB_CONFIG");
          this.t();
          obj.b0().b(uoa.k);
          uoa.m = RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new i(uoa));
          u1.a(this);
          b.a(-920422449).j(uoa.e.o(), uoa.l);
          obj = null;
          if (!PatchProxy.applyVoid(obj, uoa, uof, "6")) {
             if (!b.a(-1343064608).isColdStart()) {
                objArray1 = new Object[0];
                b.C().y("ActivityTabLifecycleAwareness", "preload yoda not cold start", objArray1);
             }else {
                HomeTabPreloadWebViewConfig value = a.t().getValue("homeTabPreloadWebview", HomeTabPreloadWebViewConfig.class, obj);
                if (value == null) {
                   objArray1 = new Object[0];
                   b.C().y("ActivityTabLifecycleAwareness", "preload yoda no config", objArray1);
                }else {
                   long l = System.currentTimeMillis();
                   String str = "preload yoda currentTime:";
                   if (l - value.mStartTime < 0 || l - value.mEndTime > 0) {
                      uof1 = uof;
                      Object[] objArray2 = new Object[0];
                      b.C().y("ActivityTabLifecycleAwareness", str+DateUtils.a(l), objArray2);
                   label_0163 :
                      if (!PatchProxy.applyVoid(null, uoa, uof1, "8")) {
                         if (!a.t().d("kds_enable_cny2023_4tab_preload", true)) {
                            objArray = new Object[0];
                            b.C().y("ActivityTabLifecycleAwareness", "4tab not allow preload.", objArray);
                         }else {
                            objArray = new Object[0];
                            b.C().y("ActivityTabLifecycleAwareness", "start 4tab preload.", objArray);
                            c.e.c(null, PreloadSource.FOUR_TAB, 0);
                         }
                      }
                   }else {
                      a = a.a;
                      long longx = a.getLong("latest_preload_home_tab_web_view_time", 0);
                      if (longx - value.mStartTime >= 0 && longx - value.mEndTime <= 0) {
                         Object[] objArray3 = new Object[0];
                         b.C().y("ActivityTabLifecycleAwareness", "preload yoda latestTime:"+DateUtils.a(longx), objArray3);
                      }else {
                         uof1 = uof;
                         objArray = new Object[0];
                         b.C().y("ActivityTabLifecycleAwareness", str+DateUtils.a(l)+" startTime"+DateUtils.a(value.mStartTime)+" endTime"+DateUtils.a(value.mEndTime)+" latestTime:"+DateUtils.a(longx), objArray);
                         SharedPreferences$Editor uEditor = a.edit();
                         uEditor.putLong("latest_preload_home_tab_web_view_time", l);
                         g.a(uEditor);
                         l.d().e(a.b().getApplicationContext());
                         goto label_0163 ;
                      }
                   }
                }
             }
          }
          uof1 = uof;
          goto label_0163 ;
       }
       return;
    }
    public void i(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
       }else {
          this.s();
          p0.b0().e(this.k);
          u1.b(this);
          b.a(-920422449).h(this.e.o(), this.l);
          b9.a(this.m);
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, f.class, "14")) {
          return;
       }
       f tf = this.f;
       if (tf == null) {
          return;
       }
       if (tf.c(this.j) == null) {
          this.f.w(this.j);
          this.f.n(this.j);
       }
       tf = this.g;
       if (tf != null) {
          this.f.r(this.j, tf);
       }
       return;
    }
    public void onEventMainThread(JsActivityTabParams p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "1")) {
          return;
       }
       if (TextUtils.n(p0.mActivityId, this.e.m())) {
          if (!PatchProxy.applyVoid(null, this, uof, "9")) {
             b uob = this.e.e();
             if (uob != null) {
                TabViewInfo tabViewInfo = uob.c();
                if (tabViewInfo != null && tabViewInfo.mTabIcon != null) {
                   a.s(this.n(), tabViewInfo);
                }else {
                   a.j(this.n());
                }
                if (tabViewInfo != null && tabViewInfo.mTabIcon != null) {
                   a.r(this.n(), tabViewInfo.mTabLottie);
                }else {
                   a.i(this.n());
                }
             }
          }
          this.t();
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       if (this.f == null) {
          return;
       }
       g og = new g();
       this.i = og;
       this.f.j(this.j, og);
       return;
    }
    public void q(){
       a b;
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       if (!f.n) {
          Object[] objArray = new Object[0];
          b.C().A("ReactNative", "preloadKrnOnce", objArray);
          b = a.b;
          if (b.n("4tab")) {
             b.uN("4tab", true);
          }
          f.n = true;
       }
       return;
    }
    public final void r(){
       boolean b;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "15")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uof, "16");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!QCurrentUser.me().isLogined()){
          uof = this.f;
          if (uof != null && uof.i(this.j)) {
             b = true;
          }
       }
       b = false;
       if (b) {
          a.q(this.n());
       }else {
          a.h(this.n());
       }
       if (b) {
          c3.c(this.f, new h(this));
          uof = this.j;
          n on = n.class;
          if (!PatchProxy.isSupport(on) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(uof), objArray, on, "2") && (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(uof), Boolean.TRUE, objArray, on, "4")))) {
             RedDot redDot = b.a(0x34c80eb4).c(uof);
             if (redDot != null && redDot.mRealShow != null) {
                int i = (int)(redDot.mTotal - redDot.mWaterline);
                if (i > 0) {
                   t.just(redDot).map(new k(redDot, i, true)).subscribeOn(d.c).observeOn(d.a).subscribe(new i(uof));
                }
             }
          }
       }
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
          return;
       }
       f tj = this.j;
       if (tj > null) {
          f tf = this.f;
          if (tf != null) {
             f tg = this.g;
             if (tg != null) {
                tf.s(tj, tg);
                this.g = null;
             }
             this.f.f(this.h);
             this.h = null;
             this.f = null;
          }
       }
       this.i = null;
       return;
    }
    public void t(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       this.s();
       if (!PatchProxy.applyVoid(objArray, this, uof, "10")) {
          int i = this.e.f();
          this.j = i;
          if (i > 0) {
             this.f = b.a(0x34c80eb4);
             this.p();
             this.g = new f(this);
             g og = new g(this);
             this.h = og;
             this.f.q(og);
             this.o();
             this.r();
          }
       }
       return;
    }
}
