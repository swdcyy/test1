package com.yxcorp.gateway.pay.webview.yoda.b$d0;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
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
import nv8.b;
import lv8.d;
import com.google.gson.Gson;
import com.yxcorp.gateway.pay.webview.yoda.j;
import ho7.d;

public class b$d0 extends p0	// class@0012af
{
    public final String g;
    public final b h;

    public void b$d0(b p0,Activity p1,WebView p2,String p3,String p4){
       this.h = p0;
       this.g = p4;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d0.class, "1")) {
       }else {
          g.d("uploadCertVideo start");
          String str = "IDCARD_UPLOAD_CERT_VIDEO";
          g.j(str, "START", this.g);
          i videoUploadH = PayManager.getInstance().getVideoUploadHelper();
          if (videoUploadH == null) {
             JsErrorResult jsErrorResul = new JsErrorResult(404, this.h.a.getString(0x7f103b99));
             this.b(p0.mCallback, jsErrorResul);
             b.f("PayYodaJsBridge", "uploadCertVideo failed, not support this operation");
             g.k(str, "FAIL", this.g, d.a.q(jsErrorResul));
          }else {
             videoUploadH.a(this.h.a, this.g, new j(this, p0));
          }
       }
       return;
    }
}
