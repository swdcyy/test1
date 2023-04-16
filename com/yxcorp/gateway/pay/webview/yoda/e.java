package com.yxcorp.gateway.pay.webview.yoda.e;
import ho7.a;
import com.yxcorp.gateway.pay.webview.yoda.b$f;
import com.kwai.sdk.pay.api.parmas.JsVerifyRealNameInfoParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import sv8.p0;
import lv8.d;
import com.google.gson.Gson;
import lv8.g;
import nv8.b;
import java.lang.Integer;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import android.os.Looper;
import com.yxcorp.gateway.pay.webview.yoda.b;
import sv8.m0;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Throwable;

public class e implements a	// class@0012cd
{
    public final JsVerifyRealNameInfoParams a;
    public final b$f b;

    public void e(b$f p0,JsVerifyRealNameInfoParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       JsSuccessResult jsSuccessRes = new JsSuccessResult();
       this.b.b(this.a.mCallback, jsSuccessRes);
       g.k("WEBCLOUD_FACE_VERIFY", "SUCCESS", this.b.g, d.a.q(jsSuccessRes));
       b.o("PayYodaJsBridge", "verifyRealNameInfo success!");
       return;
    }
    public void b(int p0,String p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "2")) {
          return;
       }
       JsErrorResult jsErrorResul = new JsErrorResult(p0, p1);
       if (Looper.myLooper() == Looper.getMainLooper()) {
          this.b.b(this.a.mCallback, jsErrorResul);
       }else {
          this.b.h.a.runOnUiThread(new m0(this, this.a, jsErrorResul));
       }
       b.i("PayYodaJsBridge", "verifyRealNameInfo failed!", null, "errorCode", Integer.valueOf(p0), "errorMessage", p1);
       g.k("WEBCLOUD_FACE_VERIFY", "FAIL", this.b.g, d.a.q(jsErrorResul));
       return;
    }
}
