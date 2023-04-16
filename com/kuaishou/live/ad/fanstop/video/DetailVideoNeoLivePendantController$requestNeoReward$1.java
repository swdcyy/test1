package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$requestNeoReward$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.Objects;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import android.app.Activity;
import lnc.y0;
import yx.j0;
import kotlin.Result;
import java.lang.Integer;
import im9.a;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import java.lang.Long;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.yxcorp.gifshow.commercial.api.RewardTaskInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import g59.o;
import java.util.List;
import trd.t;
import nsd.u;
import java.util.concurrent.atomic.AtomicBoolean;
import dy8.g;
import dy8.b;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import o49.h;
import o49.f;
import p49.c;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$requestNeoReport$2$1;
import msd.l;
import brd.x;
import cjd.e;
import erd.o;
import sl0.c;
import sl0.b;
import erd.a;
import sl0.d;
import ftd.k;
import sl0.e;
import erd.g;
import crd.b;
import dsd.e;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;

public final class DetailVideoNeoLivePendantController$requestNeoReward$1 extends SuspendLambda implements p	// class@0009bb
{
    public Object L$0;
    public int label;
    public k0 p$;
    public final DetailVideoNeoLivePendantController this$0;

    public void DetailVideoNeoLivePendantController$requestNeoReward$1(DetailVideoNeoLivePendantController p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       DetailVideoNeoLivePendantController$requestNeoReward$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$requestNeoReward$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DetailVideoNeoLivePendantController$requestNeoReward$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$requestNeoReward$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object[] obj3;
       a uoa;
       DetailVideoNeoLivePendantController obj5;
       long l1;
       NeoParamsBaseInfo mExtParams;
       DetailVideoNeoLivePendantController uDetailVideo2;
       long l2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DetailVideoNeoLivePendantController$requestNeoReward$1 obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, DetailVideoNeoLivePendantController$requestNeoReward$1.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = b.h();
       DetailVideoNeoLivePendantController$requestNeoReward$1 label = obj.label;
       int i = 1;
       if (label != null) {
          if (label == i) {
             j0.n(p0);
             obj3 = obj1;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          obj1 = obj.this$0;
          obj.L$0 = obj.p$;
          obj.label = i;
          Objects.requireNonNull(obj1);
          l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(this), i);
          ol.u();
          PhotoAdvertisement$FanstopLiveInfo obj4 = null;
          int i1 = 0;
          if (y0.o(obj1.n)) {
             obj3 = new Object[i1];
             j0.c("DetailVideoNeoLivePendantController", "request neo report when activity finished", obj3);
             ol.resumeWith(Result.constructor-impl(obj4));
          }else {
             DetailVideoNeoLivePendantController uDetailVideo = DetailVideoNeoLivePendantController.class;
             if (PatchProxy.isSupport(uDetailVideo)) {
                uoa = PatchProxy.applyOneRefs(Integer.valueOf(i1), obj1, uDetailVideo, "25");
                if (uoa != patchProxyRe) {
                }else {
                label_007e :
                   DetailVideoNeoLivePendantController g = obj1.g;
                   PhotoAdvertisement$FanstopLiveInfo uFanstopLive = null;
                   if (g != null) {
                      LiveAdNeoParam mStartParam = g.mStartParam;
                      if (mStartParam != null) {
                         LiveAdNeoParam$StartParam mNeoParamsLi = mStartParam.mNeoParamsLiveInfo;
                         if (mNeoParamsLi != null) {
                            Long longx = Long.valueOf(mNeoParamsLi.mBusinessId);
                            long l = (longx.longValue() - uFanstopLive > 0)? 1: 0;
                            if (!l) {
                               longx = obj4;
                            }
                            if (longx != null) {
                               l = longx.longValue();
                            label_00aa :
                               l1 = l;
                               g = obj1.f;
                               if (g != null) {
                                  Object[] objArray = new Object[i1];
                                  j0.f("DetailVideoNeoLivePendantController", "NeoStatusInfo CreativeId: "+g.mCreativeId, objArray);
                                  PhotoAdvertisement$FanstopLiveInfo mPageId = g.mPageId;
                                  uFanstopLive = g.mSubPageId;
                                  obj4 = g.mAdData;
                                  DetailVideoNeoLivePendantController uDetailVideo1 = uDetailVideo;
                                  PhotoAdvertisement$AdData uAdData = (obj4 != null)? obj4.mPosId: 0;
                                  obj5 = obj1.g;
                                  if (obj5 != null) {
                                     LiveAdNeoParam mStartParam1 = obj5.mStartParam;
                                     if (mStartParam1 != null) {
                                        LiveAdNeoParam$StartParam mNeoParamsLi1 = mStartParam1.mNeoParamsLiveInfo;
                                        if (mNeoParamsLi1 != null) {
                                           mExtParams = mNeoParamsLi1.mExtParams;
                                           if (mExtParams != null) {
                                           label_00ee :
                                              NeoParamsBaseInfo neoParamsBas = mExtParams;
                                              Object obj6 = PatchProxy.applyOneRefs(g, obj1, uDetailVideo1, "26");
                                              if (obj6 != patchProxyRe) {
                                                 uDetailVideo2 = g;
                                                 l2 = obj6.longValue();
                                              }else {
                                                 uDetailVideo2 = g;
                                                 l2 = o.b(g.mLlsid, r1.i1(obj1.p));
                                              }
                                              RewardTaskInfo rewardTaskIn = new RewardTaskInfo(Long.valueOf(l2), obj1.q, Long.valueOf(uDetailVideo2.mCreativeId), Integer.valueOf(1), obj1.b);
                                              a uoa1 = new a(mPageId, uFanstopLive, uAdData, l1, "live", neoParamsBas, 0, 0, t.k(mExtParams), 0, 192, null);
                                              uoa = l;
                                           }
                                        }
                                     }
                                  }
                                  mExtParams = "";
                                  goto label_00ee ;
                               }else {
                                  uoa = null;
                               }
                            }
                         }
                      }
                   }
                   StringBuilder str = 101;
                   goto label_00aa ;
                }
             }else {
                goto label_007e ;
             }
             if (uoa == null) {
                obj3 = new Object[0];
                j0.c("DetailVideoNeoLivePendantController", "Illegal request params for neo report", obj3);
                ol.resumeWith(Result.constructor-impl(null));
             }else {
                int i2 = 0;
                obj5 = null;
                if (obj1.c.get()) {
                   obj3 = new Object[i2];
                   j0.f("DetailVideoNeoLivePendantController", "Duplicate neo report request", obj3);
                   ol.resumeWith(Result.constructor-impl(obj5));
                }else {
                   obj1.c.set(true);
                   h oh = new h(obj1.p, 0, 0, new f(c.g, BusinessType.NEO_LIVE, DetailVideoNeoLivePendantController$requestNeoReport$2$1.INSTANCE, null, 8, null), null, 22, null);
                   t ot = b.a().a(a.a.q(uoa)).compose(obj5);
                   obj1.a(ot.map(new e()).map(c.b).doFinally(new b(obj1, 0)).subscribe(new d(ol), new e(ol)));
                }
             }
          }
          obj3 = ol.r();
          if (obj3 == b.h()) {
             e.c(this);
          }
          if (obj3 == obj2) {
             return obj2;
          }
       }
       if (obj3 == null) {
          obj.this$0.g();
       }else {
          obj.this$0.h(obj3);
       }
       return l1.a;
    }
}
