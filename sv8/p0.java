package sv8.p0;
import sv8.q0;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.webview.yoda.b$t;
import com.yxcorp.gateway.pay.api.PayManager;
import nv8.b;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import lv8.d;
import com.google.gson.Gson;
import java.io.Serializable;
import ov8.a;
import java.util.HashMap;
import java.lang.Throwable;
import java.util.Map;
import java.lang.ref.WeakReference;
import lv8.u;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.Runnable;
import ekd.k1;

public abstract class p0 extends q0	// class@003871
{
    public String e;
    public boolean f;

    public void p0(Activity p0,WebView p1,String p2){
       super(p0, p1, p2);
    }
    public void a(Activity p0,WebView p1){
       boolean b;
       String url;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0.class, "1")) {
          return;
       }
       try{
          b = false;
          if (this.f != null) {
             url = p1.getUrl();
             if (TextUtils.isEmpty(url) || (!this instanceof b$t && !PayManager.getInstance().isKwaiUrl(url))) {
                b.f("PayYodaJsInvoker", "PayYodaJsInvoker: safeRun failed");
                return;
             }else {
                this.f = b;
             }
          }
          Class uClass = null;
          if (!TextUtils.isEmpty(this.e)) {
             uClass = d.a.h(this.e, this.getClass().getGenericSuperclass().getActualTypeArguments()[b]);
          }
          this.d(uClass);
          a.d().e("kspay", this.d, p1.getOriginalUrl(), "h5");
       }catch(java.lang.Exception e7){
          HashMap hashMap = new HashMap();
          hashMap.put("url", p1.getUrl());
          hashMap.put("bridgeCommand", this.d);
          b.k("PayYodaJsInvoker", "PayYodaJsInvoker: safeRun failed", e7, hashMap);
       }
       return;
    }
    public void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0.class, "4")) {
          return;
       }
       Activity uActivity = this.b.get();
       if (uActivity != null && !uActivity.isFinishing()) {
          WebView webView = this.c.get();
          if (webView == null) {
             return;
          }else {
             u.d(webView, p0, p1);
             if (p1 instanceof BaseResult) {
                a.d().f("kspay", this.d, webView.getUrl(), p1.mResult, "h5");
             }
          }
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       this.e = p0;
       k1.o(this);
       return;
    }
    public abstract void d(Serializable p0);
}
