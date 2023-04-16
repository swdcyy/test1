package vxc.z;
import ekd.d;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.yxcorp.gifshow.webview.helper.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import fg6.a;
import com.google.gson.Gson;
import java.io.Serializable;
import java.lang.RuntimeException;
import rx7.a;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import uv8.g1;
import java.lang.Throwable;
import android.util.Log;
import q87.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kwai.yoda.bridge.InvokeContextCompatHelper;
import vxc.g;
import android.os.SystemClock;
import java.lang.Thread;
import java.lang.StackTraceElement;
import oe6.b;
import android.content.SharedPreferences;
import ekd.k1;
import android.os.Looper;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Boolean;
import rx7.a$a;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import com.kwai.yoda.Yoda;
import ny7.c;
import ty7.c;
import ty7.g;
import ty7.e;
import ty7.d;
import java.lang.Integer;

public abstract class z extends d	// class@0040b9
{
    public String c;
    public WeakReference d;
    public String e;
    public String f;
    public long g;
    public a h;
    public String i;
    public boolean j;

    public void z(Activity p0,WebView p1){
       super(p0);
       this.d = new WeakReference(p1);
    }
    public void z(WebView p0){
       super(e.f(p0));
       this.d = new WeakReference(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.c)) {
          object oobject = this.getClass().getGenericSuperclass().getActualTypeArguments()[0];
          try{
             objArray = a.a.h(this.c, oobject);
          }catch(java.lang.RuntimeException e0){
             this.j(0x1e84f, e0);
             return;
          }
       }
       try{
          this.i(objArray);
       }catch(java.lang.RuntimeException e0){
          this.j(412, e0);
       }
       return;
    }
    public z b(String p0,String p1){
       this.e = p0;
       this.f = p1;
       return this;
    }
    public void c(WebView p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, z.class, "5")) {
          return;
       }
       if (this.h != null && this.g(p1)) {
          this.h.c();
       }
       e.a(p0, p1, p2);
       this.h(p1, p2);
       return;
    }
    public void d(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z.class, "6")) {
          return;
       }
       Activity uActivity = this.b.get();
       if (uActivity != null && !uActivity.isFinishing()) {
          WebView webView = this.d.get();
          if (webView == null) {
             return;
          }else if(this.h != null && this.g(p0)){
             this.h.c();
          }
          e.a(webView, p0, p1);
          this.h(p0, p1);
       }
       return;
    }
    public Activity e(){
       Object obj = PatchProxy.apply(null, this, z.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "3")) {
          return;
       }
       this.c = p0;
       try{
          this.i = new JSONObject(TextUtils.k(p0)).optString("callback");
       }catch(org.json.JSONException e6){
          Object[] objArray = new Object[0];
          g1.C().w("get callback fail.", Log.getStackTraceString(e6), objArray);
       }
       if (!PatchProxy.applyVoid(null, this, z.class, "4") && (TextUtils.x(this.e) || TextUtils.x(this.f))) {
          WebView webView = this.d.get();
          if (webView instanceof YodaBaseWebView && !TextUtils.x(this.i)) {
             a uoa = webView.getJavascriptBridge().t().a(this.i);
             this.h = uoa;
             if (uoa == null) {
             }
          }else if(!webView instanceof g){
             this.g = SystemClock.elapsedRealtime();
             StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
             if (stackTrace != null) {
                int i = 4;
                if (stackTrace.length > i) {
                   this.e = webView.c(stackTrace[i].getClassName());
                   this.f = stackTrace[i].getMethodName();
                }
             }
          }
       }
    label_00a6 :
       if (b.a.getBoolean("EnableJsRunOnUiThread", true)) {
          if (Looper.getMainLooper() == Looper.myLooper()) {
             this.run();
          }else {
             long l = SystemClock.uptimeMillis() - 1000;
             Handler a = k1.a;
             if (l <= 0) {
                l = 0;
             }
             a.postAtTime(this, l);
          }
       }else {
          k1.o(this);
       }
       return;
    }
    public final boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.i) && TextUtils.n(p0, this.i))? true: false;
       return b;
    }
    public final void h(String p0,Object p1){
       JsErrorResult mResult;
       z th1;
       c debugKit;
       g og;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z.class, "9")) {
          return;
       }
       if (!this.g(p0)) {
          return;
       }
       WebView webView = this.d.get();
       if (!webView instanceof YodaBaseWebView) {
          return;
       }
       z th = this.h;
       if (th != null) {
          th.d();
          webView.getJavascriptBridge().t().c(this.h);
       }else {
          this.h = a.r.a(this.e, this.f, this.c, "", this.g);
       }
       Gson gson = null;
       if (p1 instanceof JsErrorResult) {
          mResult = p1.mResult;
       }else if(p1 instanceof JsSuccessResult){
          mResult = p1.mResult;
       }else if(p1 instanceof Serializable){
          gson = a.a.q(p1);
          try{
             mResult = new JSONObject(gson).optInt("result", true);
          }catch(org.json.JSONException e0){
             mResult = 1;
          }
       }else {
          goto label_0074 ;
       }
    }
    public abstract void i(Serializable p0);
    public final void j(int p0,RuntimeException p1){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, z.class, "2")) {
          return;
       }
       this.d(this.i, new JsErrorResult(p0, Log.getStackTraceString(p1)));
       return;
    }
}
