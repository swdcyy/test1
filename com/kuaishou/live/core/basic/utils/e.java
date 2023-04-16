package com.kuaishou.live.core.basic.utils.e;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import android.os.Build$VERSION;
import qka.a;
import rka.b;
import rka.d;
import android.view.Window;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import com.kwai.robust.PatchProxyResult;
import uj3.b$a;
import uj3.b;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import tkd.b;
import tkd.d;
import os5.c;
import xa2.k;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import id5.u;
import androidx.fragment.app.FragmentActivity;
import f12.d;
import f12.c;
import dw6.b;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import d12.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.b$a;
import com.kuaishou.live.core.basic.liveslide.b;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.activity.x;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.live.model.i;
import wa1.f;
import d61.g;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Throwable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u07.t$a;
import z12.p;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.c;
import w51.a;
import xf6.l;
import yxb.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import lnc.i3;
import android.os.SystemClock;
import k2b.u1;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import dq3.a;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import dq3.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import r12.g;
import kp.r1;
import u53.b;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public class e	// class@0008e6
{

    public void e(){
       super();
    }
    public static void a(LiveBizParam p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "28")) {
          return;
       }
       LiveBizParam mLiveStylePa = p0.mLiveStyleParams;
       if (mLiveStylePa.mHasAdaptFullscreen != null) {
          return;
       }
       mLiveStylePa.mHasAdaptFullscreen = true;
       if (mLiveStylePa.mShouldAdaptFullscreen != null) {
          if (Build$VERSION.SDK_INT >= 28 && a.a()) {
             b.b().a().b(p1.getWindow());
          }else {
             p0.mShouldAdaptFullscreen = false;
          }
       }
       return;
    }
    public static LivePlayerParam$Builder b(LiveStreamFeedWrapper p0,QLivePlayConfig p1){
       b$a obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.c(p1.isGamePatternType());
       return new LivePlayerParam$Builder().liveStreamId(p1.getLiveStreamId()).isCdnOverload(p1.mIsCdnOverload).shouldUseHardwareDecoding(b.e(p1)).qosMonitorConfig(b.b()).setEnableAutoUpdateViewSize(true).enableWebRTCManifest(obj.a).setNetworkRetryScene(d.a(0x4fb7d1af).F50()).setWebRTCConfig(obj.b).setIsPrivateLive(k.c(p0)).setIsPaidLive(p0.isPaidShowLive()).setAnchorId(p0.getUserId());
    }
    public static PhotoDetailParam c(GifshowActivity p0,Bundle p1,LiveStreamFeedWrapper p2,LiveAudienceParam p3){
       PhotoDetailParam obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailParam();
       if (p0 instanceof u && (p1 != null && p2 != null)) {
          int i = 0;
          if (c.c(p0).E()) {
             obj = b.j(p1).d("KEY_PHOTO_DETAIL_PARAM");
             i = b.j(p1).c("KEY_PAGE_INTERFACE", i);
          }
          obj.setSource(i);
       }else {
          obj = new PhotoDetailParam();
       }
       obj.getDetailCommonParam().setPreInfo(p3.mPreInfo);
       return obj;
    }
    public static void d(QLivePlayConfig p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "22")) {
          return;
       }
       if (p0 != null && !p0.isLandscape()) {
          int requestedOri = p1.getRequestedOrientation();
          if (requestedOri && (requestedOri != 6 && (requestedOri == 11 || requestedOri == 8))) {
             p1.setRequestedOrientation(1);
          }
       }
       return;
    }
    public static void e(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "13")) {
          return;
       }
       c.b(p0).s();
       return;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, e.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLimitLiveRoomNumberInActivity", false);
    }
    public static LiveBizParam g(Activity p0,Bundle p1){
       LiveBizParam liveBizParam;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof LiveSlideActivity) {
          liveBizParam = a.e(p0).a();
       }else if(c.b(p0).E()){
          liveBizParam = b.j(p1).d("liveBizParam");
       }else {
          liveBizParam = LiveBizParam.getBizParamFromBundle(p1);
       }
       if (liveBizParam == null) {
          liveBizParam = new LiveBizParam();
       }
       return liveBizParam;
    }
    public static QPhoto h(Activity p0){
       a$a obj = PatchProxy.applyOneRefs(p0, null, e.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof u) {
          return p0.getCurrentPhoto();
       }
       if (!p0 instanceof LiveSlideActivity) {
          return null;
       }
       a uoa = a.n(p0);
       obj = (uoa.j().a.a != null)? 1: null;
       if (!obj) {
          return null;
       }else {
          return uoa.j().h(uoa.h().a());
       }
    }
    public static int i(d p0,LiveBizParam p1,LiveAudienceParam p2,x p3,boolean p4){
       LiveAudienceParam mLiveSourceU;
       int i;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uoe, "29");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1.mIsAutoEnter != null && (p3 != null && p3.a())) {
          return 8;
       }else if(i.j(p2.mPhoto)){
          return 6;
       }else if(!p4){
          mLiveSourceU = p2.mLiveSourceUrl;
          if (mLiveSourceU != null && mLiveSourceU.startsWith("kwai://live/play/")) {
             return 7;
          }
       }
       mLiveSourceU = p2.mLiveSourceUrl;
       if (mLiveSourceU != null && (mLiveSourceU.startsWith("kwai://liveaggregatesquare") && (p2.mIndexInAdapter == null && p0.c() != 2))) {
          return 5;
       }else {
          i = p0.c();
          if (i == 1) {
             return 3;
          }else if(i == 2){
             return 2;
          }else {
             return 1;
          }
       }
    }
    public static String j(LiveStreamFeedWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a(p0);
    }
    public static int k(Activity p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (g.h(p0)) {
          return i;
       }else if(i.e(p0) && !p1){
          i = n.A(p0);
       }
       return i;
    }
    public static void l(KwaiException p0,Activity p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uoe, "9")) {
          return;
       }
       if (!g.i(p0)) {
          return;
       }
       if (p0.getErrorCode() == 0x13c7d || (p0.getErrorCode() == 0x13c83 && !TextUtils.x(p0.mErrorMessage))) {
          p0 = p0.mErrorMessage;
          if (!PatchProxy.applyVoidTwoRefs(p1, p0, null, uoe, "8") && p1 != null) {
             t$a uoa = new t$a(p1);
             uoa.X0(p0);
             uoa.S0(R.string.arg_RES_7f1012a9);
             uoa.u0(new p(p1));
             uoa.A(false);
             t$a uoa1 = f.e(uoa);
             uoa1.v(true);
             uoa1.k().Z();
          }
       }else {
          p1.finish();
       }
       return;
    }
    public static boolean m(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isFinishing())? true: false;
       return b;
    }
    public static boolean n(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && p0.startsWith("~"))? true: false;
       return b;
    }
    public static boolean o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, e.class, "37");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "119");
       boolean b = false;
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("enableClickPreCreatePlayerOpt", b);
       if (!i) {
          return a.t().u("SOURCE_LIVE").d("enableLivePlayerPreloadOpt", b);
       }else if(i == 1){
          b = true;
       }
       return b;
    }
    public static boolean p(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, e.class, "31");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "110");
       boolean b = false;
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("enableLivePlayPresenterScatter", b);
       if (!i) {
          return a.t().u("SOURCE_LIVE").d("enableLivePlayPresenterScatter", b);
       }else if(i == 1){
          b = true;
       }
       return b;
    }
    public static boolean q(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, e.class, "32");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "111");
       boolean b = false;
       boolean i = (obj != patchProxyRe)? obj.intValue(): l.e("enableLivePlayPresenterScatterOnSlide", b);
       if (!i) {
          i = a.t().u("SOURCE_LIVE").d("enableLivePlayPresenterScatterOnSlide", b);
       }else if(i == 1){
          i = true;
       }else {
          i = false;
       }
       if (i && e.p()) {
          b = true;
       }
       return b;
    }
    public static boolean r(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (d.a(-430326918).cR(p0)) {
          return b;
       }
       if (!p0 instanceof LiveSlideActivity) {
          return false;
       }
       LiveBizParam liveBizParam = a.e(p0).a();
       if (liveBizParam == null || liveBizParam.mIsSoloLiveStream != null) {
          b = false;
       }
       return b;
    }
    public static boolean s(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.a(-430326918).cR(p0) || p0 instanceof LiveSlideActivity)? true: false;
       return b;
    }
    public static void t(long p0,int p1,String p2,LiveStreamFeed p3){
       String id;
       String str1;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, p3, null, e.class, "24")) {
          return;
       }
       String str = null;
       if (p3 != null) {
          LiveStreamFeed mUser = p3.mUser;
          if (mUser != null && !TextUtils.x(mUser.getId())) {
             id = p3.mUser.getId();
          }else if(e.n(p2) && p2 != null){
             id = p2.substring(1);
          }else {
             id = str;
          }
       }else {
          goto label_0037 ;
       }
       if (p3 != null) {
          LiveStreamFeed mConfig = p3.mConfig;
          if (mConfig != null && !TextUtils.x(mConfig.getLiveStreamId())) {
             p2 = p3.mConfig.getLiveStreamId();
          }else if(e.n(p2)){
             p2 = str;
          }
       }else {
          goto label_005c ;
       }
       i3 oi3 = i3.f();
       oi3.d("live_stream_id", TextUtils.k(p2));
       oi3.d("anchor_user_id", TextUtils.k(id));
       oi3.c("time_cost", Long.valueOf((SystemClock.elapsedRealtime() - p0)));
       if (p1 != 1) {
          if (p1 != 7) {
             str1 = (p1 != 8)? "null": "FAIL";
          }else {
             str1 = "SUCCESS";
          }
       }else {
          str1 = "START";
       }
       oi3.d("status", str1);
       u1.R("LIVE_PLAY_LAUNCH_REQUEST", oi3.e(), 3);
       return;
    }
    public static void u(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "26")) {
          return;
       }
       c0.q().n(a.a(p0));
       return;
    }
    public static void v(LivePlayActivity p0,LiveStreamFeed p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, e.class, "20")) {
          return;
       }
       e.w(p0, p1, p2, null, null);
       return;
    }
    public static void w(LivePlayActivity p0,LiveStreamFeed p1,int p2,String p3,String p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoe, "21")) {
             return;
          }
       }
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p1);
       uoa.g(b.a(p2, p1, null, null, null));
       uoa.o(p3);
       uoa.f(p4);
       g.j(p1);
       g.h(p0, b.j(p1.mConfig, r1.U1(p1)), p1);
       LivePlayFragment livePlayFrag = LivePlayFragment.Mh(uoa.a());
       e.d(p1.mConfig, p0);
       LiveStreamFeedWrapper liveStreamFe = new LiveStreamFeedWrapper(p1);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidTwoRefs(livePlayFrag, liveStreamFe, p0, LivePlayActivity.class, "8") && livePlayFrag != null) {
          p0.A = liveStreamFe;
          e uoe1 = p0.getSupportFragmentManager().beginTransaction();
          uoe1.v(R.id.fragment_container, livePlayFrag);
          uoe1.m();
       }
       p0.S2(livePlayFrag);
       p0.b2(1);
       return;
    }
    public static boolean x(LiveBizParam p0){
       boolean b = (p0 != null && p0.mLiveStyleParams.mShouldAdaptFullscreen != null)? true: false;
       return b;
    }
}
