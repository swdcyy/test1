package com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.view.c$d;
import uxc.h;
import vxc.g;
import iyc.c;
import com.kwai.yoda.YodaWebView;
import com.yxcorp.gifshow.webview.yoda.view.d;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ym4.h;
import com.kuaishou.merchant.web.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$e;
import java.util.HashSet;
import android.content.Context;
import android.util.AttributeSet;
import mz7.a;
import java.util.concurrent.CopyOnWriteArrayList;
import ayc.g$a;
import java.util.HashMap;
import iyc.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import lnc.f1;
import tkd.b;
import tkd.d;
import vxc.f;
import vxc.e;
import txc.a;
import java.util.Map;
import iyc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vxc.h;
import com.yxcorp.gifshow.webview.yoda.h;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.webkit.WebView;
import my7.f;
import com.yxcorp.gifshow.webview.yoda.view.c;
import java.util.Objects;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.yoda.bridge.YodaWebChromeClient;
import myc.k;
import com.kwai.yoda.bridge.g;
import com.yxcorp.gifshow.webview.yoda.g;
import com.yxcorp.gifshow.webview.view.c;
import com.kuaishou.webkit.WebViewClient;
import px7.e;
import syc.a;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$c;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModelInternal;
import com.yxcorp.gifshow.webview.cookie.g;
import syc.e;
import android.os.SystemClock;
import jyc.a;
import oe6.a;
import java.lang.Integer;
import uv8.g1;
import java.lang.StringBuilder;
import q87.c;
import ekd.p0;
import wkd.b;
import eyc.a;
import java.util.List;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import android.widget.AbsoluteLayout;
import java.util.Set;
import com.yxcorp.retrofit.e;
import ua6.b;
import ua6.b$a;
import ia0.g;
import com.yxcorp.retrofit.f;
import java.util.Iterator;
import java.util.Collection;
import yz7.r;
import java.lang.Throwable;
import byc.c;
import lnc.db;
import com.kuaishou.webkit.WebSettings;
import sz7.l;
import android.view.KeyEvent;
import com.yxcorp.gifshow.webview.view.c$c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import hy7.a;
import com.kwai.performance.stability.crash.monitor.util.e;
import s66.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$d;
import android.view.MotionEvent;
import com.kwai.yoda.bridge.c;
import com.yxcorp.gifshow.webview.yoda.view.e;
import ayc.g;
import com.yxcorp.gifshow.webview.api.EnhancedWebView$a;
import java.lang.IllegalArgumentException;
import java.util.Locale;
import lnc.f4;
import qe6.d;
import android.net.Uri;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import xxc.a;
import o56.c;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class KwaiYodaWebView extends YodaWebView implements c$d, h, g, c	// class@0017e1
{
    public String b;
    public List c;
    public EnhancedWebView$a d;
    public e e;
    public c f;
    public c$c g;
    public KwaiYodaWebView$a h;
    public KwaiYodaWebView$b i;
    public c j;
    public g k;
    public k l;
    public KwaiYodaWebView$c m;
    public final Map n;
    public boolean o;
    public boolean p;
    public c q;
    public static final x r;
    public static KwaiYodaWebView$e s;
    public static final Set t;

    static {
       KwaiYodaWebView.r = Suppliers.a(d.b);
       if (PatchProxy.applyVoid(null, null, KwaiYodaWebView.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, h.class, "1")){
          KwaiYodaWebView.setYodaWebViewUrlProvider(a.a);
       }
       KwaiYodaWebView.t = new HashSet();
    }
    public void KwaiYodaWebView(Context p0){
       super(p0, null, null);
    }
    public void KwaiYodaWebView(Context p0,AttributeSet p1){
       super(p0, p1, 0, null);
    }
    public void KwaiYodaWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, null);
       this.c = new CopyOnWriteArrayList();
       this.d = new g$a();
       this.n = new HashMap(4);
       this.o = false;
       this.p = false;
       this.q = new a();
    }
    public void KwaiYodaWebView(Context p0,AttributeSet p1,int p2,a p3){
       super(p0, p1, p2, p3);
       this.c = new CopyOnWriteArrayList();
       this.d = new g$a();
       HashMap hashMap = new HashMap(4);
       this.n = hashMap;
       this.o = false;
       this.p = false;
       this.q = new a();
       q.b(p0.getApplicationContext());
       f1.a();
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "6")) {
       }else {
          this.e = d.a(-1995910978).gL();
          hashMap.putAll(a.a);
       }
       return;
    }
    public void KwaiYodaWebView(Context p0,AttributeSet p1,a p2){
       super(p0, null, 0, p2);
    }
    public static void setYodaWebViewUrlProvider(KwaiYodaWebView$e p0){
       KwaiYodaWebView.s = p0;
    }
    public void a(Class p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebView.class, "2")) {
          return;
       }
       this.q.a(p0, p1);
       return;
    }
    public void addJavascriptInterface(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebView.class, "41")) {
          return;
       }
       String str = "Kwai";
       if (TextUtils.n(str, p1) && p0 instanceof e) {
          this.e = p0;
       }
       if (p0 instanceof h) {
          h oh = p0.k(p0, p1);
          oh.f(this);
          Object[] objArray = null;
          if (TextUtils.n(str, p1)) {
             Object obj = PatchProxy.apply(objArray, objArray, q.class, "3");
             boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("disable_ks_bridge", false);
             if (!b) {
             label_0053 :
                if (!PatchProxy.applyVoidOneRefs(oh, this, KwaiYodaWebView.class, "43")) {
                   oh.d();
                   if (!PatchProxy.applyVoid(objArray, oh, h.class, "8") && oh.e != null) {
                      oh.a.addJavascriptInterface(oh, oh.b());
                   }
                }
             }
          }else {
             goto label_0053 ;
          }
       label_007a :
          this.n.put(p0.getClass().getName(), p1);
       }else {
          super.addJavascriptInterface(p0, p1);
       }
       return;
    }
    public void attach(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "26")) {
          return;
       }
       super.attach(p0);
       if (p0 instanceof c) {
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, p0, c.class, "18");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             c f = p0.f;
             if (f != null) {
                Bundle arguments = f.getArguments();
                if (arguments != null) {
                   objArray = arguments.getString("KEY_WEB_TYPE");
                }
             }
          }
          this.b = objArray;
       }
       return;
    }
    public String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebView.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.get(p0);
    }
    public YodaWebChromeClient createWebChromeClient(){
       k ok = PatchProxy.apply(null, this, KwaiYodaWebView.class, "14");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(this);
       }
       return ok;
    }
    public g createWebViewClient(){
       g og = PatchProxy.apply(null, this, KwaiYodaWebView.class, "15");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(this);
       }
       return og;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "37")) {
          return;
       }
       this.stopLoading();
       this.p();
       super.destroy();
       return;
    }
    public c getActionBarManager(){
       return this.f;
    }
    public WebViewClient getClientInWorkThread(){
       return this.k;
    }
    public e getJsInjectKwai(){
       return this.e;
    }
    public Map getLoadHeader(){
       HashMap obj = PatchProxy.apply(null, this, KwaiYodaWebView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("Accept-Encoding", "gzip, deflate, br");
       return obj;
    }
    public e getUserAgentJar(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mUserAgentJar == null) {
          this.mUserAgentJar = new a();
       }
       return this.mUserAgentJar;
    }
    public WebChromeClient getWebChromeClient(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          super.getWebChromeClient();
       }
       return this.l;
    }
    public WebViewClient getWebViewClient(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k == null) {
          super.getWebViewClient();
       }
       return this.k;
    }
    public k getYodaChromeClient(){
       return this.l;
    }
    public g getYodaWebViewClient(){
       return this.getYodaWebViewClient();
    }
    public g getYodaWebViewClient(){
       return this.k;
    }
    public void goBack(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "36")) {
          return;
       }
       this.p();
       super.goBack();
       KwaiYodaWebView tm = this.m;
       if (tm != null) {
          tm.a();
       }
       return;
    }
    public b h(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.h(p0);
    }
    public void handleLaunchModel(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "7")) {
          return;
       }
       g.h(this, this.getLaunchModel().getUrl());
       return;
    }
    public void initJavascriptBridge(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "42")) {
          return;
       }
       this.mJavascriptBridge = new e(this);
       return;
    }
    public void injectCookie(){
       boolean b;
       String currentUrl;
       HashMap hashMap1;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiYodaWebView.class, "8")) {
          return;
       }
       super.injectCookie();
       SystemClock.elapsedRealtime();
       a uoa = a.class;
       Object[] obj = PatchProxy.apply(objArray, objArray, uoa, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(a.a == null){
          String str1 = a.b();
          String[] obj1 = PatchProxy.applyOneRefs(str1, objArray, uoa, "2");
          boolean b1 = true;
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             obj1 = str1.split("\\.");
             if (obj1.length >= 3 && (Integer.parseInt(obj1[0]) <= 8 && (Integer.parseInt(obj1[b1]) <= 0 && Integer.parseInt(obj1[2]) <= 40))) {
                b1 = false;
             }
          }
          a.a = Boolean.valueOf(b1);
          obj = new Object[false];
          g1.C().w("AppVersionUtil", "historyVerion: "+str1+" : is new version ? "+a.a, obj);
       }
       b = a.a.booleanValue();
       if (!b) {
          try{
             currentUrl = this.getCurrentUrl();
             if (!PatchProxy.applyVoidOneRefs(currentUrl, this, KwaiYodaWebView.class, "9")) {
                currentUrl = p0.n(currentUrl);
                String str = PatchProxy.applyOneRefs(currentUrl, this, KwaiYodaWebView.class, "10");
                if (str != patchProxyRe) {
                }else {
                   List list = b.a(-1275906972).a();
                   str = (list == null || list.isEmpty())? this.v(currentUrl, g.a): this.v(currentUrl, list);
                }
                if (TextUtils.x(str)) {
                   YodaCookie.f.a(currentUrl, false);
                }else if(PatchProxy.applyVoidTwoRefs(this.getContext(), str, this, KwaiYodaWebView.class, "12")){
                   g.d();
                   if (KwaiYodaWebView.t.isEmpty()) {
                      Map map = YodaCookie.f.b();
                      Set d = g.d;
                      if (d.isEmpty()) {
                         HashMap hashMap = new HashMap();
                         hashMap1 = new HashMap();
                         if (e.h().e()) {
                            b$a c = b.c;
                            hashMap.putAll(c.a().d());
                            hashMap1.putAll(c.a().b());
                         }else {
                            b.a(-1961311520).e().d(hashMap);
                            b.a(-1961311520).e().b(hashMap1);
                         }
                         iterator = hashMap.keySet().iterator();
                         while (iterator.hasNext()) {
                            map.remove(iterator.next());
                         }
                         iterator = hashMap1.keySet().iterator();
                         while (iterator.hasNext()) {
                            map.remove(iterator.next());
                         }
                      }else {
                         iterator = d.iterator();
                         while (iterator.hasNext()) {
                            map.remove(iterator.next());
                         }
                      }
                      KwaiYodaWebView.t.addAll(map.keySet());
                   }
                   Iterator iterator1 = KwaiYodaWebView.t.iterator();
                   while (iterator1.hasNext()) {
                      currentUrl = iterator1.next();
                      if (!TextUtils.x(currentUrl)) {
                         r.b("CookieInjectManager", "clear cookie: "+currentUrl);
                         hashMap1 = new HashMap();
                         hashMap1.put(currentUrl, "");
                         YodaCookie.f.o(str, hashMap1, false, false);
                      }
                   }
                }
             }
          }catch(java.lang.Exception e0){
             obj = new Object[false];
             g1.C().A(this.getClass().getSimpleName(), "get url host error:"+currentUrl, obj);
          }
       }
    }
    public boolean isAppEvent(){
       boolean b;
       KwaiYodaWebView obj = PatchProxy.apply(null, this, KwaiYodaWebView.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.isAppEvent()) {
          obj = this.j;
          if (obj == null || obj.a()) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public boolean isWebViewEmbedded(){
       return this.o;
    }
    public void loadUrl(String p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "27")) {
          return;
       }
       if (!TextUtils.x(p0) && (!p0.startsWith("javascript:") && !p0.equalsIgnoreCase("about:blank"))) {
          WebSettings webSettings = null;
          KwaiYodaWebView$e s = KwaiYodaWebView.s;
          if (s != null) {
             str = s.a(p0);
             if (str != null) {
                webSettings = 1;
             }
          }else {
             str = p0;
          }
          if (!webSettings) {
             str = db.a(p0);
          }
          this.q(p0);
          this.r(str);
          p0 = str;
       }
    label_003c :
       this.getSettings().setUserAgentString(this.s(p0));
       if (p0.startsWith("https") && (this.isUseKsWebView() && this.u(p0))) {
          super.loadUrl(p0, this.getLoadHeader());
          p0.supportBr = Boolean.TRUE;
       }else {
          super.loadUrl(p0);
       }
       return;
    }
    public void loadUrl(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebView.class, "31")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.q(p0);
          p0 = db.a(p0);
       }
       this.r(p0);
       this.getSettings().setUserAgentString(this.s(p0));
       if (p0.startsWith("https") && (this.isUseKsWebView() && this.u(p0))) {
          HashMap hashMap = new HashMap(p1);
          String str = "Accept-Encoding";
          if (!hashMap.containsKey(str)) {
             hashMap.put(str, "gzip, deflate, br");
          }
          super.loadUrl(p0, hashMap);
          p0.supportBr = Boolean.TRUE;
       }else {
          super.loadUrl(p0, p1);
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "39")) {
          return;
       }
       super.onAttachedToWindow();
       return;
    }
    public boolean onCheckIsTextEditor(){
       return true;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "40")) {
          return;
       }
       super.onDetachedFromWindow();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (PatchProxy.isSupport(KwaiYodaWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KwaiYodaWebView.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 4;
       if (p0 == i) {
          KwaiYodaWebView tf = this.f;
          if (tf != null && tf.r != null) {
             tf = this.g;
             if (tf != null) {
                tf.onBackPressed();
                return true;
             }
          }
       }
       if (p0 == i && this.canGoBack()) {
          KwaiYodaWebView th = this.h;
          if (th != null) {
             return th.a();
          }else {
             this.goBack();
             return true;
          }
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(KwaiYodaWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, KwaiYodaWebView.class, "21")) {
          return;
       }
       super.onOverScrolled(p0, p1, p2, p3);
       KwaiYodaWebView ti = this.i;
       if (ti != null) {
          ti.onOverScrolled(p0, p1, p2, p3);
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiYodaWebView.class, "46")) {
          return;
       }
       super.onPause();
       if (a.a(this.getContext()) && !PatchProxy.applyVoid(objArray, this, KwaiYodaWebView.class, "38")) {
          LaunchModel launchModel = this.getLaunchModel();
          if (launchModel != null) {
             Object obj = e.p().get("web_url");
             if (obj instanceof String && TextUtils.n(obj, launchModel.getUrl())) {
                a.e("web_url");
                a.e("current_web_url");
                a.e("web_user_agent");
                a.e("cpuUsage");
                a.e("webviewMemoryUsage");
                a.e("webviewMediaCodecCount");
                a.e("webviewFps");
                a.e("webviewProfilingTs");
             }
          }
       }
       return;
    }
    public void onPauseEvent(boolean p0){
       if (PatchProxy.isSupport(KwaiYodaWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiYodaWebView.class, "49")) {
          return;
       }
       super.onPauseEvent(p0);
       KwaiYodaWebView tj = this.j;
       if (tj != null) {
          tj.onPauseEvent(p0);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "45")) {
          return;
       }
       super.onResume();
       this.resumeTimers();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onResume();
       }
       this.r(this.getCurrentUrl());
       e.v("web_user_agent", TextUtils.k(this.getSettings().getUserAgentString()));
       return;
    }
    public void onResumeEvent(boolean p0){
       if (PatchProxy.isSupport(KwaiYodaWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiYodaWebView.class, "48")) {
          return;
       }
       super.onResumeEvent(p0);
       KwaiYodaWebView tj = this.j;
       if (tj != null) {
          tj.onResumeEvent(p0);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       KwaiYodaWebView obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       if (obj != null) {
          obj.onTouchEvent(p0);
       }
       if (this.p != null) {
          return false;
       }else {
          return super.onTouchEvent(p0);
       }
    }
    public void onUrlLoading(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebView.class, "34")) {
          return;
       }
       super.onUrlLoading(p0, p1);
       p0.i = e.b;
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebView.class, "52")) {
          return;
       }
       b.a(0x63531a27).a().b(this);
       KwaiYodaWebView tf = this.f;
       if (tf != null) {
          tf.g();
       }
       this.d.b(this);
       return;
    }
    public final void q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "51")) {
          return;
       }
       b.a(0x63531a27).a().a(this, p0);
       KwaiYodaWebView tf = this.f;
       if (tf != null) {
          tf.g();
       }
       this.d.a(this, p0);
       return;
    }
    public final void r(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "32")) {
          return;
       }
       LaunchModel launchModel = this.getLaunchModel();
       if (launchModel != null) {
          e.v("web_url", TextUtils.k(launchModel.getUrl()));
       }
       e.v("current_web_url", TextUtils.k(p0));
       return;
    }
    public void removeJavascriptInterface(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "44")) {
          return;
       }
       super.removeJavascriptInterface(p0);
       if (TextUtils.n("Kwai", p0)) {
          this.e = null;
       }
       return;
    }
    public String s(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebView.class, "30");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.getSettings().getUserAgentString();
       if (!TextUtils.x(this.b)) {
          p0 = p0+" WebType/"+this.b;
       }
       return p0;
    }
    public void setBackInterceptor(KwaiYodaWebView$a p0){
       this.h = p0;
    }
    public void setCurrentUrl(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebView.class, "33")) {
          return;
       }
       super.setCurrentUrl(p0, p1);
       return;
    }
    public void setDisableTouch(boolean p0){
       this.p = p0;
    }
    public void setLifeEventCallback(c p0){
       this.j = p0;
    }
    public void setLoadingCallback(EnhancedWebView$a p0){
       this.d = p0;
    }
    public void setOnBackPressedListener(c$c p0){
       this.g = p0;
    }
    public void setOnOverScrolledCallBack(KwaiYodaWebView$b p0){
       this.i = p0;
    }
    public void setOnUrlChangeCallback(KwaiYodaWebView$c p0){
       this.m = p0;
    }
    public void setWebChromeClient(WebChromeClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "19")) {
          return;
       }
       super.setWebChromeClient(p0);
       if (p0 instanceof k) {
          this.l = p0;
       }else if(p0 != null){
          g1.C().e("KwaiYodaWebView", "use KwaiYodaChromeClient!", new IllegalArgumentException(String.valueOf(p0)));
          this.l = null;
       }else {
          this.l = null;
       }
       return;
    }
    public void setWebSettings(WebSettings p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "24")) {
          return;
       }
       super.setWebSettings(p0);
       this.getSettings().setTextZoom(100);
       f4.d(this.getContext(), d.d(f4.a()));
       return;
    }
    public void setWebTypeUA(String p0){
       this.b = p0;
    }
    public void setWebViewActionBarManager(c p0){
       this.f = p0;
    }
    public void setWebViewClient(WebViewClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "17")) {
          return;
       }
       super.setWebViewClient(p0);
       this.w(p0);
       return;
    }
    public void setWebViewEmbedded(boolean p0){
       this.o = p0;
    }
    public void setYodaChromeClient(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "23")) {
          return;
       }
       this.l = p0;
       this.setWebChromeClient(p0);
       return;
    }
    public void setYodaWebViewClient(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "22")) {
          return;
       }
       this.k = p0;
       this.setWebViewClient(p0);
       return;
    }
    public void t(KwaiYodaWebView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "5")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public boolean u(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebView.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          Uri uri = Uri.parse(p0);
          String host = uri.getHost();
          uri = uri.getPath();
          List value = a.t().getValue("should_load_with_br", new KwaiYodaWebView$1(this).getType(), null);
          if (value != null && !value.isEmpty()) {
             Iterator iterator = value.iterator();
             if (iterator.hasNext()) {
                JsonObject jsonObject = iterator.next();
                String str = jsonObject.e0("host").w();
                String str1 = jsonObject.e0("path").w();
                if (str.equals("*") && str1.equals("*")) {
                   return true;
                }else if(host.equalsIgnoreCase(str) && uri.equalsIgnoreCase(str1)){
                   return true;
                }else if(host.equalsIgnoreCase(str) && str1.equals("*")){
                   return true;
                }
             }
          }
          return b;
       }catch(java.lang.Exception e0){
       }
    }
    public final String v(String p0,List p1){
       String str1;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiYodaWebView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          String str = "";
          if (!iterator.hasNext()) {
             return str;
          }
          obj = TextUtils.k(iterator.next());
          g og = g.class;
          str1 = PatchProxy.applyOneRefs(obj, null, og, "3");
          if (str1 != PatchProxyResult.class) {
          }else {
             Object obj1 = PatchProxy.applyOneRefs(obj, null, og, "4");
             boolean b = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): (obj.replaceAll("\\.\(?:com\\.cn|cn|com|net|edu\\..*|org\)", str)).contains(".") ^ 0x01;
             if (b) {
                obj = "www."+obj;
             }
             str1 = obj;
          }
          if (TextUtils.n(str1, p0)) {
             break ;
          }
       }
       return str1;
    }
    public final void w(WebViewClient p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebView.class, "18")) {
          return;
       }
       if (p0 instanceof g) {
          this.k = p0;
       }else if(p0 instanceof a){
          a = p0.a;
          if (a == p0) {
             this.w(null);
          }else {
             this.w(a);
          }
       }else if(p0 != null){
          g1.C().e("KwaiYodaWebView", "use KwaiYodaClient or ForwardingWebViewClient!", new IllegalArgumentException(String.valueOf(p0)));
          if (!a.a().c() && !SystemUtil.I()) {
             ExceptionHandler.handleCaughtException(new IllegalArgumentException("use KwaiYodaClient or ForwardingWebViewClient!"));
             this.k = null;
          }else {
             throw new IllegalArgumentException(String.valueOf(p0));
          }
       }else {
          this.k = null;
       }
       return;
    }
}
