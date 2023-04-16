package com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import tl8.d;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import java.lang.Throwable;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.util.rx.RxBus;
import a59.h;
import java.lang.Long;
import im9.a;
import com.yxcorp.gifshow.commercial.api.RewardTaskInfo;
import kp.r1;
import java.util.List;
import trd.t;
import nsd.u;
import dy8.g;
import dy8.b;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import o49.h;
import o49.f;
import p49.c;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$requestNeoReport$1;
import msd.l;
import brd.x;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$a;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$b;
import erd.a;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$c;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$d;
import erd.g;
import crd.b;

public final class NeoAppAdvanceReportUtil	// class@00178e
{
    public static final NeoAppAdvanceReportUtil a;

    static {
       NeoAppAdvanceReportUtil.a = new NeoAppAdvanceReportUtil();
    }
    public void NeoAppAdvanceReportUtil(){
       super();
    }
    public static final void f(PhotoAdvertisement p0,BaseFeed p1){
       NeoAppAdvanceReportUtil a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, NeoAppAdvanceReportUtil.class, "1")) {
          return;
       }
       a.p(p0, "ad");
       a.p(p1, "feed");
       a = NeoAppAdvanceReportUtil.a;
       PhotoAdvertisement$NeoReportInfo neoReportInf = a.a(p0);
       if (neoReportInf != null && a.b(neoReportInf)) {
          a.e(p0, p1);
       }
       return;
    }
    public static final void g(AdDataWrapper p0){
       NeoAppAdvanceReportUtil a;
       NeoAppAdvanceReportUtil neoAppAdvanc = NeoAppAdvanceReportUtil.class;
       PhotoAdvertisement photoAdverti = null;
       if (PatchProxy.applyVoidOneRefs(p0, photoAdverti, neoAppAdvanc, "2")) {
          return;
       }
       a.p(p0, "adDataWrapper");
       BaseFeed photo = p0.getPhoto();
       if (photo != null) {
          a.o(photo, "adDataWrapper.photo ?: return");
          PhotoAdvertisement photoAdverti1 = photo.get("AD");
          if (photoAdverti1 != null) {
             a = NeoAppAdvanceReportUtil.a;
             PhotoAdvertisement$NeoReportInfo neoReportInf = a.a(photoAdverti1);
             int i = 1;
             if (neoReportInf != null && a.b(neoReportInf)) {
                neoReportInf = neoReportInf.mType;
                boolean i1 = AdProcessUtils.e(p0);
                Objects.requireNonNull(a);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (PatchProxy.isSupport(neoAppAdvanc)) {
                   Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(neoReportInf), Integer.valueOf(i1), a, neoAppAdvanc, "5");
                   if (obj != patchProxyRe) {
                      i1 = obj.booleanValue();
                   }else if(neoReportInf != null){
                      if (neoReportInf != i) {
                         if (neoReportInf != 2) {
                            if (neoReportInf == 3) {
                            label_00a6 :
                               i1 = true;
                            }
                         }else if(PatchProxy.isSupport(neoAppAdvanc)){
                            Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), a, neoAppAdvanc, "6");
                            if (obj1 != patchProxyRe) {
                               i1 = obj1.booleanValue();
                            }
                         }
                         Object[] objArray = new Object[0];
                         j0.f("NeoAppAdvanceReporter", "current itemClickType "+i1, objArray);
                         if (i1 != 115 && (i1 == 29 || i1 == 51)) {
                            goto label_00a6 ;
                         }
                      }else {
                         goto label_00a6 ;
                      }
                   }
                label_00a8 :
                   i1 = false;
                }else {
                   goto label_005e ;
                }
                if (i1) {
                label_00ad :
                   if (i) {
                      photoAdverti = photoAdverti1;
                   }
                   if (photoAdverti != null) {
                      a.e(photoAdverti, photo);
                   }
                }
             }
          label_00ac :
             i = 0;
             goto label_00ad ;
          }
       }
       return;
    }
    public final PhotoAdvertisement$NeoReportInfo a(PhotoAdvertisement p0){
       Integer integer;
       PhotoAdvertisement$AdData obj = PatchProxy.applyOneRefs(p0, this, NeoAppAdvanceReportUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getAdData();
       PhotoAdvertisement$NeoReportInfo neoReportInf = null;
       if (obj != null) {
          obj = obj.mInspireAdInfo;
          if (obj != null) {
             PhotoAdvertisement$InspireAdInfo mInspireActi = obj.mInspireAction;
             if (mInspireActi != null) {
                integer = Integer.valueOf(mInspireActi.mPecType);
             label_0026 :
                int i = (integer != null && integer.intValue() > 0)? 1: 0;
                if (!i) {
                   integer = neoReportInf;
                }
                if (integer != null) {
                   return neoReportInf;
                }else {
                   PhotoAdvertisement$AdData adData = p0.getAdData();
                   if (adData != null) {
                      adData = adData.mInspireAdInfo;
                      if (adData != null) {
                         neoReportInf = adData.mNeoReportInfo;
                      }
                   }
                   return neoReportInf;
                }
             }
          }
       }
       integer = neoReportInf;
       goto label_0026 ;
    }
    public final boolean b(PhotoAdvertisement$NeoReportInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoAppAdvanceReportUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mHasReported == null && p0.mIsReportRequesting == null) {
          return true;
       }
       Object[] objArray = new Object[0];
       j0.f("NeoAppAdvanceReporter", "hasReported "+p0.mHasReported+' '+"or isReportRequesting "+p0.mIsReportRequesting, objArray);
       return 0;
    }
    public final void c(BaseFeed p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NeoAppAdvanceReportUtil.class, "9")) {
          return;
       }
       i0.a().e(805, p0).a();
       j0.e("NeoAppAdvanceReporter", "request err", p1);
       return;
    }
    public final void d(BaseFeed p0,PhotoAdvertisement$NeoReportInfo p1,ProvideNeoInfo$Data p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NeoAppAdvanceReportUtil.class, "8")) {
          return;
       }
       boolean b = true;
       if (p1 != null) {
          p1.mHasReported = b;
       }
       ProvideNeoInfo$Data mToast = p2.mToast;
       if (mToast != null) {
          if (mToast.length()) {
             b = false;
          }
          if (b) {
             mToast = null;
          }
          if (mToast != null) {
             s.q(mToast);
          }
       }
       RxBus.f.b(new h());
       i0.a().e(804, p0).q("get_points_cnt", Long.valueOf(p2.mNeoAmount)).a();
       Object[] objArray = new Object[0];
       j0.f("NeoAppAdvanceReporter", "request success", objArray);
       return;
    }
    public final void e(PhotoAdvertisement p0,BaseFeed p1){
       PhotoAdvertisement$InspireAdInfo mNeoParams;
       PhotoAdvertisement$InspireAdInfo mNeoReportIn;
       PhotoAdvertisement obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, NeoAppAdvanceReportUtil.class, "7")) {
          return;
       }
       PhotoAdvertisement mPageId = obj.mPageId;
       PhotoAdvertisement mSubPageId = obj.mSubPageId;
       PhotoAdvertisement mAdData = obj.mAdData;
       PhotoAdvertisement$AdData mPosId = (mAdData != null)? mAdData.mPosId: 0;
       PhotoAdvertisement$AdData uAdData = mPosId;
       long l = 0;
       Long longx = Long.valueOf(r1.i1(p1));
       String id = p1.getId();
       Long longx1 = Long.valueOf(obj.mCreativeId);
       Integer integer = Integer.valueOf(1);
       mAdData = obj.mAdData;
       if (mAdData != null) {
          mPosId = mAdData.mInspireAdInfo;
          if (mPosId != null) {
             mNeoParams = mPosId.mNeoParams;
             if (mNeoParams != null) {
             label_0052 :
                RewardTaskInfo rewardTaskIn = new RewardTaskInfo(longx, id, longx1, integer, mNeoParams);
                boolean b = true;
                a uoa = new a(mPageId, mSubPageId, uAdData, l, "dspVideo", null, 0, 0, t.k(v12), 0, 744, null);
                obj = obj.mAdData;
                if (obj != null) {
                   PhotoAdvertisement$AdData mInspireAdIn = obj.mInspireAdInfo;
                   if (mInspireAdIn != null) {
                      mNeoReportIn = mInspireAdIn.mNeoReportInfo;
                   label_0075 :
                      PhotoAdvertisement$InspireAdInfo inspireAdInf = mNeoReportIn;
                      if (inspireAdInf != null) {
                         inspireAdInf.mIsReportRequesting = b;
                      }
                      f uof = new f(c.g, BusinessType.NEO_VIDEO, NeoAppAdvanceReportUtil$requestNeoReport$1.INSTANCE, null, 8, null);
                      h oh = new h(p1, 0, 0, id, null, 22, null);
                      b.a().a(a.a.q(v1)).compose(v14).map(new e()).map(NeoAppAdvanceReportUtil$a.b).doFinally(new NeoAppAdvanceReportUtil$b(inspireAdInf)).subscribe(new NeoAppAdvanceReportUtil$c(obj1, inspireAdInf), new NeoAppAdvanceReportUtil$d(obj1));
                      return;
                   }
                }
                mNeoReportIn = null;
                goto label_0075 ;
             }
          }
       }
       mNeoParams = "";
       goto label_0052 ;
    }
}
