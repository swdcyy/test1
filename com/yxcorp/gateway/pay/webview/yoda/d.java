package com.yxcorp.gateway.pay.webview.yoda.d;
import ho7.c;
import com.yxcorp.gateway.pay.webview.yoda.b$d;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import sv8.p0;
import nv8.b;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;

public class d implements c	// class@0012cc
{
    public final JsCallbackParams a;
    public final b$d b;

    public void d(b$d p0,JsCallbackParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsSuccessResult());
       b.o("PayYodaJsBridge", "bindPhone success!");
       g.i("BIZ_BIND_PHONE", "SUCCESS");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(-1, tb.g.a.getString(R.string.arg_RES_7f103b87)));
       b.f("PayYodaJsBridge", "bindPhone failure!");
       g.i("BIZ_BIND_PHONE", "FAIL");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(0, tb.g.a.getString(R.string.arg_RES_7f103baa)));
       b.o("PayYodaJsBridge", "bindPhone cancel!");
       g.i("BIZ_BIND_PHONE", "CANCEL");
       return;
    }
}