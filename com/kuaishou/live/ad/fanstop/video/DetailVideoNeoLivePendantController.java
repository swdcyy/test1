package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$a;
import nsd.u;
import android.app.Activity;
import android.view.View;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown$SCENE;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$mAdNeoPendantView$2;
import msd.a;
import qrd.p;
import qrd.s;
import crd.a;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import java.lang.StringBuilder;
import yx.j0;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import usd.q;
import java.lang.Boolean;
import lnc.y0;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import lnc.a1;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$b;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import mxb.j0;
import mxb.i0;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$c;
import erd.g;
import ftd.k0;
import ftd.l0;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$onCountDownEnd$2;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$onNeoReportFail$1;
import tl0.d;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$d;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$onNeoReportSuccess$1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$e;
import g59.k0;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$f;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$g;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$requestNeoReward$1;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import dsd.a;
import u49.c;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$h;
import ftd.k;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$i;
import csd.b;
import dsd.e;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import msd.l;
import dm9.a;
import java.util.Objects;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1;
import ekd.k1;
import java.util.concurrent.CancellationException;

public final class DetailVideoNeoLivePendantController implements NeoLiveCountDown	// class@0009c2
{
    public long a;
    public String b;
    public AtomicBoolean c;
    public boolean d;
    public c e;
    public final PhotoAdvertisement$FanstopLiveInfo f;
    public final LiveAdNeoParam g;
    public AtomicBoolean h;
    public final p i;
    public a j;
    public k0 k;
    public k0 l;
    public final int m;
    public final Activity n;
    public final View o;
    public final BaseFeed p;
    public final String q;
    public final NeoLiveCountDown$SCENE r;
    public static final DetailVideoNeoLivePendantController$a s;

    static {
       DetailVideoNeoLivePendantController.s = new DetailVideoNeoLivePendantController$a(null);
    }
    public void DetailVideoNeoLivePendantController(Activity p0,View p1,BaseFeed p2,String p3,NeoLiveCountDown$SCENE p4){
       PhotoAdvertisement$FanstopLiveInfo mFeedFlowAdN;
       PhotoAdvertisement$InspireAdInfo mNeoParams;
       a.p(p0, "mActivity");
       a.p(p1, "mRootView");
       a.p(p2, "mFeed");
       a.p(p3, "mVideoLivePendantId");
       a.p(p4, "mScene");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       boolean b = false;
       this.c = new AtomicBoolean(b);
       this.h = new AtomicBoolean(b);
       this.i = s.c(new DetailVideoNeoLivePendantController$mAdNeoPendantView$2(this));
       this.j = new a();
       PhotoAdvertisement photoAdverti = p2.get("AD");
       PhotoAdvertisement photoAdverti1 = null;
       PhotoAdvertisement mAdLiveForFa = (photoAdverti != null)? photoAdverti.mAdLiveForFansTop: photoAdverti1;
       this.f = mAdLiveForFa;
       if (photoAdverti != null) {
          PhotoAdvertisement mAdLiveForFa1 = photoAdverti.mAdLiveForFansTop;
          if (mAdLiveForFa1 != null) {
             mFeedFlowAdN = mAdLiveForFa1.mFeedFlowAdNeoParam;
          label_0062 :
             this.g = mFeedFlowAdN;
             if (mAdLiveForFa != null) {
                mFeedFlowAdN = mAdLiveForFa.mAdData;
                if (mFeedFlowAdN != null) {
                   PhotoAdvertisement$AdData mInspireAdIn = mFeedFlowAdN.mInspireAdInfo;
                   if (mInspireAdIn != null) {
                      mNeoParams = mInspireAdIn.mNeoParams;
                   label_0072 :
                      this.b = mNeoParams;
                      long l = (mAdLiveForFa != null)? TimeUnit.MILLISECONDS.toSeconds(mAdLiveForFa.mFansTopAwardBonusTime): 0;
                      this.a = l;
                      int i = (p4 == NeoLiveCountDown$SCENE.DETAIL_VIDEO)? 22: 13;
                      this.m = i;
                      if (photoAdverti != null) {
                         photoAdverti1 = photoAdverti.mAdGroup;
                      }
                      if (photoAdverti1 == PhotoAdvertisement$AdGroup.AD_SOCIAL) {
                         Object[] objArray = new Object[b];
                         j0.c("DetailVideoNeoLivePendantController", "Unexpected adgroup: "+photoAdverti.mCreativeId, objArray);
                      }
                      return;
                   }
                }
             }
             mNeoParams = photoAdverti1;
             goto label_0072 ;
          }
       }
       mFeedFlowAdN = photoAdverti1;
       goto label_0062 ;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailVideoNeoLivePendantController.class, "11")) {
          return;
       }
       if (p0 != null) {
          this.j.c(p0);
       }
       return;
    }
    public final long b(){
       LiveAdNeoParam$TaskInfoParam mNeoNextUnse;
       DetailVideoNeoLivePendantController obj = PatchProxy.apply(null, this, DetailVideoNeoLivePendantController.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.g;
       if (obj != null) {
          LiveAdNeoParam mTaskInfoPar = obj.mTaskInfoParam;
          if (mTaskInfoPar != null) {
             mNeoNextUnse = mTaskInfoPar.mNeoNextUnsealTimestampMs;
          label_0022 :
             Long obj1 = b.a(0x3b1f7b44);
             a.o(obj1, "Singleton.get\(HttpSntpClient::class.java\)");
             obj1 = obj1.a();
             if (obj1 == null) {
                obj1 = Long.valueOf(System.currentTimeMillis());
             }
             a.o(obj1, "Singleton.get\(HttpSntpCl¡­ystem.currentTimeMillis\(\)");
             return TimeUnit.MILLISECONDS.toSeconds(q.o((mNeoNextUnse - obj1.longValue()), 0));
          }
       }
       mNeoNextUnse = 0;
       goto label_0022 ;
    }
    public final boolean c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, DetailVideoNeoLivePendantController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       int i1 = y0.o(this.n) ^ i;
       int i2 = (this.a > 0)? 1: 0;
       DetailVideoNeoLivePendantController tf = this.f;
       if (tf != null) {
          objArray = Boolean.valueOf(tf.mHadEarnFansTopCoin);
       }
       boolean b = y0.p(objArray);
       if (!i1 || (!i2 || b)) {
          i = false;
       }
       return i;
    }
    public final LiveAdNeoPendantBaseView d(){
       Object obj = PatchProxy.apply(null, this, DetailVideoNeoLivePendantController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "23")) {
          return;
       }
       this.d().k(a1.p(R.string.arg_RES_7f102844), false);
       this.d().setOnClickListener(new DetailVideoNeoLivePendantController$b(this));
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "21")) {
          return;
       }
       i0.a().e(759, this.p).d(new DetailVideoNeoLivePendantController$c(this)).a();
       if (this.n(this.g)) {
          this.l();
       }else {
          a.f(l0.b(), null, null, new DetailVideoNeoLivePendantController$onCountDownEnd$2(this, null), 3, null);
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "28")) {
          return;
       }
       this.d().d(false, new DetailVideoNeoLivePendantController$onNeoReportFail$1(this));
       i0.a().e(805, this.p).d(new DetailVideoNeoLivePendantController$d(this)).a();
       return;
    }
    public final void h(ProvideNeoInfo$Data p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailVideoNeoLivePendantController.class, "27")) {
          return;
       }
       this.d().g(this.n(this.g), p0.mNeoAmount, new DetailVideoNeoLivePendantController$onNeoReportSuccess$1(this));
       DetailVideoNeoLivePendantController tf = this.f;
       boolean b = true;
       if (tf != null) {
          tf.mHadEarnFansTopCoin = b;
       }
       ProvideNeoInfo$Data mToast = p0.mToast;
       if (mToast != null && mToast.length()) {
          b = false;
       }
       if (b) {
          mToast = null;
       }
       if (mToast != null) {
          i.d(R.style.arg_RES_7f11066a, mToast);
       }
       i0.a().e(804, this.p).q("get_points_cnt", Long.valueOf(p0.mNeoAmount)).d(new DetailVideoNeoLivePendantController$e(this)).a();
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "19")) {
          return;
       }
       this.d().setOnClickListener(null);
       k0.e(this.d());
       this.d = false;
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "13")) {
          return;
       }
       i0.a().e(141, this.p).d(new DetailVideoNeoLivePendantController$f(this)).a();
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "12")) {
          return;
       }
       i0.a().e(140, this.p).d(new DetailVideoNeoLivePendantController$g(this)).a();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "24")) {
          return;
       }
       DetailVideoNeoLivePendantController tl = this.l;
       if (tl != null) {
          a.f(tl, null, null, new DetailVideoNeoLivePendantController$requestNeoReward$1(this, null), 3, null);
       }
       return;
    }
    public final Object m(long p0,c p1){
       LiveAdNeoParam$StartParam mH5NeoParams;
       int i = 1;
       l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p1), i);
       ol.u();
       DetailVideoNeoLivePendantController tf = this.f;
       PhotoAdvertisement$AdData uAdData = null;
       Boolean uBoolean = (tf != null)? a.a(tf.mHadEarnFansTopCoin): uAdData;
       if (y0.p(uBoolean)) {
          i = 2;
       }
       c uoc = b.a(0x3a268c29);
       DetailVideoNeoLivePendantController tb = this.b;
       DetailVideoNeoLivePendantController tg = this.g;
       if (tg != null) {
          LiveAdNeoParam mStartParam = tg.mStartParam;
          if (mStartParam != null) {
             mH5NeoParams = mStartParam.mH5NeoParams;
          label_0038 :
             DetailVideoNeoLivePendantController tf1 = this.f;
             if (tf1 != null) {
                PhotoAdvertisement$FanstopLiveInfo mAdData = tf1.mAdData;
                if (mAdData != null) {
                   uAdData = mAdData.mLiveStreamId;
                }
             }
             t ot = uoc.v(i, tb, mH5NeoParams, uAdData).map(new e());
             if (p0 - null > 0) {
                ot.timeout(p0, TimeUnit.SECONDS);
             }
             this.a(ot.subscribeOn(d.a).subscribe(new DetailVideoNeoLivePendantController$h(ol), new DetailVideoNeoLivePendantController$i(ol)));
             Object obj = ol.r();
             if (obj == b.h()) {
                e.c(p1);
             }
             return obj;
          }
       }
       mH5NeoParams = uAdData;
       goto label_0038 ;
    }
    public final boolean n(LiveAdNeoParam p0){
       NeoParamsBaseInfo mAutoReport;
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailVideoNeoLivePendantController.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.mStartParam;
          if (p0 != null) {
             LiveAdNeoParam$StartParam mNeoParamsLi = p0.mNeoParamsLiveInfo;
             if (mNeoParamsLi != null) {
                mAutoReport = mNeoParamsLi.mAutoReport;
             label_0021 :
                return mAutoReport;
             }
          }
       }
       mAutoReport = false;
       goto label_0021 ;
    }
    public final void o(l p0){
       DetailVideoNeoLivePendantController uDetailVideo = DetailVideoNeoLivePendantController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDetailVideo, "3")) {
          return;
       }
       if (!this.c()) {
          return;
       }
       if (this.h.get()) {
          Object[] objArray = new Object[0];
          j0.c("DetailVideoNeoLivePendantController", "Duplicate Pendant start", objArray);
          return;
       }else {
          this.h.set(true);
          a d = a.d;
          DetailVideoNeoLivePendantController tq = this.q;
          DetailVideoNeoLivePendantController tr = this.r;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidTwoRefs(tq, tr, d, a.class, "1")) {
             a.p(tq, "videoLivePendantId");
             a.p(tr, "scene");
             a.b = tq;
             a.c = tr;
          }
          this.k = l0.b();
          this.l = l0.b();
          if (!PatchProxy.applyVoidOneRefs(p0, this, uDetailVideo, "8")) {
             DetailVideoNeoLivePendantController tk = this.k;
             if (tk != null) {
                a.f(tk, null, null, new DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1(this, p0, null), 3, null);
             }
          }
          return;
       }
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "18")) {
          return;
       }
       this.d().c();
       this.d().g1();
       this.i();
       this.j.dispose();
       this.j = new a();
       k1.n(this);
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("DetailVideoNeoLivePendantController", "reset watched time", objArray);
       this.p();
       this.h.set(0);
       a.d.a();
       DetailVideoNeoLivePendantController tk = this.k;
       if (tk != null) {
          l0.f(tk, null, 1, null);
       }
       this.k = null;
       tk = this.l;
       if (tk != null) {
          l0.f(tk, null, 1, null);
       }
       this.l = null;
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "2")) {
          return;
       }
       this.o(null);
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, DetailVideoNeoLivePendantController.class, "4")) {
          return;
       }
       this.p();
       this.h.set(false);
       DetailVideoNeoLivePendantController tk = this.k;
       if (tk != null) {
          l0.f(tk, null, 1, null);
       }
       this.k = null;
       tk = this.l;
       if (tk != null) {
          l0.f(tk, null, 1, null);
       }
       this.l = null;
       return;
    }
}
