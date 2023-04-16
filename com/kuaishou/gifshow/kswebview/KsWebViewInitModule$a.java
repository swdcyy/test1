package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a$a;
import com.kuaishou.webkit.extension.KsCoreListener;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import android.app.Application;
import o56.a;

public final class KsWebViewInitModule$a	// class@0019d4
{

    public void KsWebViewInitModule$a(){
       super();
    }
    public void KsWebViewInitModule$a(u p0){
       super();
    }
    public final void a(boolean p0){
       KsWebViewInitModule$a uoa = KsWebViewInitModule$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       Log.g("KsWebView", "KwSdk.init");
       KwSdk.setCoreListener(new KsWebViewInitModule$a$a(p0));
       return;
    }
    public final KwSdk$CoreInitCallback b(){
       return KsWebViewInitModule.w;
    }
    public final Object c(){
       return KsWebViewInitModule.v;
    }
    public final KwSdk$CoreInitCallback d(){
       return KsWebViewInitModule.z;
    }
    public final boolean e(){
       return KsWebViewInitModule.r;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$a.class, "8")) {
          return;
       }
       if (KsWebViewInitModule.t) {
          return;
       }
       boolean b = true;
       KsWebViewInitModule.t = b;
       Application uApplication = a.b();
       if (uApplication == null) {
          Log.d("KsWebView", "Application is null");
          return;
       }else {
          this.a(b);
          KwSdk.init(uApplication, this.d());
          return;
       }
    }
    public final void g(boolean p0){
       KsWebViewInitModule.s = p0;
    }
    public final void h(KwSdk$CoreInitCallback p0){
       KsWebViewInitModule.w = null;
    }
    public final void i(boolean p0){
       KsWebViewInitModule.r = p0;
    }
}
