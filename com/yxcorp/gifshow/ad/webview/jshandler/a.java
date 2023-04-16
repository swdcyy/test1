package com.yxcorp.gifshow.ad.webview.jshandler.a;
import zl9.b;
import p59.t;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import p59.j;
import java.lang.Runnable;
import ekd.k1;
import zl9.a;

public class a implements b	// class@0018f4
{
    public final t a;

    public void a(t p0){
       super();
       this.a = p0;
    }
    public void e(String p0,e p1){
       t a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          a = ta.a;
          if (a != null) {
             if (!SystemUtil.M(a, "com.tencent.mm")) {
                p1.onError(432, null);
             }else {
                k1.o(new j(this));
                p1.onSuccess(null);
             }
             return;
          }
       }
       p1.onError(-1, "context is null");
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "openWechatQRScan";
    }
    public void onDestroy(){
       a.a(this);
    }
}
