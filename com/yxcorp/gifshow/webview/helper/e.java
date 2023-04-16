package com.yxcorp.gifshow.webview.helper.e;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import uv8.g1;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Number;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONObject;
import yz7.k;
import oe6.b;
import ayc.h;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import vxc.e;
import p55.a;
import vxc.b;
import iyc.b;
import iyc.c;
import android.app.Activity;
import android.content.Context;
import e3a.a;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import android.widget.AbsoluteLayout;
import android.content.MutableContextWrapper;

public class e	// class@00175c
{

    public void e(){
       super();
    }
    public static boolean a(WebView p0,String p1,Object p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, e.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          obj = a.t().c("check_js_bridge_callback_rule", null);
          if (!TextUtils.x(obj) && (TextUtils.x(p1) || !Pattern.compile(obj).matcher(p1).find())) {
             Object[] objArray = new Object[0];
             g1.C().A("WebViewUtils", "illegal callback: "+p1, objArray);
             return 0;
          }
       }catch(java.lang.Exception e1){
          ExceptionHandler.handleCaughtException(e1);
       }
    label_005e :
       if (p2 instanceof CharSequence || p2 instanceof Number) {
          e.b(p0, e.c(p1, JSONObject.quote(String.valueOf(p2))));
       }else if(p2 != null){
          e.b(p0, (e.c(p1, JSONObject.quote(a.a.q(p2)))).replace("\\n", "\n"));
       }else {
          p2 = PatchProxy.applyOneRefs(p1, null, e.class, "3");
          if (p2 != patchProxyRe) {
          }else {
             p2 = new Object[]{p1,p1};
             p2 = k.a("javascript:typeof %s === \'function\' && %s\(\)", p2);
          }
          e.b(p0, p2);
       }
       return true;
    }
    public static void b(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "4")) {
          return;
       }
       if (!b.l()) {
          k1.o(new h(p0, p1));
       }else {
          p0.loadUrl(p1);
       }
       return;
    }
    public static String c(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{p0,p0,p1};
       return k.a("javascript:typeof %s === \'function\' && %s\(%s\)", obj);
    }
    public static c d(YodaBaseWebView p0){
       c uoc = null;
       Object obj = PatchProxy.applyOneRefs(p0, uoc, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof KwaiYodaWebView) {
          return uoc;
       }
       e jsInjectKwai = p0.getJsInjectKwai();
       if (jsInjectKwai != null) {
          uoc = jsInjectKwai.j();
       }
       return uoc;
    }
    public static a e(YodaBaseWebView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       a uoa = null;
       Object obj = PatchProxy.applyOneRefs(p0, uoa, uoe, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       b uob = PatchProxy.applyTwoRefs(p0, b.class, uoa, uoe, "12");
       if (uob != patchProxyRe) {
       }else if(p0 instanceof c){
          uob = p0.h(b.class);
       }else {
          uob = uoa;
       }
       if (uob != null) {
          uoa = uob.a();
       }
       return uoa;
    }
    public static Activity f(WebView p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Activity uActivity = a.b(e.h(p0));
       if (uActivity == null) {
          uActivity = ActivityContext.g().e();
       }
       return uActivity;
    }
    public static JsNativeEventCommunication g(YodaBaseWebView p0){
       JsNativeEventCommunication jsNativeEven = null;
       Object obj = PatchProxy.applyOneRefs(p0, jsNativeEven, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof KwaiYodaWebView) {
          return jsNativeEven;
       }
       e jsInjectKwai = p0.getJsInjectKwai();
       if (jsInjectKwai != null) {
          jsNativeEven = jsInjectKwai.i();
       }
       return jsNativeEven;
    }
    public static Context h(WebView p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = p0.getContext();
       if (context instanceof MutableContextWrapper) {
          context = context.getBaseContext();
       }
       return context;
    }
}
