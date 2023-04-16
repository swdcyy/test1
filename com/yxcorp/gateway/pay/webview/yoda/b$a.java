package com.yxcorp.gateway.pay.webview.yoda.b$a;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsWithDrawBindParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import tv8.g;
import tv8.h;
import brd.t;
import lv8.n;
import brd.z;
import sv8.k0;
import com.yxcorp.gateway.pay.webview.yoda.a;
import erd.g;
import crd.b;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import java.lang.StringBuilder;
import nv8.b;

public class b$a extends p0	// class@0012aa
{
    public final String g;
    public final b h;

    public void b$a(b p0,Activity p1,WebView p2,String p3,String p4){
       this.h = p0;
       this.g = p4;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          g.d("bindWithdrawType start");
          String str = "ACCOUNT_WITHDRAW_BIND";
          g.j(str, "START", this.g);
          if (!TextUtils.x(p0.mTicket) && (TextUtils.x(p0.mType) || TextUtils.x(p0.mGroupKey))) {
             this.b(p0.mCallback, new JsErrorResult(-1, this.h.a.getString(R.string.arg_RES_7f103b87)));
             b.f("PayYodaJsBridge", "bindWithdrawType failed, params="+this.g);
             g.j(str, "FAIL", this.g);
          }else {
             h.a(this.h.a, p0.mType).a(p0.mTicket, p0.mGroupKey).subscribeOn(n.a).subscribe(new k0(this, p0, this.g), new a(this, p0));
          }
       }
       return;
    }
}
