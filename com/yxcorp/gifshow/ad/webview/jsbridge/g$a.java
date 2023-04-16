package com.yxcorp.gifshow.ad.webview.jsbridge.g$a;
import zl9.e;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.kwai.feature.api.tuna.js_params.BusinessJsParams;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import o59.v;
import java.lang.Runnable;
import o59.w;

public class g$a implements e	// class@0018d0
{
    public final BusinessJsParams a;
    public final g b;

    public void g$a(g p0,BusinessJsParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onError(int p0,String p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.b.h(new v(this, p0, p1, this.a));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.b.h(new w(this, p0, this.a));
       return;
    }
}
