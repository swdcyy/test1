package com.yxcorp.gifshow.ad.webview.jsbridge.i;
import zl9.e;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import f55.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import fg6.a;
import com.google.gson.Gson;
import o59.a0;
import java.lang.Runnable;
import o59.u;
import o59.z;

public class i implements e	// class@0018d4
{
    public final g a;
    public final g b;

    public void i(g p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onError(int p0,String p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "2")) {
          return;
       }
       this.b.h(new a0(this, this.a, a.a.q(new JsErrorResult(p0, p1))));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.b.h(new z(this, this.a, a.a.q(new u(p0))));
       return;
    }
}
