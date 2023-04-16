package com.yxcorp.gateway.pay.webview.c;
import erd.g;
import com.yxcorp.gateway.pay.webview.b$b;
import com.yxcorp.gateway.pay.params.webview.JSAuthThirdAccountParams;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nv8.b;
import rv8.d;

public class c implements g	// class@00129a
{
    public final JSAuthThirdAccountParams b;
    public final b$b c;

    public void c(b$b p0,JSAuthThirdAccountParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          b.q("PayJsInject", "authThirdPartyAccount finish", "provider", this.b.mProvider, "error_code", p0.mErrorCode);
          this.c.b(this.b.mCallback, p0);
       }
       return;
    }
}
