package com.yxcorp.gifshow.featured.feedprefetcher.module.PhotoPrefetcherInitModule;
import com.kwai.framework.init.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import sea.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import pea.b;
import wkd.b;
import qea.u;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import brd.t;
import qea.p;
import erd.r;
import qea.k;
import java.util.Comparator;
import brd.a0;
import t45.d;
import brd.z;
import qea.m;
import erd.g;
import crd.b;
import qea.s;
import java.lang.Runnable;
import t45.c;
import iea.d;
import com.yxcorp.gifshow.featured.feedprefetcher.module.a;
import ekd.k1;
import b76.a;
import qea.r;
import java.util.concurrent.Executor;
import iea.b;
import android.content.SharedPreferences;
import qea.t;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import o56.d;
import android.app.Application;
import o56.a;
import com.kwai.robust.PatchProxyResult;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.featured.feedprefetcher.module.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import e6a.d;
import sea.h;
import iea.p;
import sea.i;
import iea.o;
import sea.e;
import cda.h;
import sea.j;
import cn5.a;
import sea.g;
import java.util.ArrayList;
import java.util.Iterator;
import lea.f;
import lea.b;
import yb6.d;
import java.lang.StringBuilder;
import zy5.k;
import zy5.d;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptUpdateEvent;
import lnc.b9;
import uh5.e;
import kea.b;
import kea.a;
import com.kuaishou.eve.kit.rerank.config.RankApiParams;
import zc5.b;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.featured.feedprefetcher.module.b;
import sea.f;
import lnc.i3;
import k2b.u1;
import com.kuaishou.eve.kit.rerank.Constants;
import com.kuaishou.android.model.mix.CommonMeta;
import p5a.d;
import tkd.b;
import tkd.d;
import ida.b;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.featured.feedprefetcher.i;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import wh5.c;
import sea.d;
import qea.u$d;
import android.content.Context;
import lnc.a1;
import ekd.p0;
import java.lang.System;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.featured.feedprefetcher.config.DisablePrefetchPeriodConfig;
import com.yxcorp.gifshow.featured.feedprefetcher.config.DisablePrefetchPeriodConfig$Period;
import iea.k;
import java.lang.Number;
import sea.c;
import com.yxcorp.gifshow.featured.feedprefetcher.i$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import iea.l;
import mea.c;
import android.os.Build;
import android.os.Build$VERSION;
import com.hihonor.android.os.Build$VERSION;
import pea.a;
import c37.b;
import b37.c;
import gn5.b;

public class PhotoPrefetcherInitModule extends a	// class@000fc4
{
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public b v;
    public b w;
    public WeakReference x;
    public boolean y;
    public final Runnable z;
    public static final int A;

    public void PhotoPrefetcherInitModule(){
       super();
       this.y = a.t().d("ksLaunchOpt2022RemoveDynamicCache", true);
       this.z = new b(this);
    }
    public final void A0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoPrefetcherInitModule.class, "32")) {
          return;
       }
       b uob = c.e();
       if (uob != null && uob.mEnableSortByDuration != null) {
          b.g("InitModule sort by duration");
          u ou = b.a(-622777217);
          Objects.requireNonNull(ou);
          if (!PatchProxy.applyVoid(objArray, ou, u.class, "44")) {
             List list = ou.n();
             if (!q.f(list)) {
                t.fromIterable(list).filter(p.b).toSortedList(k.b).T(d.c).Q(new m(ou));
             }
          }
       }
       return;
    }
    public int f0(){
       return 5;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, PhotoPrefetcherInitModule.class, "4")) {
          return;
       }
       this.t0("app_background");
       u ou = b.a(-622777217);
       Objects.requireNonNull(ou);
       if (!PatchProxy.applyVoid(null, ou, u.class, "45")) {
          c.a(new s(ou));
       }
       if (!PatchProxy.applyVoid(null, this, PhotoPrefetcherInitModule.class, "5") && (d.j() && this.y != null)) {
          k1.o(a.b);
       }
    label_004a :
       return;
    }
    public void k0(a p0){
       u ou = u.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetcherInitModule.class, "2")) {
          return;
       }
       int i = -622777217;
       u ou1 = b.a(i);
       Objects.requireNonNull(ou1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ou1, ou, "6")) {
          u.l.execute(new r(ou1));
       }
       u ou2 = b.a(i);
       Objects.requireNonNull(ou2);
       if (!PatchProxy.applyVoid(objArray, ou2, ou, "43") && !b.a.getBoolean("hasClearedSP", false)) {
          c.a(new t(ou2));
       }
       this.v0();
       return;
    }
    public final void l0(QPhoto p0,HomeFeedResponse p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PhotoPrefetcherInitModule.class, "26")) {
          return;
       }
       b.g("InitModule addCanUsePrefetchPhoto, photo is prefetch");
       p0.setPrefetch(true);
       p0.setListLoadSequenceID(p1.mLlsid);
       r1.f5(p0.getEntity(), 2);
       p2.add(p0);
       return;
    }
    public void n(){
       z a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoPrefetcherInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, PhotoPrefetcherInitModule.class, "3") && d.i) {
          Application uApplication = a.b();
          c uoc = PatchProxy.apply(objArray, this, PhotoPrefetcherInitModule.class, "6");
          if (uoc != PatchProxyResult.class) {
          }else {
             uoc = new c(this);
          }
          uApplication.registerActivityLifecycleCallbacks(uoc);
          RxBus f = RxBus.f;
          a = d.a;
          f.f(d.class).observeOn(a).subscribe(new h(this));
          f.f(p.class).observeOn(a).subscribe(new i(this));
          f.f(o.class).observeOn(a).subscribe(new e(this));
          f.f(h.class).observeOn(a).subscribe(new j(this));
          f.f(a.class).observeOn(a).subscribe(new g(this));
       }
       return;
    }
    public List n0(List p0){
       StringBuilder str1;
       b mQPhoto;
       String str2;
       b obj = PatchProxy.applyOneRefs(p0, this, PhotoPrefetcherInitModule.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e();
       List list = null;
       if (obj == null) {
          return list;
       }
       if (q.f(p0)) {
          return list;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          if (uof == null) {
             continue ;
          }else if(uof.mQPhoto == null){
             b.g("InitModule checkPrefetchModelEffective, photo is null");
             uof.mDiscardReason = "photo_null";
             uArrayList.add(uof);
          }else {
             long l = uof.mCreateTimestamp + obj.mEffectiveDurationMs;
             String str = "null";
             if (l - d.a() < 0) {
                str1 = "InitModule prefetch model expired, photo: ";
                mQPhoto = uof.mQPhoto;
                str2 = (mQPhoto == null)? str: mQPhoto.toString();
                str1 = str1+str2+" ";
                mQPhoto = uof.mQPhoto;
                if (mQPhoto != null) {
                   str = mQPhoto.getUserName();
                }
                b.g(str1+str);
                uof.mDiscardReason = "prefetch_expired";
                uArrayList.add(uof);
             }else if(b.a(-275376108).k(uof.mQPhoto.getPhotoId())){
                str1 = "InitModule prefetch duplicate, photo: ";
                mQPhoto = uof.mQPhoto;
                str2 = (mQPhoto == null)? str: mQPhoto.toString();
                str1 = str1+str2+" ";
                mQPhoto = uof.mQPhoto;
                if (mQPhoto != null) {
                   str = mQPhoto.getUserName();
                }
                b.g(str1+str);
                uof.mDiscardReason = "duplicated_photo";
                uArrayList.add(uof);
             }else {
                str1 = "InitModule prefetch model not expired, photo: ";
                mQPhoto = uof.mQPhoto;
                str2 = (mQPhoto == null)? str: mQPhoto.toString();
                str1 = str1+str2+" ";
                mQPhoto = uof.mQPhoto;
                if (mQPhoto != null) {
                   str = mQPhoto.getUserName();
                }
                b.g(str1+str+" canUse: "+uof.mCanUser);
                uArrayList1.add(uof);
             }
          }
       }
       if (!q.f(uArrayList)) {
          b.c(uArrayList, false);
       }
       return uArrayList1;
    }
    public final void o0(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetcherInitModule.class, "18")) {
          return;
       }
       b uob = c.e();
       if (uob == null) {
          b.g("InitModule fillWhenPrefetchInsufficient config null");
          return;
       }else {
          List list = b.a(-622777217).l();
          b = true;
          if (q.f(list) || (uob.mFillWhenPrefetchInsufficient != null && list.size() < uob.mPrefetchLimit)) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetcherInitModule.class, "13")) {
                uob = c.e();
                if (uob == null) {
                   b.g("InitModule doPrefetch config null");
                }else if(this.s != null){
                   b.g("InitModule prefetch last prefetch not complete");
                }else {
                   this.s = b;
                   this.u = this.u + b;
                   b.g("InitModule prefetch load data start");
                   this.w0();
                   b9.a(this.v);
                   t ot = (e.f())? a.a().b(b, b, RankApiParams.a(b)): a.a().a(6, "", true, "", b.a(-869999145).j(), b.a(-869999145).d(), true, true, RankApiParams.a(b));
                   this.v = ot.map(new e()).subscribe(new b(this, uob, p0), new f(this));
                   i3 oi3 = i3.f();
                   oi3.d("reason", p0);
                   p0 = oi3.e();
                   u1.R("PREFETCH_PHOTO_REQUEST", p0, 14);
                }
             }
          }else {
             this.A0();
             RxBus.f.b(new NasaLaunchOptUpdateEvent(b));
          }
          return;
       }
    }
    public final void p0(QPhoto p0,HomeFeedResponse p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PhotoPrefetcherInitModule.class, "24")) {
          return;
       }
       if (!Constants.a()) {
          return;
       }
       CommonMeta commonMeta = p0.getCommonMeta();
       if (commonMeta != null && !q.f(commonMeta.mSortFeatures)) {
          p0.setPrefetch(true);
          p0.setListLoadSequenceID(p1.mLlsid);
          r1.f5(p0.getEntity(), 2);
          p2.add(p0);
       }else {
          b.g("InitModule filterNoSortFeatureForRank, photo sortFeatures is empty, "+p0);
       }
       return;
    }
    public List q0(HomeFeedResponse p0){
       QPhoto qPhoto;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, PhotoPrefetcherInitModule.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       b uob = c.e();
       if (uob != null) {
          obj = uob.mEnableHlsPrefetch;
       }
       if (obj != null) {
          List list = PatchProxy.applyOneRefs(p0, this, PhotoPrefetcherInitModule.class, "27");
          if (list != patchProxyRe) {
          }else {
             HomeFeedResponse mQPhotos = p0.mQPhotos;
             if (q.f(mQPhotos)) {
                list = null;
             }else {
                list = new ArrayList();
                Iterator iterator = mQPhotos.iterator();
                while (iterator.hasNext()) {
                   qPhoto = iterator.next();
                   if (qPhoto == null) {
                      b.g("InitModule getPrefetchPhotos, photo is null");
                   }else {
                      qPhoto.setPrefetch(true);
                      qPhoto.setListLoadSequenceID(p0.mLlsid);
                      list.add(qPhoto);
                   }
                }
             }
          }
          return list;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator1 = p0.mQPhotos.iterator();
          while (iterator1.hasNext()) {
             qPhoto = iterator1.next();
             if (qPhoto == null) {
                b.g("InitModule filterPhotoWhenPageListNull, photo is null");
             }else if(d.a(qPhoto) == 9){
                b.g("InitModule filterHlsPhoto");
             }else if(b.a(-275376108).k(qPhoto.getPhotoId())){
                b.g("InitModule filterDuplicatedPhoto has duplicated "+qPhoto.getUserName()+" "+qPhoto.getPhotoId());
             }else if(Constants.a()){
                this.p0(qPhoto, p0, uArrayList);
             }else {
                this.l0(qPhoto, p0, uArrayList);
             }
          }
          return uArrayList;
       }
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, PhotoPrefetcherInitModule.class, "7")) {
          return;
       }
       if (this.x == null) {
          WeakReference weakReferenc = d.a(-859095268).NP();
          if (weakReferenc != null && weakReferenc.get() != null) {
             this.x = weakReferenc;
          }
       }
       return;
    }
    public void s0(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoPrefetcherInitModule.class, "29")) {
          return;
       }
       i oi = b.a(-1335897016);
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoid(objArray, oi, i.class, "6")) {
          StringBuilder str = "Manager pause prefetch, mCurrentPhotoPrefetcher != null ? ";
          b = (oi.c != null)? true: false;
          b.g(str+b);
          if (oi.c != null) {
             oi.e = true;
          }
       }
       return;
    }
    public final void t0(String p0){
       boolean b;
       f obj;
       int b1;
       Iterator obj3;
       long l1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetcherInitModule.class, "12")) {
          return;
       }
       if (VisitorModeManager.f() || c.b()) {
          b.g("InitModule, isVisitorModeOpen return");
          return;
       }else {
          int i = -622777217;
          if (b.a(i).b == null) {
             b.g("InitModule, PrefetchDataSourceManager not initialized yet, init prefetch data source");
             b.a(i).s(new d(this, p0));
             return;
          }else {
             b.g("InitModule prefetch source:"+p0);
             b uob = c.e();
             if (uob == null) {
                b.g("InitModule prefetch config null");
                return;
             }else if(uob.mWifiOnly != null && !p0.F(a1.c())){
                b.g("InitModule prefetch not wifi");
                return;
             }else {
                b.g("InitModule prefetch config limit:"+uob.mPrefetchLimit+" effectiveDurationMs:"+uob.mEffectiveDurationMs+" nextPrefetchIntervalMs:"+uob.mNextPrefetchIntervalMs+" wifiOnly: "+uob.mWifiOnly);
                long l = System.currentTimeMillis();
                c uoc = c.class;
                b = true;
                if (PatchProxy.isSupport(uoc)) {
                   obj = PatchProxy.applyOneRefs(Long.valueOf(l), null, uoc, "10");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else {
                   label_00c6 :
                      DisablePrefetchPeriodConfig uDisablePref = PatchProxy.apply(null, null, uoc, "14");
                      if (uDisablePref != patchProxyRe) {
                      }else if(c.c == null){
                         _monitor_enter(uoc);
                         if (c.c == null) {
                            c.c = c.j();
                            String str1 = (c.c == null)? "period config null": c.c.toString();
                            b.e(str1);
                         }
                         _monitor_exit(uoc);
                      }
                      uDisablePref = c.c;
                      if (uDisablePref != null) {
                         DisablePrefetchPeriodConfig mDisablePref = uDisablePref.mDisablePrefetchPeriod;
                         if (mDisablePref != null) {
                            int len = mDisablePref.length;
                            int i1 = 0;
                            while (true) {
                               if (i1 < len) {
                                  if (mDisablePref[i1].inPeriod(l)) {
                                     b1 = true;
                                  }else {
                                     i1 = i1 + 1;
                                  }
                               }
                            }
                         }
                      }
                      b1 = false;
                   }
                }else {
                   goto label_00c6 ;
                }
                if (b1) {
                   b.g(" InitModule prohibit in current time:");
                   return;
                }else {
                   b1 = -1335897016;
                   if (b.a(b1).d()) {
                      b.g("InitModule current prefetch models is not empty, stop prefetch");
                      if (b.a(b1).e != null) {
                         b.g("InitModule current prefetch models is not empty, resume prefetch");
                         b.a(b1).f();
                      }
                      return;
                   }else {
                      ArrayList uArrayList = new ArrayList();
                      List list = b.a(i).n();
                      if (!q.f(list)) {
                         list = this.n0(list);
                         if (!q.f(list)) {
                            uArrayList.addAll(list);
                         }
                      }
                      i a = b.a(b1).a;
                      if (!q.f(a)) {
                         b.g("InitModule prefetching model id:"+b.a(b1).c());
                         list = this.n0(a);
                         if (!q.f(list)) {
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               obj = iterator.next();
                               if (!uArrayList.contains(obj)) {
                                  uArrayList.add(obj);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                      b.a(i).z(uArrayList);
                      if (!q.f(uArrayList)) {
                         ArrayList obj1 = PatchProxy.applyOneRefs(uArrayList, this, PhotoPrefetcherInitModule.class, "21");
                         if (obj1 != patchProxyRe) {
                            b = obj1.booleanValue();
                         }else if(c.e() == null || q.f(uArrayList)){
                            obj3 = uArrayList.iterator();
                            do {
                               if (obj3.hasNext()) {
                                  if (obj3.next().mCanUser != null) {
                                     continue ;
                                  }
                               }
                            } while (obj3.next().mCanUser == null);
                         }
                         b = false;
                         if (b) {
                            b.g("InitModule prefetch has not download models,continue download");
                            obj1 = PatchProxy.applyOneRefs(uArrayList, this, PhotoPrefetcherInitModule.class, "19");
                            if (obj1 != patchProxyRe) {
                            }else {
                               obj1 = new ArrayList();
                               if (!q.f(uArrayList)) {
                                  Iterator iterator1 = uArrayList.iterator();
                                  while (iterator1.hasNext()) {
                                     f uof = iterator1.next();
                                     if (uof.mCanUser == null) {
                                        obj1.add(uof);
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                            }
                            Object obj2 = obj1;
                            String str = b.a(b1).c();
                            obj3 = PatchProxy.apply(null, null, k.class, "2");
                            if (obj3 != patchProxyRe) {
                               l1 = obj3.longValue();
                            }else if(e.f()){
                               l1 = b.a.getLong("thanosLastPrefetchTime", 0);
                            }else {
                               l1 = b.a.getLong("featuredLastPrefetchTime", 0);
                            }
                            long l2 = l1;
                            this.u0(obj2, str, l2, new c(this, p0));
                            return;
                         }
                      }
                      this.o0(p0);
                      return;
                   }
                }
             }
          }
       }
    }
    public final void u0(List p0,String p1,long p2,i$a p3){
       f mLlsid;
       SharedPreferences$Editor uEditor;
       if (PatchProxy.isSupport(PhotoPrefetcherInitModule.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, PhotoPrefetcherInitModule.class, "16")) {
          return;
       }
       StringBuilder str = "InitModule prefetchWithModels  size:";
       boolean b = false;
       int i = (q.f(p0))? 0: p0.size();
       b.g(str+i+" id: "+p1+" lastPrefetchCreateTime: "+p2+"OnPrefetchFinishListener == null ? "+b);
       i oi = b.a(-1335897016);
       Objects.requireNonNull(oi);
       if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, oi, i.class, "1")) {
          StringBuilder str1 = "Manager prefetch size:";
          int i1 = (q.f(p0))? 0: p0.size();
          b.g(str1+i1+" prefetchId: "+p1+" lastPrefetchTime: "+p2+" OnPrefetchFinishListener == null ? : "+b);
          if (q.f(p0)) {
             b.g("Manager prefetch photo list empty");
          }else if(TextUtils.x(p1)){
             mLlsid = p0.get(b).mLlsid;
          }
          if (TextUtils.n(mLlsid, oi.b) || oi.d()) {
             b.g("Manager prefetch...ing id:"+mLlsid);
          }else {
             oi.e("new start");
             oi.a = new ArrayList(p0);
             oi.b = mLlsid;
             if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p2), null, k.class, "1")) {
                if (e.f()) {
                   uEditor = b.a.edit();
                   uEditor.putLong("thanosLastPrefetchTime", p2);
                   g.a(uEditor);
                }else {
                   uEditor = b.a.edit();
                   uEditor.putLong("featuredLastPrefetchTime", p2);
                   g.a(uEditor);
                }
             }
             if (!PatchProxy.applyVoidOneRefs(mLlsid, null, k.class, "3")) {
                if (e.f()) {
                   uEditor = b.a.edit();
                   uEditor.putString("thanosLastPrefetchId", mLlsid);
                   g.a(uEditor);
                }else {
                   uEditor = b.a.edit();
                   uEditor.putString("featuredLastPrefetchId", mLlsid);
                   g.a(uEditor);
                }
             }
             oi.d = new l(oi.a);
             oi.a(p3);
          }
       }
       return;
    }
    public final void v0(){
       if (PatchProxy.applyVoid(null, this, PhotoPrefetcherInitModule.class, "33")) {
          return;
       }
       c uoc = c.f();
       if (uoc == null || (uoc.mEnableUseLinkTurboSDK != null && ((Build.MANUFACTURER).equals("HONOR") && (Build$VERSION.SDK_INT >= 31 && Build$VERSION.MAGIC_SDK_INT >= 35)))) {
          c.b(new a());
       }
    label_0035 :
       return;
    }
    public final void w0(){
       if (PatchProxy.applyVoid(null, this, PhotoPrefetcherInitModule.class, "28")) {
          return;
       }
       k1.m(this.z);
       return;
    }
    public void x0(){
       if (PatchProxy.applyVoid(null, this, PhotoPrefetcherInitModule.class, "30")) {
          return;
       }
       b.a(-1335897016).f();
       return;
    }
    public final void y0(o p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetcherInitModule.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b.g("InitModule, TriggerPrefetchPhotoEvent reason = "+p0.a+" hasPreloadCompleted = "+this.q);
       String str = "new_reflux_user";
       if (this.q == null && str.equals(p0.a)) {
          b.g("InitModule new user trigger later");
          this.r = true;
          return;
       }else if(this.q == null){
          return;
       }else if(str.equals(p0.a) && d.a(0x2213150f).I00()){
          int i = -622777217;
          b = false;
          SharedPreferences sharedPrefer = (!q.f(b.a(i).k()) || !q.f(b.a(i).l()))? 1: null;
          if (sharedPrefer) {
             b.g("InitModule, new user hasPrefetchPhoto");
             return;
          }else {
             sharedPrefer = b.a;
             if (sharedPrefer.getBoolean("hasNewRefluxTriggerPrefetch", b)) {
                b.g("InitModule, new user had trigger prefetch");
                return;
             }else if(c.e() != null || PatchProxy.applyVoid(null, null, c.class, "13")){
                c.b = new b();
                c.b.mNextPrefetchIntervalMs = 0x5265c00;
                c.b.mEffectiveDurationMs = 0x48190800;
                c.b.mPreloadBytes = 0x4e20000;
                c.b.mPrefetchLimit = 1;
                c.b.mWifiOnly = true;
                c.b.mEnableHlsPrefetch = true;
                c.b.mHlsMaxSegCnt = 8;
             }
             b.g("InitModule, new user trigger prefetch");
             SharedPreferences$Editor uEditor = sharedPrefer.edit();
             uEditor.putBoolean("hasNewRefluxTriggerPrefetch", true);
             g.a(uEditor);
             this.t0(p0.a);
          }
       }else {
          this.t0(p0.a);
       }
       return;
    }
}
