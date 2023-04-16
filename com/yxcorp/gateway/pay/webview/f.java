package com.yxcorp.gateway.pay.webview.f;
import ho7.b;
import com.yxcorp.gateway.pay.webview.b$g;
import com.kwai.sdk.pay.api.parmas.JsIdentityVerifyParams;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsIdentityVerifyResult;
import rv8.d;
import nv8.b;
import java.lang.Integer;
import java.lang.Throwable;

public class f implements b	// class@00129d
{
    public final JsIdentityVerifyParams a;
    public final b$g b;

    public void f(b$g p0,JsIdentityVerifyParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       g.d("startIdentityVerify onValidated, type="+p0);
       this.b.b(this.a.mCallback, new JsIdentityVerifyResult(1, p1, p0));
       b.o("PayJsInject", "startIdentityVerify success!");
       return;
    }
    public void onFailed(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "2")) {
          return;
       }
       b.h("PayJsInject", "startIdentityVerify failed", null, "errCode", Integer.valueOf(p0));
       this.b.b(this.a.mCallback, new JsIdentityVerifyResult(p0, "", ""));
       return;
    }
}
