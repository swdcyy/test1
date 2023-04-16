package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g;
import c37.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import hea.a;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$a;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$b;
import vda.e;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;
import mea.c;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.a;
import brd.t;
import t45.d;
import brd.z;
import vda.h;
import erd.g;
import crd.b;
import df5.b;
import hf5.b;
import qvb.q;
import sy6.a;
import androidx.viewpager.widget.ViewPager$i;
import df5.e;
import hf5.g;
import vda.g;
import hf5.a;
import e50.m;
import b37.b;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import lea.f;
import lea.b;
import wkd.b;
import qea.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PhotoPrefetchLogManager;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PrefetchPhotoInfo;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import p5a.d;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.DownloadPhotoInfo;
import o56.a;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.ConsumePhotoInfo;
import java.lang.System;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import com.kwai.video.hodor.Hodor;
import com.kwai.framework.network.monitor.NetworkTypeMonitor;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import m9a.w;
import java.lang.StringBuilder;
import pea.b;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import k2b.u1;
import vda.i;
import java.lang.Runnable;
import vda.j;
import vda.k;
import iea.o;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$d;
import java.lang.Enum;
import java.lang.Boolean;
import mea.b;
import java.util.concurrent.TimeUnit;
import vda.f;
import com.kuaishou.live.common.core.basic.tools.h;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;
import m56.f;
import c37.c;

public class g extends PresenterV2 implements d	// class@000f3c
{
    public UsePrefetchReason A;
    public c B;
    public b C;
    public boolean D;
    public final Handler E;
    public QPhoto F;
    public QPhoto G;
    public QPhoto H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public List O;
    public boolean P;
    public a Q;
    public final q R;
    public final b S;
    public final e T;
    public final ViewPager$i U;
    public a p;
    public g q;
    public b r;
    public a s;
    public MilanoContainerEventBus t;
    public m u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void g(){
       super();
       this.D = false;
       this.E = new Handler(Looper.getMainLooper());
       this.I = false;
       this.J = false;
       this.O = new ArrayList();
       this.P = false;
       this.Q = new a();
       this.R = new g$a(this);
       this.S = new g$b(this);
       this.T = new e(this);
       this.U = new g$c(this);
    }
    public void D0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "6")) {
          return;
       }
       g tQ = this.Q;
       Objects.requireNonNull(tQ);
       if (!PatchProxy.applyVoid(objArray, tQ, a.class, "1")) {
          tQ.a = SystemClock.elapsedRealtime();
       }
       this.S8("enter_elevator");
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       c uoc = c.f();
       this.B = uoc;
       if (uoc != null && uoc.mEnablePoorNetworkOpt != null) {
          this.v = true;
          this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new h(this)));
          this.r.De(this.S);
          this.p.e(this.R);
          this.p.i(this.U);
          uoc = this.B.mTriggerPrefetchAfterVideoCount;
          if (uoc != -1) {
             this.K = uoc;
          }
          this.q.L5(this.T);
          this.X7(this.q.m().subscribe(new g(this)));
          g ts = this.s;
          if (ts != null) {
             this.u = ts.J9();
          }
          if (!PatchProxy.applyVoidOneRefs(this, null, b.class, "1")) {
             a.p(this, "listener");
             b.a.add(this);
          }
       }
    label_0090 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       if (this.v != null) {
          this.r.c3(this.S);
          this.p.b(this.R);
          this.p.g(this.U);
          this.q.p8(this.T);
       }
       this.d9();
       if (!PatchProxy.applyVoidOneRefs(this, null, b.class, "2")) {
          a.p(this, "listener");
          b.a.remove(this);
       }
       return;
    }
    public final void P8(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "11")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          if (uof != null && uof.mQPhoto != null) {
             b.a(-622777217).b(uof.mQPhoto.getPhotoId(), p1);
          }
       }
       return;
    }
    public final void R8(List p0,List p1,int p2,String p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, g.class, "13")) {
          return;
       }
       for (int i = 0; i < p0.size(); i = i + 1) {
          QPhoto qPhoto = p0.get(i);
          PrefetchPhotoInfo prefetchPhot = b.a(0x31d4e985).a(qPhoto.getPhotoId());
          if (prefetchPhot == null) {
             prefetchPhot = new PrefetchPhotoInfo();
             prefetchPhot.mPhotoId = qPhoto.getPhotoId();
             prefetchPhot.mPhotoHetu = g.g(qPhoto);
             prefetchPhot.mPhotoType = qPhoto.getType();
             prefetchPhot.mMediaType = d.a(qPhoto);
             DownloadPhotoInfo uDownloadPho = new DownloadPhotoInfo();
             prefetchPhot.mDownloadPhotoInfo = uDownloadPho;
             uDownloadPho.mAppVer = a.m;
             uDownloadPho.mReason = "UNKNOWN";
          }
          ConsumePhotoInfo uConsumePhot = new ConsumePhotoInfo();
          prefetchPhot.mConsumePhotoInfo = uConsumePhot;
          uConsumePhot.mStatus = "USED";
          uConsumePhot.mAppVer = a.m;
          uConsumePhot.mReason = p3;
          uConsumePhot.mTime = System.currentTimeMillis();
          prefetchPhot.mConsumePhotoInfo.mSystemClockTime = SystemClock.elapsedRealtime();
          prefetchPhot.mConsumePhotoInfo.mSize = g.f(qPhoto);
          prefetchPhot.mConsumePhotoInfo.mHlsSegCnt = g.d(qPhoto);
          prefetchPhot.mConsumePhotoInfo.mIsFullyCache = g.i(qPhoto);
          int i1 = b.a(-622777217).p() - p0.size();
          prefetchPhot.mConsumePhotoInfo.mCachePoolSize = i1;
          i1 = p2 + i;
          prefetchPhot.mConsumePhotoInfo.mReplacedIndex = i1;
          if (!q.f(p1)) {
             qPhoto = p1.get(i);
             prefetchPhot.mConsumePhotoInfo.mReplacedPhotoId = qPhoto.getPhotoId();
             prefetchPhot.mConsumePhotoInfo.mReplacedPhotoCacheSize = g.f(qPhoto);
             prefetchPhot.mConsumePhotoInfo.mReplacedPhotoHetu = g.g(qPhoto);
          }
          prefetchPhot.mConsumePhotoInfo.mNetScore = NetworkQualityEstimator.b();
          prefetchPhot.mConsumePhotoInfo.mCdnNetSpeed = Hodor.instance().getNetSpeedKbpsForPreload();
          prefetchPhot.mConsumePhotoInfo.mNetSessionId = b.a(0x34606e83).a();
          prefetchPhot.mConsumePhotoInfo.mPoorNetSessionId = b.a(-953099949).d();
       }
       return;
    }
    public void S8(String p0){
       int netSpeedKbps;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "21")) {
          return;
       }
       String str = null;
       if (w.b()) {
          b.d("current net disconnection, reason: "+p0);
       }else {
          String str1 = " reason: ";
          if (this.B.mCdnNetSpeedThreshold > null) {
             netSpeedKbps = Hodor.instance().getNetSpeedKbpsForPreload();
             b.d("current net speed: "+netSpeedKbps+" kbps mNetSpeedThreshold: "+this.B.mCdnNetSpeedThreshold+str1+p0);
             if (netSpeedKbps >= this.B.mCdnNetSpeedThreshold) {
             label_00f0 :
                if (str != null) {
                   if (this.B.mEnableUsePrefetchFistPage != null) {
                      b.d("current network is poor, directly replace photo");
                      this.E.post(new i(this));
                   }else if(this.L != null && this.O.size() > this.M){
                      b.d("current network is poor, replace photo");
                      this.E.post(new j(this));
                   }else if(this.p.j() == this.p.Z()){
                      b.d("first page, and last photo, replace photo");
                      this.E.post(new k(this));
                   }else {
                      b.d("first page, but not last photo, don\'t replace photo");
                   }
                }
                if (!this.a9() || (!PatchProxy.applyVoid(null, this, og, "26") && this.a9())) {
                   RxBus.f.b(new o("not_enough_in_good_net"));
                }
             label_016a :
                return;
             }
          }else if(("enter_elevator").equals(p0) && this.B.mEnableUseLinkTurboSDK != null){
             netSpeedKbps = NetworkQualityEstimator.b();
             b.d("current net score: "+netSpeedKbps+" mNetSpeedThreshold: "+this.B.mNetSpeedThreshold+str1+p0);
             if (netSpeedKbps < this.B.mNetSpeedThreshold) {
                g tQ = this.Q;
                Objects.requireNonNull(tQ);
                a uoa = a.class;
                if (!PatchProxy.applyVoid(null, tQ, uoa, "2")) {
                   if (tQ.a - null > 0) {
                      str = 1;
                   }
                   if (str != null) {
                      if (!PatchProxy.applyVoid(null, tQ, uoa, "3")) {
                         i3 oi3 = i3.f();
                         oi3.c("trigger_time_interval", Long.valueOf((SystemClock.elapsedRealtime() - tQ.a)));
                         u1.R("DIFF_ELEVATOR_NETSCORE", oi3.e(), 14);
                      }
                      tQ.a = -1;
                   }
                }
             }else {
                goto label_00f0 ;
             }
          }
       }
       str = 1;
       goto label_00f0 ;
    }
    public final String V8(UsePrefetchReason p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = g$d.a[p0.ordinal()];
       if (i == 1) {
          return "photo_used_for_no_net";
       }
       if (i != 2) {
          return "photo_used_first_play";
       }
       return "photo_used_for_poor_net";
    }
    public final String W8(List p0,String p1){
       StringBuilder obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return "null";
       }
       obj = new StringBuilder(300)+p1+" photos: ";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (qPhoto != null) {
             obj = obj+qPhoto.getPhotoId()+" "+qPhoto.getUserName()+"; ";
          }
       }
       return obj;
    }
    public final String X8(List p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return "null";
       }
       obj = new StringBuilder(300)+"Photos: ";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          if (uof != null) {
             b mQPhoto = uof.mQPhoto;
             if (mQPhoto != null) {
                obj = obj+mQPhoto.getPhotoId()+" "+uof.mQPhoto.getUserName()+"; ";
             }
          }
       }
       return obj;
    }
    public boolean Y8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (g.i(p0)) {
          return b;
       }
       if (g.f(p0) - c.g() >= 0) {
          b.d("photo id: "+p0.getPhotoId()+" userName: "+p0.getUserName()+" cacheSize >= mPreloadBytes");
          return b;
       }else {
          b.d("photo id: "+p0.getPhotoId()+" userName: "+p0.getUserName()+" cacheSize < mPreloadBytes");
          return false;
       }
    }
    public final boolean Z8(int p0,QPhoto p1){
       StringBuilder obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, og, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = null;
       if (p1.isAd()) {
          b.d("next  "+(p0 + 1)+"  photo is ad, "+p1.getPhotoId()+" "+p1.getUserName());
          return 1;
       }else if(p1.isLiveStream()){
          b.d("next  "+(p0 + 1)+" photo is live, "+p1.getPhotoId()+" "+p1.getUserName());
          return 1;
       }else if(!p1.isVideoType()){
          b.d("next  "+(p0 + 1)+" photo is non-video, "+p1.getPhotoId()+" "+p1.getUserName());
          return 1;
       }else {
          return obj;
       }
    }
    public boolean a9(){
       int b1;
       int i;
       int i1;
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, this, g.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.B == null) {
          return b;
       }
       obj = PatchProxy.apply(null, null, uoc, "7");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(c.e() != null && c.e().mEnableIncreaseFrequency != null){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1) {
          return b;
       }else {
          b1 = b.a(-622777217).p();
          Object obj1 = PatchProxy.apply(null, null, uoc, "8");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          }else if(c.e() == null){
             i = 0;
          }else {
             i = c.e().mPrefetchLimit;
          }
          if (b1 > i) {
             return b;
          }else {
             b1 = NetworkQualityEstimator.b();
             Object obj2 = PatchProxy.apply(null, null, uoc, "9");
             if (obj2 != PatchProxyResult.class) {
                i1 = obj2.intValue();
             }else if(c.e() == null){
                i1 = 101;
             }else {
                i1 = c.e().mPrefetchNetScoreThreshold;
             }
             if (b1 >= i1) {
                b = true;
             }
             return b;
          }
       }
    }
    public final void b9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "14")) {
          return;
       }
       if (this.B.mEnableDeletePhotoWhenRealShow != null && !q.f(p0)) {
          b.a(-622777217).d(p0);
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, g.class, "20")) {
          return;
       }
       long l = 0;
       if (this.B.mNetMonitorTimerInterval - l > 0 && this.D == null) {
          b.d("start poor net monitor");
          c mNetMonitorF = this.B.mNetMonitorForbiddenTime;
          if (mNetMonitorF - l >= 0) {
             l = mNetMonitorF;
          }
          g tC = this.C;
          if (tC == null || tC.isDisposed()) {
             b uob = t.interval(l, this.B.mNetMonitorTimerInterval, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(this), h.b);
             this.C = uob;
             this.X7(uob);
          }
          this.D = true;
       }
       return;
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, g.class, "22")) {
          return;
       }
       g tC = this.C;
       if (tC != null) {
          if (!tC.isDisposed()) {
             this.C.dispose();
          }
          this.C = null;
          this.D = false;
       }
       return;
    }
    public void e9(UsePrefetchReason p0){
       f uof;
       QPhoto qPhoto;
       StringBuilder str8;
       String str9;
       String str10;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       Iterator iterator2;
       f uof1;
       b mQPhoto1;
       int i3;
       int i4;
       QPhoto qPhoto1;
       f uof2;
       Iterator iterator3;
       f uof3;
       b mQPhoto2;
       g this;
       int i5;
       int i6;
       int i7;
       String str13;
       int i8;
       ArrayList uArrayList3;
       ArrayList uArrayList4;
       int i9;
       QPhoto qPhoto2;
       boolean b3;
       String str14;
       ArrayList uArrayList5;
       ArrayList uArrayList6;
       f uof4;
       b mQPhoto3;
       boolean b = this;
       QPhoto obj = p0;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, og, "7")) {
          return;
       }
       if (b.x == null) {
          b.d("first item not show");
          return;
       }else {
          String str = "in side profile";
          if (b.p.r()) {
             b.d(str);
             return;
          }else if(b.J != null){
             b.d(str);
             return;
          }else {
             int i = 1;
             List list = b.a(-622777217).o(b.B.mPoorNetConsumeLimit, i, c.a());
             if (q.f(list)) {
                b.d("no prefetch photo can consume");
                return;
             }else if(b.y != null && b.B.mEnableLoadingReplace == null){
                b.z = i;
                b.A = obj;
                b.d("feed is loading, retry later");
                return;
             }else {
                b.J = i;
                boolean b1 = false;
                b.z = b1;
                UsePrefetchReason usePrefetchR = null;
                b.A = usePrefetchR;
                b.H = b.p.getCurrentPhoto();
                int i1 = b.p.a0();
                StringBuilder str1 = "currentPhoto: ";
                g h = b.H;
                String str2 = "null";
                str = (h == null)? str2: h.toString();
                StringBuilder str3 = ", ";
                str1 = str1+str+str3;
                h = b.H;
                if (h != null) {
                   str2 = h.getUserName();
                }
                b.d(str1+str2+", currentRealPosition = "+i1);
                String str4 = "SlidePoorNetworkVideoPlayOptP";
                int i2 = -1;
                if (b.B.mDisableInsertAtLast == null && b.p.j() == b.p.Z()) {
                   b.d("last photo, insert behind "+i1);
                   if (!PatchProxy.applyVoidTwoRefs(list, obj, b, og, "8")) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         uof = iterator.next();
                         if (uof != null) {
                            b mQPhoto = uof.mQPhoto;
                            if (mQPhoto != null) {
                               mQPhoto.setListLoadSequenceID(uof.mLlsid);
                               mQPhoto.setPrefetchReason(p0.getReason());
                               uArrayList.add(mQPhoto);
                            }
                         }
                      }
                      if (q.f(uArrayList)) {
                         b.d("insert fail, qPhoto list is empty");
                      }else {
                         b.d("insert "+uArrayList.size()+" photos");
                         iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            qPhoto = iterator.next();
                            b.d("insert photo: "+qPhoto.getPhotoId()+"  "+qPhoto.getUserName());
                         }
                         h = b.H;
                         if (h != null && h.equals(b.F)) {
                            b.d("attach photo not change, do insert photo");
                            b.p.m(i2, uArrayList, str4);
                            b.P8(list, "poor_net_insert");
                            str = this.V8(p0)+"_at_last";
                            b.R8(uArrayList, usePrefetchR, (b.p.a0() + i), str);
                            Iterator iterator1 = list.iterator();
                            while (iterator1.hasNext()) {
                               uof = iterator1.next();
                               if (uof != null) {
                                  uof.mDiscardReason = str;
                               }
                            }
                            if (b.B.mEnableDeletePhotoWhenRealShow == null) {
                               g.b(list, i);
                            }else {
                               b.b9(list);
                            }
                            if (b.B.mEnablePreloadPlayer != null) {
                               b.t.x.onNext(Integer.valueOf(i));
                            }
                            b.d("insert photo success");
                         }else {
                            b.d("attach photo changed, cancel this insert");
                         }
                      }
                   }
                   b.J = b1;
                   return;
                }else {
                   g b2 = b.B;
                   String str5 = "poor_net_replace";
                   String boolean str6 = " ";
                   str2 = " photo is null";
                   String str7 = "next  ";
                   if (b2.mReplaceOpt != null && b2.mRankPhotoCount > i) {
                      b.d("need usePrefetchPhoto, rankPhotoCount: "+b.B.mRankPhotoCount);
                      b2 = b.F;
                      if (b2 != null && b2.equals(b.G)) {
                         b.d("photo not change,do not replace");
                      }else if(PatchProxy.isSupport(og)){
                         str8 = str2;
                         str9 = str6;
                         str10 = str5;
                         if (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(i1), list, p0, this, g.class, "10")) {
                         }
                      }else {
                         str8 = str2;
                         str9 = str6;
                         str10 = str5;
                      }
                   }else {
                      str8 = str2;
                      String str11 = str6;
                      String str12 = str5;
                      b.d("need usePrefetchPhoto, checkPhotoCount: "+b.B.mCheckPhotoCount);
                      if (PatchProxy.isSupport(og)) {
                         str10 = str12;
                         if (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(i1), list, p0, this, g.class, "9")) {
                         }
                      }else {
                         str10 = str12;
                         g og1 = -1;
                      }
                   }
                }
             }
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.s = this.q8(a.class);
       this.p = this.q8(a.class);
       this.q = this.q8(g.class);
       this.r = this.q8(b.class);
       this.t = this.q8(MilanoContainerEventBus.class);
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       b.d("to background");
       this.d9();
       return;
    }
    public void r3(){
       c.a(this);
    }
}
