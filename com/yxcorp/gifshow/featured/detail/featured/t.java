package com.yxcorp.gifshow.featured.detail.featured.t;
import tjc.i;
import m9c.a;
import s1b.b;
import yda.d;
import qvb.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import e50.m;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.action.RealActionBizType;
import lda.x;
import com.yxcorp.gifshow.featured.detail.featured.g;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.featured.detail.featured.r;
import com.yxcorp.gifshow.featured.detail.featured.s;
import com.yxcorp.gifshow.featured.detail.featured.m;
import com.yxcorp.gifshow.featured.detail.featured.p;
import com.yxcorp.gifshow.featured.detail.featured.q;
import tkd.b;
import tkd.d;
import hn5.n;
import qvb.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import java.lang.Boolean;
import erd.b;
import java.util.Collection;
import ekd.q;
import java.util.List;
import um9.d;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import ym9.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import java.util.HashMap;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$CommonConfigInfo;
import qrd.l1;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$TkConfigInfo;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$CardData;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CommonMeta;
import um9.e;
import com.yxcorp.gifshow.commoninsertcard.entity.d;
import lnc.i3;
import com.kwai.soc.arch.rubas.base.Rubas;
import k2b.u1;
import kda.e;
import q87.c;
import com.google.common.collect.HashMultimap;
import qk.g0;
import b06.d;
import kp.y1;
import java.util.ArrayList;
import la6.b;
import k50.a;
import com.yxcorp.gifshow.model.response.feed.EdgeRealTimeConfig;
import java.util.Map;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import wkd.b;
import zy5.k;
import zy5.d;
import java.lang.Iterable;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.h;
import java.lang.StringBuilder;
import uxb.m;
import java.util.Collections;
import jsa.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.featured.detail.featured.pushinject.FeaturePushInjectTask;
import com.yxcorp.gifshow.featured.detail.featured.pushinject.FeaturePushInjectTask$FailType;
import com.yxcorp.gifshow.featured.detail.featured.pushinject.a;
import bea.a;
import java.lang.Number;
import brd.t;
import gn5.b;
import pea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import java.lang.Long;
import qea.u;
import lda.t;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.featured.detail.featured.j;
import erd.o;
import lda.h;
import erd.g;
import nl9.c0;
import nl9.b;
import nl9.g;
import lda.d;
import lda.e;
import com.yxcorp.gifshow.w;
import uv8.e1;
import lnc.k2;
import com.yxcorp.gifshow.featured.detail.featured.n;
import java.lang.Runnable;
import pf5.o;
import java.util.Locale;
import java.util.concurrent.Future;
import java.lang.System;
import lda.l;
import lda.m;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.refresh.RefreshType;
import pf5.p;
import java.lang.Enum;
import pf5.l;
import crd.b;
import pf5.s;
import ayb.r;
import lda.y;
import iea.d;
import java.util.concurrent.CountDownLatch;
import lda.k;
import com.yxcorp.gifshow.featured.detail.featured.h;
import lda.n;
import brd.w;
import lda.o;
import lda.i;
import lda.g;
import java.lang.Throwable;
import com.yxcorp.gifshow.featured.detail.NasaSlidePageListUtils;
import qrd.p;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.middleware.azeroth.network.AzerothApiException;
import java.io.IOException;
import kotlin.text.StringsKt__StringsKt;
import android.app.Application;
import o56.a;
import kda.g;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.b$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import qvb.n0$a;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.PrefetchHomeFeedResponse;
import java.util.Iterator;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.DynamicPrefetchFeedResponse;
import go5.a;
import com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchUtils;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;
import lea.e;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import lea.f;
import lea.b;
import lnc.b9;
import lda.s;
import yb7.p;
import ayb.g;
import java.util.Map$Entry;
import r1b.b;
import com.yxcorp.gifshow.loadmore.config.LoadMorePolicy;
import tjc.c;
import le5.g;
import nl9.h0;
import wa5.e;
import zc5.b;
import n50.a;
import com.kuaishou.eve.kit.rerank.BizPage;
import n50.a$a;
import com.kuaishou.eve.kit.rerank.realshow.RealShowPref;
import com.kuaishou.eve.kit.rerank.realshow.IRealShowStore$a;
import com.kuaishou.eve.kit.rerank.realshow.RealShowPref$b;
import com.google.common.collect.EvictingQueue;
import qk.p;
import trd.u;
import com.kuaishou.eve.kit.rerank.realshow.RealShowPref$Item;
import nda.a;
import lfa.a;
import lda.u;
import com.yxcorp.gifshow.featured.detail.featured.i;
import u2b.c;
import cjd.e;
import com.yxcorp.gifshow.featured.detail.featured.d;
import com.yxcorp.gifshow.featured.detail.featured.c;
import com.yxcorp.gifshow.featured.detail.featured.b;
import com.kwai.feature.api.feed.home.PhotoPrefetchBlockUtil;
import com.yxcorp.gifshow.featured.detail.featured.e;
import com.yxcorp.gifshow.featured.detail.featured.f;
import cjd.a;
import lda.j;
import com.yxcorp.gifshow.featured.detail.featured.o;
import com.yxcorp.gifshow.featured.detail.featured.l;
import lda.w;
import erd.c;
import com.yxcorp.gifshow.featured.detail.featured.k;
import jea.e;
import jea.f;
import lda.p;
import mea.a;

public class t extends f implements i, a, b, d	// class@000f93
{
    public g A;
    public b B;
    public QPhoto C;
    public b D;
    public int E;
    public String F;
    public String G;
    public d H;
    public f I;
    public c J;
    public final AtomicBoolean K;
    public e L;
    public d M;
    public final c N;
    public boolean O;
    public b P;
    public boolean Q;
    public boolean R;
    public QPhoto S;
    public final g T;
    public final x U;
    public final x U0;
    public final x V;
    public boolean V0;
    public final x W;
    public final x X;
    public String Y;
    public final x Z;
    public final List p;
    public boolean q;
    public boolean r;
    public RefreshType s;
    public final m t;
    public long u;
    public AtomicInteger v;
    public long w;
    public Future x;
    public boolean y;
    public AtomicReference z;
    public static boolean W0;
    public static final AtomicBoolean X0;
    public static final AtomicInteger Y0;
    public static final AtomicInteger Z0;
    public static boolean a1;
    public static HomeFeedResponse b1;

    static {
       t.X0 = new AtomicBoolean(true);
       t.Y0 = new AtomicInteger(0);
       t.Z0 = new AtomicInteger(0);
       t.a1 = true;
    }
    public void t(m p0,boolean p1,int p2){
       super();
       this.p = new CopyOnWriteArrayList();
       this.v = new AtomicInteger();
       this.z = new AtomicReference();
       this.K = new AtomicBoolean(false);
       this.N = RealActionBizType.FEATURED;
       this.T = new x(this);
       this.U = Suppliers.a(g.b);
       this.V = Suppliers.a(r.b);
       this.W = Suppliers.a(s.b);
       this.X = Suppliers.a(m.b);
       this.Z = Suppliers.a(p.b);
       this.U0 = Suppliers.a(q.b);
       this.t = p0;
       this.O = p1;
       if (d.a(-1883158055).j7()) {
          this.b = new CopyOnWriteArrayList();
       }
       return;
    }
    public static HomeFeedResponse h2(t p0,HomeFeedResponse p1){
       d a;
       Objects.requireNonNull(p0);
       t obj = PatchProxy.applyOneRefs(p1, p0, t.class, "17");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          obj = p0.B;
          if (obj != null) {
             obj.accept(p1, Boolean.valueOf(p0.K()));
          }
          if (p1 != null && !q.f(p1.mQPhotos)) {
             int i = 0;
             while (i < p1.mQPhotos.size()) {
                HomeFeedResponse mQPhotos = p1.mQPhotos;
                d uod = d.class;
                if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), mQPhotos, null, uod, "2")) {
                   a.p(mQPhotos, "photos");
                   QPhoto obj1 = PatchProxy.apply(null, null, a.class, "1");
                   boolean b = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): a.t().d("interestManagementCardV3Dynamic", false);
                   if (!b || (!q.f(mQPhotos) && i < mQPhotos.size())) {
                      obj1 = mQPhotos.get(i);
                      if (r1.J2(obj1.mEntity)) {
                         a = d.a;
                         obj1 = obj1.mEntity;
                         a.o(obj1, "photo.mEntity");
                         Objects.requireNonNull(a);
                         CommonInsertCardFeed uCommonInser = PatchProxy.applyOneRefs(obj1, a, uod, "3");
                         if (uCommonInser != PatchProxyResult.class) {
                         }else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("interestManagementCard", obj1);
                            CommonInsertCardFeed uCommonInser1 = new CommonInsertCardFeed();
                            CommonInsertCardFeedMeta uCommonInser2 = new CommonInsertCardFeedMeta();
                            uCommonInser2.mMetaStyle = 3;
                            uCommonInser2.mCardType = 16;
                            uCommonInser2.mFeedId = obj1.getId();
                            CommonInsertCardFeedMeta$CommonConfigInfo uCommonConfi = new CommonInsertCardFeedMeta$CommonConfigInfo();
                            uCommonConfi.mEnableHorizontalSlide = true;
                            uCommonConfi.mEnableSideMenu = true;
                            uCommonInser2.mCommonConfigInfo = uCommonConfi;
                            CommonInsertCardFeedMeta$TkConfigInfo tkConfigInfo = new CommonInsertCardFeedMeta$TkConfigInfo();
                            tkConfigInfo.mBundleId = "FeedVenomCommonInsertCard";
                            tkConfigInfo.mViewKey = "InterestManagementV3";
                            uCommonInser2.mTkConfigInfo = tkConfigInfo;
                            CommonInsertCardFeedMeta$CardData uCardData = new CommonInsertCardFeedMeta$CardData();
                            uCardData.mDynamicCardData = a.a.q(hashMap);
                            uCommonInser2.mCardData = uCardData;
                            uCommonInser1.mCommonInsertCardFeedMeta = uCommonInser2;
                            uCommonInser1.mCommonMeta = new CommonMeta();
                            uCommonInser = uCommonInser1;
                         }
                         mQPhotos.set(i, new QPhoto(uCommonInser));
                      }
                   }
                }
             label_0106 :
                BaseFeed entity = p1.mQPhotos.get(i).getEntity();
                if (!PatchProxy.applyVoidOneRefs(entity, null, e.class, "1") && d.a(entity)) {
                   String str = e.a(entity.mCommonInsertCardFeedMeta).e();
                   String str1 = "common_card_data_touch";
                   Rubas.d(str1, str);
                   u1.R(str1, str, 14);
                }
                i = i + 1;
             }
          }
       }
       return p1;
    }
    public static HomeFeedResponse i2(t p0,HomeFeedResponse p1){
       boolean b;
       Objects.requireNonNull(p0);
       HashMultimap obj = PatchProxy.applyOneRefs(p1, p0, t.class, "57");
       if (obj != PatchProxyResult.class) {
          b = obj;
       }else if(d.a(-1883158055).j7() && (p1 == null || q.f(p1.mQPhotos))){
          int i = 0;
          Object[] objArray = new Object[i];
          e.C().w("NasaSlidePageList", "preFilterFeedResponse begin", objArray);
          obj = HashMultimap.create();
          obj.putAll(d.h(p1.mQPhotos));
          y1.g(p1.getItems(), 42, p1.mLlsid);
          ArrayList uArrayList = new ArrayList();
          uArrayList.addAll(p0.b);
          List list = super.W1(p1, p0.b);
          if (!q.f(p1.mQPhotos)) {
             p0.t.u2(new a(p1.mEdgeRealTimeConfig, p1.mLlsid, p1.mPageRealSize, p1.mEdgeCandidateResult), uArrayList, list, p0.K());
          }
          if (HomePageExperimentManager.b()) {
             obj.putAll("FILTER_GLOBAL_REAL_SHOW_FEED", b.a(-275376108).c(list));
          }
          p0.D2(list, obj);
          if (!obj.isEmpty()) {
             RxBus.f.b(new h("featured", obj));
             objArray = new Object[i];
             e.C().w("NasaSlidePageList", "preFilterFeedResponse filter:"+obj, objArray);
          }
          Object[] objArray1 = new Object[i];
          e.C().w("NasaSlidePageList", "preFilterFeedResponse end", objArray1);
          p1.mQPhotos.clear();
          p1.mQPhotos.addAll(list);
          p1.mIsFiltered = true;
          Object[] objArray2 = new Object[i];
          e.C().w("NasaSlidePageList", "preFilterFeedResponse current:"+list, objArray2);
       }
       return b;
    }
    public String A1(){
       return "featured";
    }
    public void A2(HomeFeedResponse p0,List p1){
       t ot = t.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ot, "32")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(p1);
       super.d2(p0, p1);
       d.a(0x214156f5).aD(p0.mIsNewRefluxUser);
       if (!PatchProxy.applyVoidTwoRefs(p1, uArrayList, this, ot, "37")) {
          if (this.K()) {
             y1.a(Collections.emptyList(), p1);
          }else {
             y1.a(uArrayList, p1);
          }
       }
       c uoc = new c(p0.mQPhotos, p1, 11, 5, this.K());
       RxBus.f.b(v7);
       this.v.incrementAndGet();
       return;
    }
    public final void B2(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "56")) {
          return;
       }
       if (!TextUtils.x(this.F)) {
          t tF = this.F;
          t tG = this.G;
          if (!PatchProxy.applyVoidThreeRefs(p0, tF, tG, null, FeaturePushInjectTask.class, "1")) {
             boolean b = false;
             if (p0 == null || q.f(p0.mQPhotos)) {
                a.a(FeaturePushInjectTask$FailType.FEED_REQUEST_FAIL, tF, tG, b);
             }else if(!tF.equals(p0.mQPhotos.get(b).getPhotoId())){
                a.a(FeaturePushInjectTask$FailType.FORCE_IN_FAIL, tF, tG, b);
             }else {
                a uoa = b.a(0x59e14c23);
                uoa.a = tF;
                uoa.b = tG;
                uoa.c = true;
             }
          }
          this.F = null;
          this.G = null;
       }
       return;
    }
    public int C1(){
       Object obj = PatchProxy.apply(null, this, t.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.t().d("enablePageListSchedulerOpt", false)) {
          return 1;
       }
       return false;
    }
    public final t C2(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ot, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, ot, "48");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          long l1 = d.a(0x2213150f).bh();
          if (d.a(0x2213150f).l0() && l1 - null > 0) {
             b.k("PageList newRefluxUserTimeout:"+l1);
             l = l1;
          }else {
             b.k("PageList delayShowCacheDurationMs:"+c.c());
             l = c.c();
          }
       }
       if (PatchProxy.isSupport(ot)) {
          ot = PatchProxy.applyOneRefs(Long.valueOf(l), this, ot, "50");
          if (ot != patchProxyRe) {
          label_00a6 :
             return ot.onErrorReturn(j.b).doOnNext(new h(this));
          }
       }
       b.a(-622777217).e();
       ot = t.fromCallable(new t(this)).delaySubscription(l, TimeUnit.MILLISECONDS).subscribeOn(d.c);
       goto label_00a6 ;
    }
    public final void D2(List p0,g0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "34")) {
          return;
       }
       if (p0 != null) {
          d.a(-500494672).IB(p0);
          p1.putAll(d.d(p0));
          g0 og0 = d.a(p0, this.K());
          d.a(0x940c093).hr(og0);
          p1.putAll(og0);
          p1.putAll(d.b(p0, this.v.get()));
          p1.putAll(d.g(p0));
          d.a(0x940c093).Hb(p0, this.K());
          int i = 0x22aa1781;
          if (d.a(i).KS()) {
             d.a(i).sX(p0, this.K());
          }
       }
       return;
    }
    public t E0(){
       Object obj = PatchProxy.apply(null, this, t.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k2();
    }
    public void E2(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "39")) {
          return;
       }
       this.p.clear();
       if (p0 != null) {
          Object[] objArray = new Object[0];
          e.C().w("NasaSlidePageList", "setNasaPhotoInfo\(\) "+p0.mPhotoId+", "+p0.mServerExpTag, objArray);
          this.p.add(p0);
       }
       return;
    }
    public void F2(e p0){
       this.L = p0;
    }
    public void G2(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "1")) {
          return;
       }
       b.a(-1343064608).z().e("featured", p0);
       if (!p0) {
          k2.b.a(n.b);
       }
       return;
    }
    public t I1(){
       boolean i;
       Object[] objArray1;
       t ot1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       String str = "15";
       o obj = PatchProxy.apply(objArray, this, ot, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = o.class;
       ot = PatchProxy.apply(objArray, this, ot, "16");
       if (ot != patchProxyRe) {
       }else {
          this.G2(0);
          if (this.K() && this.x != null) {
             ot = this.x;
             this.x = objArray;
             Object[] objArray2 = new Object[]{Boolean.valueOf(this.y),Boolean.valueOf(ot.isDone()),Long.valueOf((System.currentTimeMillis() - this.w))};
             String str2 = String.format(Locale.US, "err=%s&done=%s&timeDiff=%d", objArray2);
             Object[] objArray3 = new Object[0];
             e.C().w("featuredPreInit", str2, objArray3);
             u1.R("featuredPreInit", str2, 14);
             if (this.y == null) {
                ot = t.fromFuture(ot).subscribeOn(d.c).map(new l(this)).map(new m(this));
             }
          }
          ot = this.k2().map(new l(this)).map(new m(this));
          if (this.K()) {
             t tL = this.L;
             if (tL != null) {
                t obj1 = PatchProxy.apply(objArray, tL, obj, str);
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else if(!tL.d.a() && tL.e(tL.a)){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   obj1 = this.L;
                   Objects.requireNonNull(obj1);
                   o obj2 = PatchProxy.applyOneRefs(ot, obj1, obj, "4");
                   if (obj2 != patchProxyRe) {
                      ot = obj2;
                   }else {
                      a.p(ot, "netRequestObservable");
                      obj2 = obj1.a;
                      if (obj2 != null) {
                         if (p.a[obj2.ordinal()] != 1) {
                            ot = obj1.c(obj2, ot);
                         }else {
                            Object obj3 = PatchProxy.applyOneRefs(ot, obj1, obj, "5");
                            if (obj3 != patchProxyRe) {
                               ot = obj3;
                            }else {
                               Object obj4 = PatchProxy.apply(objArray, obj1, obj, "1");
                               if (obj4 != patchProxyRe) {
                                  i = obj4.booleanValue();
                               }else if(obj1.f.a() > 0){
                                  i = true;
                               }else {
                                  i = false;
                               }
                               if (i) {
                                  ot = t.timer(obj1.f.a(), TimeUnit.MILLISECONDS).flatMap(new s(ot, obj1.d(RefreshType.BACK_CLICK)));
                                  a.o(ot, "Observable.timer\(config.…spose\(\)\n        }\n      }");
                               }else {
                                  ot = obj1.c(RefreshType.BACK_CLICK, ot);
                               }
                            }
                         }
                      }
                   }
                }
             }
             ot1 = this.L;
             if (ot1 != null) {
                ot1.a();
             }
          }
       }
    label_0156 :
       i = -93189743;
       if (d.a(i).z00() && d.a(i).KH() != null) {
          this.G2(true);
          HomeFeedResponse homeFeedResp = new HomeFeedResponse();
          ArrayList uArrayList = new ArrayList();
          homeFeedResp.mQPhotos = uArrayList;
          uArrayList.add(d.a(i).KH());
          homeFeedResp.mCursor = "1";
          d.a(i).Wg();
          return t.just(homeFeedResp).doOnSubscribe(new y(this));
       }else if(this.x2() && t.a1){
          if (this.z2()) {
             this.G2(true);
             String str1 = "NasaSlidePageList";
             if (d.j() && !t.Z0.get()) {
                objArray1 = new Object[0];
                e.C().w(str1, "onCreateRequest return launchOpt", objArray1);
                CountDownLatch uCountDownLa = new CountDownLatch(true);
                ot1 = t.mergeDelayError(this.p2().doOnNext(new k(uCountDownLa)), ot.flatMap(new h(uCountDownLa)).onErrorReturn(new n(this)));
             }else {
                objArray1 = new Object[0];
                e.C().w(str1, "onCreateRequest return default", objArray1);
                ot1 = t.mergeDelayError(this.p2(), ot.onErrorReturn(new o(this)));
             }
             return ot1.doOnNext(new i(this)).doOnSubscribe(new g(this));
          }else {
             b.a(-622777217).e();
          }
       }
       return ot;
    }
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "6")) {
          return;
       }
       super.J1(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaSlidePageListUtils nasaSlidePag = NasaSlidePageListUtils.class;
       if (!PatchProxy.applyVoidOneRefs(p0, null, nasaSlidePag, "3") && p0 != null) {
          NasaSlidePageListUtils b = NasaSlidePageListUtils.b;
          Objects.requireNonNull(b);
          Boolean uBoolean = PatchProxy.apply(null, b, nasaSlidePag, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaSlidePageListUtils.a.getValue();
          }
          if (uBoolean.booleanValue()) {
             String obj = PatchProxy.applyOneRefs(p0, b, nasaSlidePag, "2");
             boolean b1 = true;
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                boolean b2 = false;
                if (!p0 instanceof RetrofitException && (!p0 instanceof KwaiException && (!p0 instanceof AzerothApiException && !p0 instanceof IOException))) {
                   obj = p0.getMessage();
                   if (obj == null || StringsKt__StringsKt.O2(obj, "NetworkException", b2, 2, null) != b1) {
                      obj = p0.getMessage();
                      if (obj == null || StringsKt__StringsKt.O2(obj, "Network disconnected", b2, 2, null) != b1) {
                         b1 = false;
                      }
                   }
                }
             }
             if (!b1 && !ExceptionHandler.handleException(a.b(), p0, g.b)) {
                ExceptionHandler.handleCaughtException(p0);
             }
          }
       }
    label_008e :
       return;
    }
    public void K1(n0$a p0){
       Iterator iterator;
       HomeFeedResponse homeFeedResp1;
       QPhoto qPhoto;
       String str10;
       boolean b1;
       Object[] obj2;
       Object[] objArray4;
       QPhoto qPhoto3;
       i3 oi3;
       String str12;
       i3 oi31;
       int i2;
       List list1;
       Object[] objArray6;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, ot, "42")) {
          return;
       }
       String str = "NasaSlidePageList";
       boolean i = 0;
       if (d.i(p0.a()) && q.f(p0.a().mQPhotos)) {
          Object[] objArray = new Object[i];
          e.C().w(str, "response.getPage\(\) instanceof DynamicPrefetchFeedResponse", objArray);
          return;
       }else if(p0.a() == null || (q.f(p0.a().mQPhotos) && obj.y2(p0.a()))){
          int b = this.K();
          HomeFeedResponse homeFeedResp = p0.a();
          d uod = d.class;
          String str1 = "6";
          e obj1 = null;
          if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), homeFeedResp, obj1, uod, str1) && (d.j() && (!homeFeedResp instanceof PrefetchHomeFeedResponse && (!d.i(homeFeedResp) && !q.f(homeFeedResp.mQPhotos)))))) {
             str12 = "DynamicPrefetcherHelper";
             b.b(str12, "缓存新拉取的 Feed 总数："+homeFeedResp.mQPhotos.size()+", firstPage:"+b);
             if (b) {
                d.a.clear();
                d.b.clear();
             }
             iterator = homeFeedResp.mQPhotos.iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto5 = iterator.next();
                if (qPhoto5 != null && (!TextUtils.x(qPhoto5.getPhotoId()) && !TextUtils.x(homeFeedResp.mCursor))) {
                   d.a.put(qPhoto5.getPhotoId(), Long.valueOf(d.d()));
                   d.b.put(qPhoto5.getPhotoId(), homeFeedResp.mCursor);
                }else {
                   b.b(str12, "格式错误:"+qPhoto5);
                }
             }
          }
       label_011d :
          iterator = p0.a().mQPhotos.iterator();
          String str2 = "GROOT";
          while (iterator.hasNext()) {
             Object[] objArray1 = new Object[i];
             e.C().w(str2, "PageList - onLoadCompleted: "+iterator.next().toString(), objArray1);
          }
          b.k("isFirstLoad: "+t.a1);
          if (this.x2() && (obj.y2(p0.a()) && !t.a1)) {
             b.k("PrefetchResponse return after normal feed response");
             return;
          }else if(d.j() && (d.i(p0.a()) && !t.a1)){
             b.k("DynamicPrefetchResponse return after normal feed response");
             return;
          }else if(obj.Z.get().booleanValue() && (this.x2() && d.j())){
             String str3 = "isDuplicate";
             String str4 = "NASA_PREFETCH_CACHE_RERANK_ORDER";
             String str5 = "isGr";
             String str6 = "photoId";
             String str7 = "";
             String str8 = "content";
             String str9 = "scene";
             if (NasaLaunchOptManager.i()) {
                homeFeedResp1 = p0.a();
                qPhoto = PatchProxy.applyOneRefs(homeFeedResp1, obj, ot, "43");
                if (qPhoto != patchProxyRe) {
                   str10 = str2;
                }else if(homeFeedResp1 != null && (!homeFeedResp1 instanceof PrefetchHomeFeedResponse && (!homeFeedResp1 instanceof DynamicPrefetchFeedResponse && (!this.m2() && (!q.f(homeFeedResp1.mQPhotos) && (this.getCount() <= 0 && (obj.C == null && t.a1))))))){
                   obj2 = PatchProxy.apply(obj1, obj1, NasaLaunchOptManager.class, str1);
                   boolean b2 = (obj2 != patchProxyRe)? obj2.booleanValue(): NasaLaunchOptManager.h.get();
                   if (b2 && t.Y0.get() <= 1) {
                      objArray4 = new Object[0];
                      e.C().w(str, "getLaunchOptCacheQPhoto begin", objArray4);
                      qPhoto3 = homeFeedResp1.mQPhotos.get(0);
                      qPhoto = (qPhoto3 != null && !a.a(qPhoto3))? NasaLaunchOptManager.f(): null;
                      str10 = str2;
                      Object[] objArray5 = new Object[0];
                      e.C().w(str, "getLaunchOptCacheQPhoto return:"+qPhoto, objArray5);
                      oi3 = i3.f();
                      oi3.d(str9, str);
                      oi3.d(str8, "getLaunchOptCacheQPhoto");
                      i = (qPhoto != null)? true: false;
                      oi3.a("result", Boolean.valueOf(i));
                      if (qPhoto3 != null) {
                         str7 = qPhoto3.getPhotoId();
                      }
                      oi3.d(str6, str7);
                      oi3.a(str5, Boolean.valueOf(a.a(qPhoto3)));
                      oi3.a(str3, Boolean.valueOf(b.a(-275376108).d(qPhoto)));
                      u1.R(str4, oi3.e(), 14);
                   }
                }
             label_02bf :
                str10 = str2;
             label_02c1 :
                qPhoto = null;
             }else {
                str10 = str2;
                homeFeedResp1 = p0.a();
                List obj3 = PatchProxy.applyOneRefs(homeFeedResp1, obj, ot, "44");
                if (obj3 != patchProxyRe) {
                }else if(homeFeedResp1 != null && (!homeFeedResp1 instanceof PrefetchHomeFeedResponse && (!homeFeedResp1 instanceof DynamicPrefetchFeedResponse && (!this.m2() && (!q.f(homeFeedResp1.mQPhotos) && (this.getCount() <= 0 && (obj.C == null && (t.a1 && (!PhotoPrefetchUtils.a() || t.Y0.get() > 1))))))))){
                   goto label_02c1 ;
                }else {
                   obj2 = new Object[0];
                   e.C().w(str, "tryGetLocalCacheQPhoto begin", obj2);
                   qPhoto3 = homeFeedResp1.mQPhotos.get(0);
                   oi3 = i3.f();
                   oi3.d(str9, str);
                   str2 = "tryGetLocalCacheQPhoto";
                   oi3.d(str8, str2);
                   str12 = "statue";
                   oi3.d(str12, "start");
                   if (qPhoto3 != null) {
                      str7 = qPhoto3.getPhotoId();
                   }
                   oi3.d(str6, str7);
                   oi3.a(str5, Boolean.valueOf(a.a(qPhoto3)));
                   u1.R(str4, oi3.e(), 14);
                   if (qPhoto3 != null && !a.a(qPhoto3)) {
                      objArray4 = new Object[0];
                      e.C().w(str, "tryGetLocalCacheQPhoto enter", objArray4);
                      objArray4 = null;
                      obj3 = PatchProxy.apply(objArray4, objArray4, PhotoPrefetchUtils.class, "3");
                      if (obj3 == patchProxyRe) {
                         obj3 = PhotoPrefetchUtils.c.getAndSet(objArray4);
                      }
                      if (obj3 != null) {
                         objArray4 = new Object[0];
                         e.C().w(str, "tryGetLocalCacheQPhoto return cache", objArray4);
                         oi31 = i3.f();
                         oi31.d(str9, str);
                         oi31.d(str8, str2);
                         oi31.d(str6, qPhoto3.getPhotoId());
                         oi31.a(str3, Boolean.valueOf(b.a(-275376108).d(obj3)));
                         oi31.d(str12, "cache");
                         u1.R(str4, oi31.e(), 14);
                      }else {
                         obj3 = d.a();
                         if (!q.f(obj3)) {
                            i2 = 0;
                            while (true) {
                               if (i2 < obj3.size()) {
                                  QPhoto qPhoto4 = obj3.get(i2);
                                  if (qPhoto4 != null) {
                                     list1 = obj3;
                                     if (!b.a(-275376108).k(qPhoto4.getPhotoId())) {
                                        objArray6 = new Object[0];
                                        e.C().w(str, "tryGetLocalCacheQPhoto return dynamic", objArray6);
                                        oi3 = i3.f();
                                        oi3.d(str9, str);
                                        oi3.d(str8, str2);
                                        oi3.a(str3, Boolean.valueOf(b.a(-275376108).d(qPhoto4)));
                                        oi3.d(str6, qPhoto3.getPhotoId());
                                        oi3.d(str12, "dynamic");
                                        String str13 = oi3.e();
                                        u1.R(str4, str13, 14);
                                        qPhoto = qPhoto4;
                                     }
                                  }else {
                                     list1 = obj3;
                                  }
                                  i2 = i2 + 1;
                                  obj3 = list1;
                               }
                            }
                         }
                         i2 = 0;
                         objArray4 = new Object[i2];
                         e.C().w(str, "tryGetLocalCacheQPhoto find prefetch", objArray4);
                         HomeFeedResponse homeFeedResp2 = obj.t2(UsePrefetchReason.LOADING_TIMEOUT);
                         if (homeFeedResp2 != null && !q.f(homeFeedResp2.mQPhotos)) {
                            objArray6 = new Object[i2];
                            e.C().w(str, "tryGetLocalCacheQPhoto return prefetch", objArray6);
                            oi31 = i3.f();
                            oi31.d(str9, str);
                            oi31.d(str8, str2);
                            oi31.a(str3, Boolean.valueOf(b.a(-275376108).d(homeFeedResp2.mQPhotos.get(0))));
                            oi31.d(str6, qPhoto3.getPhotoId());
                            oi31.d(str12, "prefetch");
                            u1.R(str4, oi31.e(), 14);
                            qPhoto = homeFeedResp2.mQPhotos.get(0);
                         }else {
                            goto label_02c1 ;
                         }
                      }
                   }else {
                      goto label_02c1 ;
                   }
                }
                qPhoto = obj3;
             }
             if (qPhoto != null && p0.a().mQPhotos != null) {
                Object[] objArray2 = new Object[0];
                e.C().w(str10, "forecInsert PageList - onLoadCompleted: "+qPhoto, objArray2);
                p0.a().mQPhotos.add(0, qPhoto);
                b = -1343064608;
                b.a(b).Z(1);
             label_04dd :
                b.a(b).i0();
                super.K1(p0);
                if (t.a1 && (d.j() && (obj.y2(p0.a()) || p0.a() instanceof DynamicPrefetchFeedResponse))) {
                   b.a(-1343064608).Z((long)this.getCount());
                }
             label_0518 :
                if (d.j() && (d.i(p0.a()) && !q.f(p0.a().mQPhotos))) {
                   obj.R = true;
                   t.a1 = false;
                   Object[] objArray3 = new Object[false];
                   e.C().w(str, "DynamicPrefetcherHelper 使用已缓存内容 id:"+p0.a().mQPhotos.get(false).getPhotoId()+" title:"+p0.a().mQPhotos.get(false).getCaption(), objArray3);
                   return;
                }else if(this.x2()){
                   homeFeedResp1 = p0.a();
                   b.k("PageList load completed llsid:"+homeFeedResp1.mLlsid+" size:"+homeFeedResp1.mQPhotos.size()+" cache:"+obj.y2(homeFeedResp1));
                   if (t.a1) {
                      if (obj.y2(homeFeedResp1)) {
                         obj.R = true;
                         b.k("PageList isPrefetchResponse");
                         b1 = false;
                      }else {
                         int i1 = -622777217;
                         b.a(i1).r();
                         List list = b.a(i1).n();
                         if (q.f(list)) {
                            b.k("PageList prefetch data source is empty");
                            list = b.a(i1).k();
                            if (q.f(list)) {
                               b.k("PageList prefetch index list is empty");
                            }else {
                               b.k("PageList prefetch index list is not empty");
                               ArrayList uArrayList = new ArrayList();
                               iterator = homeFeedResp1.mQPhotos.iterator();
                               while (iterator.hasNext()) {
                                  QPhoto qPhoto1 = iterator.next();
                                  b.k("PageList load id: "+qPhoto1.getPhotoId()+" name: "+qPhoto1.getUserName());
                                  obj1 = PatchProxy.applyTwoRefs(qPhoto1, list, obj, ot, "54");
                                  if (obj1 != patchProxyRe) {
                                  }else if(q.f(list)){
                                     Iterator iterator1 = list.iterator();
                                     while (true) {
                                        if (iterator1.hasNext()) {
                                           e uoe = iterator1.next();
                                           if (uoe != null && (qPhoto1.getPhotoId()).equals(uoe.photoId)) {
                                              b.k("PageList shouldDiscardPrecacheAsDuplicatedPhoto  YES  "+qPhoto1.getUserName()+" "+qPhoto1.getPhotoId());
                                              obj1 = uoe;
                                           }else {
                                              continue ;
                                           }
                                        }
                                     }
                                  }
                                  obj1 = null;
                                  if (obj1 != null) {
                                     b.k("PageList load id: "+qPhoto1.getPhotoId()+" name: "+qPhoto1.getUserName()+" duplicated photo, delete this photo");
                                     uArrayList.add(obj1);
                                  }else {
                                     continue ;
                                  }
                               }
                               if (!uArrayList.isEmpty()) {
                                  String str11 = "duplicated_photo";
                                  if (PatchProxy.isSupport(g.class) && (!PatchProxy.applyVoidThreeRefs(uArrayList, Boolean.FALSE, str11, null, g.class, "2") && !q.f(uArrayList))) {
                                     ArrayList uArrayList1 = new ArrayList();
                                     iterator = uArrayList.iterator();
                                     while (iterator.hasNext()) {
                                        f uof = b.a(i1).m(iterator.next());
                                        if (uof != null) {
                                           uof.mDiscardReason = str11;
                                           uArrayList1.add(uof);
                                        }else {
                                           continue ;
                                        }
                                     }
                                     g.b(uArrayList1, false);
                                  }
                               }
                            }
                         }else {
                            ArrayList uArrayList2 = new ArrayList();
                            iterator = homeFeedResp1.mQPhotos.iterator();
                            while (iterator.hasNext()) {
                               QPhoto qPhoto2 = iterator.next();
                               b.k("PageList load id: "+qPhoto2.getPhotoId()+" name: "+qPhoto2.getUserName());
                               f uof1 = PatchProxy.applyTwoRefs(qPhoto2, list, obj, ot, "53");
                               if (uof1 != patchProxyRe) {
                               }else if(q.f(list)){
                                  Iterator iterator2 = list.iterator();
                                  while (true) {
                                     if (iterator2.hasNext()) {
                                        f uof2 = iterator2.next();
                                        if (uof2 != null && qPhoto2.equals(uof2.mQPhoto)) {
                                           b.k("PageList shouldDiscardPrecacheAsDuplicatedPhoto  YES  "+qPhoto2.getUserName()+" "+qPhoto2.getPhotoId());
                                           uof1 = uof2;
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                               }
                               uof1 = null;
                               if (uof1 != null) {
                                  b.k("PageList load id: "+qPhoto2.getPhotoId()+" name: "+qPhoto2.getUserName()+" duplicated photo, delete this photo");
                                  uof1.mDiscardReason = "duplicated_photo";
                                  uArrayList2.add(uof1);
                               }else {
                                  continue ;
                               }
                            }
                            if (!uArrayList2.isEmpty()) {
                               b1 = false;
                               g.b(uArrayList2, b1);
                            label_07e9 :
                               b.k("PageList load completed dispose cache observable");
                               b9.a(obj.P);
                            }
                         }
                         b1 = false;
                         goto label_07e9 ;
                      }
                   }else {
                      b1 = false;
                      obj.R = b1;
                   }
                   t.a1 = b1;
                }
             }
          }
       label_04da :
          b = -1343064608;
          goto label_04dd ;
       }
       return;
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "31")) {
          return;
       }
       p.d(new s(this, p0));
       if (this.x2()) {
          if (t.a1 && this.Q != null) {
             b.k("PageList load error dispose cache observable");
             b9.a(this.P);
          }
          this.Q = false;
          t.a1 = false;
       }
       return;
    }
    public void M(RefreshType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "27")) {
          return;
       }
       this.s = p0;
       this.u = System.currentTimeMillis();
       t tL = this.L;
       if (tL != null) {
          tL.g(p0);
       }
       return;
    }
    public void M1(Object p0,List p1){
       this.A2(p0, p1);
    }
    public void N1(){
       PatchProxy.applyVoid(null, this, t.class, "5");
    }
    public void Q(){
       this.C = null;
    }
    public boolean W0(){
       t obj = PatchProxy.apply(null, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaSlidePageList", "removeSplashData", objArray);
       obj = this.C;
       if (obj == null) {
          return 0;
       }
       this.remove(obj);
       this.C = null;
       return true;
    }
    public List W1(b p0,List p1){
       List list1;
       boolean b;
       List list = PatchProxy.applyTwoRefs(p0, p1, this, t.class, "33");
       if (list != PatchProxyResult.class) {
       }else {
          HashMultimap hashMultimap = HashMultimap.create();
          int i = -908290672;
          if (d.a(i).bZ()) {
             list1 = d.a(i).rL(t.a1, p0);
             if (!list1.isEmpty()) {
                hashMultimap.putAll("PAD_REQUEST_WHEN_SCREEN_ORIENTATION_CHANGED", list1);
             }
          }
          list1 = super.W1(p0, p1);
          int i1 = 0;
          if (d.a(-1883158055).j7() && p0.mIsFiltered != null) {
             Object[] objArray = new Object[i1];
             e.C().w("NasaSlidePageList", "getCurrentPageItemsFromResponse do nothing", objArray);
          }else {
             hashMultimap.putAll(d.h(list1));
             y1.g(p0.getItems(), 42, p0.mLlsid);
             if (!q.f(list1)) {
                this.t.u2(new a(p0.mEdgeRealTimeConfig, p0.mLlsid, p0.mPageRealSize, p0.mEdgeCandidateResult), p1, list1, this.K());
             }
             if (HomePageExperimentManager.b()) {
                hashMultimap.putAll("FILTER_GLOBAL_REAL_SHOW_FEED", b.a(-275376108).c(list1));
             }
             this.D2(list1, hashMultimap);
             if (!hashMultimap.isEmpty()) {
                RxBus.f.b(new h("featured", hashMultimap));
                Object[] objArray1 = new Object[i1];
                e.C().w("NasaSlidePageList", "getCurrentPageItemsFromResponse filter:"+hashMultimap, objArray1);
             }
          }
          if (d.j() && (this.X.get().booleanValue() && (this.y2(p0) || (p0 instanceof DynamicPrefetchFeedResponse && !hashMultimap.isEmpty())))) {
             Iterator iterator = hashMultimap.entries().iterator();
             while (iterator.hasNext()) {
                b = g.a(iterator.next().getValue());
                if (list1 != null && (!list1.size() && (t.a1 && (b && !i1)))) {
                   HomeFeedResponse homeFeedResp = this.t2(UsePrefetchReason.LOADING_TIMEOUT);
                   if (homeFeedResp != null && !q.f(homeFeedResp.mQPhotos)) {
                      b.a(-1343064608).N((long)homeFeedResp.mQPhotos.size());
                      b.k("PageList getCurrentPageItemsFromResponse addData");
                      list1.addAll(homeFeedResp.mQPhotos);
                   }
                   i1 = 1;
                }
             }
          }
          list = list1;
       }
       return list;
    }
    public void X(b p0){
       if (p0 != null) {
          b l = p0.l;
          if (l != null) {
             this.E = l.mPageSize;
          label_000f :
             this.D = p0;
             return;
          }
       }
       this.E = 0;
       goto label_000f ;
    }
    public void a2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaSlidePageList", "modifyIfNeed: mSplashPhoto:"+this.C, objArray);
       if (this.C != null && b.a(-1608526086).S()) {
          t ot = (p0.size() > 0 && r1.w3(p0.get(0)))? 1: null;
          if (!ot) {
             p0.add(0, this.C);
          }
       }
    label_0059 :
       return;
    }
    public void b2(b p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "35")) {
       }else if(!q.f(p1)){
          y1.c(p1, p0.mLlsid);
          this.t.r2(p1);
          d.a(-500494672).r2(p1);
          d.a(0x940c093).gr(p1);
          RxBus.f.b(new h("featured", "duplicate_feed", new ArrayList(p1)));
       }
       return;
    }
    public void c2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "36")) {
          return;
       }
       RxBus.f.b(new g("featured", p0));
       return;
    }
    public void d2(b p0,List p1){
       this.A2(p0, p1);
    }
    public boolean f1(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaSlidePageList", "insertSplashData", objArray);
       this.C = p0;
       if (!d.a(-536296199).VP()) {
          this.add(0, this.C);
       }
       return true;
    }
    public boolean g2(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "41");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(e.d() > 0 && p0.isLiveStream()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean i(){
       return false;
    }
    public void j2(){
       if (PatchProxy.applyVoid(null, this, t.class, "28")) {
          return;
       }
       this.s = null;
       t tL = this.L;
       if (tL != null) {
          tL.g(null);
       }
       return;
    }
    public final t k2(){
       a b;
       AtomicBoolean obj1;
       a a;
       t ot = t.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ot, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = t.Y0.incrementAndGet();
       b.a(-869999145).h();
       b = a.b;
       BizPage uBizPage = this.t.b();
       Objects.requireNonNull(b);
       String str = "2";
       a$a uoa = PatchProxy.applyOneRefs(uBizPage, b, a.class, str);
       if (uoa != patchProxyRe) {
       }else {
          a.p(uBizPage, "bizPage");
          RealShowPref a1 = a.a;
          String realshowStor = uBizPage.getRealshowStoreKey();
          Objects.requireNonNull(a1);
          String str1 = "3";
          Object obj2 = PatchProxy.applyOneRefs(realshowStor, a1, RealShowPref.class, str1);
          if (obj2 != patchProxyRe) {
          }else {
             a.p(realshowStor, "page");
             RealShowPref$b uob = a1.g(realshowStor);
             Objects.requireNonNull(uob);
             EvictingQueue obj3 = PatchProxy.apply(objArray, uob, RealShowPref$b.class, str1);
             if (obj3 != patchProxyRe) {
                obj2 = obj3;
             }else {
                obj3 = uob.b();
                if (obj3.isEmpty()) {
                   obj2 = objArray;
                }else {
                   long l = System.currentTimeMillis();
                   uob.b.put(Long.valueOf(l), new ArrayList(obj3));
                   ArrayList uArrayList = new ArrayList(u.Y(obj3, 10));
                   Iterator iterator = obj3.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().getData());
                   }
                   obj2 = new IRealShowStore$a(l, uArrayList);
                }
             }
          }
          uoa = new a$a(obj2);
       }
       int i1 = 0;
       if (this.K()) {
          a uoa1 = b.a(0x8ca227e);
          Objects.requireNonNull(uoa1);
          obj1 = PatchProxy.apply(objArray, uoa1, a.class, str);
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             a = uoa1.a;
             Object[] objArray3 = new Object[i1];
             e.C().w("FeedInjectHelper", "reportFeedInjectionParams: "+a, objArray3);
             uoa1.a = objArray;
             objArray = a;
          }
       }
       obj1 = t.X0;
       Object[] objArray1 = new Object[i1];
       e.C().w("NasaSlidePageList", "createRequestObservable firstColdRequest:"+obj1.get(), objArray1);
       if (obj1.get() && !PatchProxy.applyVoidOneRefs(objArray, this, ot, "18")) {
          int i2 = 1;
          int i3 = (objArray != null)? TextUtils.x(objArray.a()) ^ i2: false;
          boolean b1 = this.w2();
          Object[] objArray2 = new Object[i1];
          e.C().w("NasaSlidePageList", "setIgnoreCacheAsColdStart inject:"+i3+", isNasaPhotoValid:"+b1, objArray2);
          t tK = this.K;
          if (i3 || b1) {
             i1 = true;
          }
          tK.getAndSet(i1);
       }
       return t.fromCallable(new u(this, objArray, i, uoa)).flatMap(i.b).subscribeOn(d.b).to(new c("featured")).map(new e()).doOnSubscribe(d.b).doOnNext(new c(this, objArray, uoa)).doOnError(new b(this, uoa, objArray));
    }
    public void l2(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "8")) {
          return;
       }
       if (this.K()) {
          boolean b = false;
          this.y = b;
          this.w = System.currentTimeMillis();
          Object[] objArray = new Object[b];
          e.C().w("NasaSlidePageList", "doPreRequest begin", objArray);
          if (this.U0.get().booleanValue() && (!PhotoPrefetchBlockUtil.b() && (t.X0.get() && !t.Y0.get()))) {
             Object[] objArray1 = new Object[b];
             e.C().w("NasaSlidePageList", "doPreRequest getLaunchOptCacheObservable preload", objArray1);
             if (NasaLaunchOptManager.i()) {
                this.z.set(this.o2().doOnError(e.b).toFuture());
             }else {
                this.z.set(this.n2().doOnError(f.b).toFuture());
             }
          }
          this.x = this.k2().doOnNext(a.a(p0)).doOnError(new j(this)).toFuture();
       }
       return;
    }
    public final boolean m2(){
       Object obj = PatchProxy.apply(null, this, t.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.K.get();
    }
    public final t n2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ot, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       ot = PatchProxy.apply(objArray, this, ot, "12");
       if (ot != patchProxyRe) {
       }else {
          ot = t.fromCallable(o.b).onErrorReturn(l.b).subscribeOn(d.c);
       }
       return t.zip(ot, this.C2(), new w(this)).onErrorReturn(k.b).subscribeOn(d.c);
    }
    public final t o2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.apply(null, this, t.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, NasaLaunchOptManager.class, "10");
       if (obj != patchProxyRe) {
       }else {
          obj = t.fromCallable(e.b).onErrorReturn(f.b).subscribeOn(d.c);
          a.o(obj, "Observable.fromCallable …eOn\(KwaiSchedulers.ASYNC\)");
       }
       return obj.flatMap(new p(this));
    }
    public final t p2(){
       Object[] objArray = null;
       Future obj = PatchProxy.apply(objArray, this, t.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       e.C().w("NasaSlidePageList", "getLocalCacheObservable start", objArray1);
       if (!d.j() || t.Z0.incrementAndGet() != 1) {
          return this.C2();
       }
       objArray1 = new Object[i];
       e.C().w("NasaSlidePageList", "getLocalCacheObservable cache & prefetch", objArray1);
       obj = this.z.get();
       this.z.set(objArray);
       if (obj != null) {
          Object[] objArray2 = new Object[i];
          e.C().w("NasaSlidePageList", "getLocalCacheObservable future isDone:"+obj.isDone(), objArray2);
          return t.fromFuture(obj).subscribeOn(d.c);
       }else if(NasaLaunchOptManager.i()){
          return this.o2();
       }else {
          return this.n2();
       }
    }
    public final HomeFeedResponse q2(UsePrefetchReason p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, ot, "52");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       PrefetchHomeFeedResponse obj1 = PatchProxy.apply(obj, this, ot, "49");
       int i = 0x2213150f;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(d.a(i).l0() && d.a(i).bh() > 0){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          b.k("PageList NewRefluxUser not enable use prefetch");
          return obj;
       }else if(t.b1 != null){
          return t.b1;
       }else {
          QPhoto qPhoto = d.a(i).getQPhoto();
          if (qPhoto != null) {
             qPhoto.setPrefetchReason(p0.getReason());
             qPhoto.setPrefetch(true);
             qPhoto.setCacheType(6);
             obj1 = new PrefetchHomeFeedResponse();
             b.k("PageList newRefluxUser use prefetch model,reason: "+p0.getReason()+" photoId: "+qPhoto.getPhotoId()+" userName:"+qPhoto.getUserName());
             obj1.mQPhotos = new ArrayList(Collections.singletonList(qPhoto));
             t.b1 = obj1;
             return obj1;
          }else {
             return obj;
          }
       }
    }
    public final int r2(){
       t tE = this.E;
       if (tE == null) {
          tE = 6;
       }
       return tE;
    }
    public long s2(){
       return this.w;
    }
    public final HomeFeedResponse t2(UsePrefetchReason p0){
       a obj = PatchProxy.applyOneRefs(p0, this, t.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.k("PageList load prefetch photos "+p0.getReason());
       HomeFeedResponse homeFeedResp = null;
       if (!this.x2()) {
          return homeFeedResp;
       }
       obj = c.b();
       if (obj == null) {
          return this.q2(p0);
       }
       b.a(-622777217).r();
       int i = 0;
       List list = b.a(-622777217).o(obj.mConsumeLimit, i, obj.mConsumeLimit);
       if (q.f(list)) {
          b.k("PageList has no prefetch model");
          return this.q2(p0);
       }else {
          b.a(-1343064608).p0(list.size());
          f mLlsid = list.get(i).mLlsid;
          f mCursor = list.get(i).mCursor;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             b mQPhoto = iterator.next().mQPhoto;
             StringBuilder str = "PageList has prefetch model id = "+mLlsid+", photo = "+mQPhoto+", username = ";
             String userName = (mQPhoto != null)? mQPhoto.getUserName(): homeFeedResp;
             b.k(str+userName);
             if (mQPhoto != null) {
                mQPhoto.setListLoadSequenceID(mLlsid);
                uArrayList.add(mQPhoto);
             }
          }
          if (q.f(uArrayList)) {
             return this.q2(p0);
          }
          PrefetchHomeFeedResponse prefetchHome = new PrefetchHomeFeedResponse();
          b.k("PageList use prefetch model size = "+uArrayList.size());
          prefetchHome.mQPhotos = uArrayList;
          prefetchHome.mCursor = mCursor;
          prefetchHome.mLlsid = mLlsid;
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().setPrefetchReason(p0.getReason());
             b.k("PageList set prefetch reason = "+p0.getReason());
          }
          return prefetchHome;
       }
    }
    public RefreshType u2(){
       return this.s;
    }
    public e v2(){
       return this.L;
    }
    public boolean w2(){
       Object obj = PatchProxy.apply(null, this, t.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.p.isEmpty() ^ 0x01);
    }
    public boolean x2(){
       Object obj = PatchProxy.apply(null, this, t.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.O != null && (!PhotoPrefetchBlockUtil.b() && !this.m2()))? true: false;
       return b;
    }
    public final boolean y2(HomeFeedResponse p0){
       return p0 instanceof PrefetchHomeFeedResponse;
    }
    public final boolean z2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, t.class, "47");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, c.class, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(c.b() != null && c.b().mColdStartUseWaitTimeMs > 0){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
