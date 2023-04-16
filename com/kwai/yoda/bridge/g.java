package com.kwai.yoda.bridge.g;
import qy7.b;
import com.kwai.yoda.bridge.g$a;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.YodaInitConfig;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rx7.u;
import rx7.d0;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import java.lang.Boolean;
import px7.b;
import kotlin.jvm.internal.a;
import my7.i;
import my7.j;
import java.lang.Integer;
import java.lang.Exception;
import java.lang.StringBuilder;
import yz7.r;
import jz7.e;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;
import android.net.Uri;
import sx7.x;
import sx7.x$a;
import sx7.x$b;
import com.kwai.yoda.cache.YodaXCache;
import iz7.i;
import java.util.Objects;
import com.kwai.yoda.model.LaunchModel;
import java.util.List;
import com.kwai.yoda.model.LaunchModelInternal;
import java.lang.Long;
import xz7.c;
import brd.t;
import java.util.concurrent.TimeUnit;
import java.lang.RuntimeException;
import sz7.l;
import com.kwai.yoda.session.logger.webviewload.XCacheInfo;
import com.kwai.yoda.request.YodaWebRequestProcessor;
import gz7.b;
import gz7.a;
import iz7.j;
import java.lang.CharSequence;
import yb7.o;
import nz7.e;
import com.kwai.yoda.bridge.g$b;
import yz7.n;
import android.view.View;
import px7.d;
import my7.o;
import tx7.a;
import brd.a0;
import brd.z;
import tx7.b;
import tx7.c;
import erd.g;
import crd.b;
import rx7.c0;
import java.lang.Runnable;
import ca7.v;
import android.graphics.Bitmap;
import com.kwai.yoda.bridge.c;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import rx7.b;
import ty7.j;
import com.kwai.yoda.event.d;
import com.kuaishou.webkit.RenderProcessGoneDetail;
import sz7.e;
import vy7.a;
import java.util.concurrent.atomic.AtomicInteger;
import sz7.i;
import java.lang.System;
import java.util.concurrent.CopyOnWriteArrayList;
import sz7.m;
import com.kuaishou.webkit.URLUtil;
import java.lang.Throwable;

public class g extends b	// class@001192
{
    public YodaBaseWebView a;
    public boolean b;
    public YodaWebRequestProcessor c;
    public g$b d;

    public void g(){
       super();
       this.b = true;
       this.d = new g$a(this);
       Yoda.get().getConfig();
    }
    public void g(YodaBaseWebView p0){
       super();
       this.b = true;
       this.d = new g$a(this);
       Yoda.get().getConfig();
       this.a = p0;
       d0 uod0 = PatchProxy.apply(null, this, g.class, "10");
       if (uod0 != PatchProxyResult.class) {
       }else {
          uod0 = new d0(this);
       }
       p0.registerLoadIntercept(uod0);
       return;
    }
    public boolean d(WebView p0,SslErrorHandler p1,SslError p2){
       Boolean uBoolean1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "19");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          boolean b1 = true;
          if (Yoda.get().isDebugMode()) {
             return b1;
          }
          YodaBaseWebView yodaBaseWebV = this.h(p0);
          if (yodaBaseWebV == null) {
             return b;
          }
          Boolean uBoolean = PatchProxy.applyThreeRefs(yodaBaseWebV, p1, p2, null, b.class, "7");
          if (uBoolean != patchProxyRe) {
          }else {
             a.q(yodaBaseWebV, "$this$handleReceivedSslAction");
             i managerProvi = yodaBaseWebV.getManagerProvider();
             if (managerProvi != null) {
                j oj = managerProvi.a();
                if (oj != null) {
                   uBoolean1 = Boolean.valueOf(oj.c(yodaBaseWebV, p1, p2));
                label_0057 :
                   uBoolean = uBoolean1;
                }
             }
             uBoolean1 = null;
             goto label_0057 ;
          }
          if (uBoolean != Boolean.TRUE) {
             b1 = false;
          }
          Integer integer = Integer.valueOf(p2.getPrimaryError());
          String str = p2.toString();
          String str1 = (b1)? "accept": "refuse";
          yodaBaseWebV.onWebViewLoadError("SSL_ERROR", integer, str, null, str1, Boolean.FALSE);
          return b1;
       }catch(java.lang.Exception e12){
          e12.printStackTrace();
          r.d("YodaWebViewClient", "onReceivedSslError : "+e12.getMessage());
          return b;
       }
    }
    public void doUpdateVisitedHistory(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "15")) {
          return;
       }
       this.a.getMediaRecorder().f("native_audio_recorder_error", "userCancel", "history changed");
       super.doUpdateVisitedHistory(p0, p1, p2);
       return;
    }
    public final WebResourceResponse e(YodaBaseWebView p0,WebResourceRequest p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x$a obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       r.g("YodaWebViewClient: "+p1.getUrl()+" : "+p1.isForMainFrame());
       obj = x.h.h(p0.getCurrentUrl());
       x$a enable = obj.enable;
       String str = "request";
       String str1 = null;
       if (enable != null && enable.booleanValue()) {
          YodaXCache n = YodaXCache.n;
          i oi = new i(p1);
          oi.i(obj);
          Objects.requireNonNull(n);
          WebResourceResponse webResourceR = PatchProxy.applyTwoRefs(oi, p0, n, YodaXCache.class, "19");
          if (webResourceR != patchProxyRe) {
          }else {
             a.q(oi, str);
             LaunchModel launchModel = p0.getLaunchModel();
             List list = (launchModel != null)? launchModel.getHyIds(): str1;
             Uri uri = oi.d();
             String str2 = (uri != null)? uri.toString(): str1;
             x$a proxyTimeout = oi.a().proxyTimeout;
             long l = (proxyTimeout != null)? proxyTimeout.longValue(): 15;
             r.b("YodaXCache", "[YodaXCache]intercept WebResourceResponse:"+str2);
             try{
                int i = p0;
                t ot = YodaXCache.m(n, oi, i, list, null, 8, null);
                if (ot != null) {
                   ot = ot.timeout(l, TimeUnit.SECONDS);
                   if (ot != null) {
                      str1 = ot.blockingFirst();
                   }
                }
             }catch(java.lang.RuntimeException e13){
                r.b("YodaXCache", "[YodaXCache]get_response_fail:"+str2+' '+e13.getMessage());
             }
             webResourceR = str1;
          }
          return webResourceR;
       }else {
          obj = obj.offlinenable;
          if (obj == null || obj.booleanValue()) {
             if (this.c == null) {
                this.c = new YodaWebRequestProcessor(p0);
             }
             g tc = this.c;
             Objects.requireNonNull(tc);
             i obj1 = PatchProxy.applyTwoRefs(p1, p0, tc, YodaWebRequestProcessor.class, "6");
             if (obj1 != patchProxyRe) {
                str1 = obj1;
             }else {
                a.q(p1, "webRequest");
                obj1 = new i(p1);
                b uob = tc.a();
                Objects.requireNonNull(uob);
                str1 = PatchProxy.applyTwoRefs(obj1, p0, uob, a.class, "5");
                if (str1 != patchProxyRe) {
                }else {
                   a.q(obj1, str);
                   str1 = uob.a(obj1, p0);
                }
                if (str1 != null) {
                   r.g("Intercept "+obj1.d()+" with offline package");
                }
             }
          }else {
             p0.getSessionPageInfoModule().e().offlineEnable = Boolean.FALSE;
          }
          boolean b = o.b(p1.getUrl().toString(), p0.getCurrentUrl());
          if (p1.isForMainFrame() || b) {
             r.h("YodaWebViewClient", "request.isForMainFrame\(\):"+p1.isForMainFrame()+",  mainRequest:"+b);
             p0.getSessionLogger().w("load_request");
             if (str1 == null) {
                p0.getSessionPageInfoModule().k("system");
             }else {
                p0.getSessionPageInfoModule().k("hy");
             }
             p0.mainDocCancelReason = "url_switch";
          }
          return str1;
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       this.g().s0(this.a);
       return;
    }
    public g$b g(){
       return this.d;
    }
    public YodaBaseWebView h(WebView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (n.f(p0)) {
          return null;
       }
       return p0;
    }
    public boolean i(){
       return this.b;
    }
    public boolean j(String p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "13");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       YodaInitConfig config = Yoda.get().getConfig();
       boolean b = (config != null && config.isErrorReportJsEnable())? true: false;
       return b;
    }
    public void k(long p0){
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       super.onPageFinished(p0, p1);
       String str = "YodaWebViewClient";
       if (n.a(p0) || n.f(p0)) {
          r.j(str, "onPageFinished but mismatch webview: "+p0);
          return;
       }else {
          WebView webView = p0;
          r.h(str, "onPageFinished url="+p1+" progress:"+webView.getProgress());
          if (webView.getProgress() < 100 || webView.isPageLoadFinished()) {
             r.h(str, "onPageFinished, progress less than 100 or isPageLoadFinished, progess:"+webView.getProgress());
             return;
          }else {
             webView.setProgressVisibility(4);
             g ta = this.a;
             Object obj = null;
             if (PatchProxy.applyOneRefs(ta, obj, d.class, "6") != PatchProxyResult.class) {
             }else {
                a.q(ta, "$this$hideLoadingPageFallback");
                i managerProvi = ta.getManagerProvider();
                if (managerProvi != null) {
                   o oo = managerProvi.b();
                   if (oo != null) {
                      oo.c();
                   }
                }
             }
             webView.preCachePool();
             a i = a.i;
             Objects.requireNonNull(i);
             a uoa = a.class;
             boolean b = true;
             if (!PatchProxy.applyVoid(obj, i, uoa, "9")) {
                int h = a.h;
                a.h = (h <= b)? 0: h - 1;
                String str1 = "YodaCodeCache";
                r.b(str1, "onPageFinished: "+a.h);
                if (!a.h && !PatchProxy.applyVoid(obj, i, uoa, "11")) {
                   r.b(str1, "checkImportant\(\) called");
                   if (a.e) {
                      r.b(str1, "checkImportant\(\) checked in this app life");
                   }else if(!i.n()){
                      r.j(str1, "checkImportant Please call inited\(\) first.");
                   }else if(!a.c){
                      r.j(str1, "checkImportant Code cache generating is not supported by webview core.");
                   }else {
                      a.e = b;
                      a0.Y(3, TimeUnit.SECONDS).T(a.a).R(b.b, c.b);
                      r.b(str1, "checkImportant\(\) start delay");
                   }
                }
             }
          label_0102 :
             webView.getSessionLogger().w("did_end_load");
             webView.setPageLoadFinished(b);
             boolean b1 = this.i();
             this.u(b);
             if (("about:blank").equals(p1)) {
                webView.onWebViewLoadError("ILLEGAL_URL", null, "BLANK_PAGE, url:"+p1, p1, null, null);
             }else if(b1){
                v.e(new c0(webView));
             }
             this.g().H(p0, p1, b1);
             webView.injectCommonParams();
             return;
          }
       }
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       Object[] this;
       Map a;
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "11")) {
          return;
       }
       String str = "YodaWebViewClient";
       r.h(str, "onPageStarted loadUrl="+p1);
       YodaXCache n = YodaXCache.n;
       Objects.requireNonNull(n);
       YodaXCache yodaXCache = YodaXCache.class;
       this = null;
       if (!PatchProxy.applyVoid(this, n, yodaXCache, "32") && !PatchProxy.applyVoid(this, n, yodaXCache, "18")) {
          b i1 = YodaXCache.i;
          if (i1 != null) {
             if (!(i1.isDisposed() ^ 0x01)) {
                objArray = this;
             }
             if (i1 != null) {
                i1.dispose();
             }
          }
          YodaXCache.i = this;
          i1 = YodaXCache.j;
          if (i1 != null) {
             if (!(i1.isDisposed() ^ 0x01)) {
                objArray = this;
             }
             if (i1 != null) {
                i1.dispose();
             }
          }
          YodaXCache.j = this;
       }
       a i = a.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(this, i, a.class, "8")) {
          a.h = a.h + 1;
          r.b("YodaCodeCache", "onPageStart: "+a.h);
       }
       if (n.a(p0) || n.f(p0)) {
          r.j(str, "onPageStarted but mismatch webview: "+p0);
          return;
       }else {
          YodaBaseWebView yodaBaseWebV = p0;
          if (yodaBaseWebV.getLoadEventLogger().e()) {
             yodaBaseWebV.evaluateJavascript("const times = [];\nlet fps;\nlet lastTime = 0;\nlet recording = true;\n\nfunction refreshLoop\(\) {\n  window.requestAnimationFrame\(\(\) => {\n    const now = performance.now\(\);\n    while \(times.length > 0 && times[0] <= now - 1000\) {\n      times.shift\(\);\n    }\n    times.push\(now\);\n    fps = times.length;\n    if \(lastTime < now - 1000\) {\n    __yodaBridge__.fpsUpdate\(fps\);\n    lastTime = now;\n    }\n    if \(recording\) {\n    refreshLoop\(\);\n    }\n  }\);\n}\n\nrefreshLoop\(\);");
          }
          boolean b = false;
          yodaBaseWebV.setPageLoadFinished(b);
          yodaBaseWebV.getSessionLogger().w("did_start_load");
          if (!PatchProxy.applyVoidTwoRefs(yodaBaseWebV, p1, this, g.class, "12")) {
             yodaBaseWebV.getSessionLogger().w("start_inject_local_js");
             Iterator iterator = Yoda.get().getPreloadJsContentMap().keySet().iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                if (this.j(str1, p1)) {
                   String str2 = Yoda.get().getPreloadJsContentMap().get(str1);
                   if (!o.c(str2)) {
                      yodaBaseWebV.evaluateJavascript(str2);
                      yodaBaseWebV.getSessionPageInfoModule().i(Boolean.TRUE);
                   }else {
                      a = b.a;
                      if (!o.c(a.get(str1))) {
                         yodaBaseWebV.evaluateJavascript(a.get(str1));
                         yodaBaseWebV.getSessionPageInfoModule().i(Boolean.TRUE);
                      }
                   }
                }
             }
             if (j.c.c()) {
                yodaBaseWebV.evaluateJavascript("var head = document.getElementsByTagName\(\'head\'\)[0];\n    var script = document.createElement\(\'script\'\)\n    script.setAttribute\(\'src\', \'https://d2.static.yximgs.com/udata/pkg/yoda-test/yoda-debugger/yoda_debugger_inject.js\'\)\n    head.insertBefore\(script, head.firstChild\)");
             }
             yodaBaseWebV.getSessionLogger().w("local_js_injected");
          }
          yodaBaseWebV.evaluateJavascript("typeof __yodaBridgeReady__ === \'function\'  && __yodaBridgeReady__\(\)");
          yodaBaseWebV.injectCommonParams();
          yodaBaseWebV.setCurrentUrl(p1, "page_started");
          d.f().b(yodaBaseWebV);
          yodaBaseWebV.setProgressVisibility(b);
          yodaBaseWebV.getSessionLogger().w("progress_shown");
          this.g().O(p0, p1, p2);
          return;
       }
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, g.class, "3")) {
          return;
       }
       r.d("YodaWebViewClient", p1+" : "+p2+" : "+p3);
       super.onReceivedError(p0, p1, p2, p3);
       if (n.a(p0) || n.f(p0)) {
          r.j("YodaWebViewClient", "onReceivedError but mismatch webview: "+p0);
          return;
       }else {
          this.s(p0, p1, p2, p3, "LOADING_ERROR");
          this.g().q0(p0, p1, p2, p3);
          return;
       }
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "4")) {
          return;
       }
       super.onReceivedHttpError(p0, p1, p2);
       if (n.a(p0) || n.f(p0)) {
          r.j("YodaWebViewClient", "onReceivedHttpError but mismatch webview: "+p0);
          return;
       }else {
          this.s(p0, p2.getStatusCode(), p2.getReasonPhrase(), p1.getUrl().toString(), "NETWORK_ERROR");
          this.g().r0(p0, p1, p2);
          return;
       }
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "18")) {
          return;
       }
       if (this.d(p0, p1, p2)) {
          p1.proceed();
       }else {
          super.onReceivedSslError(p0, p1, p2);
       }
       return;
    }
    public boolean onRenderProcessGone(WebView p0,RenderProcessGoneDetail p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       YodaBaseWebView yodaBaseWebV = this.h(p0);
       if (yodaBaseWebV != null) {
          if (p1.didCrash()) {
             yodaBaseWebV.onWebViewLoadError("RENDER_CRASH", Integer.valueOf(0x2710), null, null, null, Boolean.TRUE);
          }else {
             yodaBaseWebV.onWebViewLoadError("RENDER_KILL", Integer.valueOf(0x2711), null, null, null, Boolean.TRUE);
             yodaBaseWebV.setRenderProcessKilled(true);
          }
       }
       return true;
    }
    public void q(String p0){
       if (n.a(this.a)) {
          return;
       }
       this.a.onUrlLoading(p0, "load");
       return;
    }
    public boolean r(WebView p0,String p1){
       return false;
    }
    public void s(WebView p0,int p1,String p2,String p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, og, "5")) {
             return;
          }
       }
       YodaBaseWebView yodaBaseWebV = p0;
       boolean b = (yodaBaseWebV.getCurrentUrl()).equals(p3);
       r.h("YodaWebViewClient", "onReceivedError : errorCode="+p1+" description: "+p2+" failingUrl: "+p3+" mainRequest="+b+", resultType:"+p4);
       if (b) {
          this.u(0);
          yodaBaseWebV.onWebViewLoadError(p4, Integer.valueOf(p1), p2, p3, null, Boolean.TRUE);
       }else {
          yodaBaseWebV.getSessionPageInfoModule().httpErrorInfo.add(new e(p3, Integer.valueOf(p1), p2));
       }
       return;
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,WebResourceRequest p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.getUrl().toString();
       r.h(this.getClass().getSimpleName(), "shouldInterceptRequest"+obj);
       YodaBaseWebView yodaBaseWebV = this.h(p0);
       if (yodaBaseWebV != null) {
          if (a.a()) {
             r.b("YodaWebViewClient", "tryInjectCookieOnInterceptRequest");
             yodaBaseWebV.tryInjectCookie(obj);
          }
          yodaBaseWebV.getSessionPageInfoModule().apiRequestCount.incrementAndGet();
       }
       if (obj.endsWith(".js") || obj.endsWith(".css")) {
          i oi = new i();
          oi.url = obj;
          oi.loadTime = Long.valueOf(System.currentTimeMillis());
          oi.loadType = "system";
          if (yodaBaseWebV != null) {
             yodaBaseWebV.getSessionPageInfoModule().e().a.add(oi);
          }
       }
       WebResourceResponse webResourceR = null;
       if (yodaBaseWebV != null) {
          try{
             yodaBaseWebV.getSessionLogger().l().b(obj, p1.isForMainFrame());
             if (URLUtil.isHttpUrl(obj)) {
                yodaBaseWebV.getSessionLogger().l().c().add(obj);
             }
             yodaBaseWebV.getSessionPageInfoModule().hyRequestCount.incrementAndGet();
             webResourceR = this.e(yodaBaseWebV, p1);
          }catch(java.lang.Exception e0){
             r.e("YodaWebViewClient", e0);
             if (p1.isForMainFrame()) {
                r.h("YodaWebViewClient", "request.isForMainFrame, Exception:"+e0.getMessage());
                yodaBaseWebV.getSessionLogger().w("load_request");
                yodaBaseWebV.getSessionPageInfoModule().k("system");
             }
          }
       }
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,String p1){
       YodaBaseWebView obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h(p0);
       if (obj != null && a.a()) {
          r.b("YodaWebViewClient", "tryInjectCookieOnInterceptRequest");
          obj.tryInjectCookie(p1);
       }
       return super.shouldInterceptRequest(p0, p1);
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.shouldOverrideUrlLoading(p0, p1);
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       g og = g.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, og, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       r.h("YodaWebViewClient", "shouldOverrideUrlLoading url:"+p1);
       this.a.getMediaRecorder().f("native_audio_recorder_error", "userCancel", "overide url loading");
       if (this.r(p0, p1)) {
          return true;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "17")) {
          if (n.a(p0) || n.f(p0)) {
             r.j("YodaWebViewClient", "onUrlLoading but mismatch webview: "+p0);
          }else {
             p0.onUrlLoading(p1, "override");
          }
       }
       return super.shouldOverrideUrlLoading(p0, p1);
    }
    public void t(g$b p0){
       this.d = p0;
    }
    public void u(boolean p0){
       this.b = p0;
    }
}
