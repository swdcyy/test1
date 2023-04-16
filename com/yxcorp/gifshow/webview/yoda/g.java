package com.yxcorp.gifshow.webview.yoda.g;
import xxc.b;
import com.kwai.yoda.bridge.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.g$a;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.webview.yoda.g$c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.e;
import java.util.Map;
import java.lang.reflect.Type;
import el.a;
import com.kwai.sdk.switchconfig.a;
import java.util.HashMap;
import txc.n;
import io7.a;
import com.kuaishou.webkit.WebView;
import uv8.g1;
import q87.c;
import android.graphics.Bitmap;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModelInternal;
import com.yxcorp.utility.TextUtils;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kuaishou.webkit.WebSettings;
import java.lang.Throwable;
import yz7.r;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.view.View;
import yz7.n;
import java.lang.CharSequence;
import android.net.Uri;
import gy7.a;
import gy7.a$a;
import gy7.n;
import android.graphics.Rect;
import android.widget.AbsoluteLayout;
import o56.a;
import android.app.Application;
import e17.i;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import android.content.Context;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import xf6.h;
import xf6.l;
import u07.t$a;
import myc.l;
import u07.u;
import myc.m;
import u07.t;
import u07.j;
import com.yxcorp.gifshow.webview.yoda.g$b;
import brd.t;
import com.yxcorp.gifshow.webview.helper.e;
import com.yxcorp.gifshow.webview.yoda.f;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import sy7.b;
import wkd.b;
import nf6.i;
import ekd.w0;
import lnc.h3$a;
import lnc.h3;
import myc.o;
import lnc.a3;
import android.content.Intent;
import android.content.ComponentName;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import nf6.a;
import com.kuaishou.webkit.URLUtil;
import ayc.g;
import com.yxcorp.gifshow.webview.api.EnhancedWebView$a;
import e3a.a;
import android.app.ActivityManager;
import java.util.List;
import android.app.ActivityManager$RunningTaskInfo;

public class g extends g implements b	// class@0017c3
{
    public g$c e;
    public JsNativeEventCommunication f;
    public boolean g;
    public g$b h;
    public String i;

    public void g(YodaBaseWebView p0){
       super(p0);
       this.e = new g$a(this);
       this.g = true;
    }
    public void A(JsNativeEventCommunication p0){
       this.f = p0;
    }
    public void B(g$c p0){
       this.e = p0;
    }
    public String b(){
       return this.i;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, g.class, "15")) {
          return;
       }
       g tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(null, tf, JsNativeEventCommunication.class, "12")) {
             tf.b("native_loadPage", null);
          }
          this.f.d();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, g.class, "16")) {
          return;
       }
       this.e.L5();
       return;
    }
    public boolean j(String p0,String p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!super.j(p0, p1)) {
          p1 = PatchProxy.applyOneRefs(p0, null, e.class, "1");
          if (p1 != patchProxyRe) {
             b1 = p1.booleanValue();
          }else if(e.b == null){
             Type[] typeArray = new Type[]{String.class,Boolean.class};
             Type type = a.getParameterized(Map.class, typeArray).getType();
             e.b = a.t().getValue("yoda_enable_js_file_inject_white_list", type, new HashMap());
             a.t().p("yoda_enable_js_file_inject_white_list", new n(type));
          }
          Boolean uBoolean = e.b.get(p0);
          if (uBoolean != null) {
             b1 = uBoolean.booleanValue();
          }else {
             b1 = false;
          }
          if (!b1) {
          label_007a :
             return b;
          }
       }
       b = true;
       goto label_007a ;
    }
    public void onPageFinished(WebView p0,String p1){
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       g1.C().t("JsNativeEventCommunication", "onPageFinished.", objArray);
       if (this.x(p0)) {
          objArray1 = new Object[i];
          g1.C().t("JsNativeEventCommunication", "onPageFinished but CurrentActivityFinishing!", objArray1);
          return;
       }else {
          this.e.H(p0, p1, this.i());
          super.onPageFinished(p0, p1);
          g tf = this.f;
          if (tf != null) {
             Objects.requireNonNull(tf);
             if (!PatchProxy.applyVoid(null, tf, JsNativeEventCommunication.class, "6")) {
                tf.b("native_pageFinished", null);
             }
          }else {
             objArray1 = new Object[i];
             g1.C().t("JsNativeEventCommunication", "onPageFinished but mCommunicator null!", objArray1);
          }
          return;
       }
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "3")) {
          return;
       }
       if (this.x(p0)) {
          return;
       }
       super.onPageStarted(p0, p1, p2);
       this.i = p1;
       this.e.O(p0, p1, p2);
       if (!PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          YodaBaseWebView yodaBaseWebV = this.h(p0);
          if (yodaBaseWebV != null && yodaBaseWebV.getLaunchModel() != null) {
             e.v("web_url", TextUtils.k(yodaBaseWebV.getLaunchModel().getUrl()));
          }
          e.v("current_web_url", TextUtils.k(this.i));
          if (p0 != null) {
             e.v("web_user_agent", TextUtils.k(p0.getSettings().getUserAgentString()));
          }
       }
    label_0077 :
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       Uri uri;
       boolean b;
       g og = this;
       int i = p1;
       String str = p2;
       String str1 = p3;
       g og1 = g.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, g.class, "6")) {
          return;
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       g1.C().t("YodaWebViewClient", "errorCode= "+i+" : "+str+" £º "+str1, objArray);
       if (this.x(p0) || (!n.a(p0) && !n.f(p0))) {
          String str2 = this.w(p0);
          if (!TextUtils.n(str2, str1)) {
             this.s(p0, p1, p2, p3, "LOADING_ERROR");
             return;
          }else if(i == -1){
             Object[] objArray1 = null;
             try{
                uri = Uri.parse(str2);
             }catch(java.lang.Exception e0){
                Object[] objArray2 = new Object[i1];
                g1.C().t("YodaWebViewClient", "onReceivedError, parse url fail, url:"+e0, objArray2);
                uri = objArray1;
             }
             if (uri != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                String obj = PatchProxy.apply(objArray1, this, og1, "7");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   obj = PatchProxy.apply(objArray1, objArray1, a.class, "4");
                   if (obj != patchProxyRe) {
                   }else {
                      obj = a.b.a();
                   }
                   String[] stringArray = obj.split("\\.");
                   if (stringArray != null && stringArray.length >= 4) {
                      int i2 = 2;
                      try{
                         if (Integer.parseInt(stringArray[i2]) > 79) {
                            b = false;
                         }
                      }catch(java.lang.Exception e0){
                         Object[] objArray3 = new Object[i1];
                         g1.C().t(79, "onReceivedError,isLowWebViewVersion fail, webViewVersion:"+obj, objArray3);
                      }
                   }
                }
                if (!b && n.f(uri, "yoda_load_error_unknown_handle", objArray1)) {
                label_011a :
                   super.onReceivedError(p0, p1, p2, p3);
                   og.e.q0(p0, i, str, str1);
                   if (p0.getGlobalVisibleRect(new Rect())) {
                      i.d(R.style.arg_RES_7f110668, a.B.getString(R.string.arg_RES_7f1038e5));
                   }else if(a.t().d("invisible_web_toast_error", i1)){
                      i.d(R.style.arg_RES_7f110668, a.B.getString(R.string.arg_RES_7f1038e5));
                   }
                }
             }
          label_010c :
             this.s(p0, p1, p2, p3, "LOADING_ERROR");
             return;
          }else {
             goto label_011a ;
          }
       }
       return;
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "8")) {
          return;
       }
       super.onReceivedHttpError(p0, p1, p2);
       return;
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       Object[] this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "18")) {
          return;
       }
       if (p2 != null) {
          Object[] objArray = new Object[0];
          g1.C().t(this.getClass().getSimpleName(), "onReceivedSslError errorUrl:  "+p2.getUrl()+" errorCode: "+p2.getPrimaryError(), objArray);
       }else {
          this = new Object[0];
          g1.C().t(this.getClass().getSimpleName(), "onReceivedSslError but error == null", this);
       }
       if (this.d(p0, p1, p2)) {
          p1.proceed();
          return;
       }else if(PatchProxy.applyVoidTwoRefs(p0.getContext(), p1, this, g.class, "19")){
          Activity uActivity = ActivityContext.g().e();
          if (uActivity != null) {
             if (h.v() && l.c("ignore_web_ssl_dialog", 0)) {
                p1.proceed();
             }else {
                t$a uoa = new t$a(uActivity);
                uoa.W0(R.string.arg_RES_7f104a83);
                uoa.y0(R.string.arg_RES_7f104a82);
                uoa.S0(R.string.arg_RES_7f104a81);
                uoa.Q0(R.string.arg_RES_7f104a80);
                uoa.t0(new l(p1));
                uoa.u0(new m(p1));
                j.d(uoa);
             }
          }
       }
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return this.shouldOverrideUrlLoading(p0, p1.getUrl().toString());
       }catch(java.lang.Exception e0){
          return super.shouldOverrideUrlLoading(p0, p1);
       }
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       String obj1;
       h3$a uoa;
       Intent intent;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       ComponentName obj = PatchProxy.applyTwoRefs(p0, p1, this, og, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.v() != null && this.v().J(p0, p1)) {
          this.q(p1);
          return b;
       }else if(!this.x(p0) && (TextUtils.x(p1) || this.g == null)){
          this.c();
          return super.shouldOverrideUrlLoading(p0, p1);
       }else if(a.t().d("ks_web_router", false) && this.y(p0)){
          t ot = PatchProxy.applyTwoRefs(p0, p1, this, og, "12");
          if (ot != patchProxyRe) {
          }else {
             ot = t.create(new f(e.f(p0), p1));
          }
          if (ot.throttleFirst(1, TimeUnit.SECONDS).blockingFirst().booleanValue()) {
             return b;
          }
       }
    }
    public g$b v(){
       return this.h;
    }
    public String w(WebView p0){
       YodaBaseWebView obj = PatchProxy.applyOneRefs(p0, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h(p0);
       String currentUrl = (obj != null)? obj.getCurrentUrl(): p0.getOriginalUrl();
       return currentUrl;
    }
    public final boolean x(WebView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Activity uActivity = a.b(p0.getContext());
       if (uActivity != null) {
          return uActivity.isFinishing();
       }
       uActivity = ActivityContext.g().e();
       if (uActivity != null) {
          return uActivity.isFinishing();
       }
       return false;
    }
    public final boolean y(WebView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       String obj = PatchProxy.applyOneRefs(p0, this, og, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          Object obj1 = PatchProxy.applyOneRefs(p0, this, og, "11");
          obj = "";
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             Activity uActivity = e.f(p0);
             if (uActivity != null) {
                obj = uActivity.getSystemService("activity").getRunningTasks(1).get(0).baseActivity.getClassName();
             }
          }
          return obj.contains("com.mini.app.activity.MiniAppActivity");
       }catch(java.lang.Exception e0){
       }
    }
    public boolean z(String p0){
       return false;
    }
}
