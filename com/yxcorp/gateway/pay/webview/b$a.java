package com.yxcorp.gateway.pay.webview.b$a;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsWithDrawBindParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import android.app.Activity;
import nv8.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import tv8.g;
import tv8.h;
import brd.t;
import lv8.n;
import brd.z;
import rv8.g;
import com.yxcorp.gateway.pay.webview.a;
import erd.g;
import crd.b;

public class b$a extends d	// class@00127e
{
    public final String e;
    public final b f;

    public void b$a(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          g.d("bindWithdrawType start");
          String str = "ACCOUNT_WITHDRAW_BIND";
          g.j(str, "START", this.e);
          if (p0.mTicket == null) {
             this.b(p0.mCallback, new JsErrorResult(-1, this.f.a.getString(R.string.arg_RES_7f103b87)));
             b.f("PayJsInject", "bindWithdrawType failed, params.mTicket == null");
             g.j(str, "FAIL", this.e);
          }else {
             h.a(this.f.a, p0.mType).a(p0.mTicket, p0.mGroupKey).subscribeOn(n.a).subscribe(new g(this, p0, this.e), new a(this, p0));
          }
       }
       return;
    }
}
