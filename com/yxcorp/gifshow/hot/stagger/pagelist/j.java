package com.yxcorp.gifshow.hot.stagger.pagelist.j;
import mb5.c;
import s1b.b;
import jb5.d;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import wkd.b;
import qc5.a;
import e50.i;
import yv8.c;
import java.lang.ref.WeakReference;
import ekd.e0;
import java.lang.String;
import android.content.Context;
import android.media.AudioManager;
import com.yxcorp.gifshow.hot.stagger.pagelist.HomeHotCacheManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.cache.CacheManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.n0;
import mb5.b;
import java.lang.System;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomeDataPrefetchLogger;
import java.util.List;
import java.util.Collection;
import ekd.q;
import brd.t;
import brd.w;
import brd.m;
import t45.d;
import brd.z;
import rva.q;
import erd.g;
import rva.n;
import rva.o;
import rva.e;
import rva.d;
import rva.p;
import cjd.a;
import com.yxcorp.gifshow.hot.stagger.pagelist.b;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import yva.a;
import yva.b;
import com.yxcorp.gifshow.hot.stagger.pagelist.j$b;
import qvb.n0$a;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager;
import com.yxcorp.gifshow.refresh.RefreshType;
import qvb.a;
import tkd.b;
import tkd.d;
import uxb.m;
import com.yxcorp.gifshow.hot.stagger.pagelist.j$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import ob5.a;
import com.yxcorp.gifshow.hot.stagger.http.HotPreFetchFeedProcessor;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import trd.u;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.concurrent.CopyOnWriteArrayList;
import pva.a;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomePrefetchConfigUtils;
import com.kwai.component.homepage_interface.pagelist.model.PhotoPage;
import android.os.Handler;
import java.lang.Math;
import zc5.b;
import com.yxcorp.gifshow.hot.stagger.pagelist.g;
import java.util.concurrent.Callable;
import rva.m;
import io.reactivex.g;
import bfa.b;
import java.io.Serializable;
import bfa.e;
import dfa.c$a;
import efa.b;
import dfa.b;
import rva.b;
import dfa.c;
import java.lang.Number;
import qrd.p;
import efa.a;
import cfa.b;
import r1b.b;
import com.yxcorp.gifshow.loadmore.config.LoadMorePolicy;
import nvb.a;
import java.lang.Integer;
import nl9.c0;
import la6.b;
import wa5.e;
import qvb.o;
import k50.a;
import com.yxcorp.gifshow.model.response.feed.EdgeRealTimeConfig;
import wh5.c;
import java.lang.StringBuilder;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import rva.k;
import rva.c;
import msd.a;
import com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy;
import rva.l;
import com.yxcorp.gifshow.hot.stagger.pagelist.d;
import com.yxcorp.gifshow.hot.stagger.pagelist.f;

public class j extends d implements c, b	// class@0018b5
{
    public final int C;
    public boolean D;
    public final i E;
    public AudioManager F;
    public b G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public List L;
    public final c M;
    public String N;
    public j$b O;
    public String P;
    public final HomeHotCacheManager Q;
    public boolean R;
    public static final long S;
    public static a T;
    public static WeakReference U;
    public static long V;
    public static HotPreFetchFeedProcessor W;

    static {
       j.S = TimeUnit.DAYS.toMillis(3650);
       j.T = b.a(-515139006);
       j.V = 0;
    }
    public void j(int p0,i p1,c p2,boolean p3){
       super();
       this.D = true;
       this.J = false;
       this.K = false;
       this.C = p0;
       this.I = p3;
       j.U = new WeakReference(this);
       this.E = p1;
       this.F = e0.b.getSystemService("audio");
       this.M = p2;
       this.N = "3";
       this.Q = new HomeHotCacheManager();
    }
    public static void W2(){
       if (PatchProxy.applyVoid(null, null, j.class, "5")) {
          return;
       }
       WeakReference u = j.U;
       if (u != null && u.get() != null) {
          j.U.get().k2();
       }
       b.a(0x5f2ddeb4).remove("hot_pre_fetch");
       b.a(0x5f2ddeb4).remove("hot_pre_fetch_for_degrade");
       return;
    }
    public boolean A2(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oj, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.apply(objArray, this, oj, "15");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(this.K() && b.a(0x5f2ddeb4).j("hot_pre_fetch_for_degrade")){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1 && !this.B2()) {
          b = false;
       }
       return b;
    }
    public void B(){
       b.a(this);
    }
    public boolean G2(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.K = super.G2();
       if (this.K != null) {
          HomeDataPrefetchLogger.e(3, ((System.currentTimeMillis() + this.v2()) - this.t.mPrefetchExpiredDate));
          return true;
       }else if(this.J == null && (this.t != null && !q.f(this.t.getItems()))){
          this.J = true;
          HomeDataPrefetchLogger.g(3);
       }
    label_004b :
       return false;
    }
    public t I1(){
       t obj = PatchProxy.apply(null, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       this.R = b;
       super.I1();
       this.N2(this.C);
       if (!this.E2()) {
          obj = t.concat(this.R2(), this.Q2()).firstElement().C();
       }else {
          w[] owArray = new w[]{this.P2(),this.R2(),this.S2(this.D),this.Q2()};
          obj = t.concatArray(owArray).firstElement().C();
       }
       return obj.observeOn(d.a).doOnNext(new q(this)).doOnNext(new n(this)).doOnNext(new o(this)).doOnError(new e(this)).doOnNext(new d(this)).doOnNext(a.a(new p(this))).doOnNext(new b(this));
    }
    public void I2(HomeFeedResponse p0,List p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "23")) {
          return;
       }
       if (HomePageExperimentManager.b()) {
          b.a(p2, null);
       }
       j tO = this.O;
       if (tO != null && p2 != null) {
          tO.a(p1, p2);
       }
       super.I2(p0, p1, p2);
       return;
    }
    public void J2(HomeFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "21")) {
          return;
       }
       super.J2(p0, p1);
       if (!q.f(p1)) {
          this.E.r2(p1);
       }
       return;
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "34")) {
          return;
       }
       super.K1(p0);
       if (HotExperimentManager.d() && p0.c()) {
          this.invalidate();
       }
       return;
    }
    public void K2(HomeFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "22")) {
          return;
       }
       RefreshType rETAIN_FIRST = RefreshType.RETAIN_FIRST_PAGE;
       if (this.z == rETAIN_FIRST) {
          this.L = this.getItems();
       }
       super.K2(p0, p1);
       d.a(0x214156f5).aD(p0.mIsNewRefluxUser);
       c.k(new j$a(this, p0));
       if (this.z == rETAIN_FIRST) {
          if (!q.f(p1) && !q.f(this.L)) {
             p1.addAll(0, this.L);
          }
          this.L = null;
       }
       return;
    }
    public void M1(Object p0,List p1){
       this.K2(p0, p1);
    }
    public void M2(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "35")) {
          return;
       }
       super.M2(p0);
       b.a(-1684107285).j(3);
       return;
    }
    public void O2(HomeFeedResponse p0){
       QPhoto obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "33")) {
          return;
       }
       p0.mPrefetchExpiredDate = System.currentTimeMillis() + this.v2();
       if (j.W == null) {
          j.W = new HotPreFetchFeedProcessor();
       }
       HotPreFetchFeedProcessor w = j.W;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(p0, w, HotPreFetchFeedProcessor.class, "2")) {
          a.p(p0, "feedResponse");
          if (!q.f(p0.mQPhotos)) {
             w.a = p0;
             w.c = System.currentTimeMillis();
             p0 = p0.mQPhotos;
             a.o(p0, "feedResponse.mQPhotos");
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                Object obj1 = obj;
                obj1 = (obj1 != null && obj1.mEntity instanceof LiveStreamFeed)? 1: null;
                if (obj1) {
                   uArrayList.add(obj);
                }
             }
             ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                a.o(obj, "qPhoto");
                BaseFeed entity = obj.getEntity();
                Objects.requireNonNull(entity, "null cannot be cast to non-null type com.kuaishou.android.model.feed.LiveStreamFeed");
                uArrayList1.add(entity);
             }
             w.d = new CopyOnWriteArrayList(uArrayList1);
             w.c();
             a uoa = new a(w);
             w.b.postDelayed(uoa, TimeUnit.MILLISECONDS.convert((long)HomePrefetchConfigUtils.b.b(PhotoPage.FOUND), TimeUnit.SECONDS));
          }
       }
       return;
    }
    public boolean P1(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isEmpty();
    }
    public t Q2(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = j.T.a();
       boolean b = j.T.c();
       d tu = this.u;
       int i = this.X2();
       long l = System.currentTimeMillis();
       if (Math.abs((l - j.V)) - 300 > 0) {
          b.a(-869999145).h();
       }
       j.V = l;
       g og = new g(this, str, b, i, this.C2(), tu);
       return t.defer(l).subscribeOn(d.c);
    }
    public t S2(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oj, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.Q.a()) {
          return t.empty();
       }else {
          return t.create(new m(this, p0)).subscribeOn(d.c);
       }
    }
    public void U2(HomeFeedResponse p0){
       long l1;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "11")) {
          return;
       }
       if (this.Q.a()) {
          j tQ = this.Q;
          Objects.requireNonNull(tQ);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          HomeHotCacheManager homeHotCache = HomeHotCacheManager.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tQ, homeHotCache, "5") && p0 != null) {
             b a = b.a;
             e uoe = a.b("hot_cache_with_strategy", p0, HomeFeedResponse.class).e(new c$a().a(new b()).a(new b()).b());
             long l = 1000;
             uoe.c(l);
             TimeUnit obj = PatchProxy.apply(null, tQ, homeHotCache, "4");
             if (obj != patchProxyRe) {
                l1 = obj.longValue();
             }else if(tQ.b()){
                l1 = TimeUnit.DAYS.toMillis(3650);
             }else {
                obj = TimeUnit.MINUTES;
                Number number = PatchProxy.apply(null, null, HotExperimentManager.class, "6");
                if (number == patchProxyRe) {
                   number = HotExperimentManager.f.getValue();
                }
                l1 = obj.toMillis(number.longValue());
             }
             uoe.d(l1);
             uoe.a();
             e uoe1 = a.b("hot_cache_for_degrade_with_strategy", p0, HomeFeedResponse.class).e(new c$a().a(new b()).a(new b()).b());
             uoe1.c(l);
             Object obj1 = PatchProxy.apply(null, tQ, homeHotCache, "3");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else if(tQ.b()){
                i = 6;
             }else {
                i = 20;
             }
             e uoe2 = uoe1.b(new a(i));
             uoe2.d(TimeUnit.DAYS.toMillis(3650));
             uoe2.a();
          }
       }
       super.U2(p0);
       return;
    }
    public void V2(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "32")) {
          return;
       }
       if (p0 != null) {
          this.t = p0;
          b.a(-1684107285).b(3);
       }
       return;
    }
    public void X(b p0){
       if (p0 != null) {
          b l = p0.l;
          if (l != null) {
             this.H = l.mPageSize;
          label_000f :
             this.G = p0;
             return;
          }
       }
       this.H = 0;
       goto label_000f ;
    }
    public final int X2(){
       int i;
       Object obj = PatchProxy.apply(null, this, j.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.a() && this.u <= 1) {
          i = 10;
       }else {
          i = this.H;
          if (i == null) {
             i = 20;
          }
       }
       return i;
    }
    public final float Y2(){
       Object obj = PatchProxy.apply(null, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)Math.round((((float)this.F.getStreamVolume(3) * 100.00f) / (float)this.F.getStreamMaxVolume(3))) / 100.00f);
    }
    public final void Z2(HomeFeedResponse p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "16")) {
          return;
       }
       d.a(-500494672).t60(p0.getItems(), 7, p1);
       return;
    }
    public void a3(j$b p0){
       this.O = p0;
    }
    public void b2(b p0,List p1){
       this.J2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.K2(p0, p1);
    }
    public boolean g2(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "30");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(e.d() > 0 && p0.isLiveStream()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void h0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "28")) {
          return;
       }
       Iterator iterator = p0.iterator();
       a uoa = null;
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!qPhoto.isShowed() && !qPhoto.isRecShowed()) {
             int i = this.b.indexOf(qPhoto);
             if (i > -1) {
                this.b.remove(i);
             }
          }
          uoa = 1;
       }
       if (uoa != null) {
          this.c.k(false);
       }
       return;
    }
    public void k2(){
       if (PatchProxy.applyVoid(null, this, j.class, "18")) {
          return;
       }
       super.k2();
       this.t = null;
       return;
    }
    public void m2(HomeFeedResponse p0,List p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "20")) {
          return;
       }
       if (!q.f(p2)) {
          this.E.u2(new a(p0.mEdgeRealTimeConfig, p0.mLlsid, p0.mPageRealSize), p1, p2, this.K());
       }
       return;
    }
    public String o2(){
       Object obj = PatchProxy.apply(null, this, j.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.b()) {
          return super.o2()+"_child_lock";
       }
       if (VisitorModeManager.f()) {
          return super.o2()+"_visitor_mode";
       }
       return super.o2();
    }
    public int r2(){
       return 2;
    }
    public int t2(){
       return 3;
    }
    public long v2(){
       d obj = PatchProxy.apply(null, this, j.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.r;
       if (obj - null) {
          return obj;
       }
       long l = TimeUnit.MILLISECONDS.convert((long)HomePrefetchConfigUtils.b.b(PhotoPage.FOUND), TimeUnit.SECONDS);
       this.r = l;
       return l;
    }
    public final int w2(){
       return 7;
    }
    public t x1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "6";
       j obj = PatchProxy.apply(objArray, this, j.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.Q.a()) {
          obj = this.Q;
          k ok = new k(this);
          Objects.requireNonNull(obj);
          t ot = PatchProxy.applyOneRefs(ok, obj, HomeHotCacheManager.class, str);
          if (ot != patchProxyRe) {
          }else {
             a.p(ok, "isPreFetchedDataValid");
             ot = t.create(new c(obj, ok));
             a.o(ot, "Observable.create { emit¡­\)\n        }\n      }\n    }");
          }
          return ot.subscribeOn(n0.l);
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, HotFeedRequestStrategy.class, "2");
          if (uBoolean == patchProxyRe) {
             uBoolean = HotFeedRequestStrategy.b.getValue();
          }
          if (uBoolean.booleanValue()) {
             return this.w1().delaySubscription(2, TimeUnit.SECONDS);
          }else {
             return super.x1();
          }
       }
    }
    public t y1(){
       Object obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (HotExperimentManager.d()) {
          return t.create(new l(this)).doOnNext(d.b).doOnError(f.b);
       }
       return super.y1();
    }
    public String z2(){
       return "hot";
    }
}
