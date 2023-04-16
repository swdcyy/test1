package com.yxcorp.gateway.pay.webview.yoda.f;
import ho7.b;
import com.yxcorp.gateway.pay.webview.yoda.b$g;
import com.kwai.sdk.pay.api.parmas.JsIdentityVerifyParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsIdentityVerifyResult;
import sv8.p0;
import java.lang.Integer;

public class f implements b	// class@0012ce
{
    public final JsIdentityVerifyParams a;
    public final String b;
    public final b$g c;

    public void f(b$g p0,JsIdentityVerifyParams p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       g.d("bridge:startIdentityVerify onValidated, type="+p0);
       this.c.b(this.a.mCallback, new JsIdentityVerifyResult(1, p1, p0));
       return;
    }
    public void onFailed(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "2")) {
          return;
       }
       g.d("PayYodaJsBridge startIdentityVerify failed. errCode="+p0+", url="+this.b);
       this.c.b(this.a.mCallback, new JsIdentityVerifyResult(p0, "", ""));
       return;
    }
}
