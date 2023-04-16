package rv8.d;
import rv8.a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kuaishou.webkit.WebView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.webview.b$o;
import com.yxcorp.gateway.pay.api.PayManager;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import lv8.d;
import com.google.gson.Gson;
import java.io.Serializable;
import java.lang.Exception;
import lv8.u;
import java.lang.Runnable;
import ekd.k1;

public abstract class d extends a	// class@00371b
{
    public String c;
    public boolean d;

    public void d(PayWebViewActivity p0){
       super(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       try{
          boolean b = false;
          if (this.d != null) {
             String url = this.b.get().mWebView.getUrl();
             if (TextUtils.isEmpty(url) || (!this instanceof b$o && !PayManager.getInstance().isKwaiUrl(url))) {
                return;
             }else {
                this.d = b;
             }
          }
          if (!TextUtils.isEmpty(this.c)) {
             objArray = d.a.h(this.c, this.getClass().getGenericSuperclass().getActualTypeArguments()[b]);
          }
          this.d(objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       PayWebViewActivity payWebViewAc = this.b.get();
       if (payWebViewAc != null && (!payWebViewAc.isFinishing() && !PatchProxy.applyVoidThreeRefs(payWebViewAc, p0, p1, null, u.class, "1"))) {
          u.d(payWebViewAc.mWebView, p0, p1);
       }
    label_0030 :
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.c = p0;
       k1.o(this);
       return;
    }
    public abstract void d(Serializable p0);
}
