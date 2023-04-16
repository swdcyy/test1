package com.kuaishou.merchant.home2.b;
import zw3.h;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import rw3.c;
import com.kuaishou.merchant.home2.main.Prefetch;
import a04.j;
import java.util.Objects;
import a04.l;
import a04.b;
import ot3.u0;
import brd.t;
import t45.d;
import brd.z;
import a04.c;
import erd.g;
import crd.b;
import com.kuaishou.merchant.home2.main.activity.MerchantHomeActivity;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import java.lang.Boolean;
import zw3.b;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;
import androidx.fragment.app.FragmentActivity;
import b04.d;
import java.lang.System;
import com.kuaishou.merchant.home2.a;
import mu4.d;
import ju4.e;
import androidx.recyclerview.widget.RecyclerView;
import hx3.d;
import java.lang.Integer;
import yz3.c;
import zw3.j;
import java.lang.Runnable;
import com.google.gson.JsonObject;
import c04.a;
import android.app.Application;
import o56.a;
import zw3.k;
import zz3.a;
import yz7.e;
import java.util.Set;
import java.util.Map;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import xu4.e;
import java.util.List;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils;
import com.kuaishou.merchant.home2.main.predict.PredictStates;
import a04.i;
import a04.d;
import io.reactivex.g;
import a04.g;
import a04.h;
import android.os.SystemClock;
import d04.g;
import d04.e;
import d04.f;
import zw3.d;
import hx3.n;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import qa4.f;
import zw3.i;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import lnc.b9;
import a04.k;
import com.google.gson.JsonElement;

public class b implements h	// class@0016e5
{

    public void b(){
       super();
    }
    public void Ac(Activity p0,long p1){
       z c;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uob, "5")) {
          return;
       }
       c.a("merchant_home_onSideBarClick");
       this.n70("SIDEBAR", "2");
       if (!PatchProxy.applyVoid(null, this, uob, "13")) {
          this.o70(Prefetch.r);
       }
       this.Am(p0, "SIDEBAR", p1);
       if (!PatchProxy.applyVoid(null, this, uob, "19")) {
          j k = j.k;
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoid(null, k, j.class, "2") && j.f) {
             Objects.requireNonNull(l.i);
             l.g = true;
             b d = b.d;
             Objects.requireNonNull(d);
             b uob1 = b.class;
             if (!PatchProxy.applyVoid(null, d, uob1, "2")) {
                if (!PatchProxy.applyVoid(null, d, uob1, "11")) {
                   c = d.c;
                   t ot = t.just(String.valueOf(u0.b())).subscribeOn(c).observeOn(c);
                   ot.subscribe(c.b);
                }
                b.a = b.a + true;
             }
          }
       }
       return;
    }
    public void Am(Activity p0,String p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, b.class, "2")) {
          return;
       }
       if (!PatchProxy.isSupport(MerchantHomeActivity.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, MerchantHomeActivity.class, "1")) {
          Intent intent = new Intent();
          Object[] objArray = new Object[]{p1};
          intent.setData(x0.f(String.format("kwai://merchanthome?pageSource=%s", objArray)).buildUpon().appendQueryParameter("t_click", String.valueOf(p2)).build());
          intent.setClass(p0, MerchantHomeActivity.class);
          p0.startActivity(intent);
       }
       return;
    }
    public Fragment I7(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new MerchantMallFragment();
    }
    public boolean Rr(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.e() == 2)? true: false;
       return b;
    }
    public void U7(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       int i = f.e("merchant_feed_stage");
       int i1 = a.t().a("merchantHomeStayInterval", 3000);
       if (p0 == null) {
          return;
       }
       if (!p0 instanceof MerchantHomeActivity) {
          return;
       }
       d uod = d.J0(p0);
       if (i) {
          int i2 = 3;
          if (i != 1) {
             if (i != 2) {
                if (i != i2) {
                   p0.onBackPressed();
                }else if(uod.x != null || (System.currentTimeMillis() - uod.A0()) - (long)i1 >= 0){
                   p0.onBackPressed();
                }else {
                   e.i("buyerHomeFeedTopAndRefresh", "", a.a);
                   uod.x = true;
                }
             }else if(uod.x != null){
                p0.onBackPressed();
             }else {
                e.i("buyerHomeFeedTopAndRefresh", "", a.a);
                uod.x = true;
             }
          }else if(!uod.E0() && (uod.u0() != null && d.b(uod.u0(), p0) >= i2)){
             uod.T0(true);
          }
          if (uod.x == null && (uod.E0() || uod.D0())) {
             p0.onBackPressed();
          }else {
             e.i("buyerHomeFeedTopAndRefresh", "", a.a);
             uod.x = true;
          }
       }else {
          p0.onBackPressed();
       }
       return;
    }
    public boolean XE(Activity p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 instanceof c) {
          p0.runOnUiThread(new j(p0, p1));
          return true;
       }else {
          return false;
       }
    }
    public JsonObject dZ(){
       Object obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b.a(a.b());
    }
    public void iB(String p0){
       Set set;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "20")) {
          return;
       }
       k c = k.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, k.class, "1")) {
          try{
             a uoa = e.a(p0, a.class);
             if (uoa != null) {
                String str = 1;
                Map map = (uoa.a != null && (uoa.b != null && (uoa.c != null && uoa.d != null)))? 1: null;
                if (map) {
                   map = k.a;
                   int i = 0;
                   if (map != null) {
                      set = map.keySet();
                      if (set != null && set.contains(uoa.c()) == str) {
                         map = k.a;
                         map = (map != null)? map.get(uoa.c()): i;
                         if (map != null) {
                            map = k.a;
                            a.m(map);
                            c.a(map, uoa);
                         }
                      }
                   }
                   map = k.b;
                   if (map != null) {
                      set = map.keySet();
                      if (set != null && set.contains(uoa.c()) == str) {
                         map = k.b;
                         if (map != null) {
                            i = map.get(uoa.c());
                         }
                         if (i != null) {
                            map = k.b;
                            a.m(map);
                            c.a(map, uoa);
                         }
                      }
                   }
                }
             }
          }catch(java.lang.Exception e0){
             a.s(MerchantHomeLogBiz.Logger, "bridge publicDomainComponentRefreshSceneControl", "bridge publicDomainComponentRefreshSceneControl failed");
          }
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public String ls(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       p0 = e.a(p0, "list_memory", "merchant_home_agile_mall_tab_search_storage_key");
       try{
          Object obj1 = p0;
          if (obj1 == null) {
             return "";
          }
          if (obj1.size() <= 10) {
             return e.f(p0);
          }
          return e.f(obj1.subList((obj1.size() - 10), obj1.size()));
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public final void m70(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "12")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("request", Integer.valueOf(p0));
       oi3.c("preloadType", Integer.valueOf(Prefetch.f()));
       j k = j.k;
       oi3.c("prediction", Integer.valueOf(k.a()));
       oi3.c("predictionToPreload", Integer.valueOf(k.c()));
       oi3.c("predictionPriority", Long.valueOf(k.b()));
       String str = oi3.e();
       u1.Y("MerchantHomePreloadRequest", str, 7);
       return;
    }
    public final void n70(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       MerchantHomePrefetchUtils.b(p0, p1);
       return;
    }
    public final boolean o70(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Prefetch.w.l(p0);
       return Prefetch.x.l(p0);
    }
    public final void p70(boolean p0,g p1){
       long l;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "17")) {
          return;
       }
       j k = j.k;
       Objects.requireNonNull(k);
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, k, oj, "1")) {
          if (!k.d(PredictStates.ON_START)) {
             p1.accept(Boolean.FALSE);
          }else {
             j.b = j.c.subscribe(p1, new i(p1));
             b d = b.d;
             Objects.requireNonNull(d);
             b.b = b.b + 1;
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), k, oj, "9")) {
                t ot = PatchProxy.apply(null, d, b.class, "8");
                if (ot != PatchProxyResult.class) {
                }else {
                   z c = d.c;
                   ot = t.create(d.b).subscribeOn(c).observeOn(c);
                }
                j.a = ot.subscribe(new g(p0), new h(p0));
             }
             k.d(PredictStates.STARTED);
             l i = l.i;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoid(null, i, l.class, "3")) {
                l = u0.b();
                l.c = l;
                l.d = l;
                l.e = l;
                l.f = -1;
                l.g = false;
             }
          }
       }
       return;
    }
    public void tt(boolean p0,boolean p1,boolean p2){
       j k;
       b c;
       b a;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, b.class, "8")) {
          return;
       }
       if (p2) {
          return;
       }
       Prefetch w = Prefetch.w;
       w.e = u0.b();
       w.f = SystemClock.elapsedRealtime();
       String str = 1;
       String str1 = "1";
       if (p0) {
          c.a("merchant_home_onSideBarShow");
          g e = g.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(null, e, g.class, str1)) {
             str = a.t().d("merchantHomeSkinPreload", str);
             g.d = str;
             if (str) {
                t ot = e.c();
                if (ot != null) {
                   c = g.c;
                   if (c != null) {
                      c.dispose();
                   }
                   g.c = ot.subscribe(e.b, f.b);
                }
             }
          }
          c.a("merchant_home_onPreLoadSkinEnd");
          if (!PatchProxy.applyVoid(null, this, uob, "7")) {
             Objects.requireNonNull(d.a);
             List list = n.b();
             if (list != null) {
                BundlePreloadUtil.a("BUYER_HOME_PAGE", list);
             }
          }
          c.a("merchant_home_onPreLoadTKBundleEnd");
          Prefetch.x.e();
          if (a.t().d("merchantHomeAgileLocalOptimizeCode", false)) {
             f.a.b("BUYER_HOME_PAGE2");
          }
          k = j.k;
          if (k.a() && (k.c() && !k.b() - 1)) {
             c.a("merchant_home_onPredict_tryStartPredict");
             this.p70(p1, new i(this));
          }else if(PatchProxy.applyVoid(null, this, uob, "11")){
             this.m70(this.o70(Prefetch.q));
          }
          this.p70(p1, Functions.d());
       }else if(PatchProxy.applyVoid(null, this, uob, "18")){
          k = j.k;
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoid(null, k, j.class, "3") && k.d(PredictStates.ON_RELEASE)) {
             EveManagerWrapper.e.e("MerchantPreload", "0");
             a = j.a;
             if (a == null) {
                a.S("mLocationDisposable");
             }
             b9.a(a);
             a = j.b;
             if (a == null) {
                a.S("mPredictionDisposable");
             }
             b9.a(a);
             k.d(PredictStates.RELEASED);
             l i = l.i;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoid(null, i, l.class, "6")) {
                l.e = u0.b();
             }
             if (j.i) {
                k a1 = k.a;
                Objects.requireNonNull(a1);
                if (!PatchProxy.applyVoid(null, a1, k.class, str1)) {
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.a0("type", Integer.valueOf(str));
                   jsonObject.H("truthResult", Boolean.valueOf(l.g));
                   jsonObject.a0("predictResult", Integer.valueOf(l.f));
                   jsonObject.G("resultParams", l.h);
                   jsonObject.a0("inferDuration", Long.valueOf((l.d - l.c)));
                   jsonObject.a0("taskDuration", Long.valueOf((l.e - l.c)));
                   jsonObject.a0("taskActivationDuration", Long.valueOf((l.b - l.a)));
                   u1.Y("MerchantHomePreloadPredict", jsonObject.toString(), 7);
                }
             }
          }
       }
       return;
    }
}
