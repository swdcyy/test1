package com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.action.e;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.action.f;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import yv8.b;
import lnc.u1;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import yv8.j;
import erd.g;
import crd.b;
import eda.l;
import yv8.i;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.action.i$a;
import android.app.Application$ActivityLifecycleCallbacks;
import wkd.b;
import ew8.k;
import zv8.n;
import yv8.c;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.yxcorp.gifshow.action.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.q;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;
import ekd.j;
import java.util.List;
import java.util.Iterator;
import yv8.a;
import java.util.Collection;
import aw.a$d;
import com.google.protobuf.nano.MessageNano;
import ekd.s;
import com.kwai.framework.security.LogEncryptor;
import android.util.Base64;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.model.RealActionFeed$RealActionExtParams;
import java.lang.System;
import com.yxcorp.gifshow.action.g;
import java.util.HashMap;
import ekd.a0;
import xf6.i;
import cw8.a;
import io.reactivex.internal.functions.Functions;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.action.RealActionBizType;
import zv8.e;
import zv8.g;
import zv8.i;
import zv8.a;
import aw8.a;
import com.yxcorp.gifshow.action.config.live.LiveRerankRealActionKSwitchConfig;
import aw8.b;
import aw8.c;
import aw8.f;
import aw8.d;
import aw8.g;
import zv8.d;
import zv8.p;
import zv8.f;
import com.yxcorp.gifshow.action.config.c;
import zv8.c;
import zv8.o;
import zv8.h;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import yv8.l;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.SharedPreferences$Editor;
import oe6.g;
import b66.k$a;

public class i	// class@001324
{
    public final Map a;
    public Map b;
    public b c;
    public SharedPreferences d;
    public static final x e;
    public static final x f;

    static {
       i.e = Suppliers.a(e.b);
       i.f = Suppliers.a(f.b);
    }
    public void i(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       b.b("RealActionManager", "init");
       u1.a(this);
       c.j();
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new j(this));
       f.g(l.class, mAIN).subscribe(new i(this));
       a.a().a().registerActivityLifecycleCallbacks(new i$a(this));
       b.a(-1842212552).h();
    }
    public synchronized final void a(n p0,c p1,RealActionFeed p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "14")) {
          return;
       }
       d uod = this.b.get(p1);
       if (uod == null) {
          uod = new d(p1);
          this.b.put(p1, uod);
       }
       uod.a(p0, p1, p2);
       return;
    }
    public final boolean b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.containsKey(p0);
    }
    public final boolean c(c p0,RealActionFeed p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, oi, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       n on = this.a.get(p0);
       boolean b = false;
       if (on == null) {
          return b;
       }
       Map map = on.availableActionConfig();
       if (!q.h(map)) {
          FeedRealActionsPageConfig uFeedRealAct = map.get(p1.mPage);
          if (uFeedRealAct != null && (!j.g(uFeedRealAct.mActions) && (j.c(uFeedRealAct.mActions, p1.mActionType) && (on.disableSourceFilter() || (!j.h(uFeedRealAct.mSources) && j.d(uFeedRealAct.mSources, p1.mSource)))))) {
             List list = on.actionFilters();
             Object obj1 = PatchProxy.applyTwoRefs(list, p1, this, oi, "19");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next().a(p1)) {
                         b1 = true;
                      }
                   }else {
                      b1 = false;
                   }
                }
             }
             if (b1) {
                b = true;
             }
          }
       }
    label_008d :
       return b;
    }
    public synchronized void d(c p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "11")) {
          return;
       }
       b.c("RealActionManager", "clearActions", "bizType", p0.bizType());
       d uod = this.b.get(p0);
       if (uod != null) {
          uod.b(p1);
       }
       return;
    }
    public String e(c p0,List p1,String[] p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, null, this, i.class, "7");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!this.b(p0)) {
          this.k();
       }
       n on = this.a.get(p0);
       if (!q.f(p1) && on != null) {
          a$d uod = on.buildRealActionPage(p1);
          if (uod != null) {
             return Base64.encodeToString(LogEncryptor.c.a(s.b(MessageNano.toByteArray(uod))), 2);
          }
       }
       return "";
    }
    public synchronized List f(c p0,a p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = this.j(p0);
       obj = new ArrayList();
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             RealActionFeed realActionFe = iterator.next();
             if (realActionFe != null && p1.a(realActionFe)) {
                if (realActionFe.mExtParams == null) {
                   realActionFe.mExtParams = RealActionFeed$RealActionExtParams.newInstance();
                }
                realActionFe.mExtParams.mHasReported = true;
                obj.add(realActionFe);
             }
          }
       }
       b.c("RealActionManager", "getActions", "actionSize", String.valueOf(obj.size()));
       return obj;
    }
    public String g(c p0,a p1,boolean p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h(p0, p1, p2, null);
    }
    public String h(c p0,a p1,boolean p2,String[] p3){
       g a;
       List this;
       String str;
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, i.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = System.currentTimeMillis();
       if (p1 == null) {
          a = g.a;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("bizIsValid", String.valueOf(this.b(p0)));
       hashMap.put("bizType", p0.bizType());
       hashMap.put("clearActions", String.valueOf(p2));
       b.d("RealActionManager", "getActionsGzip", hashMap);
       if (!this.b(p0)) {
          this.k();
       }
       n on = this.a.get(p0);
       this = this.f(p0, a);
       if (!q.f(this) && on != null) {
          a$d uod = on.buildRealActionPage(this);
          if (uod != null) {
             byte[] uobyteArray = MessageNano.toByteArray(uod);
             if (p3 != null) {
                p3[0] = a0.f(uobyteArray);
             }
             str = Base64.encodeToString(LogEncryptor.c.a(s.b(uobyteArray)), 2);
          label_0094 :
             if (i.c("KEY_REAL_ACTION_LOGGER")) {
                this.c = b.a(0xf6bde02).a(str).subscribe(Functions.d(), Functions.d());
             }
             if (p2) {
                this.d(p0, a);
             }
             b.c("RealActionManager", "getActionsGzip", "ºÄÊ±", String.valueOf((System.currentTimeMillis() - l)));
             return str;
          }
       }
       str = "";
       goto label_0094 ;
    }
    public synchronized String i(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = p0.d();
       if (!q.f(list)) {
          return a.a.q(list);
       }
       return "";
    }
    public synchronized final List j(c p0){
       d obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get(p0);
       if (obj == null) {
          obj = new d(p0);
          this.b.put(p0, obj);
       }
       return obj.d();
    }
    public void k(){
       RealActionBizType lIVE_SQUARE;
       int i;
       LiveRerankRealActionKSwitchConfig mFeaturedRer;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
          return;
       }
       RealActionBizType fOLLOW = RealActionBizType.FOLLOW;
       if (!this.a.containsKey(fOLLOW)) {
          this.l(fOLLOW, new e());
       }
       fOLLOW = RealActionBizType.HOT;
       if (!this.a.containsKey(fOLLOW)) {
          this.l(fOLLOW, new g());
       }
       fOLLOW = RealActionBizType.LOCAL;
       if (!this.a.containsKey(fOLLOW)) {
          this.l(fOLLOW, new i());
       }
       fOLLOW = RealActionBizType.CORONA;
       if (!this.a.containsKey(fOLLOW)) {
          this.l(fOLLOW, new a());
       }
       if (i.e.get().booleanValue()) {
          fOLLOW = RealActionBizType.FEATURE_LIVE;
          if (!this.a.containsKey(fOLLOW)) {
             this.l(fOLLOW, new a());
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "24")) {
          lIVE_SQUARE = RealActionBizType.LIVE_FEATURED_RERANK;
          if (!this.a.containsKey(lIVE_SQUARE) || !this.a.containsKey(RealActionBizType.LIVE_HOT_RERANK)) {
             LiveRerankRealActionKSwitchConfig liveRerankRe = i.f.get();
             i = 20;
             if (liveRerankRe != null) {
                mFeaturedRer = liveRerankRe.mFeaturedRerankMaxActionCount;
                if (mFeaturedRer <= null) {
                   mFeaturedRer = 20;
                }
                liveRerankRe = liveRerankRe.mHotRerankMaxActionCount;
                if (liveRerankRe > null) {
                   i = liveRerankRe;
                }
             }else {
                mFeaturedRer = 20;
             }
             this.l(lIVE_SQUARE, new b(mFeaturedRer));
             this.l(RealActionBizType.LIVE_HOT_RERANK, new c(i));
          }
       }
       lIVE_SQUARE = RealActionBizType.LIVE_SQUARE;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new f());
       }
       lIVE_SQUARE = RealActionBizType.LIVE_MORE_SQUARE;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new d());
       }
       lIVE_SQUARE = RealActionBizType.LIVE_VOICE_PARTY_SQUARE;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new g());
       }
       lIVE_SQUARE = RealActionBizType.FEATURED;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new d());
       }
       lIVE_SQUARE = RealActionBizType.THANOS_NEBULA;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new p());
       }
       lIVE_SQUARE = RealActionBizType.FRIEND_TAB;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new f());
       }
       lIVE_SQUARE = RealActionBizType.NEWS_SLIDE;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new c());
       }
       lIVE_SQUARE = RealActionBizType.DOMINO;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new c());
       }
       lIVE_SQUARE = RealActionBizType.SEARCH;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new o());
       }
       lIVE_SQUARE = RealActionBizType.LIFE;
       if (!this.a.containsKey(lIVE_SQUARE)) {
          this.l(lIVE_SQUARE, new h());
       }
       return;
    }
    public final void l(c p0,n p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "2")) {
          return;
       }
       b.c("RealActionManager", "register", "bizType", p0.bizType());
       this.a.put(p0, p1);
       return;
    }
    public void m(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "21")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "20") && this.d == null) {
          this.d = b.c(a.b(), "log_real_action", 0);
       }
       t.fromCallable(new l(this)).subscribeOn(d.c).subscribe(Functions.d(), Functions.d());
       return;
    }
    public final void n(c p0,d p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "22")) {
          return;
       }
       String str = "log_key_real_action_v2";
       String str1 = str+p0;
       if (RealActionBizType.SEARCH == p0) {
          str1 = str+p0+QCurrentUser.ME.getId();
       }
       g.a(this.d.edit().putString(str1, p2));
       p1.e(4);
       HashMap hashMap = new HashMap();
       hashMap.put("bizType", p0.bizType());
       hashMap.put("actionSize", String.valueOf(p1.d().size()));
       b.d("RealActionManager", "saveActionLogStr", hashMap);
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "17")) {
          return;
       }
       if (p0.a == 2) {
          c.j();
       }
       return;
    }
}
