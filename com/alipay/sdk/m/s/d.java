package com.alipay.sdk.m.s.d;
import com.alipay.sdk.m.s.e$e;
import com.alipay.sdk.m.s.e$f;
import com.alipay.sdk.m.s.e$g;
import com.alipay.sdk.m.s.c;
import android.app.Activity;
import s6.a;
import java.lang.String;
import v6.d;
import com.alipay.sdk.m.s.e$d;
import com.alipay.sdk.m.s.e;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.kuaishou.webkit.JsPromptResult;
import java.lang.CharSequence;
import com.alipay.sdk.m.s.d$a;
import java.lang.Runnable;
import com.kuaishou.webkit.JsResult;
import java.lang.StringBuilder;
import k6.a;
import android.widget.ImageView;
import android.os.SystemClock;
import com.alipay.sdk.m.q.b;
import android.text.TextUtils;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import java.lang.Throwable;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import java.lang.Object;
import com.alipay.sdk.m.s.d$d;
import com.alipay.sdk.m.f.c;
import j6.b;
import java.util.Iterator;
import java.util.Stack;
import org.json.JSONObject;
import com.alipay.sdk.m.s.d$f;
import android.widget.LinearLayout;
import com.alipay.sdk.m.s.d$g;
import j6.c;
import m6.a$b;
import java.util.List;
import java.util.Collections;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import java.util.HashMap;
import android.view.animation.TranslateAnimation;
import com.alipay.sdk.m.s.d$c;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import com.alipay.sdk.m.s.d$b;

public class d extends c implements e$e, e$f, e$g	// class@000eaa
{
    public boolean d;
    public String e;
    public boolean f;
    public final a g;
    public boolean h;
    public e i;
    public d j;

    public void d(Activity p0,a p1,String p2){
       super(p0, p2);
       boolean b = true;
       this.d = b;
       this.e = "GET";
       this.f = false;
       this.i = null;
       this.j = new d();
       this.g = p1;
       try{
          _monitor_enter(this);
          e uoe = new e(this.b, p1, new e$d((this.l() ^ b), (b ^ this.l())));
          this.i = uoe;
          uoe.setChromeProxy(this);
          this.i.setWebClientProxy(this);
          this.i.setWebEventProxy(this);
          this.addView(this.i);
          _monitor_exit(this);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean q(d p0,boolean p1){
       p0.f = p1;
       return p1;
    }
    public synchronized boolean a(e p0,String p1,String p2,String p3,JsPromptResult p4){
       if (p2.startsWith("<head>") && p2.contains("sdk_result_code:")) {
          this.b.runOnUiThread(new d$a(this));
       }
       p4.cancel();
       return true;
    }
    public synchronized void b(e p0){
       this.u();
    }
    public synchronized boolean c(e p0,int p1,String p2,String p3){
       this.h = true;
       a.h(this.g, "net", "SSLError", "onReceivedError:"+p3);
       p0.getRefreshButton().setVisibility(0);
       return 0;
    }
    public synchronized boolean d(e p0,String p1){
       a.c(this.g, "biz", "h5ld", SystemClock.elapsedRealtime()+"|"+b.w(p1));
       if (!TextUtils.isEmpty(p1) && !p1.endsWith(".apk")) {
          this.v();
       }
       return false;
    }
    public synchronized void e(e p0,String p1){
       if (!p1.startsWith("http") && !(p0.getUrl()).endsWith(p1)) {
          this.i.getTitle().setText(p1);
       }
       return;
    }
    public synchronized boolean f(e p0,String p1){
       a.c(this.g, "biz", "h5ldd", SystemClock.elapsedRealtime()+"|"+b.w(p1));
       this.v();
       p0.getRefreshButton().setVisibility(0);
       return true;
    }
    public synchronized boolean g(e p0,String p1){
       boolean b = false;
       if (TextUtils.isEmpty(p1)) {
          return b;
       }
       c tb = this.b;
       if (tb == null) {
          return true;
       }
       if (b.h(this.g, p1, tb)) {
          return true;
       }
       if (p1.startsWith("alipayjsbridge://")) {
          this.r(p1.substring(17));
       }else if(TextUtils.equals(p1, "sdklite://h5quit")){
          this.p(b);
       }else if(p1.startsWith("http://") || p1.startsWith("https://")){
          this.i.d(p1);
       }else {
          Intent intent = new Intent();
          intent.setAction("android.intent.action.VIEW");
          intent.setData(Uri.parse(p1));
          tb.startActivity(intent);
       }
       return true;
    }
    public synchronized void h(e p0){
       p0.getWebView().reload();
       p0.getRefreshButton().setVisibility(4);
    }
    public synchronized boolean i(e p0,SslErrorHandler p1,SslError p2){
       c tb = this.b;
       if (tb == null) {
          return true;
       }
       a.h(this.g, "net", "SSLError", "2-"+p2);
       tb.runOnUiThread(new d$d(this, tb, p1));
       return true;
    }
    public synchronized void k(String p0){
       if (("POST").equals(this.e)) {
          this.i.f.postUrl(p0, null);
       }else {
          this.i.d(p0);
       }
       c.j(this.i.getWebView());
       return;
    }
    public synchronized boolean m(){
       c tb = this.b;
       if (tb == null) {
          return true;
       }
       if (this.l()) {
          d ti = this.i;
          if (ti == null || ti.getWebView() == null) {
             tb.finish();
             return true;
          }else if(ti.getWebView().canGoBack()){
             if (this.h != null) {
                c uoc = c.b(c.f.b());
                int i = uoc.b();
                b.c(b.b(i, uoc.a(), ""));
                tb.finish();
             }
          }else {
             b.c(b.a());
             tb.finish();
          }
          return true;
       }else if(this.f == null){
          this.u();
       }
       return true;
    }
    public synchronized void n(){
       this.i.b();
       d tj = this.j;
       if (tj.a()) {
       }else {
          Iterator iterator = tj.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
          tj.a.clear();
       }
       return;
    }
    public synchronized final void o(String p0,String p1,String p2){
       d$f b;
       ImageView backButton;
       String url;
       d ti = this.i;
       if (ti == null) {
          return;
       }
       JSONObject jSONObject = b.u(p2);
       d$f uof = new d$f(ti, p0, p1, jSONObject);
       Context context = ti.getContext();
       b = uof.b;
       int i = -1;
       int i1 = 4;
       boolean b1 = true;
       switch (b.hashCode()){
           case 0x95988d9e:
             if (b.equals("canUseTaoLogin")) {
                i = 8;
             }
             break;
           case 0xdf11b4e7:
             if (b.equals("taoLogin")) {
                i = 9;
             }
             break;
           case 0x2e04e7:
             if (b.equals("back")) {
                i = 2;
             }
             break;
           case 0x2fb91e:
             if (b.equals("exit")) {
                i = 3;
             }
             break;
           case 0x6942258:
             if (b.equals("title")) {
                i = 0;
             }
             break;
           case 0x40b292db:
             if (b.equals("refresh")) {
                i = 1;
             }
             break;
           case 0x65883baa:
             if (b.equals("pushWindow")) {
                i = 6;
             }
             break;
           case 0x71a18ef9:
             if (b.equals("backButton")) {
                i = 4;
             }
             break;
           case 0x7417e808:
             if (b.equals("sdkInfo")) {
                i = 7;
             }
             break;
           case 0x7938d5ed:
             if (b.equals("refreshButton")) {
                i = 5;
             }
             break;
           default:
       }
    label_0088 :
       String str = null;
       switch (i){
           case 0:
             if (jSONObject.has("title")) {
                ti.getTitle().setText(jSONObject.optString("title", ""));
             }
             break;
           case 1:
             ti.getWebView().reload();
             break;
           case 2:
             this.w();
             break;
           case 3:
             b.c(jSONObject.optString("result", str));
             this.p(jSONObject.optBoolean("success", false));
             break;
           case 4:
             backButton = ti.getBackButton();
             if (jSONObject.optBoolean("show", b1)) {
                i1 = 0;
             }
             backButton.setVisibility(i1);
             break;
           case 5:
             backButton = ti.getRefreshButton();
             if (jSONObject.optBoolean("show", b1)) {
                i1 = 0;
             }
             backButton.setVisibility(i1);
             break;
           case 6:
             this.s(jSONObject.optString("url"), jSONObject.optString("title", ""));
             break;
           case 7:
             JSONObject jSONObject1 = new JSONObject();
             jSONObject1.put("sdk_version", "15.8.05");
             jSONObject1.put("app_name", this.g.b);
             jSONObject1.put("app_version", this.g.a);
             uof.b(jSONObject1);
             break;
           case 8:
             jSONObject = ti.getUrl();
             if (!b.g(this.g, jSONObject)) {
                a.h(this.g, "biz", "jsUrlErr", jSONObject);
             }else {
                jSONObject = new JSONObject();
                boolean b2 = b.l(this.g, context, Collections.singletonList(new a$b("com.taobao.taobao", false, "")));
                jSONObject.put("enabled", b2);
                a.c(this.g, "biz", "TbChk", String.valueOf(b2));
                uof.b(jSONObject);
             }
             break;
           case 9:
             url = ti.getUrl();
             if (!b.g(this.g, url)) {
                a.h(this.g, "biz", "jsUrlErr", url);
             }else {
                url = jSONObject.optString("random");
                jSONObject = jSONObject.optJSONObject("options");
                if (!TextUtils.isEmpty("random") && jSONObject != null) {
                   String str1 = jSONObject.optString("url");
                   jSONObject = jSONObject.optString("action");
                   if (TextUtils.isEmpty(str1) || (!TextUtils.isEmpty(jSONObject) && context instanceof Activity)) {
                      a.b(this.g, "biz", "TbStart");
                      context.startActivityForResult(new Intent(jSONObject, Uri.parse(str1)), 1010);
                      c.a = new d$g(uof, url);
                   }
                }
             }
             break;
           default:
       }
    label_01e8 :
       return;
    }
    public synchronized boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = (this.f != null)? true: super.onInterceptTouchEvent(p0);
       return b;
    }
    public synchronized final void p(boolean p0){
       b.d(p0);
       this.b.finish();
    }
    public synchronized final void r(String p0){
       int i;
       Map map = b.k(this.g, p0);
       if (p0.startsWith("callNativeFunc")) {
          Map map1 = map;
          p0 = map1.get("func");
          this.o(p0, map1.get("cbId"), map.get("data"));
       }else if(p0.startsWith("onBack")){
          this.w();
       }else if(p0.startsWith("setTitle") && map.containsKey("title")){
          this.i.getTitle().setText(map.get("title"));
       }else if(p0.startsWith("onRefresh")){
          this.i.getWebView().reload();
       }else if(p0.startsWith("showBackButton") && map.containsKey("bshow")){
          ImageView backButton = this.i.getBackButton();
          i = (TextUtils.equals("true", map.get("bshow")))? 0: 4;
          backButton.setVisibility(i);
       }else if(p0.startsWith("onExit")){
          b.c(map.get("result"));
          this.p(TextUtils.equals("true", map.get("bsucc")));
       }else if(p0.startsWith("onLoadJs")){
          this.i.d("javascript:\(function\(\) {\n    if \(window.AlipayJSBridge\) {\n        return\n    }\n\n    function alipayjsbridgeFunc\(url\) {\n        var iframe = document.createElement\(\"iframe\"\);\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild\(iframe\);\n        setTimeout\(function\(\) {\n            document.body.removeChild\(iframe\)\n        }, 100\)\n    }\n    window.alipayjsbridgeSetTitle = function\(title\) {\n        document.title = title;\n        alipayjsbridgeFunc\(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent\(title\)\)\n    };\n    window.alipayjsbridgeRefresh = function\(\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://onRefresh?\"\)\n    };\n    window.alipayjsbridgeBack = function\(\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://onBack?\"\)\n    };\n    window.alipayjsbridgeExit = function\(bsucc\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://onExit?bsucc=\" + bsucc\)\n    };\n    window.alipayjsbridgeShowBackButton = function\(bshow\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://showBackButton?bshow=\" + bshow\)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall\(paramStr\) {\n        setTimeout\(function\(\) {\n        \tvar iframe = document.createElement\(\"iframe\"\);\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild\(iframe\);\n        \tsetTimeout\(function\(\) {\n            \tparent.removeChild\(iframe\)\n        \t}
    , 0\)\n        }, 0\)\n    }\n\n    function callNativeFunc\(nativeFuncName, data, h5JsCallback\) {\n        var h5JsCallbackId = \"\";\n        if \(h5JsCallback\) {\n            h5JsCallbackId = \"cb_\" + \(uniqueId++\) + \"_\" + new Date\(\).getTime\(\);\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if \(data\) {\n            dataStr = encodeURIComponent\(JSON.stringify\(data\)\)\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall\(paramStr\)\n    }\n\n    function callBackFromNativeFunc\(h5JsCallbackId, data\) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if \(h5JsCallback\) {\n            h5JsCallback\(data\);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener\(jsFuncName, jsFunc\) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener\(jsFuncName\) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if \(!jsFunc\) {\n            return false\n        }\n        return true\n    }\n\n    function callListener\(h5JsFuncName, data, nativeCallbackId\) {\n        var responseCallback;\n        if \(nativeCallbackId\) {\n            responseCallback = function\(responseData\) {\n                var dataStr = \"\";\n                if \(responseData\) {\n                    dataStr = encodeURIComponent\(JSON.stringify\(responseData\)\)\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall\(paramStr\)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if \(h5JsFunc\) {\n            h5JsFunc\(data, responseCallback\)\n        } else if \(h5JsFuncName == \"h5BackAction\"\) {\n            if \(!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction\(\)\) {\n                var paramStr = \"func=back\";\n                iframeCall\(paramStr\)\n            }\n        } else {\n            console.log\(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data\)\n        }\n    }\n    var event;\n    if \(window.CustomEvent\) {\n        event = new CustomEvent\(\"alipayjsbridgeready\"\)\n    } else {\n        event = document.createEvent\(\"Event\"\);\n        event.initEvent\(\"alipayjsbridgeready\"
    , true, true\)\n    }\n    document.dispatchEvent\(event\);\n    setTimeout\(excuteH5InitFuncs, 0\);\n\n    function excuteH5InitFuncs\(\) {\n        if \(window.AlipayJSBridgeInitArray\) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for \(var i = 0; i < h5InitFuncs.length; i++\) {\n                try {\n                    h5InitFuncs[i]\(AlipayJSBridge\)\n                } catch \(e\) {\n                    setTimeout\(function\(\) {\n                        throw e\n                    }\)\n                }\n            }\n        }\n    }\n}\)\(\);\n");
       }
       return;
    }
    public synchronized final boolean s(String p0,String p1){
       d uod = this;
       d i = uod.i;
       boolean b = false;
       e uoe = new e(uod.b, uod.g, new e$d((this.l() ^ 1), (this.l() ^ 1)));
       uod.i = uoe;
       uoe.setChromeProxy(this);
       uod.i.setWebClientProxy(this);
       uod.i.setWebEventProxy(this);
       if (!TextUtils.isEmpty(p1)) {
          uod.i.getTitle().setText(p1);
       }
       uod.f = true;
       uod.j.a.push(i);
       TranslateAnimation translateAni = new TranslateAnimation(1, 0x3f800000, 1, 0, 1, 0, 1, 0);
       v3.setDuration(400);
       v3.setFillAfter(b);
       v3.setAnimationListener(new d$c(this, i, p0));
       uod.i.setAnimation(v3);
       this.addView(uod.i);
       return 1;
    }
    public synchronized final boolean t(){
       if (this.j.a()) {
          this.b.finish();
       }else {
          this.f = true;
          d ti = this.i;
          this.i = this.j.a.pop();
          TranslateAnimation translateAni = new TranslateAnimation(1, 0, 1, 0x3f800000, 1, 0, 1, 0);
          v2.setDuration(400);
          v2.setFillAfter(false);
          v2.setAnimationListener(new d$b(this, ti));
          ti.setAnimation(v2);
          this.removeView(ti);
          this.addView(this.i);
       }
       return true;
    }
    public synchronized final void u(){
       c tb = this.b;
       d ti = this.i;
       if (tb == null || ti == null) {
          return;
       }
       if (this.d != null) {
          tb.finish();
       }else {
          ti.d("javascript:window.AlipayJSBridge.callListener\(\'h5BackAction\'\);");
       }
       return;
    }
    public final void v(){
       d ti = this.i;
       if (ti != null) {
          ti.getWebView().loadUrl("javascript:\(function\(\) {\n    if \(window.AlipayJSBridge\) {\n        return\n    }\n\n    function alipayjsbridgeFunc\(url\) {\n        var iframe = document.createElement\(\"iframe\"\);\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild\(iframe\);\n        setTimeout\(function\(\) {\n            document.body.removeChild\(iframe\)\n        }, 100\)\n    }\n    window.alipayjsbridgeSetTitle = function\(title\) {\n        document.title = title;\n        alipayjsbridgeFunc\(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent\(title\)\)\n    };\n    window.alipayjsbridgeRefresh = function\(\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://onRefresh?\"\)\n    };\n    window.alipayjsbridgeBack = function\(\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://onBack?\"\)\n    };\n    window.alipayjsbridgeExit = function\(bsucc\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://onExit?bsucc=\" + bsucc\)\n    };\n    window.alipayjsbridgeShowBackButton = function\(bshow\) {\n        alipayjsbridgeFunc\(\"alipayjsbridge://showBackButton?bshow=\" + bshow\)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall\(paramStr\) {\n        setTimeout\(function\(\) {\n        \tvar iframe = document.createElement\(\"iframe\"\);\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild\(iframe\);\n        \tsetTimeout\(function\(\) {\n            \tparent.removeChild\(iframe\)\n        \t}
    , 0\)\n        }, 0\)\n    }\n\n    function callNativeFunc\(nativeFuncName, data, h5JsCallback\) {\n        var h5JsCallbackId = \"\";\n        if \(h5JsCallback\) {\n            h5JsCallbackId = \"cb_\" + \(uniqueId++\) + \"_\" + new Date\(\).getTime\(\);\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if \(data\) {\n            dataStr = encodeURIComponent\(JSON.stringify\(data\)\)\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall\(paramStr\)\n    }\n\n    function callBackFromNativeFunc\(h5JsCallbackId, data\) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if \(h5JsCallback\) {\n            h5JsCallback\(data\);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener\(jsFuncName, jsFunc\) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener\(jsFuncName\) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if \(!jsFunc\) {\n            return false\n        }\n        return true\n    }\n\n    function callListener\(h5JsFuncName, data, nativeCallbackId\) {\n        var responseCallback;\n        if \(nativeCallbackId\) {\n            responseCallback = function\(responseData\) {\n                var dataStr = \"\";\n                if \(responseData\) {\n                    dataStr = encodeURIComponent\(JSON.stringify\(responseData\)\)\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall\(paramStr\)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if \(h5JsFunc\) {\n            h5JsFunc\(data, responseCallback\)\n        } else if \(h5JsFuncName == \"h5BackAction\"\) {\n            if \(!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction\(\)\) {\n                var paramStr = \"func=back\";\n                iframeCall\(paramStr\)\n            }\n        } else {\n            console.log\(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data\)\n        }\n    }\n    var event;\n    if \(window.CustomEvent\) {\n        event = new CustomEvent\(\"alipayjsbridgeready\"\)\n    } else {\n        event = document.createEvent\(\"Event\"\);\n        event.initEvent\(\"alipayjsbridgeready\"
    , true, true\)\n    }\n    document.dispatchEvent\(event\);\n    setTimeout\(excuteH5InitFuncs, 0\);\n\n    function excuteH5InitFuncs\(\) {\n        if \(window.AlipayJSBridgeInitArray\) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for \(var i = 0; i < h5InitFuncs.length; i++\) {\n                try {\n                    h5InitFuncs[i]\(AlipayJSBridge\)\n                } catch \(e\) {\n                    setTimeout\(function\(\) {\n                        throw e\n                    }\)\n                }\n            }\n        }\n    }\n}\)\(\);\n;window.AlipayJSBridge.callListener\(\'h5PageFinished\'\);");
       }
       return;
    }
    public synchronized final void w(){
       WebView webView = this.i.getWebView();
       if (webView.canGoBack()) {
          webView.goBack();
       }else {
          d tj = this.j;
          if (tj != null && !tj.a()) {
             this.t();
          }else {
             this.p(false);
          }
       }
       return;
    }
}
