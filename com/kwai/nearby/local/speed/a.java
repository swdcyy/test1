package com.kwai.nearby.local.speed.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolConfig;
import android.os.Handler;
import android.os.Looper;
import com.kwai.nearby.local.speed.QueueCaller;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolPastRecord;
import java.lang.reflect.Type;
import frb.c;
import java.lang.System;
import java.lang.Boolean;
import jrb.a;
import java.lang.Number;
import java.util.Calendar;
import java.util.Date;
import android.app.Activity;
import dd7.e;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import gd7.c;
import ea5.d$d;
import wkd.b;
import vc7.i0;
import pe6.a;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.google.gson.JsonObject;
import lb5.e;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.action.RealActionBizType;
import yv8.c;
import yv8.a;
import dsb.d;
import brd.t;
import u2b.c;
import erd.o;
import gd7.g;
import bp6.a;
import erd.g;
import crd.b;
import rd7.c;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.concurrent.atomic.AtomicBoolean;
import mrb.a;
import q87.c;
import dsb.e;
import qd7.c;
import urb.a;
import com.yxcorp.gifshow.nearby.common.helper.STopicRedDotStore;
import gd7.f;
import gd7.e;
import java.util.Collection;
import java.util.List;
import com.kwai.framework.cache.CacheManager;
import frb.a;
import lnc.b9;
import ekd.q;
import java.util.ArrayList;
import com.kwai.framework.activitycontext.ActivityContext;
import android.content.Context;
import o56.f;
import ga5.e;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.a;
import com.kwai.nearby.local.utils.d;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import sa5.c;
import java.util.Iterator;
import a1.a;
import gd7.b;
import android.view.ViewGroup;
import a1.a$e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf6.h;
import t45.d;
import brd.z;
import gd7.d;
import com.gifshow.tuna.player.poi.e;
import gd7.h;
import java.lang.Runnable;
import t45.c;
import java.util.Queue;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class a	// class@000fe4
{
    public Map a;
    public Map b;
    public NearbyCachePoolConfig c;
    public b d;
    public b e;
    public a f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public String p;
    public b q;
    public Handler r;
    public QueueCaller s;
    public HomeFeedResponse t;
    public NearbyCachePoolPastRecord u;
    public c v;

    public void a(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       NearbyCachePoolConfig nearbyCacheP = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "29");
       if (nearbyCacheP != PatchProxyResult.class) {
       }else {
          nearbyCacheP = LocalConfigKeyHelper.C.getValue();
       }
       this.c = nearbyCacheP;
       this.l = true;
       this.r = new Handler(Looper.getMainLooper());
       this.s = new QueueCaller();
       return;
    }
    public static void a(a p0){
       int i;
       Objects.requireNonNull(p0);
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, uoa, "3")) {
       }else {
          p0.t = p0.h();
          if (!PatchProxy.applyVoid(objArray, p0, uoa, "13")) {
             if (p0.m() && p0.t == null) {
                p0.c();
             }else {
                NearbyCachePoolPastRecord nearbyCacheP = c.a(NearbyCachePoolPastRecord.class);
                p0.u = nearbyCacheP;
                if (nearbyCacheP == null) {
                   nearbyCacheP = new NearbyCachePoolPastRecord(0, 0);
                   p0.u = nearbyCacheP;
                   nearbyCacheP.mLastEnterLocal = System.currentTimeMillis();
                   p0.o();
                }
                if (p0.l()) {
                   if (p0.t != null) {
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      Calendar obj = PatchProxy.apply(objArray, p0, uoa, "29");
                      boolean b = true;
                      if (obj != patchProxyRe) {
                         b = obj.booleanValue();
                      }else if(!p0.l()){
                         obj = PatchProxy.apply(objArray, objArray, a.class, "12");
                         if (obj != patchProxyRe) {
                            i = obj.intValue();
                         }else {
                            obj = Calendar.getInstance();
                            obj.setTime(new Date());
                            i = obj.get(11);
                         }
                         if (i < 18 || i > 22) {
                            uoa = p0.u;
                            if (uoa != null && (uoa.mLastUpdateCacheFromNet && ((System.currentTimeMillis() - p0.u.mLastUpdateCacheFromNet) - ((long)p0.c.mRequestInterval * 0x5265c00) <= 0 || (System.currentTimeMillis() - p0.u.mLastEnterLocal) - ((long)p0.c.mMaximumLeaveDay * 0x5265c00) >= 0))) {
                            label_00d4 :
                               b = false;
                            }
                         }
                      }
                   label_00d5 :
                      if (!b) {
                      label_00e5 :
                         return;
                      }
                   }
                   p0.c();
                   p0.u.mLastUpdateCacheFromNet = System.currentTimeMillis();
                   p0.o();
                   goto label_00e5 ;
                }
             }
          }
       }
    }
    public void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       new e(e.f()).a(p0, new c(this));
       return;
    }
    public final void c(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, a.class, "8")) {
          return;
       }
       obj.e = b.a(-319613407).l(true, 10, 1, 20, a.a(), null, 0, true, 1, b.a(0x4b316083).getSessionId(), false, "", null, e.a(RefreshType.RETAIN_FIRST_PAGE).toString(), null, false, null, null, b.a(-129117978).g(RealActionBizType.LOCAL, objArray, false), null, "3", null, null, null, false, this.j(), null, d.i(), true, LocalConfigKeyHelper.g()).to(new c("local")).subscribe(new g(obj), new a());
       return;
    }
    public void d(){
       long l = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, l, uoa, "7")) {
          return;
       }
       if (l.k == null || (l.i != null || (l.j == null && l.f != null))) {
          c.e();
          l.n = System.currentTimeMillis();
          l.i = true;
          boolean andSet = d.a(-500494672).Jq().getAndSet(false);
          Object[] objArray1 = new Object[false];
          a.C().w("NEARBY_VISIT", "asyncNetData", objArray1);
          d.f();
          Object obj = b.a(-319613407);
          long l1 = a.a();
          int i = d.a(-500494672).Vz(10);
          String sessionId = b.a(0x4b316083).getSessionId();
          String str = e.a(RefreshType.RETAIN_FIRST_PAGE).toString();
          a g = l.g;
          a h = l.h;
          String str1 = b.a(-129117978).g(RealActionBizType.LOCAL, objArray, false);
          String str2 = PatchProxy.apply(objArray, l, uoa, "10");
          if (str2 != PatchProxyResult.class) {
          }else {
             str2 = c.b();
             l.p = str2;
          }
          l.d = obj.l(andSet, 10, 1, 20, l1, null, i, andSet, 1, sessionId, false, "", null, str, g, false, h, null, str1, null, "3", null, str2, a.a().c, false, this.j(), STopicRedDotStore.a(), d.i(), false, LocalConfigKeyHelper.g()).to(new c("local")).subscribe(new f(l), new e(l));
       }
    label_0102 :
       return;
    }
    public synchronized void e(HomeFeedResponse p0){
       a tt;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       if (this.l()) {
          if (this.t == null) {
             this.t = p0;
          }else {
             this.t.mQPhotos.addAll(p0.mQPhotos);
          }
          p0.mQPhotos = a.d(this.t.mQPhotos);
          a tc = this.c;
          p0.mQPhotos = a.c(this.t.mQPhotos, tc.mPopMaximum, tc.mCacheSize);
          tt = this.t;
       }
       a uoa = tt;
       int i = 0x5f2ddeb4;
       try{
          b.a(i).c("local_cache_loading_data", uoa, HomeFeedResponse.class, (System.currentTimeMillis() + 0x757b12c00));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.t == null) {
          this.t = this.h();
       }
       boolean b = (this.l != null && (this.f == null || (this.f.a() == null && this.t != null)))? true: false;
       return b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "31")) {
          return;
       }
       this.m = true;
       this.i = false;
       this.f = null;
       b9.a(this.q);
       this.r.removeCallbacksAndMessages(null);
       return;
    }
    public final HomeFeedResponse h(){
       Object obj = PatchProxy.apply(null, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = System.currentTimeMillis();
       HomeFeedResponse homeFeedResp = b.a(0x5f2ddeb4).g("local_cache_loading_data", HomeFeedResponse.class);
       if (homeFeedResp != null) {
          c.f("read_cache_cost", (System.currentTimeMillis() - l));
       }
       return homeFeedResp;
    }
    public HomeFeedResponse i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.l()) {
          return this.t;
       }
       uoa = PatchProxy.apply(objArray, this, uoa, "26");
       if (uoa != patchProxyRe) {
       }else {
          boolean b = false;
          this.l = b;
          uoa = this.t;
          if (this.t != null && (!q.f(this.t.mQPhotos) && this.t.mQPhotos.size() > this.c.mPopMaximum)) {
             HomeFeedResponse homeFeedResp = this.t.clone();
             ArrayList uArrayList = new ArrayList();
             homeFeedResp.mQPhotos = uArrayList;
             uArrayList.addAll(this.t.mQPhotos.subList(b, this.c.mPopMaximum));
             this.t.mQPhotos.removeAll(homeFeedResp.mQPhotos);
          }
       }
       return uoa;
    }
    public final int j(){
       Activity obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = ActivityContext.g().e();
       if (!f.b(obj)) {
          return 0;
       }
       return e.e(e.h(obj));
    }
    public void k(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (!f.b(uActivity) || this.m != null) {
          if (this.m == null && this.m()) {
             c.a(new h(this));
          }
          return;
       }else if(!PatchProxy.applyVoidOneRefs(uActivity, this, uoa, "15") && (uActivity != null && uActivity.getIntent() != null)){
          Uri data = uActivity.getIntent().getData();
          if (data != null && data.isHierarchical()) {
             this.g = data.getQueryParameter("injectFeedId");
             this.h = data.getQueryParameter("injectFeedType");
          }
       }
    label_0051 :
       this.k = true;
       this.n = 0;
       this.o = 0;
       this.j = false;
       a ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoidOneRefs(uActivity, ts, QueueCaller.class, "1")) {
          a.p(uActivity, "activity");
          ts.b = uActivity;
       }
       this.f = new a(objArray);
       if (!PatchProxy.applyVoidOneRefs(uActivity, this, uoa, "4")) {
          ArrayList uArrayList = new ArrayList();
          int i = d.b();
          uArrayList.add(Integer.valueOf(i));
          this.v = new c(ImmutableMap.builder().c(Integer.valueOf(i), "HomeLocalLayout").a());
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             i = iterator.next().intValue();
             if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(uActivity, Integer.valueOf(i), this, uoa, "6")) {
                continue ;
             }else {
                a tv = this.v;
                if (tv != null) {
                   tv.b(i);
                }
                new a(uActivity).b(i, objArray, new b(this));
             }
          }
       }
       this.q = RxBus.f.f(h.class).observeOn(d.a).subscribe(new d(this), e.b);
       c.a(new h(this));
       return;
    }
    public final boolean l(){
       boolean b = (this.c.mCacheSize > null)? true: false;
       return b;
    }
    public final boolean m(){
       return this.c.mOnlyRequestWhenNoCache;
    }
    public void n(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       a ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoidOneRefs(p0, ts, QueueCaller.class, "4")) {
          a.p(p0, "runnable");
          if (ts.d.isEmpty() && ts.e == null) {
             ts.e = true;
             ts.d.add(p0);
             ts.a();
          }else {
             ts.d.add(p0);
          }
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "33")) {
          return;
       }
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString("nearby_cache_pool_past_record", b.e(this.u));
       g.a(uEditor);
       return;
    }
}
