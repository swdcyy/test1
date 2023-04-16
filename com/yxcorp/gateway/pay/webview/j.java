package com.yxcorp.gateway.pay.webview.j;
import ho7.d;
import com.yxcorp.gateway.pay.webview.b$y;
import com.yxcorp.gateway.pay.params.webview.JsVideoCaptureParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gateway.pay.webview.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import android.app.Activity;
import rv8.d;
import java.lang.Throwable;
import nv8.b;
import lv8.d;
import com.google.gson.Gson;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsVideoCaptureResult;
import java.io.File;
import qkd.b;

public class j implements d	// class@0012a1
{
    public final JsVideoCaptureParams a;
    public final b$y b;

    public void j(b$y p0,JsVideoCaptureParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       JsErrorResult jsErrorResul;
       JsErrorResult jsErrorResul1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "1")) {
          return;
       }
       b$y f = this.b.f;
       Objects.requireNonNull(f);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          jsErrorResul = PatchProxy.applyOneRefs(Integer.valueOf(p0), f, uob, "30");
          if (jsErrorResul != PatchProxyResult.class) {
          }else if(p0){
             int i = 415;
             if (p0 != i) {
                i = 416;
                if (p0 != i) {
                   jsErrorResul = new JsErrorResult(412, f.a.getString(0x7f103b99));
                }else {
                   jsErrorResul1 = new JsErrorResult(i, f.a.getString(0x7f103b94));
                }
             }else {
                jsErrorResul1 = new JsErrorResult(i, f.a.getString(0x7f103b93));
             }
             jsErrorResul = jsErrorResul1;
          }else {
             jsErrorResul = new JsErrorResult(0, f.a.getString(0x7f103baa));
          }
       }else {
          goto label_0035 ;
       }
       this.b.b(this.a.mCallback, jsErrorResul);
       b.h("PayJsInject", "uploadCertVideo failed", null, "errorCode", Integer.valueOf(p0));
       g.k("IDCARD_UPLOAD_CERT_VIDEO", "FAIL", this.b.e, d.a.q(jsErrorResul));
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       b$y f = this.b.f;
       Objects.requireNonNull(f);
       JsVideoCaptureResult jsVideoCaptu = PatchProxy.applyOneRefs(p0, f, b.class, "31");
       if (jsVideoCaptu != PatchProxyResult.class) {
       }else {
          jsVideoCaptu = new JsVideoCaptureResult();
          jsVideoCaptu.mSnapshot = b.w(new File(p0));
       }
       this.b.b(this.a.mCallback, jsVideoCaptu);
       b.o("PayJsInject", "uploadCertVideo success");
       g.k("IDCARD_UPLOAD_CERT_VIDEO", "SUCCESS", this.b.e, d.a.q(jsVideoCaptu));
       return;
    }
}
