package com.kuaishou.merchant.home2.main.Prefetch;
import com.kuaishou.merchant.home2.main.b;
import erd.o;
import com.kuaishou.merchant.home2.main.a;
import java.lang.Object;
import mrd.a;
import com.kuaishou.merchant.home2.main.Prefetch$b;
import com.kuaishou.merchant.home2.main.Prefetch$a;
import com.kuaishou.merchant.home2.main.Prefetch$CacheConfig;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import cx3.d;
import cx3.c;
import b04.a;
import com.kuaishou.merchant.home2.home.presenter.PageRefreshPresenter$a;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import brd.w;
import com.kuaishou.merchant.home2.feed.model.StartupRequestModel;
import java.util.Objects;
import com.kuaishou.merchant.home2.feed.model.StartupRequestModel$a;
import nsd.u;
import crd.b;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import java.util.concurrent.ConcurrentHashMap;
import rw3.c;
import com.kuaishou.merchant.home2.main.e;
import java.util.concurrent.Callable;
import com.kuaishou.merchant.home2.main.d;
import erd.r;
import com.kuaishou.merchant.home2.main.c;
import xz3.c;
import xz3.b;
import erd.g;
import zw3.d;

public class Prefetch	// class@001809
{
    public final o a;
    public c b;
    public final Prefetch$b c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public Prefetch$CacheConfig m;
    public ConcurrentHashMap n;
    public ConcurrentHashMap o;
    public b p;
    public static String q = "enablePreloadMerchantHome";
    public static String r = "enablePreloadMerchantHomeBeforeRouter";
    public static String s = "merchantHomeSideBarPrefetch";
    public static String t = "merchantHomeEVEPrefetch";
    public static String u = "merchantHomePreConnection";
    public static String v = "merchantHomeCacheConfig";
    public static final Prefetch w;
    public static final Prefetch x;

    static {
       Prefetch.w = new Prefetch(b.b);
       Prefetch.x = new Prefetch(a.b);
    }
    public void Prefetch(o p0){
       super();
       this.b = a.g();
       this.c = new Prefetch$b(null);
       this.d = 0;
       this.g = false;
       this.m = new Prefetch$CacheConfig(null);
       this.a = p0;
    }
    public static t c(boolean p0){
       Prefetch prefetch = Prefetch.class;
       if (PatchProxy.isSupport(prefetch)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, prefetch, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return c.c().c("true", "SIDEBAR", a.p0(), null, 0, 1, 10);
       }else {
          return c.c().e("SIDEBAR", a.p0(), null, 0, 1, 10);
       }
    }
    public static t d(boolean p0){
       String obj;
       Prefetch prefetch = Prefetch.class;
       if (PatchProxy.isSupport(prefetch)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, prefetch, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "SIDEBAR";
       if (p0) {
          return c.c().d("true", obj).map(new PageRefreshPresenter$a());
       }else {
          return c.c().h(obj).map(new PageRefreshPresenter$a());
       }
    }
    public static int f(){
       Prefetch obj = PatchProxy.apply(null, null, Prefetch.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = Prefetch.x;
       boolean b = obj.h(Prefetch.q);
       boolean b1 = obj.h(Prefetch.r);
       if (b && b1) {
          return 3;
       }
       if (b) {
          return 1;
       }
       if (b1) {
          return 2;
       }
       return 0;
    }
    public static long g(){
       return Prefetch.w.m.mReportDelayDuration;
    }
    public static boolean i(){
       Object obj = PatchProxy.apply(null, null, Prefetch.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("merchantHomeAgileNetworkCache", false);
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, Prefetch.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("merchantHomeNetworkCache", false);
    }
    public static w k(List p0){
       d uod = c.c();
       StartupRequestModel$a companion = StartupRequestModel.Companion;
       Objects.requireNonNull(companion);
       StartupRequestModel startupReque = PatchProxy.applyOneRefs(p0, companion, StartupRequestModel$a.class, "1");
       if (startupReque != PatchProxyResult.class) {
       }else {
          startupReque = new StartupRequestModel(null, 1, null);
          startupReque.setLiveStreamInfoList(p0);
       }
       return uod.b(startupReque);
    }
    public void a(){
       this.g = false;
       Prefetch tc = this.c;
       tc.a = null;
       tc.b = 0;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, Prefetch.class, "24")) {
          return;
       }
       Prefetch tp = this.p;
       if (tp != null) {
          tp.dispose();
          this.p = null;
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, Prefetch.class, "23")) {
          return;
       }
       String str = "Prefetch";
       if (!Prefetch.i()) {
          a.s(MerchantHomeLogBiz.MerchantCache, str, "merchant cache switch not enable");
          return;
       }else if(this.p != null){
          a.s(MerchantHomeLogBiz.MerchantCache, str, "start up api repeat, reset state");
          this.b();
          return;
       }else if(this.o != null){
          this.o.clear();
       }
       c.a("merchant_home_fetchStartupIsLivingStart");
       this.p = t.fromCallable(e.b).filter(d.b).flatMap(c.b).subscribe(new c(this), new b(this));
       return;
    }
    public final boolean h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Prefetch.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((Prefetch.q).equals(p0)) {
          return this.h;
       }
       if ((Prefetch.r).equals(p0)) {
          return this.i;
       }
       return false;
    }
    public boolean l(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, Prefetch.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Objects.requireNonNull(d.a);
       return false;
    }
}
