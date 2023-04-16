package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl;
import txc.l;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$a;
import nsd.u;
import java.lang.Object;
import txc.b;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsNewYodaPageConfigParams;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import android.os.Bundle;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import tyb.a;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckParams;
import com.yxcorp.gifshow.webview.yoda.utils.a;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult$JsLocationData;
import java.lang.System;
import com.kwai.framework.location.k;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$b;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$c;
import u07.u;
import lnc.w5;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationRequestWitchCheckParams;
import cyc.c;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$e;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$g;
import android.content.pm.PackageManager;
import java.lang.Exception;
import com.yxcorp.gifshow.webview.jsmodel.component.JsGetAppEnvironmentResult$AppEnvironment;
import o56.a;
import oe6.a;
import ua6.b;
import ua6.b$a;
import ia0.c;
import ekd.p0;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.webview.jsmodel.component.JsGetAppEnvironmentResult;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData$Item;
import com.yxcorp.gifshow.webview.bridge.bean.JsGetClipBoardResult;
import java.util.Objects;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import ny7.c;
import yz7.k;
import com.kwai.yoda.bridge.YodaBaseWebView;
import ty7.c;
import ty7.g;
import ty7.d;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$hideNavigationBar$1;
import msd.a;
import tb7.b;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageTitleParams;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setPageTitle$1;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopRightSecondBtn$1;
import com.yxcorp.gifshow.webview.jsmodel.interact.JsInteractParams;
import com.yxcorp.gifshow.webview.jsmodel.interact.JsInteractParams$JsInteractData;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopRightBtn$1;
import com.yxcorp.gifshow.webview.helper.event.JsEventParameter;
import vxc.e;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yz7.r;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$exitCurrentWebView$1;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$resetTopButtons$1;
import uv8.g1;
import q87.c;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftBtn$1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import ekd.q;
import androidx.fragment.app.Fragment;
import uxc.c;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.utility.n;
import sy7.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$popBack$1;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import org.greenrobot.eventbus.a;
import cyc.a;
import android.os.Build;
import java.util.Locale;
import ra6.a;
import h30.a;
import qe6.b;
import lnc.a1;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.gifshow.webview.jsmodel.component.JsCommonResult;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$i;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$j;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$k;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftSecondBtn$1;
import com.yxcorp.gifshow.webview.jsmodel.component.JsPageSlideParams;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setSlideBack$1;
import cyc.b;
import org.json.JSONObject;
import java.lang.Iterable;
import cyc.b$a;
import com.kwai.framework.abtest.f;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftCloseBtn$1;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPhysicalBackButtonParams;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setPhysicalBackButton$1;
import com.yxcorp.gifshow.webview.yoda.utils.q;

public final class WebViewBridgeModuleImpl implements l	// class@0016f6
{
    public static final WebViewBridgeModuleImpl$a f;

    static {
       WebViewBridgeModuleImpl.f = new WebViewBridgeModuleImpl$a(null);
    }
    public void WebViewBridgeModuleImpl(){
       super();
    }
    public void C6(b p0,JsNewYodaPageConfigParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "17")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "newPageConfigJson");
       a.p(p2, "callback");
       Activity uActivity = p0.o();
       if (uActivity == null) {
          p2.a(0x1e855, "current act is null.", null);
          return;
       }else {
          JsNewYodaPageConfigParams mBizId = p1.mBizId;
          JsNewYodaPageConfigParams jsNewYodaPag = null;
          mBizId = (mBizId == null || !mBizId.length())? 1: null;
          if (mBizId) {
             mBizId = p1.mUrl;
             mBizId = (mBizId == null || !mBizId.length())? 1: 0;
             if (mBizId) {
                JsNewYodaPageConfigParams mCallback = p1.mCallback;
                if (mCallback == null || !mCallback.length()) {
                   jsNewYodaPag = 1;
                }
                if (jsNewYodaPag) {
                   p2.a(0x1e84f, "url & bizId all empty", null);
                }
                return;
             }
          }
          a uoa = d.a(-1671712621);
          jsNewYodaPag = p1.mUrl;
          String str = "";
          if (jsNewYodaPag == null) {
             String str1 = str;
          }
          p1 = p1.mBizId;
          if (p1 != null) {
             str = p1;
          }
          Intent intent = uoa.wQ(uActivity, jsNewYodaPag, str);
          a.o(intent, "PluginManager.get\(\n     \x20\x02eConfigJson.mBizId ?: \"\"\)\x00");
          uActivity.startActivity(intent);
          p2.onSuccess(null);
          return;
       }
    }
    public void D(b p0,JsLocationWithCheckParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "19")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "params");
       a.p(p2, "callback");
       Activity uActivity = p0.o();
       Bundle uBundle = null;
       if (uActivity == null) {
          p2.a(0x1e855, "current act is null.", uBundle);
          return;
       }else {
          String str = a.a(p1.bizType, p1.featureId);
          super();
          if (a.d(str, p1.forcePermissionRequest)) {
             k.h(str, System.currentTimeMillis());
             a.e(uActivity, p1.title, p1.content, new WebViewBridgeModuleImpl$b(str, uActivity, p2, this), new WebViewBridgeModuleImpl$c(p2));
          }else if(a.b(str)){
             if (!w5.a(uActivity)) {
                p2.a(401, "no permission", uBundle);
                return;
             }else {
                LocationCityInfo locationCity = u.d();
                if (locationCity == null) {
                   p2.a(412, "unknown error", uBundle);
                   return;
                }else {
                   this.mLatitude = locationCity.mLatitude;
                   this.mLongitude = locationCity.mLongitude;
                   p2.onSuccess(new JsLocationWithCheckResult(1, this));
                }
             }
          }else if(a.c(str)){
             p2.a(a.e, "cold down", uBundle);
          }else {
             p2.a(a.f, "not show", uBundle);
          }
          return;
       }
    }
    public void E2(b p0,JsLocationRequestWitchCheckParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "21")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "params");
       a.p(p2, "callback");
       Activity uActivity = p0.o();
       Bundle uBundle = null;
       if (uActivity == null) {
          p2.a(0x1e855, "current act is null.", uBundle);
          return;
       }else {
          String str = a.a(p1.bizType, p1.featureId);
          if (a.b(str) && w5.a(uActivity)) {
             p2.onSuccess(new c(1));
             return;
          }else {
             JsLocationRequestWitchCheckParams forcePermiss = p1.forcePermissionRequest;
             if (forcePermiss == a.a) {
                k.h(str, System.currentTimeMillis());
                a.e(uActivity, p1.title, p1.content, new WebViewBridgeModuleImpl$d(str, uActivity, p2), new WebViewBridgeModuleImpl$e(p2));
             }else if(forcePermiss == a.b){
                if (a.c(str)) {
                   p2.a(a.e, "no permission", uBundle);
                }else {
                   k.h(str, System.currentTimeMillis());
                   a.e(uActivity, p1.title, p1.content, new WebViewBridgeModuleImpl$f(str, uActivity, p2), new WebViewBridgeModuleImpl$g(p2));
                }
             }else {
                p2.a(a.f, "not show", uBundle);
             }
             return;
          }
       }
    }
    public void G7(Context p0,String p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "28")) {
          return;
       }
       a.p(p0, "context");
       a.p(p2, "callback");
       PackageManager packageManag = (p1 == null || !p1.length())? 1: null;
       Intent launchIntent = (!packageManag)? p0.getPackageManager().getLaunchIntentForPackage(p1): null;
       if (launchIntent == null) {
          p2.a(432, null, null);
          return;
       }else {
          try{
             p0.startActivity(launchIntent);
             p2.onSuccess(null);
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
             p2.a(432, null, null);
          }
          return;
       }
    }
    public void H5(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl.class, "25")) {
          return;
       }
       a.p(p0, "callback");
       JsGetAppEnvironmentResult$AppEnvironment uAppEnvironm = new JsGetAppEnvironmentResult$AppEnvironment();
       uAppEnvironm.mAppVersion = a.m;
       uAppEnvironm.mCountry = a.h();
       uAppEnvironm.mDeviceId = a.a;
       uAppEnvironm.mDeviceModel = a.j;
       uAppEnvironm.mLanguage = b.c.a().e().o();
       uAppEnvironm.mNet = p0.g(a.B);
       uAppEnvironm.mOs = "android";
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       uAppEnvironm.mUserId = mE.getId();
       Object obj = b.a(0x4b316083);
       a.o(obj, "Singleton.get\(\n      ILogManager::class.java\n    \)");
       uAppEnvironm.mSessionId = obj.getSessionId();
       p0.onSuccess(new JsGetAppEnvironmentResult(1, "", uAppEnvironm));
       return;
    }
    public void I(g p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl.class, "29")) {
          return;
       }
       a.p(p0, "callback");
       ClipboardManager systemServic = a.b().getSystemService("clipboard");
       int i = 0;
       if (systemServic != null) {
          ClipData primaryClip = ClipboardInterceptor.getPrimaryClip(systemServic);
          if (primaryClip != null && primaryClip.getItemCount() > 0) {
             ClipData$Item itemAt = primaryClip.getItemAt(i);
             a.o(itemAt, "data.getItemAt\(0\)");
             CharSequence text = itemAt.getText();
             if (text != null) {
                str = text.toString();
                if (str != null) {
                label_0044 :
                   if (str.length() > 0) {
                      i = 1;
                   }
                   if (i) {
                      p0.onSuccess(new JsGetClipBoardResult(1, str));
                      return;
                   }else {
                      p0.a(412, "", null);
                      return;
                   }
                }
             }
          }
       }
       str = "";
       goto label_0044 ;
    }
    public void J7(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl.class, "31")) {
          return;
       }
       a.p(p0, "callback");
       Object systemServic = a.b().getSystemService("clipboard");
       Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.content.ClipboardManager");
       if (Build$VERSION.SDK_INT >= 28) {
          systemServic.clearPrimaryClip();
       }else {
          systemServic.setPrimaryClip(ClipData.newPlainText("", ""));
       }
       p0.onSuccess(null);
       return;
    }
    public void N4(Context p0,String p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "30")) {
          return;
       }
       a.p(p0, "context");
       a.p(p2, "callback");
       ClipboardManager systemServic = p0.getSystemService("clipboard");
       if (systemServic != null) {
          systemServic.setPrimaryClip(ClipData.newPlainText("", p1));
          p2.onSuccess(null);
       }else {
          p2.a(412, "", null);
       }
       return;
    }
    public final void Na(Activity p0,KwaiYodaWebView p1,String p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, WebViewBridgeModuleImpl.class, "26")) {
          return;
       }
       if (p0 != null && !p0.isFinishing()) {
          Object[] objArray = new Object[]{p2,p2};
          p1.evaluateJavascript(k.a("javascript:typeof %s === \'function\' && %s\(\)", objArray));
          c debugKit = p1.getDebugKit();
          if (debugKit != null) {
             debugKit.a(new g(p3, null));
          }
       }
       return;
    }
    public void O5(b p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "2")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "callback");
       b.j(new WebViewBridgeModuleImpl$hideNavigationBar$1(p0));
       p1.onSuccess(null);
       return;
    }
    public void P8(b p0,JsPageTitleParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "7")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "jsPageTitleParams");
       a.p(p2, "callback");
       c actionBarMan = p0.p().getActionBarManager();
       if (actionBarMan == null) {
          p2.a(0x1e855, "No actionBar", null);
          return;
       }else {
          b.j(new WebViewBridgeModuleImpl$setPageTitle$1(actionBarMan, p1, p2));
          return;
       }
    }
    public void Q1(b p0,JsPageButtonParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "15")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "pageButtonParams");
       a.p(p2, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       WebViewBridgeModuleImpl$setTopRightSecondBtn$1 osetTopRight = new WebViewBridgeModuleImpl$setTopRightSecondBtn$1(this, kwaiYodaWebV.getActionBarManager(), p1, p0, kwaiYodaWebV);
       b.j(p2);
       return;
    }
    public void R2(b p0,JsInteractParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "18")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "interactParams");
       a.p(p2, "callback");
       Activity uActivity = p0.o();
       if (uActivity == null) {
          p2.a(0x1e855, "current act is null.", null);
          return;
       }else if(a.g("captcha", p1.mType)){
          Intent intent = new Intent();
          intent.putExtra("android.intent.extra.RETURN_RESULT", p1.mData.mToken);
          uActivity.setResult(-1, intent);
          uActivity.finish();
       }
       return;
    }
    public void R9(b p0,JsPageButtonParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "14")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "pageButtonParams");
       a.p(p2, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       WebViewBridgeModuleImpl$setTopRightBtn$1 osetTopRight = new WebViewBridgeModuleImpl$setTopRightBtn$1(this, kwaiYodaWebV.getActionBarManager(), p1, p0, kwaiYodaWebV);
       b.j(p2);
       return;
    }
    public void S4(b p0,JsEventParameter p1,g p2){
       PatchProxyResult this;
       boolean b;
       JsEventParameter mType;
       JsEventParameter mHandler;
       Object obj = p1;
       Object obj1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "5")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(obj, "eventParameter");
       a.p(obj1, "callback");
       e jsInjectKwai = p0.p().getJsInjectKwai();
       if (jsInjectKwai == null) {
          obj1.a(0x1e84a, "THe JsInjectKwai is null", null);
          return;
       }else {
          JsNativeEventCommunication jsNativeEven = jsInjectKwai.i();
          Objects.requireNonNull(jsNativeEven);
          this = PatchProxyResult.class;
          ArrayList obj2 = PatchProxy.applyOneRefs(obj, jsNativeEven, JsNativeEventCommunication.class, "17");
          if (obj2 != this) {
             b = obj2.booleanValue();
          }else {
             r.h("JsNativeEventCommunication", "--- removeJsEventListener, mType:"+obj.mType+", mHandler:"+obj.mHandler);
             if (TextUtils.x(obj.mType) && TextUtils.x(obj.mHandler)) {
                jsNativeEven.d();
                b = true;
             }else {
                obj2 = new ArrayList();
                Iterator iterator = jsNativeEven.b.iterator();
                boolean b1 = false;
                while (iterator.hasNext()) {
                   Object obj3 = iterator.next();
                   mType = obj.mType;
                   mHandler = obj.mHandler;
                   JsEventParameter jsEventParam = mType;
                   JsEventParameter jsEventParam1 = mHandler;
                   Object obj4 = obj3;
                   JsEventParameter jsEventParam2 = mHandler;
                   JsEventParameter jsEventParam3 = mType;
                   Object obj5 = obj3;
                   Object obj6 = PatchProxy.applyThreeRefs(jsEventParam, jsEventParam1, obj4, jsNativeEven, JsNativeEventCommunication.class, "18");
                   if (obj6 != this) {
                      b1 = obj6.booleanValue();
                   }else if(!TextUtils.x(jsEventParam3) && (!(jsEventParam3).equals(obj5.mType) || (!TextUtils.x(jsEventParam2) && !(jsEventParam2).equals(obj5.mHandler)))){
                      b1 = true;
                   }
                   if (b1) {
                      obj2.add(obj5);
                   }
                }
                if (!obj2.isEmpty()) {
                   boolean b2 = jsNativeEven.b.removeAll(obj2);
                   r.h("JsNativeEventCommunication", "--- removeJsEventListener, removeJsEventList size:"+obj2.size()+", result:"+b2);
                   b = b2;
                }else {
                   b = false;
                }
             }
          }
          if (!b) {
             obj1.a(0x1e84a, "RemoveJsEventListener failed", null);
          }else {
             obj1.onSuccess(null);
          }
          return;
       }
    }
    public void W0(b p0,g p1){
       WebViewBridgeModuleImpl webViewBridg = WebViewBridgeModuleImpl.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, webViewBridg, "16")) {
          return;
       }
       String str = "bridgeContext";
       a.p(p0, str);
       a.p(p1, "callback");
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, webViewBridg, "1")) {
          a.p(p0, str);
          a.p(p1, "callback");
          Activity uActivity = p0.o();
          e jsInjectKwai = p0.p().getJsInjectKwai();
          if (jsInjectKwai == null) {
             p1.a(0x1e84a, "THe JsInjectKwai is null", null);
          }else {
             b.j(new WebViewBridgeModuleImpl$exitCurrentWebView$1(jsInjectKwai, p1, uActivity));
          }
       }
       return;
    }
    public void X(b p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "8")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "callback");
       b.j(new WebViewBridgeModuleImpl$resetTopButtons$1(p0.p().getActionBarManager(), p0));
       p1.onSuccess(null);
       return;
    }
    public void Z1(b p0,JsEventParameter p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "4")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "eventParameter");
       a.p(p2, "callback");
       if (TextUtils.x(p1.mType) || TextUtils.x(p1.mHandler)) {
          p2.a(0x1e84f, "The Input parameter is invalid.", null);
          return;
       }else {
          e jsInjectKwai = p0.p().getJsInjectKwai();
          if (jsInjectKwai == null) {
             p2.a(0x1e84a, "THe JsInjectKwai is null", null);
             return;
          }else {
             JsNativeEventCommunication jsNativeEven = jsInjectKwai.i();
             Objects.requireNonNull(jsNativeEven);
             if (!PatchProxy.applyVoidOneRefs(p1, jsNativeEven, JsNativeEventCommunication.class, "16")) {
                Object[] objArray = new Object[0];
                g1.C().t("JsNativeEventCommunication", "addJsEventListener type="+p1.mType+", handler="+p1.mHandler, objArray);
                if (jsNativeEven.b.indexOf(p1) == -1) {
                   jsNativeEven.b.add(p1);
                   if (("native_visible").equals(p1.mType)) {
                      jsNativeEven.b("native_visible", "{\"visible\":"+jsNativeEven.o+"}");
                   }
                }else {
                   Object[] objArray1 = new Object[0];
                   g1.C().t("JsNativeEventCommunication", "addJsEventListener skip for dup type+handler", objArray1);
                }
             }
             p2.onSuccess(null);
             return;
          }
       }
    }
    public void a2(b p0,JsPageButtonParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "11")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "pageButtonParams");
       a.p(p2, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       WebViewBridgeModuleImpl$setTopLeftBtn$1 osetTopLeftB = new WebViewBridgeModuleImpl$setTopLeftBtn$1(this, kwaiYodaWebV.getActionBarManager(), p1, p0, kwaiYodaWebV);
       b.j(p2);
       return;
    }
    public void g0(b p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "6")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       Activity uActivity = p0.o();
       WebViewBridgeModuleImpl$popBack$1 opopBack$1 = null;
       if (uActivity instanceof GifshowActivity) {
          Activity uActivity1 = uActivity;
          c supportFragm = uActivity1.getSupportFragmentManager();
          String str = "act.supportFragmentManager";
          a.o(supportFragm, str);
          if (!q.f(supportFragm.getFragments())) {
             c supportFragm1 = uActivity1.getSupportFragmentManager();
             a.o(supportFragm1, str);
             Iterator iterator = supportFragm1.getFragments().iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (uFragment instanceof c) {
                   opopBack$1 = uFragment.Q9();
                }else if(!uFragment instanceof WebViewFragment){
                   opopBack$1 = 1;
                }
                if (uFragment instanceof DialogContainerFragment) {
                   try{
                      uFragment.dismissAllowingStateLoss();
                      n.C(uActivity);
                   }catch(java.lang.Exception e2){
                      b.b.f(e2);
                      goto label_0047 ;
                   }
                }
             }
          }
       }
       if (opopBack$1 == null) {
          b.j(new WebViewBridgeModuleImpl$popBack$1(kwaiYodaWebV, uActivity));
       }
       return;
    }
    public String getNameSpace(){
       Object obj = PatchProxy.apply(null, this, WebViewBridgeModuleImpl.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "webview";
    }
    public void i0(String p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "27")) {
          return;
       }
       a.p(p1, "callback");
       if (SystemUtil.M(a.b(), p0)) {
          p1.onSuccess(null);
       }else {
          p1.a(432, null, null);
       }
       return;
    }
    public void m5(b p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "22")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "callback");
       if (w5.a(p0.o())) {
          p1.onSuccess(null);
       }else {
          p1.a(-1, "no permission", null);
       }
       return;
    }
    public void p3(JsEmitParameter p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "3")) {
          return;
       }
       a.p(p0, "emitParameter");
       a.p(p1, "callback");
       a.d().k(p0);
       p1.onSuccess(null);
       return;
    }
    public void r8(g p0){
       Application b;
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl.class, "23")) {
          return;
       }
       a.p(p0, "callback");
       a uoa = new a();
       uoa.mAppVersion = a.m;
       uoa.mManufacturer = a.j;
       uoa.mModel = Build.MODEL;
       uoa.mSystemVersion = a.p;
       uoa.mUUID = a.a;
       uoa.mLocale = a.c().toString();
       uoa.mNetworkType = p0.g(a.B);
       uoa.mImei = TextUtils.I(SystemUtil.m(a.B));
       uoa.mOaid = TextUtils.k(a.d());
       String str = "";
       uoa.mAndroidId = (b.a())? SystemUtil.d(a.B, str): str;
       uoa.mMac = TextUtils.I(SystemUtil.o(a.B, b.a()));
       uoa.mScreenWidth = n.y(a.B);
       uoa.mScreenHeight = n.u(a.B);
       uoa.mStatusBarHeight = n.A(a.B);
       uoa.mTitleBarHeight = a1.d(0x7f070fdf);
       b = a.B;
       a.o(b, "AppEnv.APP");
       Resources resources = b.getResources();
       a.o(resources, "AppEnv.APP.resources");
       uoa.mStatusBarHeightWithoutDPI = (int)((float)n.A(a.B) / c.c(resources).density);
       Application b1 = a.B;
       a.o(b1, "AppEnv.APP");
       Resources resources1 = b1.getResources();
       a.o(resources1, "AppEnv.APP.resources");
       uoa.mTitleBarHeightWithoutDPI = (int)((float)a1.d(0x7f070fdf) / c.c(resources1).density);
       uoa.mGlobalId = a.j();
       JsCommonResult jsCommonResu = new JsCommonResult();
       jsCommonResu.mResult = 1;
       jsCommonResu.mData = uoa;
       p0.onSuccess(jsCommonResu);
       return;
    }
    public void s0(b p0,JsLocationWithCheckParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "20")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "params");
       a.p(p2, "callback");
       Activity uActivity = p0.o();
       Bundle uBundle = null;
       if (uActivity == null) {
          p2.a(0x1e855, "current act is null.", uBundle);
          return;
       }else {
          String str = a.a(p1.bizType, p1.featureId);
          super();
          if (a.d(str, p1.forcePermissionRequest)) {
             k.h(str, System.currentTimeMillis());
             a.e(uActivity, p1.title, p1.content, new WebViewBridgeModuleImpl$h(str, uActivity, p2, this), new WebViewBridgeModuleImpl$i(p2));
          }else if(a.b(str)){
             if (!w5.a(uActivity)) {
                p2.a(401, "no permission", uBundle);
                return;
             }else {
                t.fromCallable(new WebViewBridgeModuleImpl$j(str)).delay(1000, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new WebViewBridgeModuleImpl$k(p2, this), new WebViewBridgeModuleImpl$l(p2));
             }
          }else if(a.c(str)){
             p2.a(a.e, "cold down", uBundle);
          }else {
             p2.a(a.f, "not show", uBundle);
          }
          return;
       }
    }
    public void s5(b p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "1")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "callback");
       Activity uActivity = p0.o();
       e jsInjectKwai = p0.p().getJsInjectKwai();
       if (jsInjectKwai == null) {
          p1.a(0x1e84a, "THe JsInjectKwai is null", null);
          return;
       }else {
          b.j(new WebViewBridgeModuleImpl$exitCurrentWebView$1(jsInjectKwai, p1, uActivity));
          return;
       }
    }
    public void w(b p0,JsPageButtonParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "13")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "pageButtonParams");
       a.p(p2, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       WebViewBridgeModuleImpl$setTopLeftSecondBtn$1 osetTopLeftS = new WebViewBridgeModuleImpl$setTopLeftSecondBtn$1(this, kwaiYodaWebV.getActionBarManager(), p1, p0, kwaiYodaWebV);
       b.j(p2);
       return;
    }
    public void w7(b p0,JsPageSlideParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "10")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p2, "callback");
       b.j(new WebViewBridgeModuleImpl$setSlideBack$1(p0.o(), p1, p0.p()));
       return;
    }
    public void w8(b p0,g p1){
       int i;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl.class, "24")) {
          return;
       }
       a.p(p0, "aBTestParams");
       a.p(p1, "callback");
       try{
          i = 0;
          JSONObject jSONObject = new JSONObject();
          p0 = p0.itemList;
          if (p0 != null) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                b$a uoa = iterator.next();
                b$a key = uoa.key;
                if (key != null) {
                   b$a type = uoa.type;
                   if (type != null) {
                      str = type.toLowerCase();
                      a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
                   }else {
                      str = i;
                   }
                   if (str != null) {
                      switch (str.hashCode()){
                          case 0xcad56011:
                            if (str.equals("string")) {
                               jSONObject.put(key, f.b(key, String.class, i));
                            }
                            break;
                          case 0x197ef:
                            if (str.equals("int")) {
                            label_0077 :
                               jSONObject.put(key, f.e(key));
                            }
                            break;
                          case 0x2e3aea:
                            if (str.equals("bool")) {
                            label_0067 :
                               jSONObject.put(key, f.a(key));
                            }
                            break;
                          case 0x3db6c28:
                            if (str.equals("boolean")) {
                               goto label_0067 ;
                            }
                            break;
                          case 0x74b5813e:
                            if (str.equals("integer")) {
                               goto label_0077 ;
                            }
                            break;
                          default:
                      }
                   }
                   b.b.k("getAbTest type not support -- "+uoa.type);
                }
             }
          }
          p1.onSuccess(jSONObject);
       }catch(java.lang.Exception e7){
          p1.a(0x1e84a, e7.getMessage(), i);
       }
       return;
    }
    public void x3(b p0,JsPageButtonParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "12")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "pageButtonParams");
       a.p(p2, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       WebViewBridgeModuleImpl$setTopLeftCloseBtn$1 osetTopLeftC = new WebViewBridgeModuleImpl$setTopLeftCloseBtn$1(this, kwaiYodaWebV.getActionBarManager(), p0, p1, kwaiYodaWebV);
       b.j(p2);
       return;
    }
    public void x9(b p0,JsPhysicalBackButtonParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebViewBridgeModuleImpl.class, "9")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "physicalBackButtonParams");
       a.p(p2, "callback");
       KwaiYodaWebView kwaiYodaWebV = p0.p();
       WebViewBridgeModuleImpl$setPhysicalBackButton$1 osetPhysical = new WebViewBridgeModuleImpl$setPhysicalBackButton$1(this, kwaiYodaWebV.getActionBarManager(), p1, p0, kwaiYodaWebV);
       b.j(p2);
       return;
    }
    public void z8(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl.class, "32")) {
          return;
       }
       a.p(p0, "callback");
       p0.onSuccess(q.e);
       return;
    }
}
