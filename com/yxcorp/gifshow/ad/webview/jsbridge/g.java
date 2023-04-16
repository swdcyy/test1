package com.yxcorp.gifshow.ad.webview.jsbridge.g;
import vxc.h;
import y55.a;
import android.app.Activity;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import o59.t;
import java.lang.ref.WeakReference;
import com.kuaishou.webkit.WebView;
import f55.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import yx.j0;
import android.os.Bundle;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.webview.helper.e;
import fg6.a;
import com.kwai.feature.api.tuna.js_params.BusinessJsParams;
import com.google.gson.Gson;
import java.util.Map;
import zl9.b;
import com.yxcorp.gifshow.ad.webview.jsbridge.g$a;
import com.yxcorp.gifshow.ad.webview.jsbridge.g$b;
import zl9.e;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Runnable;
import android.os.Looper;
import t45.c;
import com.yxcorp.gifshow.webview.yoda.h;
import com.yxcorp.gifshow.ad.webview.jsbridge.j;

public class g implements h, a	// class@0018d2
{
    public final Map a;
    public final WebView b;
    public final WeakReference c;
    public b d;
    public boolean e;

    public void g(Activity p0){
       super();
       this.a = new ConcurrentHashMap();
       this.d = new t();
       this.b = null;
       this.c = new WeakReference(p0);
    }
    public void g(WebView p0,Activity p1){
       super();
       this.a = new ConcurrentHashMap();
       this.d = new t();
       this.b = p0;
       this.c = new WeakReference(p1);
    }
    public void b(g p0,int p1,String p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, g.class, "8")) {
          return;
       }
       if (!this.e()) {
          Object[] objArray = new Object[0];
          j0.c("KwaiAdJSBridge", "callError checkCanCallback fail", objArray);
          return;
       }else {
          p0.a(p1, p2, null);
          return;
       }
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "6")) {
          return;
       }
       int i = 0;
       if (this.e != null) {
          Object[] objArray = new Object[i];
          j0.c("KwaiAdJSBridge", "call js after destroy jsInterface, "+p1, objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f("KwaiAdJSBridge", "response js, callback: "+p0, objArray1);
          Activity uActivity = this.c.get();
          if (uActivity == null || (!uActivity.isFinishing() && !TextUtils.isEmpty(p0))) {
             g tb = this.b;
             if (tb == null) {
                return;
             }else {
                e.a(tb, p0, p1);
             }
          }
          return;
       }
    }
    public void callAdBridge(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("KwaiAdJSBridge", "callAdBridge =="+p0, objArray);
       Gson a = a.a;
       BusinessJsParams uBusinessJsP = a.h(p0, BusinessJsParams.class);
       b uob = this.a.get(uBusinessJsP.mAction);
       if (uob == null) {
          uob = this.d;
       }
       if (uob != null) {
          g$a uoa = (!TextUtils.isEmpty(uBusinessJsP.mCallback))? new g$a(this, uBusinessJsP): new g$b(this);
          if (this.e == null) {
             uob.e(uBusinessJsP.mData, uoa);
          }else {
             this.c(uBusinessJsP.mCallback, a.q(new JsErrorResult(0, "bridge has destroyed")));
          }
       }
       return;
    }
    public void callCardHandler(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("KwaiAdJSBridge", "callCardHandler =="+p0, objArray);
       this.callAdBridge(p0);
       return;
    }
    public void d(g p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "7")) {
          return;
       }
       if (!this.e()) {
          Object[] objArray = new Object[0];
          j0.c("KwaiAdJSBridge", "callSuccess checkCanCallback fail", objArray);
          return;
       }else {
          p0.onSuccess(p1);
          return;
       }
    }
    public final boolean e(){
       Activity obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e != null) {
          return false;
       }
       obj = this.c.get();
       if (obj != null && !obj.isFinishing()) {
          return true;
       }
       Object[] objArray = new Object[false];
       j0.f("KwaiAdJSBridge", "activity is null or finish", objArray);
       return false;
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "13")) {
          return;
       }
       this.g(p0, false);
       return;
    }
    public void g(b p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "12")) {
          return;
       }
       int i = 0;
       String str = "KwaiAdJSBridge";
       if (p0 != null && !TextUtils.isEmpty(p0.getKey())) {
          if (this.a.containsKey(p0.getKey())) {
             Object[] objArray = new Object[i];
             j0.l(str, "shadow handler, handler: "+p0.getKey(), objArray);
          }
          this.a.put(p0.getKey(), p0);
       }else {
          Object[] objArray1 = new Object[i];
          j0.l(str, "handler and handler\'key cannot be null", objArray1);
       }
       return;
    }
    public void h(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       if (Looper.getMainLooper() != Looper.myLooper()) {
          p0.run();
       }else {
          c.a(p0);
       }
       return;
    }
    public h k(Object p0,String p1){
       j oj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "15");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0, p1);
       }
       return oj;
    }
}
