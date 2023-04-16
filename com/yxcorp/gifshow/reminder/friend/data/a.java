package com.yxcorp.gifshow.reminder.friend.data.a;
import qvb.f;
import com.yxcorp.gifshow.reminder.friend.data.a$d;
import nsd.u;
import bdc.b;
import eec.a;
import sdc.a;
import kdc.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import com.google.common.collect.o;
import com.yxcorp.gifshow.action.RealActionBizType;
import java.util.concurrent.atomic.AtomicBoolean;
import qvb.i;
import tkd.b;
import tkd.d;
import jx5.b;
import com.yxcorp.gifshow.reminder.friend.data.a$a;
import com.yxcorp.gifshow.reminder.friend.data.a$b;
import com.yxcorp.gifshow.reminder.friend.data.a$c;
import ok.x;
import jx5.a;
import com.yxcorp.gifshow.reminder.friend.preload.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.reminder.friend.preload.FriendsSlidePrefetchHelper;
import java.util.Objects;
import h0c.c;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import i0c.f;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.prefetch.preloader.TunaProphetPreLoader;
import gu7.b;
import j0c.a;
import k0c.a$f;
import java.lang.Integer;
import k0c.a;
import java.util.Map;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.util.List;
import la6.b;
import brd.t;
import zcc.o;
import q87.c;
import qvb.n0;
import t45.d;
import brd.z;
import ddc.e;
import erd.g;
import ddc.f;
import erd.o;
import qvb.n0$a;
import java.lang.StringBuilder;
import java.util.Collection;
import qk.g0;
import b06.d;
import kp.y1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import ekd.q;
import java.util.HashMap;
import o26.d;
import com.google.common.collect.ImmutableList;
import kdc.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import tca.h;
import kdc.c;
import tca.v2;
import com.yxcorp.gifshow.reminder.friend.data.a$f;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.reminder.friend.data.a$g;
import com.yxcorp.gifshow.reminder.friend.data.a$h;
import com.yxcorp.gifshow.reminder.friend.data.a$i;
import com.yxcorp.gifshow.reminder.friend.data.a$j;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicLong;
import wkd.b;
import ddc.a;
import tx5.a;
import android.util.Pair;
import zcc.l;
import com.kwai.soc.arch.rubas.base.Rubas;
import vdc.i;
import vdc.h;
import com.yxcorp.gifshow.reminder.friend.data.a$e;
import bdc.c;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.reminder.friend.data.a$k;
import com.yxcorp.gifshow.reminder.friend.data.a$l;
import com.yxcorp.gifshow.reminder.friend.data.a$m;

public final class a extends f	// class@001a8f
{
    public final b A;
    public final a B;
    public final a C;
    public final d D;
    public final Set p;
    public final c q;
    public final AtomicBoolean r;
    public final a s;
    public final boolean t;
    public boolean u;
    public String v;
    public boolean w;
    public boolean x;
    public Pair y;
    public a$e z;
    public static final a$d E;

    static {
       a.E = new a$d(null);
    }
    public void a(b p0,a p1,a p2,d p3){
       a.p(p0, "mCacheManager");
       a.p(p1, "schemeHelper");
       a.p(p2, "logHelper");
       a.p(p3, "postInsertHelper");
       super();
       this.A = p0;
       this.B = p1;
       this.C = p2;
       this.D = p3;
       HashSet hashSet = o.h();
       a.o(hashSet, "Sets.newHashSet\(\)");
       this.p = hashSet;
       this.q = RealActionBizType.FRIEND_TAB;
       this.r = new AtomicBoolean();
       this.x = true;
       p0.g(this);
       a uoa = d.a(-1571632429).as(a$a.b, a$b.b, new a$c(this));
       a.o(uoa, "PluginManager.get\(PymkSl¡­ier { this.isFirstPage }\)");
       this.s = uoa;
       this.u = a.a();
       uoa = PatchProxy.apply(null, null, a.class, "7");
       boolean b = (uoa != PatchProxyResult.class)? uoa.booleanValue(): a.t().d("enableFriendTabCacheLoadOpt", false);
       this.t = b;
       return;
    }
    public boolean E1(){
       boolean b1;
       f a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FriendsSlidePrefetchHelper obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.u != null) {
          if (this.A.h() && this.x != null) {
             b = true;
          }
          return b;
       }else if(this.t != null){
          if (this.A.h()) {
             obj = FriendsSlidePrefetchHelper.b;
             Objects.requireNonNull(obj);
             String obj1 = PatchProxy.apply(objArray, obj, FriendsSlidePrefetchHelper.class, "5");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                obj1 = "friends_slide";
                String obj2 = PatchProxy.applyOneRefs(obj1, objArray, c.class, "9");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = "preLoaderKey";
                   a.p(obj1, obj2);
                   a = c.a;
                   Objects.requireNonNull(a);
                   Object obj3 = PatchProxy.applyOneRefs(obj1, a, f.class, "4");
                   if (obj3 != patchProxyRe) {
                      obj2 = obj3;
                   }else {
                      a.p(obj1, obj2);
                      f a1 = a.a;
                      if (!a1.containsKey(obj1)) {
                         a1 = objArray;
                      }
                      if (a1 != null) {
                         TunaProphetPreLoader tunaProphetP = a1.get(obj1);
                         Objects.requireNonNull(tunaProphetP, "null cannot be cast to non-null type com.yxcorp.gifshow.prefetch.preloader.TunaProphetPreLoader<R>");
                         ResultWrapper resultWrappe = PatchProxy.apply(objArray, tunaProphetP, TunaProphetPreLoader.class, "7");
                         if (resultWrappe != patchProxyRe) {
                         }else {
                            TunaProphetPreLoader b2 = tunaProphetP.b;
                            resultWrappe = (b2 != null)? b2.c(): objArray;
                         }
                         a.a(a.a, new a$f(tunaProphetP.e(), tunaProphetP.d(), tunaProphetP.f()), objArray, 2, objArray);
                         objArray = resultWrappe;
                      }
                      obj2 = objArray;
                   }
                }
                if (obj2 != null) {
                   FriendSlidePlayFeedResponse result = obj2.getResult();
                   if (result != null) {
                      result = result.mPhotos;
                      if (result != null) {
                         result = (result.size() > 0)? 1: 0;
                         if (result == 1) {
                            b1 = true;
                         }
                      }
                   }
                }
                b1 = false;
             }
             if (!b1) {
                b = true;
             }
          }
       }else {
          b = this.A.h();
       }
       return b;
    }
    public Object F1(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, a.class, "9");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          FriendSlidePlayFeedResponse uFriendSlide = this.A.i(FriendSlidePlayFeedResponse.class);
          if (uFriendSlide != null) {
             uFriendSlide.mLocalRequestSource = 2;
             objArray = uFriendSlide;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public t I1(){
       t ot;
       Object[] objArray2;
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("FriendSlidePlayPageList", "onCreateRequest: isFirstPage true", objArray1);
       if (this.K()) {
          ot = PatchProxy.apply(objArray, this, uoa, "3");
          if (ot != patchProxyRe) {
          }else if(this.u != null){
             objArray2 = new Object[0];
             o.C().w("FriendSlidePlayPageList", "onCreateRequest: enableLoadOpt:true,createOriginRequest", objArray2);
             ot1 = this.h2();
          }else {
             ot1 = FriendsSlidePrefetchHelper.b.a(this.h2());
             if (ot1 != null) {
                objArray = new Object[0];
                o.C().w("FriendSlidePlayPageList", "onCreateRequest: preloadObservable!=null start handleResultWrapper", objArray);
                ot1 = ot1.subscribeOn(d.c).observeOn(d.a).doOnNext(new e(this)).map(f.b);
             }else {
                objArray2 = new Object[0];
                o.C().w("FriendSlidePlayPageList", "onCreateRequest: preloadObservable null start createOriginRequest", objArray2);
                this.n2(0, 0);
                ot1 = this.h2();
             }
          }
          ot = ot1;
          a.o(ot, "handleFirstPageRequest\(\)");
       }else {
          objArray2 = new Object[0];
          o.C().w("FriendSlidePlayPageList", "onCreateRequest: load more", objArray2);
          this.n2(0, 0);
          ot = this.h2();
       }
       return ot;
    }
    public void K1(n0$a p0){
       int i;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       boolean b = false;
       this.x = b;
       super.K1(p0);
       if (p0 != null) {
          FriendSlidePlayFeedResponse uFriendSlide = p0.a();
          if (uFriendSlide != null) {
             uFriendSlide = uFriendSlide.mPhotos;
             if (uFriendSlide != null) {
                i = uFriendSlide.size();
             label_0025 :
                StringBuilder str = 1;
                if (p0 != null && p0.c() == str) {
                   objArray = new Object[b];
                   o.C().w("FriendSlidePlayPageList", "onLoadCompleted isPrefetch: dataSize: "+i, objArray);
                   if (this.u != null && this.w != null) {
                      this.invalidate();
                   }
                }else if(p0 != null && p0.b() == str){
                   objArray = new Object[b];
                   o.C().w("FriendSlidePlayPageList", "onLoadCompleted isCache: dataSize: "+i, objArray);
                   if (this.u != null) {
                      this.invalidate();
                   }
                }else {
                   objArray = new Object[b];
                   o.C().w("FriendSlidePlayPageList", "onLoadCompleted network: isFirstPage"+this.K()+": dataSize: "+i, objArray);
                }
                return;
             }
          }
       }
       i = 0;
       goto label_0025 ;
    }
    public boolean P1(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.A.h();
    }
    public boolean U1(n0$a p0){
       Boolean uBoolean;
       o obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "response");
       if (this.u == null) {
          return super.U1(p0);
       }
       obj = o.C();
       char c = ',';
       StringBuilder str = "disposeWhenLoadCompleted: "+"response.isPrefetch:"+p0.c()+c+"response.prefetchDataIsNotEmpty:";
       FriendSlidePlayFeedResponse uFriendSlide = p0.a();
       int i = 1;
       if (uFriendSlide != null) {
          List items = uFriendSlide.getItems();
          if (items != null) {
             uBoolean = Boolean.valueOf((items.isEmpty() ^ i));
          label_005a :
             Object[] objArray = new Object[0];
             obj.w("FriendSlidePlayPageList", str+uBoolean+c+"response.isCache:"+p0.b(), objArray);
             if (p0.c()) {
                FriendSlidePlayFeedResponse uFriendSlide1 = p0.a();
                if (uFriendSlide1 != null) {
                   List items1 = uFriendSlide1.getItems();
                   if (items1 != null && (items1.isEmpty() ^ i) == i) {
                   label_009c :
                      return i;
                   }
                }
             }else if(!p0.b()){
                goto label_009c ;
             }
             i = false;
             goto label_009c ;
          }
       }
       uBoolean = null;
       goto label_005a ;
    }
    public List W1(b p0,List p1){
       Iterator iterator;
       CommonMeta uCommonMeta;
       d a;
       List list = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "12");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          list = super.W1(p0, p1);
          QPhoto qPhoto = null;
          if (list != null) {
             d.h(list);
             y1.g(list, 0, p0.mLlsid);
             d.d(list);
             if (!TextUtils.x(p0.mPrsid)) {
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   uCommonMeta = r1.w0(iterator.next().mEntity);
                   a.o(uCommonMeta, "FeedExt.getCommonMeta\(item.mEntity\)");
                   if (uCommonMeta.mFeedFriendInfo == null) {
                      uCommonMeta.mFeedFriendInfo = new FeedFriendInfo();
                   }
                   uCommonMeta = uCommonMeta.mFeedFriendInfo;
                   if (uCommonMeta != null) {
                      uCommonMeta.mPrsid = p0.mPrsid;
                   }
                }
             }
             iterator = list.iterator();
             String str = "FeedExt.getCommonMeta\(photo.mEntity\)";
             while (iterator.hasNext()) {
                uCommonMeta = r1.w0(iterator.next().mEntity);
                a.o(uCommonMeta, str);
                if (uCommonMeta.mFeedFriendInfo == null) {
                   uCommonMeta.mFeedFriendInfo = new FeedFriendInfo();
                }
                uCommonMeta = uCommonMeta.mFeedFriendInfo;
                if (uCommonMeta != null) {
                   uCommonMeta.mHasShownBubbleUsers = this.p;
                }
             }
             this.r.set(p0.mHasRemovedUser);
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                CommonMeta uCommonMeta1 = r1.w0(iterator1.next().mEntity);
                a.o(uCommonMeta1, str);
                if (uCommonMeta1.mFeedFriendInfo == null) {
                   uCommonMeta1.mFeedFriendInfo = new FeedFriendInfo();
                }
                uCommonMeta1 = uCommonMeta1.mFeedFriendInfo;
                if (uCommonMeta1 != null) {
                   uCommonMeta1.mHasRemovedUser = this.r;
                }
             }
             a tD = this.D;
             Objects.requireNonNull(tD);
             d uod = d.class;
             if (!PatchProxy.applyVoidOneRefs(list, tD, uod, "1") && !q.f(list)) {
                int i = 0;
                while (i < list.size()) {
                   QPhoto qPhoto1 = list.get(i);
                   if (qPhoto1.isPending() && tD.c.containsKey(qPhoto1.getPhotoId())) {
                      qPhoto1 = y.y(tD.d.get().Id(), new a(tD, qPhoto1)).orNull();
                      if (qPhoto1 == null) {
                         break ;
                      }else {
                         list.set(i, qPhoto1);
                         tD.a = qPhoto;
                      }
                   }
                   i = i + 1;
                }
                a = tD.a;
                if (a != null) {
                   list.add(0, a);
                   tD.a = qPhoto;
                }
                if (!PatchProxy.applyVoidOneRefs(list, tD, uod, "2")) {
                   h[] ohArray = new h[]{new c(tD)};
                   0.a(list, ohArray);
                }
             }
          }else {
             list = qPhoto;
          }
       }
       return list;
    }
    public final t h2(){
       t obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.fromCallable(new a$f(this)).subscribeOn(d.c).observeOn(d.a).flatMap(new a$g(this)).map(a$h.b).flatMap(new a$i(this)).doOnNext(new a$j(this));
       a.o(obj, "Observable\n      .fromCa¡­etSchemeParams\(\)\n      }\)");
       return obj;
    }
    public boolean i(){
       return false;
    }
    public final t i2(boolean p0,String p1,String p2,String p3){
       FriendSlidePlayFeedResponse obj;
       String str;
       FriendSlidePlayFeedResponse uFriendSlide;
       a g;
       a uoa1;
       int this;
       a uoa = this;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, a.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = null;
       if (!this.K()) {
          obj = this.L0();
          if (obj != null) {
             str = obj.getCursor();
          label_003b :
             if (!this.K()) {
                obj = this.L0();
                if (obj != null) {
                   uFriendSlide = obj.mPrsid;
                label_004e :
                   if (this.K()) {
                      g = uoa.B.g;
                   }else {
                      obj = this.L0();
                      if (obj != null) {
                         g = obj.mExtraInfo;
                      }else {
                         uoa1 = objArray;
                      label_0066 :
                         g = uoa.D;
                         Objects.requireNonNull(g);
                         Object obj1 = PatchProxy.apply(objArray, g, d.class, "4");
                         o oo = null;
                         long l = (obj1 != PatchProxyResult.class)? obj1.longValue(): g.b.getAndSet(oo);
                         this = 0;
                         if (l - oo) {
                            Object[] objArray1 = new Object[this];
                            o.C().w("FriendSlidePlayPageList", "insert topPhotoId: "+l, objArray1);
                         }
                         a v = uoa.v;
                         if (v == null || !v.length()) {
                            this = 1;
                         }
                         String str1 = "";
                         String str2 = (this)? str1: uoa.v;
                         uoa.v = str1;
                         v = uoa.B;
                         t ot = b.a(0x611ee2f7).b(6, str, uFriendSlide, p1, uoa1, l, v.a, v.b, v.f, v.e, p2, p0, str2, p3);
                         a.o(ot, "Singleton.get\(FriendSlid¡­ commonTopFeedInfos\n    \)");
                         return ot;
                      }
                   }
                   uoa1 = g;
                   goto label_0066 ;
                }
             }
             uFriendSlide = objArray;
             goto label_004e ;
          }
       }
       str = objArray;
       goto label_003b ;
    }
    public final boolean j2(){
       return this.w;
    }
    public final Pair k2(){
       return this.y;
    }
    public final a l2(){
       return this.B;
    }
    public final void m2(ResultWrapper p0){
       Object[] obj;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       int i = 0;
       if (p0 != null) {
          int i1 = 1;
          if (p0.getFromCache() == i1) {
             HashMap extra = p0.getExtra();
             obj = extra.get("need_refresh");
             if (obj instanceof Boolean) {
                this.w = obj.booleanValue();
             }
             if (l.d()) {
                b = this.B.d();
                this.w = this.w | this.B.d();
             }else {
                b = false;
             }
             extra = extra.get("preload_photo_ids");
             if (extra instanceof String) {
                this.v = extra;
             }
             this.n2((this.w ^ i1), b);
             if (this.w == null) {
                Rubas.f("friendUsePreloadData", null, null, null, 14, null);
             }
             Object[] objArray = new Object[i];
             o.C().w("FriendSlidePlayPageList", "onCreateRequest: handleResultWrapper prefetchNeedRefresh:"+this.w, objArray);
          label_0094 :
             return;
          }
       }
       obj = new Object[i];
       o.C().w("FriendSlidePlayPageList", "onCreateRequest: handleResultWrapper resultWrapper.fromCache:false", obj);
       this.n2(i, i);
       goto label_0094 ;
    }
    public final void n2(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "17")) {
          return;
       }
       i oi = b.a(-854120334);
       h oh = new h();
       int i = (p0)? 1: 2;
       oh.c = i;
       oh.d = p1;
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoidOneRefs(oh, oi, i.class, "2")) {
          a.p(oh, "dataResult");
          oh.b = a.b() ^ 1;
          oi.b = oh;
       }
       a tz = this.z;
       if (tz != null) {
          tz.a(oh);
       }
       return;
    }
    public final void o2(a$e p0){
       this.z = p0;
    }
    public final void p2(Pair p0){
       this.y = p0;
    }
    public t x1(){
       boolean b;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("FriendSlidePlayPageList", "createCacheObservable", objArray1);
       obj = this.A;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "8");
       b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.b();
       if (b) {
          ot = (this.u != null)? this.w1(): this.w1().delay(10, TimeUnit.MILLISECONDS);
          a.o(ot, "if \(mEnableLoadOpt\) {\n  ¡­nit.MILLISECONDS\)\n      }");
       }else {
          ot = super.x1();
          a.o(ot, "super.createDelayCacheObservable\(\)");
       }
       return ot;
    }
    public t y1(){
       t obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("FriendSlidePlayPageList", "createPrefetchObservable", objArray);
       if (this.u == null) {
          obj = super.y1();
          a.o(obj, "super.createPrefetchObservable\(\)");
          return obj;
       }else {
          obj = FriendsSlidePrefetchHelper.b.a(this.h2());
          if (obj != null) {
             obj = obj.subscribeOn(d.c).observeOn(d.a).doOnNext(new a$k(this)).flatMap(new a$l(this)).map(a$m.b);
             a.o(obj, "preloadObservable\n      ¡­ false, true\)\n          }");
          }else {
             objArray = new Object[i];
             o.C().w("FriendSlidePlayPageList", "onCreateRequest: preloadObservable null start createOriginRequest", objArray);
             this.n2(i, i);
             obj = t.empty();
             a.o(obj, "Observable.empty\(\)");
          }
          return obj;
       }
    }
    public boolean z1(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.u == null) {
          if (this.t == null) {
             obj = this.A;
             Objects.requireNonNull(obj);
             Object obj1 = PatchProxy.apply(objArray, obj, b.class, "9");
             b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.g;
             if (b == null) {
             label_0039 :
                b = false;
             label_003c :
                return b;
             }
          }else {
             goto label_0039 ;
          }
       }
       b = true;
       goto label_003c ;
    }
}
