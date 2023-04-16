package com.yxcorp.gateway.pay.webview.b$y;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsVideoCaptureParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.i;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import android.app.Activity;
import nv8.b;
import lv8.d;
import com.google.gson.Gson;
import com.yxcorp.gateway.pay.webview.j;
import ho7.d;

public class b$y extends d	// class@001297
{
    public final String e;
    public final b f;

    public void b$y(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$y.class, "1")) {
       }else {
          g.d("uploadCertVideo start");
          String str = "IDCARD_UPLOAD_CERT_VIDEO";
          g.j(str, "START", this.e);
          i videoUploadH = PayManager.getInstance().getVideoUploadHelper();
          if (videoUploadH == null) {
             JsErrorResult jsErrorResul = new JsErrorResult(404, this.f.a.getString(0x7f103b99));
             this.b(p0.mCallback, jsErrorResul);
             b.f("PayJsInject", "uploadCertVideo failed, not support this operation");
             g.k(str, "FAIL", this.e, d.a.q(jsErrorResul));
          }else {
             videoUploadH.a(this.f.a, this.e, new j(this, p0));
          }
       }
       return;
    }
}
