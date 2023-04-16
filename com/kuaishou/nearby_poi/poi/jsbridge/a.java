package com.kuaishou.nearby_poi.poi.jsbridge.a;
import sn4.b;
import java.lang.Object;
import com.kwai.poi.service.model.JsPoiParams;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.poi.api.constant.PoiErrorInfo;
import android.os.Bundle;
import ok7.a;
import mk7.a;
import com.kwai.poi.service.model.KLocation;
import ee6.a;
import lk7.a;
import android.app.Activity;
import com.kuaishou.nearby_poi.poi.model.JsOpenDetailParams;
import tkd.b;
import tkd.d;
import wm5.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.nearby_poi.poi.model.OpenDetailExtParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.nearby_poi.poi.http.a;
import qvb.a;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.detail.slideplay.c;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.nearby.NearbyParam;
import erb.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import java.lang.Long;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import android.view.View;
import vm5.o;
import java.lang.Integer;
import java.util.ArrayList;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import ie6.a$a;
import com.kwai.poi.service.utils.PoiServicesUtilsKt;
import ie6.a;
import com.kuaishou.nearby_poi.poi.jsbridge.a$b;
import com.kwai.framework.poi.manager.a;
import com.kuaishou.nearby_poi.poi.LocalLifeUrlParams;
import lr3.f;
import com.kuaishou.nearby_poi.poi.model.LocalLifeLoggerParams;
import lr3.b;
import sn4.c;
import mr3.b;
import java.util.Map;
import java.lang.Throwable;
import nr3.a;
import q87.c;
import com.yxcorp.utility.SystemUtil;
import lr3.e;
import com.kuaishou.nearby_poi.poi.model.LocalLifeHalfContainerParams;
import xw5.a;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import com.kuaishou.nearby_poi.poi.model.LoadWebViewParams;
import com.kuaishou.nearby_poi.poi.manager.MTWebViewManager;
import java.util.Objects;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import fg6.a;
import com.google.gson.Gson;
import com.google.common.collect.ImmutableMap;
import c87.a;
import java.lang.Boolean;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import java.util.List;
import com.kuaishou.nearby_poi.poi.manager.MTWebViewManager$LifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.activity.ComponentActivity;
import org.greenrobot.eventbus.a;
import com.kuaishou.webkit.WebView;
import java.util.HashMap;
import com.kwai.locallife.config.LocalLifeLiveMeiTuanBiz;
import lr3.d;
import sn4.a;
import com.kuaishou.nearby_poi.poi.model.LlhcRNViewReadyParams;
import com.yxcorp.gifshow.util.rx.RxBus;
import sw5.a;
import android.content.Context;
import com.kuaishou.nearby_poi.poi.model.PoiCommentElementParams;
import sw5.d;
import kotlin.jvm.internal.a;
import com.kwai.framework.poi.api.model.PoiRecallMode;
import java.lang.Double;
import me6.j;
import ke6.b;
import nsd.u;
import sn4.d;
import msd.l;
import com.kwai.locallife.model.LocalLifeGlobalEvent;
import com.kwai.locallife.model.LocalLifeGlobalEvent$LocalLifeData;
import com.kwai.locallife.model.LocalLifeGlobalEvent$LocalLifeData$AdditionInfo;
import js6.a;
import com.kwai.framework.model.locallife.LiveLocalLifeUpdateBizStatusModel;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import com.kuaishou.nearby_poi.poi.model.LocalLifeJinJingParams;
import mr3.a;
import com.kuaishou.nearby_poi.poi.model.PoiOpenLiveFeedParams;
import java.util.Collection;
import ekd.q;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.kuaishou.nearby_poi.poi.jsbridge.a$a;

public class a implements b	// class@000a24
{

    public void a(){
       super();
    }
    public void Aa(JsPoiParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       if (p0 == null) {
          PoiErrorInfo pARAMS_ERROR = PoiErrorInfo.PARAMS_ERROR;
          int errCode = pARAMS_ERROR.getErrCode();
          p1.a(errCode, pARAMS_ERROR.getErrMsg(), null);
          return;
       }else if(a.a.a(p0, p1)){
          return;
       }else {
          a.b(p0.poiBiz, p0.poiSubBiz, p0.isCitySearch, p0.poiIds, p0.extParams, p0.location, p0.pcursor, new a(p1));
          return;
       }
    }
    public void C8(Activity p0,JsOpenDetailParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       d.a(0x66aa3a58).Jk(p0, p1.mQPhoto);
       return;
    }
    public void D9(Activity p0,JsOpenDetailParams p1){
       Object obj = this;
       Object obj1 = p0;
       NasaSlideParam$a obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, a.class, "4")) {
          return;
       }
       JsOpenDetailParams mQPhoto = obj2.mQPhoto;
       JsOpenDetailParams mExtParams = obj2.mExtParams;
       if (!obj1 instanceof GifshowActivity || (mQPhoto != null && mExtParams.valid())) {
          a uoa = new a(obj.Na(mExtParams.mPhotoId), obj.Na(mExtParams.mUrl), obj.Na(mExtParams.mParam), obj.Na(mExtParams.mParsePath), TextUtils.n("sidebar", mExtParams.mPage));
          v5.add(mQPhoto);
          b uob = b.g(j.e(v5, f.b(null), c.i(1001, mQPhoto)));
          uob.n();
          String str = uob.id();
          PhotoDetailParam photoDetailP = new PhotoDetailParam(mQPhoto).setSource(1001).setPhotoIndex(mExtParams.mIndex);
          photoDetailP.getDetailLogParam().setSchemaInfo(mExtParams.mH5Page, "");
          if (!TextUtils.x(str)) {
             photoDetailP.setSlidePlayId(str);
          }
          photoDetailP.getSlidePlayConfig().setEnablePullRefresh(false);
          photoDetailP.setBizType(4);
          NearbyParam nearbyParam = new NearbyParam();
          nearbyParam.setMPoiParams(obj2.mExtParams.convert2PoiParams(mQPhoto));
          obj2 = new NasaSlideParam$a();
          obj2.T("DETAIL");
          obj2.C(false);
          obj2.q(true);
          obj2.h(true);
          obj2.e(false);
          obj2.l(false);
          String str1 = (nearbyParam.isPoiDetailStyle())? "LOCAL_POI": "nearby";
          obj2.Z(str1);
          obj2.d(Long.parseLong(mExtParams.mStartTs));
          obj2.N = true;
          obj2.R(nearbyParam);
          NasaSlideParam nasaSlidePar = obj2.a();
          d.a(0x66aa3a58).z20(obj1, 1025, photoDetailP, null, 0, 0, nasaSlidePar, true, null);
       }
    label_00f6 :
       return;
    }
    public void Fa(JsPoiParams p0,g p1){
       PoiErrorInfo bIZ_PARAMS_E;
       int errCode;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       Bundle uBundle = null;
       if (p0 != null) {
          if (TextUtils.x(p0.poiBiz) || TextUtils.x(p0.poiSubBiz)) {
             bIZ_PARAMS_E = PoiErrorInfo.BIZ_PARAMS_ERROR;
             errCode = bIZ_PARAMS_E.getErrCode();
             p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), uBundle);
             return;
          }else {
             a.b(PoiServicesUtilsKt.b(p0.poiBiz, p0.poiSubBiz, p0.location, null, p0.extParams, false, p0.pcursor, Integer.valueOf(p0.pageNum), null).a(), new a$b(this, p1));
          }
       }else {
          bIZ_PARAMS_E = PoiErrorInfo.PARAMS_ERROR;
          errCode = bIZ_PARAMS_E.getErrCode();
          p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), uBundle);
       }
       return;
    }
    public void J4(Activity p0,LocalLifeUrlParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "18")) {
          return;
       }
       if (p1 != null) {
          f.a(p1.mTag, p1.mUrl, p1.mDesc);
          p2.onSuccess(null);
          return;
       }else {
          p2.a(-1, "reportKwaiUrlLog params is null", null);
          return;
       }
    }
    public void M0(Activity p0,LocalLifeLoggerParams p1,g p2){
       LocalLifeLoggerParams this;
       LocalLifeLoggerParams mTag;
       LocalLifeLoggerParams mMsg;
       Object[] objArray;
       LocalLifeLoggerParams localLifeLog3;
       Object[] objArray1;
       String str1;
       LocalLifeLoggerParams localLifeLog = p1;
       g og = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "16")) {
          return;
       }
       if (localLifeLog) {
          c uoc = new c(localLifeLog);
          LocalLifeLoggerParams mLogType = localLifeLog.mLogType;
          String str = "KSLocalLife";
          this = 2;
          LocalLifeLoggerParams localLifeLog1 = null;
          LocalLifeLoggerParams localLifeLog2 = 5;
          int i = 4;
          int i1 = 3;
          int i2 = 1;
          if (mLogType != i2) {
             if (mLogType != i1) {
                if (mLogType != i) {
                   if (mLogType != localLifeLog2) {
                      b.b(localLifeLog.mModule, uoc, localLifeLog.mTag, localLifeLog.mMsg, localLifeLog.mParams);
                   }else {
                      b.e(localLifeLog.mModule, uoc, localLifeLog.mTag, localLifeLog.mMsg, localLifeLog.mParams, null);
                   }
                }else {
                   mLogType = localLifeLog.mModule;
                   mTag = localLifeLog.mTag;
                   mMsg = localLifeLog.mMsg;
                   localLifeLog = localLifeLog.mParams;
                   if (PatchProxy.isSupport(b.class)) {
                      objArray = new Object[localLifeLog2];
                      objArray[localLifeLog1] = mLogType;
                      objArray[i2] = uoc;
                      objArray[this] = mTag;
                      objArray[i1] = mMsg;
                      objArray[i] = localLifeLog;
                      if (!PatchProxy.applyVoid(objArray, null, b.class, "12")) {
                      }
                   }else if(mLogType != null){
                      localLifeLog3 = mLogType;
                   }else {
                      localLifeLog3 = str;
                   }
                   objArray1 = new Object[localLifeLog1];
                   a.C().A(localLifeLog3, b.a(uoc, mTag, mMsg, localLifeLog), objArray1);
                   if (SystemUtil.I()) {
                      e.a.b(localLifeLog3, uoc, mTag, mMsg, localLifeLog, null);
                   }
                }
             }else {
                mLogType = localLifeLog.mModule;
                mTag = localLifeLog.mTag;
                mMsg = localLifeLog.mMsg;
                localLifeLog = localLifeLog.mParams;
                if (PatchProxy.isSupport(b.class)) {
                   objArray = new Object[localLifeLog2];
                   objArray[localLifeLog1] = mLogType;
                   objArray[i2] = uoc;
                   objArray[this] = mTag;
                   objArray[i1] = mMsg;
                   objArray[i] = localLifeLog;
                   if (!PatchProxy.applyVoid(objArray, null, b.class, "9")) {
                   }
                }else if(mLogType != null){
                   localLifeLog3 = mLogType;
                }else {
                   str1 = str;
                }
                objArray1 = new Object[localLifeLog1];
                a.C().w(localLifeLog3, b.a(uoc, mTag, mMsg, localLifeLog), objArray1);
                if (SystemUtil.I()) {
                   e.a.b(localLifeLog3, uoc, mTag, mMsg, localLifeLog, null);
                }
             }
          }else {
             mLogType = localLifeLog.mModule;
             mTag = localLifeLog.mTag;
             mMsg = localLifeLog.mMsg;
             localLifeLog = localLifeLog.mParams;
             if (PatchProxy.isSupport(b.class)) {
                objArray = new Object[localLifeLog2];
                objArray[localLifeLog1] = mLogType;
                objArray[i2] = uoc;
                objArray[this] = mTag;
                objArray[i1] = mMsg;
                objArray[i] = localLifeLog;
                if (!PatchProxy.applyVoid(objArray, null, b.class, "3")) {
                }
             }else if(mLogType != null){
                localLifeLog3 = mLogType;
             }else {
                str1 = str;
             }
             objArray1 = new Object[localLifeLog1];
             a.C().y(localLifeLog3, b.a(uoc, mTag, mMsg, localLifeLog), objArray1);
             if (SystemUtil.I()) {
                e.a.b(localLifeLog3, uoc, mTag, mMsg, localLifeLog, null);
             }
          }
       label_0120 :
          og.onSuccess(null);
          return;
       }else {
          og.a(-1, "printLocalLifeLog params is null", null);
          return;
       }
    }
    public void N0(Activity p0,LocalLifeHalfContainerParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "14")) {
          return;
       }
       d.a(0x2ac28c95).vT((p1.mPause ^ 0x01), p1.mPhotoSaveId);
       return;
    }
    public final String Na(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return p0;
       }
       return Uri.decode(p0);
    }
    public void f9(Activity p0,LoadWebViewParams p1,g p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "19")) {
          return;
       }
       try{
          MTWebViewManager mTWebViewMan = MTWebViewManager.b();
          Objects.requireNonNull(mTWebViewMan);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          MTWebViewManager mTWebViewMan1 = MTWebViewManager.class;
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, mTWebViewMan, mTWebViewMan1, "3")) {
             a.b(LocalLifeLiveLogBiz.LIVE_ROOM, "MeituanAuthorizeLoadWebView", ImmutableMap.of("parameters", a.a.q(p1)));
             Object obj = PatchProxy.applyTwoRefs(p0, p1, mTWebViewMan, mTWebViewMan1, "5");
             int i = 0;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(p0 != null && (p1 != null && (!TextUtils.isEmpty(p1.mUrl) && (p1.mUrl).startsWith("http")))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                if (p0 instanceof FragmentActivity) {
                   obj = p0;
                   KwaiDialogFragment kwaiDialogFr = PatchProxy.applyOneRefs(obj, mTWebViewMan, mTWebViewMan1, "4");
                   if (kwaiDialogFr != patchProxyRe) {
                   }else {
                      List fragments = obj.getSupportFragmentManager().getFragments();
                      kwaiDialogFr = (!fragments.isEmpty())? mTWebViewMan.e(fragments.get(i)): null;
                   }
                   if (kwaiDialogFr != null) {
                      mTWebViewMan.a = new MTWebViewManager$LifecycleObserver(mTWebViewMan);
                      kwaiDialogFr.getLifecycle().addObserver(mTWebViewMan.a);
                   }else {
                      mTWebViewMan.a = new MTWebViewManager$LifecycleObserver(mTWebViewMan);
                      p0.getLifecycle().addObserver(mTWebViewMan.a);
                   }
                }
                if (!PatchProxy.applyVoid(null, mTWebViewMan, mTWebViewMan1, "9") && !a.d().i(mTWebViewMan)) {
                   a.d().p(mTWebViewMan);
                }
                WebView webView = mTWebViewMan.c(p0);
                mTWebViewMan.a(p0, webView, p1);
                webView.loadUrl(p1.mUrl);
             }else {
                HashMap hashMap = new HashMap();
                String str = "url";
                String str1 = (p1 == null)? "": p1.mUrl;
                hashMap.put(str, str1);
                if (!PatchProxy.applyVoidTwoRefs("LoadWebViewParams", hashMap, mTWebViewMan, mTWebViewMan1, "12")) {
                   d.a("LOCAL_LIFE_LOG_POI_DETAIL_CUSTOM_EVENT", LocalLifeLiveMeiTuanBiz.MT_OTHER, "LiveLocalLifeAuthPresenter", "LoadWebViewParams", hashMap, null, false, 1);
                }
             }
          }
       label_0104 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void i6(Activity p0,LlhcRNViewReadyParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "15")) {
          return;
       }
       RxBus.f.b(new a(p0, p1.mRootTag));
       return;
    }
    public void k0(Activity p0,PoiCommentElementParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "12")) {
          return;
       }
       if (TextUtils.x(p1.mPoiId) || TextUtils.x(p1.mPhotoId)) {
          p2.a(-1, "poiId is null", null);
          return;
       }else {
          RxBus.f.b(new d(p1.mPoiId, p1.mPhotoId, p1.mNeedToHide));
          return;
       }
    }
    public void l2(JsPoiParams p0,g p1){
       Bundle uBundle1;
       PoiErrorInfo obj = p0;
       a obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, a.class, "9")) {
          return;
       }
       Bundle uBundle = null;
       if (obj == null) {
          obj = PoiErrorInfo.PARAMS_ERROR;
          int errCode = obj.getErrCode();
          obj1.a(errCode, obj.getErrMsg(), uBundle);
          return;
       }else if(a.a.a(obj, obj1)){
          return;
       }else {
          JsPoiParams poiBiz = obj.poiBiz;
          JsPoiParams poiSubBiz = obj.poiSubBiz;
          JsPoiParams isCitySearch = obj.isCitySearch;
          JsPoiParams keywords = obj.keywords;
          JsPoiParams poiIds = obj.poiIds;
          JsPoiParams extParams = obj.extParams;
          JsPoiParams location = obj.location;
          JsPoiParams pcursor = obj.pcursor;
          a uoa = new a(obj1);
          obj1 = a.class;
          int i = 1;
          if (PatchProxy.isSupport(obj1)) {
             Object[] objArray = new Object[9];
             objArray[0] = poiBiz;
             objArray[i] = poiSubBiz;
             objArray[2] = Boolean.valueOf(isCitySearch);
             objArray[3] = keywords;
             objArray[4] = poiIds;
             objArray[5] = extParams;
             objArray[6] = location;
             objArray[7] = pcursor;
             objArray[8] = uoa;
             if (!PatchProxy.applyVoid(objArray, uBundle, obj1, "5")) {
             label_0078 :
                a.p(poiBiz, "poiBiz");
                a.p(poiSubBiz, "poiSubBiz");
                String str = "resultCallback";
                a.p(uoa, str);
                a$a uoa1 = new a$a(poiBiz, poiSubBiz);
                PoiRecallMode cITY = (isCitySearch != null)? PoiRecallMode.CITY: PoiRecallMode.NATION;
                uoa1.l(cITY);
                uoa1.j(poiIds);
                uoa1.d(keywords);
                uoa1.n(extParams);
                Double uDouble = (location != null)? Double.valueOf(location.b()): uBundle;
                uoa1.f(uDouble);
                uDouble = (location != null)? Double.valueOf(location.a()): uBundle;
                uoa1.e(uDouble);
                if (pcursor != null) {
                   uoa1.i(pcursor);
                }
                a uoa2 = uoa1.a();
                if (!PatchProxy.applyVoidTwoRefs(uoa2, uoa, uBundle, a.class, "10")) {
                   a.p(uoa2, "queryConfig");
                   a.p(uoa, str);
                   if (a.a.a()) {
                      new j(uoa2, uoa, i).a();
                   }else {
                      b uob = new b(uoa2, uoa, false, false, 12, null);
                      str.b();
                   }
                }
             }
          }else {
             goto label_0078 ;
          }
          return;
       }
    }
    public void o5(JsPoiParams p0,g p1){
       PoiErrorInfo bIZ_PARAMS_E;
       int errCode;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       if (p0 != null) {
          if (TextUtils.x(p0.poiBiz) || TextUtils.x(p0.poiSubBiz)) {
             bIZ_PARAMS_E = PoiErrorInfo.BIZ_PARAMS_ERROR;
             errCode = bIZ_PARAMS_E.getErrCode();
             p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), null);
             return;
          }else if(TextUtils.x(p0.keyword)){
             bIZ_PARAMS_E = PoiErrorInfo.KEY_WORD_PARAMS_ERROR;
             errCode = bIZ_PARAMS_E.getErrCode();
             p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), null);
             return;
          }else {
             PoiServicesUtilsKt.d(p0.poiBiz, p0.poiSubBiz, p0.keyword, p0.location, null, p0.cityName, p0.extParams, p0.pcursor, Integer.valueOf(p0.pageNum), null, new d(this, p1));
          }
       }else {
          bIZ_PARAMS_E = PoiErrorInfo.PARAMS_ERROR;
          errCode = bIZ_PARAMS_E.getErrCode();
          p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), null);
       }
       return;
    }
    public void pa(Activity p0,LocalLifeGlobalEvent p1,g p2){
       Gson a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "20")) {
          return;
       }
       LocalLifeLiveLogBiz lIVE_ROOM = LocalLifeLiveLogBiz.LIVE_ROOM;
       a = a.a;
       ImmutableMap immutableMap = ImmutableMap.of("result", a.q(p1));
       try{
          a.b(lIVE_ROOM, "MeituanAuthorizeResult", immutableMap);
          LocalLifeGlobalEvent$LocalLifeData$AdditionInfo localLifeDat = a.h(p1.data.additionInfo, LocalLifeGlobalEvent$LocalLifeData$AdditionInfo.class);
          LocalLifeGlobalEvent data = p1.data;
          if (localLifeDat != null && !TextUtils.x(localLifeDat.source)) {
             localLifeDat = localLifeDat.source;
             if (("LocalLifePoi").equals(localLifeDat)) {
                a.b.GO("LocalLifeSendAuthorizeResultToRN", data);
                a.d().k(p1);
             }else if(("LocalLifeProductDetail").equals(localLifeDat)){
                a.b.GO("localLifeH5CloseMtSilentProduceDetailAuthorization", data);
                a.d().k(p1);
             }else if(("LocalLifeMakeOrder").equals(localLifeDat)){
                a.b.GO("localLifeH5CloseMtSilentMakeOrderAuthorization", data);
                a.d().k(p1);
             }else if(("LocalLifeLive").equals(localLifeDat)){
                a.d().k(p1);
             }
          }
          return;
       }catch(com.google.gson.JsonSyntaxException e0){
       }
    }
    public void s7(LiveLocalLifeUpdateBizStatusModel p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (p0 != null) {
          RxBus.f.b(p0);
          p1.onSuccess(new JsSuccessResult());
       }else {
          p1.a(-1, "biz status model is null!", null);
       }
       return;
    }
    public void v1(Activity p0,LocalLifeJinJingParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "17")) {
          return;
       }
       if (p1 != null) {
          d.a(p1.mCustomEventKey, new a(p1.mBundleId), p1.mTag, p1.mMsg, p1.mParams, null, p1.isReportErrorLog, p1.mReportType);
          p2.onSuccess(null);
          return;
       }else {
          p2.a(-1, "reportLog2JinJing params is null", null);
          return;
       }
    }
    public void x7(Activity p0,PoiOpenLiveFeedParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "11")) {
          return;
       }
       if (p1.mSourceType == null || q.f(p1.mLiveStreamFeed)) {
          p2.a(-1, "params is null", null);
          return;
       }else {
          LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
          uob.o(p1.mSourceType);
          uob.n(p1.mLiveSquareSource);
          uob.v(p1.mPath);
          uob.c(p1.mDisableLoadMore);
          uob.d(p1.mDisablePullRefresh);
          d.a(-1835681758).b1(p0, uob.i(p1.mLiveStreamFeed).A(p1.getSelectedFeed()).a());
          return;
       }
    }
    public void xa(Activity p0,LocalLifeHalfContainerParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "13")) {
          return;
       }
       d.a(0x2ac28c95).vT((p1.mPause ^ 0x01), p1.mPhotoSaveId);
       return;
    }
    public void z0(JsPoiParams p0,g p1){
       PoiErrorInfo bIZ_PARAMS_E;
       int errCode;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       if (p0 != null) {
          if (TextUtils.x(p0.poiBiz) || TextUtils.x(p0.poiSubBiz)) {
             bIZ_PARAMS_E = PoiErrorInfo.BIZ_PARAMS_ERROR;
             errCode = bIZ_PARAMS_E.getErrCode();
             p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), null);
             return;
          }else {
             a.a(p0.poiBiz, p0.poiSubBiz, p0.location, null, p0.extParams, new a$a(this, p1));
          }
       }else {
          bIZ_PARAMS_E = PoiErrorInfo.PARAMS_ERROR;
          errCode = bIZ_PARAMS_E.getErrCode();
          p1.a(errCode, bIZ_PARAMS_E.getErrMsg(), null);
       }
       return;
    }
}
