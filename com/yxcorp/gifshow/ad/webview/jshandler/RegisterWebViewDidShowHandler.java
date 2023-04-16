package com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import zl9.b;
import p59.t;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler$1;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler$a;
import p59.t$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zl9.e;
import java.lang.Boolean;
import zl9.a;

public final class RegisterWebViewDidShowHandler implements b	// class@0018eb
{
    public e a;
    public final t b;
    public final a c;

    public void RegisterWebViewDidShowHandler(t p0){
       super(p0, RegisterWebViewDidShowHandler$1.INSTANCE);
    }
    public void RegisterWebViewDidShowHandler(t p0,a p1){
       a.p(p0, "jsBridgeContext");
       a.p(p1, "inPreloading");
       super();
       this.b = p0;
       this.c = p1;
       p0.a(new RegisterWebViewDidShowHandler$a(this));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RegisterWebViewDidShowHandler.class, "2")) {
          return;
       }
       RegisterWebViewDidShowHandler ta = this.a;
       if (ta != null) {
          ta.onSuccess(null);
       }
       return;
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RegisterWebViewDidShowHandler.class, "1")) {
          return;
       }
       a.p(p1, "function");
       this.a = p1;
       if (!this.c.invoke().booleanValue()) {
          this.a();
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "registerWebViewDidShowListener";
    }
    public void onDestroy(){
       a.a(this);
    }
}
